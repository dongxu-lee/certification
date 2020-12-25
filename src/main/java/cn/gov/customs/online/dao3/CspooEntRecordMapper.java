package cn.gov.customs.online.dao3;

import cn.gov.customs.online.pojo3.CspooEntRecord;
import cn.gov.customs.online.pojo3.CspooEntRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CspooEntRecordMapper {
    long countByExample(CspooEntRecordExample example);

    int deleteByExample(CspooEntRecordExample example);

    int deleteByPrimaryKey(String aplNo);

    int insert(CspooEntRecord record);

    int insertSelective(CspooEntRecord record);

    List<CspooEntRecord> selectByExample(CspooEntRecordExample example);

    CspooEntRecord selectByPrimaryKey(String aplNo);

    int updateByExampleSelective(@Param("record") CspooEntRecord record, @Param("example") CspooEntRecordExample example);

    int updateByExample(@Param("record") CspooEntRecord record, @Param("example") CspooEntRecordExample example);

    int updateByPrimaryKeySelective(CspooEntRecord record);

    int updateByPrimaryKey(CspooEntRecord record);
}