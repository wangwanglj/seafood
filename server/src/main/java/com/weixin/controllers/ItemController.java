package com.weixin.controllers;

import com.weixin.beans.Item;
import com.weixin.result.RestResultData;
import com.weixin.service.ItemService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "item")
public class ItemController {

    private Logger logger = Logger.getLogger(ItemController.class);
    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "getall")
    public RestResultData getAll(){
        try {
            return  new RestResultData(0,"",itemService.getAll());
        }catch (Exception e){
            logger.error("",e);
            return new RestResultData(1, "数据库查询失败"+e, new ArrayList<Item>());
        }
    }
}
