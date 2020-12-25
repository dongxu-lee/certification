package cn.gov.customs.online.dao3;

import cn.gov.customs.online.pojo3.CspooEntRecordAttach;
import cn.gov.customs.online.pojo3.CspooEntRecordAttachExample;
import cn.gov.customs.online.pojo3.CspooEntRecordAttachKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CspooEntRecordAttachMapper {
    long countByExample(CspooEntRecordAttachExample example);

    int deleteByExample(CspooEntRecordAttachExample example);

    int deleteByPrimaryKey(CspooEntRecordAttachKey key);

    int insert(CspooEntRecordAttach record);

    int insertSelective(CspooEntRecordAttach record);

    List<CspooEntRecordAttach> selectByExample(CspooEntRecordAttachExample example);

    CspooEntRecordAttach selectByPrimaryKey(CspooEntRecordAttachKey key);

    int updateByExampleSelective(@Param("record") CspooEntRecordAttach record, @Param("example") CspooEntRecordAttachExample example);

    int updateByExample(@Param("record") CspooEntRecordAttach record, @Param("example") CspooEntRecordAttachExample example);

    int updateByPrimaryKeySelective(CspooEntRecordAttach record);

    int updateByPrimaryKey(CspooEntRecordAttach record);
}