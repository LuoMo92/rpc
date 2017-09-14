package com.luomo.study.rpc.common.annotation;

import java.lang.annotation.*;

/**
 * 初始化继承BaseService的service
 *
 * Created by LiuMei on 2017-09-14.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {
}
