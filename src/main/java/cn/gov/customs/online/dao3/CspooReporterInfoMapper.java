package cn.gov.customs.online.dao3;

import cn.gov.customs.online.pojo3.CspooReporterInfo;
import cn.gov.customs.online.pojo3.CspooReporterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CspooReporterInfoMapper {
    long countByExample(CspooReporterInfoExample example);

    int deleteByExample(CspooReporterInfoExample example);

    int deleteByPrimaryKey(String no);

    int insert(CspooReporterInfo record);

    int insertSelective(CspooReporterInfo record);

    List<CspooReporterInfo> selectByExample(CspooReporterInfoExample example);

    CspooReporterInfo selectByPrimaryKey(String no);

    int updateByExampleSelective(@Param("record") CspooReporterInfo record, @Param("example") CspooReporterInfoExample example);

    int updateByExample(@Param("record") CspooReporterInfo record, @Param("example") CspooReporterInfoExample example);

    int updateByPrimaryKeySelective(CspooReporterInfo record);

    int updateByPrimaryKey(CspooReporterInfo record);
}