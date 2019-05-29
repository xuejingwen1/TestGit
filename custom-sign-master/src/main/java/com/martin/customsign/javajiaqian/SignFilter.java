/*
package com.martin.customsign.javajiaqian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ggj.finance.customs.clearance.constant.CommonConstant;
import com.ggj.finance.customs.clearance.enums.ErrorCodeEnum;
import com.ggj.finance.customs.clearance.utils.AssertUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Objects;

*/
/**
 * 签名过滤器
 *//*

@Component
@Slf4j
public class SignFilter {
    */
/**
     * 执行过滤
     *
     * @param param
     * @return
     *//*

    public boolean filter(Object param) {
        // 为空过滤
        if (StringUtils.isEmpty(param)) {
            return false;
        }
        JSONObject jsonObject = JSON.parseObject(String.valueOf(param));
        // 缺少必要参数过滤
        if (!jsonObject.containsKey("_method") || !jsonObject.containsKey("_args")) {
            return false;
        }
        // 不是签名的参数过滤
        if (!Objects.equals(CommonConstant.SIGN_METHOD, jsonObject.getString("_method"))) {
            return false;
        }
        JSONObject args = jsonObject.getJSONObject("_args");
        if (!args.getBoolean("Result")) {
            return false;
        }
        return true;
    }

    */
/**
     * 获取返回的id
     * @param param
     * @return
     *//*

    public Integer getRespId(Object param) {
        JSONObject jsonObject = JSON.parseObject(String.valueOf(param));
        return jsonObject.getInteger("_id");
    }

    */
/**
     * 解析结果
     *
     * @param result
     * @return
     *//*

    public JSONArray parseResult(Object result) {
        AssertUtils.isTrue(filter(result), ErrorCodeEnum.SIGN_EXCEPTION);
        JSONObject jsonObject = JSON.parseObject(String.valueOf(result));
        JSONObject args = jsonObject.getJSONObject("_args");
        JSONArray data = args.getJSONArray("Data");
        String signValue = data.getString(0);
        log.info("签名:{}", signValue);
        return data;
    }


}
*/
