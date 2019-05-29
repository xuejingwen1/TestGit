/*
package com.martin.customsign.javajiaqian;

import com.ggj.finance.customs.clearance.dal.entity.CustomDeclarePushLogEntity;
import com.ggj.finance.customs.clearance.dal.mapper.CustomDeclarePushLogMapper;
import com.ggj.finance.customs.clearance.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

*/
/**
 * 数据上送服务
 *//*

@Service
@Slf4j
public class DataUpService {
    @Resource
    private DataPrepareService dataPrepareService;
    @Resource
    private PayInfoService payInfoService;
    @Resource
    private CustomDeclarePushLogMapper customDeclarePushLogMapper;

    @Async
    public void upload(String orderNo, String sessionId, Integer id) {
        String reqStr = StringUtils.EMPTY;
        try {
            reqStr = dataPrepareService.prepareData(orderNo, sessionId, id);
        } catch (Exception e) {
            log.error("组装请求参数异常", e);
            return;
        }

        try {
            ApiResult apiResult = payInfoService.push(reqStr, id);
            updateResult(orderNo, sessionId, id, apiResult);
        } catch (Exception e) {
            log.error("支付信息推送失败", e);
        }
    }

    private void updateResult(String orderNo, String sessionId, Integer id, ApiResult apiResult) {
        CustomDeclarePushLogEntity entity = new CustomDeclarePushLogEntity();
        entity.setId(id);
        entity.setCode(apiResult.getCode());
        entity.setMessage(apiResult.getMessage());
        entity.setOrderNo(orderNo);
        entity.setSessionId(sessionId);
        entity.setStatus(apiResult.getStatus());
        customDeclarePushLogMapper.updateByPrimaryKeySelective(entity);
    }
}
*/
