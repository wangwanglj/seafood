package com.weixin.dao;

import com.weixin.beans.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item,Integer> {
}
