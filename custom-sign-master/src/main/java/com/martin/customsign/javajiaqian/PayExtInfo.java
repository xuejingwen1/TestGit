package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
//import lombok.Data;

import java.util.List;

/**
 *
 */
//@Data
//设置排序规则
@JSONType(orders = {"sessionID", "payExchangeInfoHead", "payExchangeInfoLists", "serviceTime", "certNo", "signValue"})
public class PayExtInfo {
    @JSONField(name = "sessionID")
    private String sessionId;

    private PayExchangeInfoHead payExchangeInfoHead;

    private List<PayExchangeInfo> payExchangeInfoLists;

    private Long serviceTime;

    private String certNo;

    private String signValue;

}
