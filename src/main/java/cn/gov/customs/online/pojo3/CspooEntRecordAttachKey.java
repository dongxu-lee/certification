package cn.gov.customs.online.pojo3;

public class CspooEntRecordAttachKey {
    private String attachNo;

    private String aplNo;

    public String getAttachNo() {
        return attachNo;
    }

    public void setAttachNo(String attachNo) {
        this.attachNo = attachNo == null ? null : attachNo.trim();
    }

    public String getAplNo() {
        return aplNo;
    }

    public void setAplNo(String aplNo) {
        this.aplNo = aplNo == null ? null : aplNo.trim();
    }
}