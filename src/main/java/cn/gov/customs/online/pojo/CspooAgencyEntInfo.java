package cn.gov.customs.online.pojo;

import java.util.Date;

public class CspooAgencyEntInfo {
    private String no;

    private String agenentCiqRegNo;

    private String agenentNameC;

    private String agenentNameE;

    private String state;

    private String uniSocialCreditCode;

    private String entMgrNo;

    private Date indbTime;

    private Date updateTime;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getAgenentCiqRegNo() {
        return agenentCiqRegNo;
    }

    public void setAgenentCiqRegNo(String agenentCiqRegNo) {
        this.agenentCiqRegNo = agenentCiqRegNo == null ? null : agenentCiqRegNo.trim();
    }

    public String getAgenentNameC() {
        return agenentNameC;
    }

    public void setAgenentNameC(String agenentNameC) {
        this.agenentNameC = agenentNameC == null ? null : agenentNameC.trim();
    }

    public String getAgenentNameE() {
        return agenentNameE;
    }

    public void setAgenentNameE(String agenentNameE) {
        this.agenentNameE = agenentNameE == null ? null : agenentNameE.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getUniSocialCreditCode() {
        return uniSocialCreditCode;
    }

    public void setUniSocialCreditCode(String uniSocialCreditCode) {
        this.uniSocialCreditCode = uniSocialCreditCode == null ? null : uniSocialCreditCode.trim();
    }

    public String getEntMgrNo() {
        return entMgrNo;
    }

    public void setEntMgrNo(String entMgrNo) {
        this.entMgrNo = entMgrNo == null ? null : entMgrNo.trim();
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