package cn.gov.customs.online.dao;

import cn.gov.customs.online.pojo.CspooEntRecordAttach;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CspooEntRecordAttachMapper {
    int deleteByPrimaryKey(@Param("attachNo") String attachNo, @Param("aplNo") String aplNo);

    int insert(CspooEntRecordAttach record);

    CspooEntRecordAttach selectByPrimaryKey(@Param("attachNo") String attachNo, @Param("aplNo") String aplNo);

    List<CspooEntRecordAttach> selectAll();

    int updateByPrimaryKey(CspooEntRecordAttach record);

    int insertBatchWithPrimaryKey(@Param("cspooEntRecordAttach") List<CspooEntRecordAttach> cspooEntRecordAttach,
                                  @Param("aplNo") String aplNo);

    int updateBatch(@Param("cspooEntRecordAttach") List<CspooEntRecordAttach> cspooEntRecordAttach);

    int deleteByAplNo(@Param("aplNo") String aplNo);

    int insertBatch(@Param("cspooEntRecordAttach") List<CspooEntRecordAttach> cspooEntRecordAttach);
}