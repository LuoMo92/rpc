package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsPageMapper;
import com.luomo.study.rpc.cms.dao.model.CmsPage;
import com.luomo.study.rpc.cms.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* Created by luomo on 2017/9/14.
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}
