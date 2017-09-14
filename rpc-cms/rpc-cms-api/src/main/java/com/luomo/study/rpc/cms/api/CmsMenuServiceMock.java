package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsMenuMapper;
import com.luomo.study.rpc.cms.dao.model.CmsMenu;
import com.luomo.study.rpc.cms.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* Created by luomo on 2017/9/14.
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}
