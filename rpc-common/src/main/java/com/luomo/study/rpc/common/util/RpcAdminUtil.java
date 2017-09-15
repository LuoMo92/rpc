package com.luomo.study.rpc.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压rpcAdmin-x.x.x.jar到resources目录
 *
 * Created by LiuMei on 2017-09-15.
 */
public class RpcAdminUtil implements InitializingBean,ServletContextAware{

    private static Logger logger = LoggerFactory.getLogger(RpcAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }
    
    public void setServletContext(ServletContext servletContext) {
        logger.info("===== 开始解压rpc-admin =====");
        String version = PropertiesFileUtil.getInstance("rpc-admin-client").get("rpc.admin.version");
        logger.info("rpc-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/rpc-admin-" + version + ".jar");
        logger.info("rpc-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/rpc-admin";
        logger.info("rpc-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        logger.info("===== 解压rpc-admin完成 =====");
    }
}
