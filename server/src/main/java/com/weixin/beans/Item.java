package com.weixin.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品
 */
@Entity
@Table(name = "item")
public class Item {

    public Item() {
    }

    public Item(int id, String name, String pic, int pice, int type, int star) {
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.pice = pice;
        this.type = type;
        this.star = star;
    }

    @Id
    @GeneratedValue
    private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品图片地址
     */
    private String pic;

    /**
     * 商品价格
     */
    private int pice;

    /**
     * 商品类型
     */
    private int type;

    /**
     * 评分星级
     */
    private int star;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getPice() {
        return pice;
    }

    public void setPice(int pice) {
        this.pice = pice;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
