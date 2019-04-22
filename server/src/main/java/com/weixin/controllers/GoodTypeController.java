package com.weixin.controllers;

import com.weixin.beans.GoodType;
import com.weixin.result.RestResultData;
import com.weixin.service.GoodTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品类型接口
 */
@Controller
@RequestMapping(value = "/goodtype")
public class GoodTypeController {

    @Autowired
    private GoodTypeService goodTypeService;
    Logger log = Logger.getLogger(GoodTypeController.class);

    @ResponseBody
    @RequestMapping(value = "/getall")
    public RestResultData getAll(){
        try {
            List<GoodType> goodTypes = goodTypeService.findAll();
            return new RestResultData(0, "", goodTypes);
        }catch (Exception e){
            log.error("",e);
            return new RestResultData(1, "数据库查询失败"+e, new ArrayList<GoodType>());
        }
    }
}
