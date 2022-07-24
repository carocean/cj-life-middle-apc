package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.DimTerminal;
import cj.life.middle.apc.domain.DimTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DimTerminalMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(DimTerminalExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(DimTerminalExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String terminalId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(DimTerminal row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(DimTerminal row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<DimTerminal> selectByExample(DimTerminalExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    DimTerminal selectByPrimaryKey(String terminalId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") DimTerminal row, @Param("example") DimTerminalExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") DimTerminal row, @Param("example") DimTerminalExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(DimTerminal row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(DimTerminal row);
}