package cn.gov.customs.online.pojo3;

import java.util.Date;

public class CspooEntRecordAttach extends CspooEntRecordAttachKey {
    private String attachType;

    private String fileName;

    private Date indbTime;

    private Date updateTime;

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