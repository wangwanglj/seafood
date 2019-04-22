package com.weixin.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品类型
 */
@Entity
@Table(name = "goodtype")
public class GoodType {

    public GoodType() {
    }

    public GoodType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * id
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     * 类型名称
     */
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
