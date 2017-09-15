package com.luomo.study.rpc.cms.service.impl;

import com.luomo.study.rpc.common.annotation.BaseService;
import com.luomo.study.rpc.common.base.BaseServiceImpl;
import com.luomo.study.rpc.cms.dao.mapper.CmsArticleTagMapper;
import com.luomo.study.rpc.cms.dao.model.CmsArticleTag;
import com.luomo.study.rpc.cms.dao.model.CmsArticleTagExample;
import com.luomo.study.rpc.cms.api.CmsArticleTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsArticleTagService实现
* Created by luomo on 2017/9/15.
*/
@Service
@Transactional
@BaseService
public class CmsArticleTagServiceImpl extends BaseServiceImpl<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

    private static Logger logger = LoggerFactory.getLogger(CmsArticleTagServiceImpl.class);

    @Autowired
    CmsArticleTagMapper cmsArticleTagMapper;

}