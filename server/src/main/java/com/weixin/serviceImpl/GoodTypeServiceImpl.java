package com.weixin.serviceImpl;

import com.weixin.beans.GoodType;
import com.weixin.dao.GoodTypeDao;
import com.weixin.service.GoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodTypeServiceImpl implements GoodTypeService {

    @Autowired
    private GoodTypeDao goodTypeDao;

    @Override
    public List<GoodType> findAll() {
        return goodTypeDao.findAll();
    }
}
