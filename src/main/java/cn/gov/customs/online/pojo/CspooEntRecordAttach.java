package cn.gov.customs.online.pojo;

import java.util.Date;

public class CspooEntRecordAttach {
    private String attachNo;

    private String aplNo;

    private String attachType;

    private String fileName;

    private Date indbTime;

    private Date updateTime;

    @Override
    public String toString() {
        return "CspooEntRecordAttach{" +
                "attachNo='" + attachNo + '\'' +
                ", aplNo='" + aplNo + '\'' +
                ", attachType='" + attachType + '\'' +
                ", fileName='" + fileName + '\'' +
                ", indbTime=" + indbTime +
                ", updateTime=" + updateTime +
                '}';
    }

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

    public String getAttachType() {
        return attachType;
    }

    public void setAttachType(String attachType) {
        this.attachType = attachType == null ? null : attachType.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Date getIndbTime() {
        return indbTime;
    }

    public void setIndbTime(Date indbTime) {
        this.indbTime = indbTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}