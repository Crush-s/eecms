package com.haolijun.eecms.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author hljstart
 * @version 1.0.0
 * @ClassName PageUtils.java
 * @Description 分页数据类
 */
@Data
public class PageUtils implements Serializable {

    private static final long serialVersionUID = 1L;

    // 总页数
    private int totalPage;
    // 总记录数
    private long totalCount;
    // 每页记录数
    private int pageSize;
    // 当前页数
    private int pageIndex;
    // 数据列表
    private List list;

    /**
     *
     * @param totalCount 总记录数
     * @param pageSize 每页的条数
     * @param pageIndex 当前页数
     * @param list  数据
     */
    public PageUtils(long totalCount, int pageSize, int pageIndex, List list) {
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.list = list;
        this.totalPage = (int) Math.ceil((double) totalCount / pageSize);
    }
}
