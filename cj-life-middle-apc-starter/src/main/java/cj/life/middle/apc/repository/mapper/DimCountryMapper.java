package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.DimCountry;
import cj.life.middle.apc.domain.DimCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DimCountryMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(DimCountryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(DimCountryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String countryId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(DimCountry row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(DimCountry row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<DimCountry> selectByExample(DimCountryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    DimCountry selectByPrimaryKey(String countryId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") DimCountry row, @Param("example") DimCountryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") DimCountry row, @Param("example") DimCountryExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(DimCountry row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(DimCountry row);
}