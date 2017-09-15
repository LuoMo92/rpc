package com.luomo.study.rpc.cms.service.impl;

import com.luomo.study.rpc.common.annotation.BaseService;
import com.luomo.study.rpc.common.base.BaseServiceImpl;
import com.luomo.study.rpc.cms.dao.mapper.CmsArticleMapper;
import com.luomo.study.rpc.cms.dao.model.CmsArticle;
import com.luomo.study.rpc.cms.dao.model.CmsArticleExample;
import com.luomo.study.rpc.cms.api.CmsArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleService实现
* Created by luomo on 2017/9/15.
*/
@Service
@Transactional
@BaseService
public class CmsArticleServiceImpl extends BaseServiceImpl<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {

    private static Logger logger = LoggerFactory.getLogger(CmsArticleServiceImpl.class);

    @Autowired
    CmsArticleMapper cmsArticleMapper;

}