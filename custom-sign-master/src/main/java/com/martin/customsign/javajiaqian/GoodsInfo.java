package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.annotation.JSONType;
//import lombok.Data;

/**
 *
 */
//@Data
@JSONType(orders = {"gname", "itemLink"})
public class GoodsInfo {
    private String gname;
    private String itemLink;
}
