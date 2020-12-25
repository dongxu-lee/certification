package cn.gov.customs.online.pojo3;

import java.util.Date;

public class CspooReporterInfo {
    private String no;

    private String name;

    private String idno;

    private String tel;

    private String powerOfAttorney;

    private String idimg;

    private String elecSignHandwriting;

    private String state;

    private Date indbTime;

    private Date updateTime;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPowerOfAttorney() {
        return powerOfAttorney;
    }

    public void setPowerOfAttorney(String powerOfAttorney) {
        this.powerOfAttorney = powerOfAttorney == null ? null : powerOfAttorney.trim();
    }

    public String getIdimg() {
        return idimg;
    }

    public void setIdimg(String idimg) {
        this.idimg = idimg == null ? null : idimg.trim();
    }

    public String getElecSignHandwriting() {
        return elecSignHandwriting;
    }

    public void setElecSignHandwriting(String elecSignHandwriting) {
        this.elecSignHandwriting = elecSignHandwriting == null ? null : elecSignHandwriting.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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