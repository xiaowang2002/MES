package com.atwzs.mes.service.impl;

import com.atwzs.mes.entity.CarbonEmission;
import com.atwzs.mes.dao.CarbonEmissionDao;
import com.atwzs.mes.service.CarbonEmissionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CarbonEmission)表服务实现类
 *
 * @author Wang Zhisheng
 * @since 2023-10-24 11:13:05
 */
@Service("carbonEmissionService")
public class CarbonEmissionServiceImpl implements CarbonEmissionService {
    @Resource
    private CarbonEmissionDao carbonEmissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CarbonEmission queryById(Long id) {
        return this.carbonEmissionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param carbonEmission 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<CarbonEmission> queryByPage(CarbonEmission carbonEmission, PageRequest pageRequest) {
        long total = this.carbonEmissionDao.count(carbonEmission);
        return new PageImpl<>(this.carbonEmissionDao.queryAllByLimit(carbonEmission, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param carbonEmission 实例对象
     * @return 实例对象
     */
    @Override
    public CarbonEmission insert(CarbonEmission carbonEmission) {
        this.carbonEmissionDao.insert(carbonEmission);
        return carbonEmission;
    }

    /**
     * 修改数据
     *
     * @param carbonEmission 实例对象
     * @return 实例对象
     */
    @Override
    public CarbonEmission update(CarbonEmission carbonEmission) {
        this.carbonEmissionDao.update(carbonEmission);
        return this.queryById(carbonEmission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.carbonEmissionDao.deleteById(id) > 0;
    }

    @Override
    public List<CarbonEmission> queryList() {
        return this.carbonEmissionDao.queryList();
    }
}
