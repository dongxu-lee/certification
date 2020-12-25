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
     * @param saveDTO
     */
    @Override
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
            cspooEntRecordMapper.insert(cspooEntRecord);
            //新增附件
            if (!CommonUtil.isListEmpty(cspooEntRecordAttach)) {
                cspooEntRecordAttachMapper.insertBatchWithPrimaryKey(cspooEntRecordAttach, aplNo);
            }
            logger.info("企业备案信息新增成功，主键：" + aplNo);
        }else {
            //修改
            //基本信息修改
            cspooEntRecordMapper.updateByPrimaryKey(cspooEntRecord);
            //附件先删除，再插入
            cspooEntRecordAttachMapper.deleteByAplNo(aplNo);
            cspooEntRecordAttachMapper.insertBatch(cspooEntRecordAttach);
            //cspooEntRecordAttachMapper.updateBatch(cspooEntRecordAttach);
            logger.info("企业备案信息修改成功，主键：" + aplNo);
        }
        return aplNo;
    }
}
