package cj.life.middle.apc.repository.mapper;

import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.FollowAppEmpl;
import cj.life.middle.apc.domain.FollowAppEmplExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowAppEmplMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(FollowAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(FollowAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(@Param("appId") String appId, @Param("emplId") String emplId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(FollowAppEmpl row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(FollowAppEmpl row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<FollowAppEmpl> selectByExample(FollowAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    FollowAppEmpl selectByPrimaryKey(@Param("appId") String appId, @Param("emplId") String emplId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") FollowAppEmpl row, @Param("example") FollowAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") FollowAppEmpl row, @Param("example") FollowAppEmplExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(FollowAppEmpl row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(FollowAppEmpl row);

    List<FactApp> listAppByEmployee(@Param("emplId") String emplId,@Param("limit") int limit, @Param("offset") long offset);

}