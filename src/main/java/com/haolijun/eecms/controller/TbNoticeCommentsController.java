package com.haolijun.eecms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.haolijun.eecms.entitry.TbNoticeComments;
import com.haolijun.eecms.service.TbNoticeCommentsService;
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
@RequestMapping("/tbNoticeComments")
@Tag(name = "TbNoticeCommentsController", description = "Web接口")
public class TbNoticeCommentsController {

    private final TbNoticeCommentsService tbNoticeCommentsService;

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
        Page<TbNoticeComments> pageInfo = new Page<>(page, pageSize);
        //条件构造器
        LambdaQueryWrapper<TbNoticeComments> queryWrapper = new LambdaQueryWrapper<>();
        //添加排序条件，根据sort进行排序
        queryWrapper.orderByDesc(TbNoticeComments::getId);

        //分页查询
        tbNoticeCommentsService.page(pageInfo, queryWrapper);
        return R.ok(pageInfo);
    }

    /**
     * 查询历史战绩
     *
     * @param tbNoticeComments 条件
     * @return 返回结果
     */
    @GetMapping("select")
    public R select(TbNoticeComments tbNoticeComments) {
        return R.ok(tbNoticeCommentsService.select(tbNoticeComments));
    }

    /**
     * 根据id修改
     *
     * @return 返回信息
     */
    @PostMapping("/update")
    public R update(@RequestBody TbNoticeComments tbNoticeComments) {
        tbNoticeCommentsService.updateById(tbNoticeComments);
        return R.ok(tbNoticeComments);
    }

    /**
     * 根据id删除
     *
     * @return 返回信息
     */
    @GetMapping("/delete")
    public R delete(String id) {
        tbNoticeCommentsService.removeById(id);
        return R.ok("删除成功");
    }

    /**
     * 新增
     *
     * @return 返回信息
     */
    @PostMapping("/save")
    public R save(@RequestBody TbNoticeComments tbNoticeComments) {
        tbNoticeCommentsService.save(tbNoticeComments);
        return R.ok(tbNoticeComments);
    }

}
