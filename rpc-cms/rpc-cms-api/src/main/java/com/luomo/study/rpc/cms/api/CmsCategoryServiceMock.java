package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsCategoryMapper;
import com.luomo.study.rpc.cms.dao.model.CmsCategory;
import com.luomo.study.rpc.cms.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* Created by luomo on 2017/9/14.
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}
