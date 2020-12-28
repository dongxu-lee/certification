package cn.gov.customs.online.service;


import cn.gov.customs.online.dto.CspooEntRecordSaveDTO;

public interface CspooEntRecordService {

    /**
     * 企业备案信息暂存（基本情况+附件）
     * @param saveDTO
     * @return
     */
    String cspooEntRecordSave(CspooEntRecordSaveDTO saveDTO);

    /**
     * 企业备案信息删除（基本情况+附件）
     * @param aplNo
     * @return
     */
    String cspooEntRecordDelete(String aplNo);

    /**
     * 企业备案信息申报（基本情况+附件）
     * @param saveDTO
     * @return
     */
    String cspooEntRecordDeclare(CspooEntRecordSaveDTO saveDTO);

}
