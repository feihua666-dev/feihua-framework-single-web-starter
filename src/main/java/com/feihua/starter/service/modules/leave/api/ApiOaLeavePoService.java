package com.feihua.starter.service.modules.leave.api;

import com.feihua.starter.service.modules.leave.dto.OaLeaveDto;
import com.feihua.starter.service.modules.leave.dto.SearchLeavesConditionDto;
import com.feihua.starter.service.modules.leave.po.OaLeavePo;
import feihua.jdbc.api.pojo.PageAndOrderbyParamDto;
import feihua.jdbc.api.pojo.PageResultDto;

/**
 * This class was generated by MyBatis Generator.
 * @author yangwei 2018-04-11 14:57:50
 */
public interface ApiOaLeavePoService extends feihua.jdbc.api.service.ApiBaseService<OaLeavePo, OaLeaveDto, String> {
    /**
     * 查询自己的请假
     * @return
     */
    public PageResultDto<OaLeaveDto> searchLeavesDsf(SearchLeavesConditionDto searchLeavesConditionDto, PageAndOrderbyParamDto pageAndOrderbyParamDto);
}