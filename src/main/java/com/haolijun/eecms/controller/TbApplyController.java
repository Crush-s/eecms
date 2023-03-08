package com.haolijun.eecms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haolijun.eecms.entitry.TbApply;
import com.haolijun.eecms.service.TbApplyService;
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
@RequestMapping("/tbApply")
@Tag(name = "TbApplyController", description = "Web接口")
public class TbApplyController {

    private final TbApplyService tbApplyService;

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
        Page<TbApply> pageInfo = new Page<>(page, pageSize);
        //条件构造器
        LambdaQueryWrapper<TbApply> queryWrapper = new LambdaQueryWrapper<>();
        //添加排序条件，根据sort进行排序
        queryWrapper.orderByDesc(TbApply::getId);

        //分页查询
        tbApplyService.page(pageInfo, queryWrapper);
        return R.ok(pageInfo);
    }

    /**
     * 查询历史战绩
     *
     * @param tbApply 条件
     * @return 返回结果
     */
    @GetMapping("select")
    public R select(TbApply tbApply) {
        return R.ok(tbApplyService.select(tbApply));
    }

    /**
     * 根据id修改
     *
     * @return 返回信息
     */
    @PostMapping("/update")
    public R update(@RequestBody TbApply tbApply) {
        tbApplyService.updateById(tbApply);
        return R.ok(tbApply);
    }

    /**
     * 根据id删除
     *
     * @return 返回信息
     */
    @GetMapping("/delete")
    public R delete(String id) {
        tbApplyService.removeById(id);
        return R.ok("删除成功");
    }

    /**
     * 新增
     *
     * @return 返回信息
     */
    @PostMapping("/save")
    public R save(@RequestBody TbApply tbApply) {
        tbApplyService.save(tbApply);
        return R.ok(tbApply);
    }

}
