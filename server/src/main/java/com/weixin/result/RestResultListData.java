package com.weixin.result;

import java.util.List;

// 使用于 查询 的返回值
public  class RestResultListData <T> {
  private int code; //  0: 数据库操作正常 1-100 ： 各种异常 代码
  private String msg; // 如果 数据库操作失败，返回失败原因""
  private List<T> data; // 查询的数据列表
  private int max_page;
  private int max_count;
  private int count_per_page;

  public RestResultListData(int code, String msg, List<T> data, int max_page, int max_count, int count_per_page) {
  		super();
  		this.code = code;
  		this.msg = msg;
  		this.data = data;
  		this.max_page = max_page;
  		this.max_count = max_count;
  		this.count_per_page = count_per_page;
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
  	public List<T> getData() {
  		return data;
  	}
  	public void setData(List<T> data) {
  		this.data = data;
  	}
  	public int getMax_page() {
  		return max_page;
  	}
  	public void setMax_page(int max_page) {
  		this.max_page = max_page;
  	}
  	public int getMax_count() {
  		return max_count;
  	}
  	public void setMax_count(int max_count) {
  		this.max_count = max_count;
  	}
  	public int getCount_per_page() {
  		return count_per_page;
  	}
  	public void setCount_per_page(int count_per_page) {
  		this.count_per_page = count_per_page;
  	}
}




/*
code: 1 数据库查询失败
code: 2 数据库插入失败
code: 3 数据库修改失败
code: 4 数据库删除失败
*/
