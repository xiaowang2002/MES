package com.atwzs.mes.service;

import com.atwzs.mes.entity.CarbonEmission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CarbonEmission)表服务接口
 *
 * @author Wang Zhisheng
 * @since 2023-10-24 11:13:02
 */
public interface CarbonEmissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarbonEmission queryById(Long id);

    /**
     * 分页查询
     *
     * @param carbonEmission 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    Page<CarbonEmission> queryByPage(CarbonEmission carbonEmission, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param carbonEmission 实例对象
     * @return 实例对象
     */
    CarbonEmission insert(CarbonEmission carbonEmission);

    /**
     * 修改数据
     *
     * @param carbonEmission 实例对象
     * @return 实例对象
     */
    CarbonEmission update(CarbonEmission carbonEmission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 列表查询
     *
     * @return 查询结果
     */
    List<CarbonEmission> queryList();
}
