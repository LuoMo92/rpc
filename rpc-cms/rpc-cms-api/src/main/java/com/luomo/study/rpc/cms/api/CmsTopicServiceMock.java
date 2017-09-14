package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsTopicMapper;
import com.luomo.study.rpc.cms.dao.model.CmsTopic;
import com.luomo.study.rpc.cms.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* Created by luomo on 2017/9/14.
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}
