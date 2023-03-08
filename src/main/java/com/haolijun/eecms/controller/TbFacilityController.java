package com.haolijun.eecms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haolijun.eecms.entitry.TbFacility;
import com.haolijun.eecms.service.TbFacilityService;
import com.haolijun.eecms.utils.R;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/tbFacility")
@Tag(name = "TbFacilityController", description = "Web接口")
public class TbFacilityController {

    private final TbFacilityService tbFacilityService;

    /**
     * 分页查询
     *
     * @param page     页数
     * @param pageSize 每页数量
     * @return 返回信息
     */
    @GetMapping("/page")
    public R page(int page, int pageSize) {
        //分页构造器
        Page<TbFacility> pageInfo = new Page<>(page, pageSize);
        //条件构造器
        LambdaQueryWrapper<TbFacility> queryWrapper = new LambdaQueryWrapper<>();
        //添加排序条件，根据sort进行排序
        queryWrapper.orderByDesc(TbFacility::getId);

        //分页查询
        tbFacilityService.page(pageInfo, queryWrapper);
        return R.ok(pageInfo);
    }

    /**
     * 查询历史战绩
     *
     * @param tbFacility 条件
     * @return 返回结果
     */
    @GetMapping("select")
    public R select(TbFacility tbFacility) {
        return R.ok(tbFacilityService.select(tbFacility));
    }

    /**
     * 根据id修改
     *
     * @return 返回信息
     */
    @PostMapping("/update")
    public R update(@RequestBody TbFacility tbFacility) {
        tbFacilityService.updateById(tbFacility);
        return R.ok(tbFacility);
    }

    /**
     * 根据id删除
     *
     * @return 返回信息
     */
    @GetMapping("/delete")
    public R delete(String id) {
        tbFacilityService.removeById(id);
        return R.ok("删除成功");
    }

    /**
     * 新增
     *
     * @return 返回信息
     */
    @PostMapping("/save")
    public R save(@RequestBody TbFacility tbFacility) {
        tbFacilityService.save(tbFacility);
        return R.ok(tbFacility);
    }

}
