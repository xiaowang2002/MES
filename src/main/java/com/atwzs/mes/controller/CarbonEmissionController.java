package com.atwzs.mes.controller;

import com.atwzs.mes.common.R;
import com.atwzs.mes.entity.CarbonEmission;
import com.atwzs.mes.service.CarbonEmissionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CarbonEmission)表控制层
 *
 * @author Wang Zhisheng
 * @since 2023-10-24 11:12:45
 */
@RestController
@RequestMapping("carbonEmission")
public class CarbonEmissionController {
    /**
     * 服务对象
     */
    @Resource
    private CarbonEmissionService carbonEmissionService;

    /**
     * 列表查询
     *
     * @return 查询结果
     */
    @GetMapping("list")
    public R<List<CarbonEmission>> queryList() {
        List<CarbonEmission> list = this.carbonEmissionService.queryList();
        if (list.isEmpty()) {
            return R.error("列表为空");
        } else {
            return R.success(list);
        }
    }

    /**
     * 分页查询 TODO 重写
     *
     * @param carbonEmission 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<CarbonEmission>> queryByPage(CarbonEmission carbonEmission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.carbonEmissionService.queryByPage(carbonEmission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R<CarbonEmission> queryById(@PathVariable("id") Long id) {
        return R.success(this.carbonEmissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param carbonEmission 实体
     * @return 新增结果
     */
    @PostMapping
    public R<CarbonEmission> add(@RequestBody CarbonEmission carbonEmission) {
        return R.success(this.carbonEmissionService.insert(carbonEmission));
    }

    /**
     * 编辑数据
     *
     * @param carbonEmission 实体
     * @return 编辑结果
     */
    @PutMapping
    public R<CarbonEmission> edit(@RequestBody CarbonEmission carbonEmission) {
        return R.success(this.carbonEmissionService.update(carbonEmission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public R<Boolean> deleteById(Long id) {
        return R.success(this.carbonEmissionService.deleteById(id));
    }

}

