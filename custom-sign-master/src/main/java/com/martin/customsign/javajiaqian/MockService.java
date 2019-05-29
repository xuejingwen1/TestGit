/*
package com.martin.customsign.javajiaqian;

import com.ggj.finance.customs.clearance.enums.CurrencyEnum;
import com.ggj.finance.customs.clearance.info.GoodsInfo;
import com.ggj.finance.customs.clearance.info.PayExchangeInfo;
import com.ggj.finance.customs.clearance.info.PayExchangeInfoHead;
import com.ggj.finance.customs.clearance.info.PayExtInfo;
import com.ggj.finance.customs.clearance.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

*/
/**
 *
 *//*

@Service
public class MockService {
    public PayExtInfo mock(String orderNo, String sessionId){
        PayExtInfo payExtInfo = new PayExtInfo();
        payExtInfo.setSessionId(sessionId);
        payExtInfo.setServiceTime(System.currentTimeMillis());
        PayExchangeInfoHead head = new PayExchangeInfoHead();
        payExtInfo.setPayExchangeInfoHead(head);
        head.setGuid(UUIDUtils.generateID());
        head.setInitalRequest("https://openapi.alipay.com/gateway.do?timestamp=2013-01-0108:08:08&method=alipay.trade.pay&app_id=13580&sign_type=RSA2&sign=ERITJKEIJKJHKKKKKKKHJEREEEEEEEEEEE&version=1.0&charset=GBK");
        head.setInitalResponse("ok");
        head.setCurrency(CurrencyEnum.RMB.getCode());
        head.setEbpCode("3301968LRE");
        head.setPayCode("312226T001");
        head.setPayTransactionId("2018121222001354081010726129");
        head.setTotalAmount(new BigDecimal("100"));
        head.setVerDept("3");
        head.setPayType("1");
        head.setTradingTime("20181212041803");
        head.setNote("批量订单，测试订单优化,生成多个so订单");
        List<PayExchangeInfo> list = new ArrayList<>();
        PayExchangeInfo payExchangeInfo = new PayExchangeInfo();
        list.add(payExchangeInfo);
        payExtInfo.setPayExchangeInfoLists(list);
        List<GoodsInfo> goodsInfos = new ArrayList<GoodsInfo>();
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setGname("lhy-gnsku3");
        goodsInfo.setItemLink("http://m.yunjiweidian.com/yunjibuyer/static/vue-buyer/idc/index.html#/detail?itemId=999761&shopId=453");
        goodsInfos.add(goodsInfo);
        GoodsInfo goodsInf = new GoodsInfo();
        goodsInf.setGname("lhy-gnsku2");
        goodsInf.setItemLink("http://m.yunjiweidian.com/yunjibuyer/static/vue-buyer/idc/index.html#/detail?itemId=999760&shopId=453");
        goodsInfos.add(goodsInf);
        payExchangeInfo.setGoodsInfo(goodsInfos);
        payExchangeInfo.setOrderNo("ord201808030001");
        payExchangeInfo.setRecpAccount("OSA571908863132601");
        payExchangeInfo.setRecpCode("");
        payExchangeInfo.setRecpName("YUNJIHONGKONGLIMITED");
        return  payExtInfo;
    }
}
*/
