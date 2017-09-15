package com.luomo.study.rpc.cms.web.controller;

import com.luomo.study.rpc.cms.api.CmsCategoryService;
import com.luomo.study.rpc.cms.api.CmsSystemService;
import com.luomo.study.rpc.cms.api.CmsTagService;
import com.luomo.study.rpc.cms.dao.model.*;
import com.luomo.study.rpc.common.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by LiuMei on 2017-09-15.
 */
@Controller
public class IndexController extends BaseController{

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private CmsCategoryService cmsCategoryService;

    @Autowired
    private CmsTagService cmsTagService;

    @Autowired
    private CmsSystemService cmsSystemService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        // 所有系统
        CmsSystemExample cmsSystemExample = new CmsSystemExample();
        cmsSystemExample.setOrderByClause("orders asc");
        List<CmsSystem> systems = cmsSystemService.selectByExample(cmsSystemExample);
        model.addAttribute("systems", systems);
        // 所有类目
        CmsCategoryExample cmsCategoryExample = new CmsCategoryExample();
        cmsCategoryExample.setOrderByClause("orders asc");
        List<CmsCategory> categories = cmsCategoryService.selectByExample(cmsCategoryExample);
        model.addAttribute("categories", categories);
        // 所有标签
        CmsTagExample cmsTagExample = new CmsTagExample();
        cmsTagExample.setOrderByClause("orders asc");
        List<CmsTag> tags = cmsTagService.selectByExample(cmsTagExample);
        model.addAttribute("tags", tags);
        return thymeleaf("/index");
    }

}
