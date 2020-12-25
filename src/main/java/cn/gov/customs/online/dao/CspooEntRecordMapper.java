package cn.gov.customs.online.dao;

import cn.gov.customs.online.pojo.CspooEntRecord;
import java.util.List;

public interface CspooEntRecordMapper {
    int deleteByPrimaryKey(String aplNo);

    int insert(CspooEntRecord record);

    CspooEntRecord selectByPrimaryKey(String aplNo);

    List<CspooEntRecord> selectAll();

    int updateByPrimaryKey(CspooEntRecord record);

    int updateByPrimaryKeySelective(CspooEntRecord record);
    //使用序列生成主键并插入数据，返回主键
    String insertUseSequence(CspooEntRecord record);
}