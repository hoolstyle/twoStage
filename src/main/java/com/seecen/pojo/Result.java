package com.seecen.pojo;

/**
 * Author: CalcYu
 * Date: 2019/6/12
 */
public class Result {
    // 1： 成功 2：失败
    private Integer status;
    // 返回请求的结果信息
    private String msg;

    public Result(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public static Result success() {
        return new Result(1, "");
    }

    public static Result success(String msg) {
        return new Result(1, msg);
    }

    public static Result error(String msg) {
        return new Result(2, msg);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
