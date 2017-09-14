package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsSystemMapper;
import com.luomo.study.rpc.cms.dao.model.CmsSystem;
import com.luomo.study.rpc.cms.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* Created by luomo on 2017/9/14.
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}
