package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsCommentMapper;
import com.luomo.study.rpc.cms.dao.model.CmsComment;
import com.luomo.study.rpc.cms.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* Created by luomo on 2017/9/14.
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}
