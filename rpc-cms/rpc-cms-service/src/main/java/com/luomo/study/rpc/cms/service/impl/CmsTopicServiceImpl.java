package com.luomo.study.rpc.cms.service.impl;

import com.luomo.study.rpc.common.annotation.BaseService;
import com.luomo.study.rpc.common.base.BaseServiceImpl;
import com.luomo.study.rpc.cms.dao.mapper.CmsTopicMapper;
import com.luomo.study.rpc.cms.dao.model.CmsTopic;
import com.luomo.study.rpc.cms.dao.model.CmsTopicExample;
import com.luomo.study.rpc.cms.api.CmsTopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsTopicService实现
* Created by luomo on 2017/9/15.
*/
@Service
@Transactional
@BaseService
public class CmsTopicServiceImpl extends BaseServiceImpl<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

    private static Logger logger = LoggerFactory.getLogger(CmsTopicServiceImpl.class);

    @Autowired
    CmsTopicMapper cmsTopicMapper;

}