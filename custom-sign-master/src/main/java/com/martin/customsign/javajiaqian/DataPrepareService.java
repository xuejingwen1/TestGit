/*
package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.ggj.finance.customs.clearance.config.CustomDeclareConfig;
import com.ggj.finance.customs.clearance.config.MockSwitch;
import com.ggj.finance.customs.clearance.converter.PayExchangeInfoHeadConverter;
import com.ggj.finance.customs.clearance.info.PayExtInfo;
import com.ggj.finance.customs.clearance.param.SignReqParam;
import com.ggj.finance.pay.dto.CustomPaymentDetailDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.URLEncoder;

*/
/**
 * 数据准备服务
 *//*

@Service
@Slf4j
public class DataPrepareService {
    @Resource
    private SignService signService;
    @Resource
    private MockSwitch mockSwitch;
    @Resource
    private MockService mockService;
    @Resource
    private CustomDeclareService customDeclareService;
    @Resource
    private PayExchangeInfoHeadConverter payExchangeInfoHeadConverter;
    @Resource
    private CustomDeclareConfig customDeclareConfig;
    @Resource
    private PayExchangeService payExchangeService;

    */
/**
     * 准备数据
     *
     * @param orderNo
     * @param sessionId
     * @param id
     * @return
     * @throws Exception
     *//*

    public String prepareData(String orderNo, String sessionId, Integer id) throws Exception {
        // mock了走mock逻辑
        if (mockSwitch.isMock()) {
            return buildReqStr(mockService.mock(orderNo, sessionId), id);
        }
        PayExtInfo payExtInfo = new PayExtInfo();
        payExtInfo.setSessionId(sessionId);
        payExtInfo.setServiceTime(System.currentTimeMillis());
        CustomPaymentDetailDTO customPaymentDetailDTO = customDeclareService.getCustomPaymentDetail(orderNo);
        payExtInfo.setPayExchangeInfoHead(payExchangeInfoHeadConverter.convert(customPaymentDetailDTO, customDeclareConfig.getEbpcode()));
        payExtInfo.setPayExchangeInfoLists(payExchangeService.queryPayExchangeList(customPaymentDetailDTO.getShopOrderId(), orderNo));
        return buildReqStr(payExtInfo, id);
    }


    */
/**
     * 构造字符串
     *
     * @param payExtInfo
     * @return
     *//*

    private String buildStr(PayExtInfo payExtInfo) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\"sessionID\":\"" + payExtInfo.getSessionId()
                + "\"||");
        stringBuffer.append("\"payExchangeInfoHead\":\""
                + JSON.toJSONString(payExtInfo.getPayExchangeInfoHead())
                + "\"||");
        stringBuffer.append("\"payExchangeInfoLists\":\""
                + JSON.toJSONString(payExtInfo.getPayExchangeInfoLists())
                + "\"||");
        stringBuffer.append("\"serviceTime\":\"" + payExtInfo.getServiceTime()
                + "\"");
        return stringBuffer.toString();
    }

    */
/**
     * 组装请求字符串
     *
     * @param payExtInfo
     * @param id
     * @return
     * @throws Exception
     *//*

    private String buildReqStr(PayExtInfo payExtInfo, Integer id) throws Exception {
        SignReqParam param = new SignReqParam();
        param.setId(id);
        param.setMessage(buildStr(payExtInfo));
        // 执行签名
        JSONArray jsonArray = signService.sign(param);
        payExtInfo.setSignValue(jsonArray.getString(0));
        payExtInfo.setCertNo(jsonArray.getString(1));
        String payInfo = JSON.toJSONString(payExtInfo);
        log.info("支付信息上送请求参数:{}", payInfo);
        return "payExInfoStr=" + URLEncoder.encode(payInfo, "utf-8");
    }
}
*/
