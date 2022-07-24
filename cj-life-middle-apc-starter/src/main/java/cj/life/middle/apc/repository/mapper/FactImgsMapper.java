package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.FactImgs;
import cj.life.middle.apc.domain.FactImgsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FactImgsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FactImgsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FactImgsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String imgId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FactImgs row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FactImgs row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FactImgs> selectByExample(FactImgsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FactImgs selectByPrimaryKey(String imgId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") FactImgs row, @Param("example") FactImgsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") FactImgs row, @Param("example") FactImgsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FactImgs row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FactImgs row);
}