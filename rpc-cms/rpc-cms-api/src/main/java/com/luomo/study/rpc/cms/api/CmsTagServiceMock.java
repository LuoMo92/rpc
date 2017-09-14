package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsTagMapper;
import com.luomo.study.rpc.cms.dao.model.CmsTag;
import com.luomo.study.rpc.cms.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* Created by luomo on 2017/9/14.
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}
