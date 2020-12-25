package cn.gov.customs.online.dto;

import cn.gov.customs.online.pojo.CspooEntRecord;
import cn.gov.customs.online.pojo.CspooEntRecordAttach;

import java.util.List;

/**
 * 企业备案信息保存DTO
 */
public class CspooEntRecordSaveDTO {

    private CspooEntRecord cspooEntRecord;

    private List<CspooEntRecordAttach> cspooEntRecordAttach;

    public CspooEntRecord getCspooEntRecord() {
        return cspooEntRecord;
    }

    public void setCspooEntRecord(CspooEntRecord cspooEntRecord) {
        this.cspooEntRecord = cspooEntRecord;
    }

    public List<CspooEntRecordAttach> getCspooEntRecordAttach() {
        return cspooEntRecordAttach;
    }

    public void setCspooEntRecordAttach(List<CspooEntRecordAttach> cspooEntRecordAttach) {
        this.cspooEntRecordAttach = cspooEntRecordAttach;
    }

    @Override
    public String toString() {
        return "CspooEntRecordSaveDTO{" +
                "cspooEntRecord=" + cspooEntRecord +
                ", cspooEntRecordAttach=" + cspooEntRecordAttach +
                '}';
    }
}
