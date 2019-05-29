/*
package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.ggj.finance.customs.clearance.client.SignClient;
import com.ggj.finance.customs.clearance.config.SignConfig;
import com.ggj.finance.customs.clearance.config.WebSocketConfig;
import com.ggj.finance.customs.clearance.constant.CommonConstant;
import com.ggj.finance.customs.clearance.enums.ErrorCodeEnum;
import com.ggj.finance.customs.clearance.exception.BusinessException;
import com.ggj.finance.customs.clearance.filter.SignFilter;
import com.ggj.finance.customs.clearance.param.SignReqParam;
import com.ggj.finance.customs.clearance.request.SignRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

*/
/**
 *
 *//*

@Service
@Slf4j
public class SignService {
    */
/**
     * 依赖配置
     *//*

    @Resource
    private WebSocketConfig webSocketConfig;
    */
/**
     * 过滤
     *//*

    @Resource
    private SignFilter filter;
    */
/**
     * 保存WebSocket链接
     *//*

    private Map<String, SignClient> clientMap = new ConcurrentHashMap<>();
    @Resource
    private SignConfig signConfig;

    */
/**
     * 执行签名操作
     *
     * @param param
     * @return
     * @throws Exception
     *//*

    public JSONArray sign(SignReqParam param) throws Exception {
        // 组装请求参数
        SignRequest request = buildRequest(param);
        // 发送签名请求
        Object result = send(JSON.toJSONString(request), param.getId());
        // 解析结果
        return filter.parseResult(result);
    }

    */
/**
     * 组装请求参数
     *
     * @param param
     * @return
     *//*

    private SignRequest buildRequest(SignReqParam param) {
        SignRequest request = new SignRequest();
        request.setId(param.getId());
        request.setMethod(CommonConstant.SIGN_METHOD);
        SignRequest.SignData data = new SignRequest.SignData();
        request.setData(data);
        data.setPasswd(signConfig.getPassword());
        data.setMessage(param.getMessage());
        return request;
    }

    */
/**
     * 向WebSocket发送消息
     *
     * @param message
     * @throws Exception
     *//*

    public Object send(String message, Integer id) throws Exception {
        log.info("发送websocket请求,请求参数:{}", message);
        SignClient client = clientMap.get(webSocketConfig.getUrl());
        if (client != null && client.isOpen()) {
            return client.sendParam(message, id);
        } else {
            client = new SignClient(new URI(webSocketConfig.getUrl()), filter,
                    CommonConstant.TIME_OUT, CommonConstant.AWAIT_TIME_OUT);
            if (client.connectBlocking()) {
                Object result = client.sendParam(message, id);
                // 放入缓存
                clientMap.put(webSocketConfig.getUrl(), client);
                return result;
            }
            throw new BusinessException(ErrorCodeEnum.SIGN_EXCEPTION);
        }
    }

}
*/
