package com.luomo.study.rpc.cms.service.impl;

import com.luomo.study.rpc.common.annotation.BaseService;
import com.luomo.study.rpc.common.base.BaseServiceImpl;
import com.luomo.study.rpc.cms.dao.mapper.CmsArticleCategoryMapper;
import com.luomo.study.rpc.cms.dao.model.CmsArticleCategory;
import com.luomo.study.rpc.cms.dao.model.CmsArticleCategoryExample;
import com.luomo.study.rpc.cms.api.CmsArticleCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleCategoryService实现
* Created by luomo on 2017/9/15.
*/
@Service
@Transactional
@BaseService
public class CmsArticleCategoryServiceImpl extends BaseServiceImpl<CmsArticleCategoryMapper, CmsArticleCategory, CmsArticleCategoryExample> implements CmsArticleCategoryService {

    private static Logger logger = LoggerFactory.getLogger(CmsArticleCategoryServiceImpl.class);

    @Autowired
    CmsArticleCategoryMapper cmsArticleCategoryMapper;

}