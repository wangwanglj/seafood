package com.weixin.result;

// 使用于 修改 和删除的返回值
public class RestResultMsg {
  private int code; //  0: 数据库操作正常 1-100 ： 各种异常 代码
  private String msg; // 如果 数据库操作失败，返回失败原因""

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

  public RestResultMsg(int code,String msg){
    this.code=code;
    this.msg=msg;
  }
}




/*
code: 1 数据库查询失败
code: 2 数据库插入失败
code: 3 数据库修改失败
code: 4 数据库删除失败
*/
