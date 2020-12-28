package cn.gov.customs.online.dao;

import cn.gov.customs.online.pojo.CspooEntRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CspooEntRecordMapper {
    int deleteByPrimaryKey(String aplNo);

    int insert(CspooEntRecord record);

    CspooEntRecord selectByPrimaryKey(String aplNo);

    List<CspooEntRecord> selectAll();

    int updateByPrimaryKey(CspooEntRecord record);

    int updateByPrimaryKeySelective(CspooEntRecord record);

    //申报方法修改两个字段
    int updateForDeclare(CspooEntRecord record);
}