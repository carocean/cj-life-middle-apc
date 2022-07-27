package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.DimCategory;
import cj.life.middle.apc.domain.DimCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DimCategoryMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(DimCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(DimCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String cateId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(DimCategory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(DimCategory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<DimCategory> selectByExample(DimCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    DimCategory selectByPrimaryKey(String cateId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") DimCategory row, @Param("example") DimCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") DimCategory row, @Param("example") DimCategoryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(DimCategory row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(DimCategory row);

    void setOrderNum(@Param("cateId") String cateId, @Param("orderNum") int orderNum);
}