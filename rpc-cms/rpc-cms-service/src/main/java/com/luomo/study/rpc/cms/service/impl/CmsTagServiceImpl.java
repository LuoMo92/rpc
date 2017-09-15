package com.luomo.study.rpc.cms.service.impl;

import com.luomo.study.rpc.common.annotation.BaseService;
import com.luomo.study.rpc.common.base.BaseServiceImpl;
import com.luomo.study.rpc.cms.dao.mapper.CmsTagMapper;
import com.luomo.study.rpc.cms.dao.model.CmsTag;
import com.luomo.study.rpc.cms.dao.model.CmsTagExample;
import com.luomo.study.rpc.cms.api.CmsTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsTagService实现
* Created by luomo on 2017/9/15.
*/
@Service
@Transactional
@BaseService
public class CmsTagServiceImpl extends BaseServiceImpl<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

    private static Logger logger = LoggerFactory.getLogger(CmsTagServiceImpl.class);

    @Autowired
    CmsTagMapper cmsTagMapper;

}