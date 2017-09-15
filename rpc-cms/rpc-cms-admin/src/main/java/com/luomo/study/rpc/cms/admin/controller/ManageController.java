package com.luomo.study.rpc.cms.admin.controller;

import com.luomo.study.rpc.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by LiuMei on 2017-09-15.
 */
@Controller
@RequestMapping("/manage")
@Api(value = "后台控制器",description = "后台管理")
public class ManageController extends BaseController{

    private static Logger logger = LoggerFactory.getLogger(ManageController.class);

    @ApiOperation(value = "后台首页")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "/manage/index.jsp";
    }
}
