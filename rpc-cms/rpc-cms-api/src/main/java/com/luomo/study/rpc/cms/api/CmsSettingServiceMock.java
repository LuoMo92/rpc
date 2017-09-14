package com.luomo.study.rpc.cms.api;

import com.luomo.study.rpc.common.base.BaseServiceMock;
import com.luomo.study.rpc.cms.dao.mapper.CmsSettingMapper;
import com.luomo.study.rpc.cms.dao.model.CmsSetting;
import com.luomo.study.rpc.cms.dao.model.CmsSettingExample;

/**
* 降级实现CmsSettingService接口
* Created by luomo on 2017/9/14.
*/
public class CmsSettingServiceMock extends BaseServiceMock<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

}
