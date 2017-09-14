package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsArticleMapper;
import com.luomo.study.rpc.cms.dao.model.CmsArticle;
import com.luomo.study.rpc.cms.dao.model.CmsArticleExample;

/**
* 降级实现CmsArticleService接口
* Created by luomo on 2017/9/14.
*/
public class CmsArticleServiceMock extends BaseServiceMock<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {

}
