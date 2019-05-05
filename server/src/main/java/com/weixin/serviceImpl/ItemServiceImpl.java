package com.weixin.serviceImpl;

import com.weixin.beans.Item;
import com.weixin.dao.ItemDao;
import com.weixin.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> getAll() {
        return itemDao.findAll();
    }
}
