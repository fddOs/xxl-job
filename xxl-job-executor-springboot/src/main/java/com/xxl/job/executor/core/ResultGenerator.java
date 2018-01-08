package com.xxl.job.executor.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result<Object> genSuccessResult() {
        return new Result<Object>()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result<Object> genSuccessResult(Object data) {
        return new Result<Object>()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result<Object> genFailResult(String message) {
        return new Result<Object>()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
}
