package cn.gov.customs.online.dao;

import cn.gov.customs.online.pojo.CspooAgencyEntInfo;
import java.util.List;

public interface CspooAgencyEntInfoMapper {
    int deleteByPrimaryKey(String no);

    int insert(CspooAgencyEntInfo record);

    CspooAgencyEntInfo selectByPrimaryKey(String no);

    List<CspooAgencyEntInfo> selectAll();

    int updateByPrimaryKey(CspooAgencyEntInfo record);
}