package com.luomo.study.rpc.cms.web.interceptor;

import com.luomo.study.rpc.cms.api.CmsMenuService;
import com.luomo.study.rpc.cms.dao.model.CmsMenu;
import com.luomo.study.rpc.cms.dao.model.CmsMenuExample;
import com.luomo.study.rpc.common.util.PropertiesFileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 公共拦截器
 *
 * Created by LiuMei on 2017-09-15.
 */
public class CmsWebInterceptor extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(CmsWebInterceptor.class);

    @Autowired
    private CmsMenuService cmsMenuService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 过滤ajax
        if (null != request.getHeader("X-Requested-With") && request.getHeader("X-Requested-With").equalsIgnoreCase("XMLHttpRequest")) {
            return true;
        }
        // rpc-ui静态资源配置信息
        String appName = PropertiesFileUtil.getInstance().get("app.name");
        String uiPath = PropertiesFileUtil.getInstance().get("rpc.ui.path");
        request.setAttribute("appName", appName);
        request.setAttribute("uiPath", uiPath);
        // 菜单
        CmsMenuExample cmsMenuExample = new CmsMenuExample();
        cmsMenuExample.setOrderByClause("orders asc");
        List<CmsMenu> menus = cmsMenuService.selectByExample(cmsMenuExample);
        request.setAttribute("menus", menus);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }

}
