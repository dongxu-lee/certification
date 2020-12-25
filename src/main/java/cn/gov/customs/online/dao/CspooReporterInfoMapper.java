package cn.gov.customs.online.dao;

import cn.gov.customs.online.pojo.CspooReporterInfo;
import java.util.List;

public interface CspooReporterInfoMapper {
    int deleteByPrimaryKey(String no);

    int insert(CspooReporterInfo record);

    CspooReporterInfo selectByPrimaryKey(String no);

    List<CspooReporterInfo> selectAll();

    int updateByPrimaryKey(CspooReporterInfo record);
}