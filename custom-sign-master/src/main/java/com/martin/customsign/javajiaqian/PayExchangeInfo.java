package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
@JSONType(orders = {"orderNo", "goodsInfo", "recpAccount", "recpCode", "recpName"})
public class PayExchangeInfo {
    private String orderNo;
    private List<GoodsInfo> goodsInfo;
    private String recpAccount;
    private String recpCode;
    private String recpName;
}
