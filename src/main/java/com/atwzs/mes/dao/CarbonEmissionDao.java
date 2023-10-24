package com.atwzs.mes.dao;

import com.atwzs.mes.entity.CarbonEmission;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (CarbonEmission)表数据库访问层
 *
 * @author Wang Zhisheng
 * @since 2023-10-24 11:12:46
 */
public interface CarbonEmissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarbonEmission queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param carbonEmission 查询条件
     * @param pageable       分页对象
     * @return 对象列表
     */
    List<CarbonEmission> queryAllByLimit(CarbonEmission carbonEmission, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param carbonEmission 查询条件
     * @return 总行数
     */
    long count(CarbonEmission carbonEmission);

    /**
     * 新增数据
     *
     * @param carbonEmission 实例对象
     * @return 影响行数
     */
    int insert(CarbonEmission carbonEmission);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CarbonEmission> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CarbonEmission> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CarbonEmission> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CarbonEmission> entities);

    /**
     * 修改数据
     *
     * @param carbonEmission 实例对象
     * @return 影响行数
     */
    int update(CarbonEmission carbonEmission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 列表查询
     *
     * @return 查询结果
     */
    List<CarbonEmission> queryList();
}

