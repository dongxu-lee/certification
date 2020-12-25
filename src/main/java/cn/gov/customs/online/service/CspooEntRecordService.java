package cn.gov.customs.online.service;


import cn.gov.customs.online.dto.CspooEntRecordSaveDTO;

public interface CspooEntRecordService {

    /**
     * 企业备案信息暂存（基本情况+附件）
     * @param saveDTO
     * @return
     */
    String cspooEntRecordSave(CspooEntRecordSaveDTO saveDTO);

}
