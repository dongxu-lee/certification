package cn.gov.customs.online.dao3;

import cn.gov.customs.online.pojo3.CspooAgencyEntInfo;
import cn.gov.customs.online.pojo3.CspooAgencyEntInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CspooAgencyEntInfoMapper {
    long countByExample(CspooAgencyEntInfoExample example);

    int deleteByExample(CspooAgencyEntInfoExample example);

    int deleteByPrimaryKey(String no);

    int insert(CspooAgencyEntInfo record);

    int insertSelective(CspooAgencyEntInfo record);

    List<CspooAgencyEntInfo> selectByExample(CspooAgencyEntInfoExample example);

    CspooAgencyEntInfo selectByPrimaryKey(String no);

    int updateByExampleSelective(@Param("record") CspooAgencyEntInfo record, @Param("example") CspooAgencyEntInfoExample example);

    int updateByExample(@Param("record") CspooAgencyEntInfo record, @Param("example") CspooAgencyEntInfoExample example);

    int updateByPrimaryKeySelective(CspooAgencyEntInfo record);

    int updateByPrimaryKey(CspooAgencyEntInfo record);
}