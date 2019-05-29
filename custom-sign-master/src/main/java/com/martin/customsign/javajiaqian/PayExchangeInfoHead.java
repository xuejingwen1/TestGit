package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 */
@Data
@JSONType(orders = {"guid", "initalRequest", "initalResponse", "ebpCode", "payCode", "payTransactionId", "totalAmount", "currency", "verDept", "payType", "tradingTime", "note"})
public class PayExchangeInfoHead {
    private String guid;
    private String initalRequest;
    private String initalResponse;
    private String ebpCode;
    private String payCode;
    private String payTransactionId;
    private BigDecimal totalAmount;
    private String currency;
    private String verDept;
    private String payType;
    private String tradingTime;
    private String note;
}
