package com.luomo.study.rpc.cms.service.impl;

import com.luomo.study.rpc.common.annotation.BaseService;
import com.luomo.study.rpc.common.base.BaseServiceImpl;
import com.luomo.study.rpc.cms.dao.mapper.CmsSettingMapper;
import com.luomo.study.rpc.cms.dao.model.CmsSetting;
import com.luomo.study.rpc.cms.dao.model.CmsSettingExample;
import com.luomo.study.rpc.cms.api.CmsSettingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsSettingService实现
* Created by luomo on 2017/9/15.
*/
@Service
@Transactional
@BaseService
public class CmsSettingServiceImpl extends BaseServiceImpl<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

    private static Logger logger = LoggerFactory.getLogger(CmsSettingServiceImpl.class);

    @Autowired
    CmsSettingMapper cmsSettingMapper;

}