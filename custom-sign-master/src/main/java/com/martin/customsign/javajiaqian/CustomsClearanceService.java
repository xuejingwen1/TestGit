/*
package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ggj.finance.customs.clearance.dal.entity.CustomDeclarePushLogEntity;
import com.ggj.finance.customs.clearance.dal.mapper.CustomDeclarePushLogMapper;
import com.ggj.finance.customs.clearance.dto.PlatDataOpenDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

*/
/**
 *
 *//*

@Service
public class CustomsClearanceService {
    @Resource
    private CustomDeclarePushLogMapper customDeclarePushLogMapper;
    @Resource
    private DataUpService dataUpService;

    public PlatDataOpenDTO platDataOpen(Map<String, String> paramMap) {
        if (!checkParam(paramMap)) {
            return PlatDataOpenDTO.failed();
        }
        CustomDeclarePushLogEntity entity = addRecord(paramMap);
        dataUpService.upload(entity.getOrderNo(), entity.getSessionId(), entity.getId());
        return PlatDataOpenDTO.success();
    }

    private boolean checkParam(Map<String, String> paramMap) {
        if (paramMap == null || StringUtils.isBlank(paramMap.get("openReq"))) {
            return false;
        }
        return true;
    }

    private CustomDeclarePushLogEntity addRecord(Map<String, String> paramMap) {
        CustomDeclarePushLogEntity entity = new CustomDeclarePushLogEntity();
        JSONObject jsonObject = JSON.parseObject(paramMap.get("openReq"));
        entity.setSessionId(jsonObject.getString("sessionID"));
        entity.setOrderNo(jsonObject.getString("orderNo"));
        customDeclarePushLogMapper.insertSelective(entity);
        return entity;
    }

}
*/
