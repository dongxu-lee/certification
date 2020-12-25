package cn.gov.customs.online.controller;

import cn.gov.customs.online.dto.CspooEntRecordSaveDTO;
import cn.gov.customs.online.pojo.CspooEntRecord;
import cn.gov.customs.online.service.CspooEntRecordService;
import cn.gov.customs.online.utils.RespUtil;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 企业备案
 */
@RequestMapping("/entRecord")
@RestController
public class CspooEntRecordController {

    @Autowired
    private CspooEntRecordService cspooEntRecordService;

    /**
     * judge whether the company is filed
     * @param aplNo
     * @return
     */
    @RequestMapping(value = "/checkEntRecord", method = RequestMethod.GET)
    public RespUtil checkEntRecord(@Param("aplNo") String aplNo) {
        switch (aplNo) {
            case "1":
                return RespUtil.success("1", "企业未备案", null);
            case "2":
                return RespUtil.success("2", "企业未备案", null);
            case "3":
                return RespUtil.success("3", "企业未备案", null);
            default:
                return RespUtil.error("500", "数据异常", null);
        }
    }

    /**
     * getAListOfBusinessProperties
     * @return
     */
    @RequestMapping(value = "/getAListOfBusinessProperties", method = RequestMethod.GET)
    public RespUtil getAListOfBusinessProperties() {
        String[] strLists = {"请选择", "国有企业", "中外合作企业", "外商独资企业", "集体企业",
            "私营企业", "其他", "股份合作企业", "联营企业", "国有联营企业",
            "集体联营企业", "国有与集体联营企业", "其他联营企业", "有限责任公司", "国有独资公司",
            "其他有限责任公司", "股份有限公司", "私营独资企业", "普通合伙企业", "私营有限责任公司",
            "私营股份有限公司", "一人有限责任公司", "合资经营企业（港或澳、台资）", "合作经营企业（港或澳、台资）", "港、澳、台商投资",
            "外国（地区）企业", "有限合伙企业", "个人独资企业", "农民专业合作社", "个体工商户"};
        return RespUtil.success("200", "企业性质列表", Arrays.asList(strLists));
    }

    /**
     * add or modify enterprise filing information
     * @param saveDTO
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RespUtil save(@RequestBody CspooEntRecordSaveDTO saveDTO) {
        String aplNo = cspooEntRecordService.cspooEntRecordSave(saveDTO);
        saveDTO.getCspooEntRecord().setAplNo(aplNo);
        return RespUtil.success("200", "success", saveDTO);
    }


}
