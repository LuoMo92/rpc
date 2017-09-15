package com.luomo.study.rpc.cms.service.impl;

import com.luomo.study.rpc.common.annotation.BaseService;
import com.luomo.study.rpc.common.base.BaseServiceImpl;
import com.luomo.study.rpc.cms.dao.mapper.CmsCategoryMapper;
import com.luomo.study.rpc.cms.dao.model.CmsCategory;
import com.luomo.study.rpc.cms.dao.model.CmsCategoryExample;
import com.luomo.study.rpc.cms.api.CmsCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsCategoryService实现
* Created by luomo on 2017/9/15.
*/
@Service
@Transactional
@BaseService
public class CmsCategoryServiceImpl extends BaseServiceImpl<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

    private static Logger logger = LoggerFactory.getLogger(CmsCategoryServiceImpl.class);

    @Autowired
    CmsCategoryMapper cmsCategoryMapper;

}