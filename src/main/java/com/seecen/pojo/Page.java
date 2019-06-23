package com.seecen.pojo;

import org.apache.ibatis.javassist.expr.NewArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: CalcYu
 * Date: 2019/5/15
 */
public class Page<E> {


    //查询条件
    private E condition;

    //保存结果集
    private List<E> list;

    //第几页  默认查询第一页
    private Integer pageNum = 1;
    //每页数量  默认查询十条记录
    private Integer pageSize = 10;

    //总记录数
    private Long total = 0L;
    
    private List<Integer> numList;

    public List<Integer> getNumList() {
        return numList;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }

    /**
     * 总页面
     *
     * @return
     */
    public Integer getTotalPage() {
        return (int) Math.ceil(total * 1.0 / pageSize);
    }

    public Integer getStart() {
        return (pageNum - 1) * pageSize;
    }

    public Integer getEnd() {
        return pageNum * pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        if (pageNum != null)
            this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public E getCondition() {
        return condition;
    }

    public void setCondition(E condition) {
        this.condition = condition;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
        //更新页码
        numList = new ArrayList<>();
        for (int i = pageNum-2; i <= pageNum+2 ; i++) {
            if (i > 0 && i <= getTotalPage()){
                numList.add(i);
            }
        }
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }
}
