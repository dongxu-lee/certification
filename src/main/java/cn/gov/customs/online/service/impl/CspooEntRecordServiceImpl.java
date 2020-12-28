package cn.gov.customs.online.service.impl;

import cn.gov.customs.online.dao.CspooEntRecordAttachMapper;
import cn.gov.customs.online.dao.CspooEntRecordMapper;
import cn.gov.customs.online.dto.CspooEntRecordSaveDTO;
import cn.gov.customs.online.pojo.CspooEntRecord;
import cn.gov.customs.online.pojo.CspooEntRecordAttach;
import cn.gov.customs.online.service.CspooEntRecordService;
import cn.gov.customs.online.utils.CommonUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class CspooEntRecordServiceImpl implements CspooEntRecordService {

    private static Logger logger = Logger.getLogger(CspooEntRecordServiceImpl.class);

    @Autowired
    private CspooEntRecordMapper cspooEntRecordMapper;

    @Autowired
    private CspooEntRecordAttachMapper cspooEntRecordAttachMapper;

    /**
     * 企业备案信息暂存（基本情况+附件）
     * question:暂存之后，要不要接着在页面反填主键？？？
     * answer:需要，因为申报需要主键
     * @param saveDTO
     */
    @Override
    @Transactional
    public String cspooEntRecordSave(CspooEntRecordSaveDTO saveDTO) {
        CspooEntRecord cspooEntRecord = saveDTO.getCspooEntRecord();
        List<CspooEntRecordAttach> cspooEntRecordAttach = saveDTO.getCspooEntRecordAttach();
        String aplNo = cspooEntRecord.getAplNo();
        if (CommonUtil.isStringEmpty(aplNo)) {
            //新增
            //新增基本信息
            //主键使用redis自增来获得，这里暂时使用UUID
            aplNo = UUID.randomUUID().toString();
            cspooEntRecord.setAplNo(aplNo);
            //备案状态，手动设置为暂存
            cspooEntRecord.setRegState("1");//当前认为1是暂存，以后再改
            //申报类别，手动设置为暂存
            cspooEntRecord.setAplType("1");//当前认为1是暂存，以后再改
            cspooEntRecordMapper.insert(cspooEntRecord);
            //新增附件
            if (!CommonUtil.isListEmpty(cspooEntRecordAttach)) {
                cspooEntRecordAttachMapper.insertBatchWithPrimaryKey(cspooEntRecordAttach, aplNo);
            }
            //新增完之后再查一遍，得到主键。当前不确定业务主键是什么？？？
            //TODO
            //cspooEntRecordMapper.selectByBusinessPrimaryKey(businessPrimaryKey);
            logger.info("企业备案信息新增成功，主键：" + aplNo);
        }else {
            //修改
            //基本信息修改
            cspooEntRecordMapper.updateByPrimaryKey(cspooEntRecord);
            //附件先删除，再插入
            cspooEntRecordAttachMapper.deleteByAplNo(aplNo);
            cspooEntRecordAttachMapper.insertBatch(cspooEntRecordAttach);
            logger.info("企业备案信息修改成功，主键：" + aplNo);
        }
        return aplNo;
    }

    /**
     * 企业备案信息删除（基本情况+附件）
     * @param aplNo
     * @return
     */
    @Override
    @Transactional
    public String cspooEntRecordDelete(String aplNo) {
        //基本信息删除
        cspooEntRecordMapper.deleteByPrimaryKey(aplNo);
        //附件信息删除
        cspooEntRecordAttachMapper.deleteByAplNo(aplNo);
        //附件文件删除
        //TODO
        return aplNo;
    }

    /**
     * 企业备案信息申报（基本情况+附件）
     * @param saveDTO
     * @return
     */
    @Override
    public String cspooEntRecordDeclare(CspooEntRecordSaveDTO saveDTO) {
        CspooEntRecord cspooEntRecord = saveDTO.getCspooEntRecord();
        String aplNo = cspooEntRecord.getAplNo();
        //申报类型修改为申报
        cspooEntRecord.setAplType("2");//当前认为2是申报，以后再改
        //备案类型修改为已申报
        cspooEntRecord.setRegState("2");//当前认为2是申报，以后再改
        cspooEntRecordMapper.updateForDeclare(cspooEntRecord);
        //申报报文发送到内网
        //TODO

        return aplNo;
    }
}
