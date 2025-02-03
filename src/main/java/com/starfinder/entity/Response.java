package com.starfinder.entity;

public class Response<T> {
    private T data;
    private Integer code;
    private String message;
    private String token;

    // 构造函数
    public Response(T data, Integer code, String message, String token) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.token = token;
    }

    // 无参构造函数
    public Response() {
    }

    // getter和setter方法
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}