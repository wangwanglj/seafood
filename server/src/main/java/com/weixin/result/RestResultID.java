package com.weixin.result;


// 使用于 插入 的返回值
public class RestResultID {
    private int code; //  0: 数据库操作正常 1-100 ： 各种异常 代码
    private String msg; // 如果 数据库操作失败，返回失败原因""
    private int id; // 查询的数据列表

    public RestResultID(int code, String msg, int id) {
        super();
        this.code = code;
        this.msg = msg;
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}


/*
code: 1 数据库查询失败
code: 2 数据库插入失败
code: 3 数据库修改失败
code: 4 数据库删除失败
*/
