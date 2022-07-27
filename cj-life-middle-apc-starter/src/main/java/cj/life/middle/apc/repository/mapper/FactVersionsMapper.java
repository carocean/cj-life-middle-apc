package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.FactVersions;
import cj.life.middle.apc.domain.FactVersionsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactVersionsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FactVersionsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FactVersionsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String versionId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FactVersions row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FactVersions row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FactVersions> selectByExample(FactVersionsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FactVersions selectByPrimaryKey(String versionId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") FactVersions row, @Param("example") FactVersionsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") FactVersions row, @Param("example") FactVersionsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FactVersions row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FactVersions row);

    List<FactVersions> listVersion(@Param("appId") String appId,@Param("limit") int limit, @Param("offset") long offset);
}