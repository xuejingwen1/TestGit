/*
package com.martin.customsign.javajiaqian;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class RequestUtils {

    */
/**
     * 将form表单参数转成map类型
     * @param request
     * @return
     *//*

    public static Map<String, String> formToParamMap(HttpServletRequest request) {
        Map<String, String> params = new HashMap<>();
        Map requestParams = request.getParameterMap();
        for (Object key : requestParams.keySet()) {
            String name = (String) key;
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }
        return params;
    }

    */
/**
     * 将json参数转成map类型
     * @param request
     * @return
     *//*

    public static Map<String, String> jsonToParamMap(HttpServletRequest request) throws IOException {
        StringBuilder resultStr = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
        String line;
        while ((line = in.readLine()) != null) {
            resultStr.append(line);
        }
        log.info("jsonToParamMap,json_str: {}", resultStr.toString());
        return StringUtil.jsonStrToMap(resultStr.toString());
    }

    */
/**
     * 将xml类型参数转成map类型
     * 微信回调时会用到
     * @param request
     * @return
     * @throws Exception
     *//*

    public static Map<String, String> xmlToParamMap(HttpServletRequest request) throws Exception {
        InputStream inStream = request.getInputStream();
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[2048];
        int len;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        outSteam.close();
        inStream.close();
        String reqParams = new String(outSteam.toByteArray(), "UTF-8");
        log.info("xmlToParamMap xml_str: {}", reqParams);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //这是优先选择. 如果不允许DTDs (doctypes) ,几乎可以阻止所有的XML实体攻击
        String FEATURE = "http://apache.org/xml/features/disallow-doctype-decl";
        dbf.setFeature(FEATURE, true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        reqParams = reqParams.replaceAll("\r|\n", "");
        InputStream is = new ByteArrayInputStream(reqParams.getBytes());
        org.w3c.dom.Document document = db.parse(is);
        Map<String, String> signParameters = new TreeMap<>();
        for (int i = 0; i < document.getDocumentElement().getChildNodes().getLength(); i++) {
            String nodeName = document.getDocumentElement().getChildNodes().item(i).getNodeName();
            String nodeValue = document.getElementsByTagName(nodeName).item(0).getFirstChild().getTextContent();
            log.info("nodeName:{}, nodeValue:{}", nodeName, nodeValue);
            signParameters.put(nodeName, nodeValue);
        }
        return signParameters;
    }

    */
/**
     * 获取请求URL
     *
     * @param httpServletRequest
     * @return
     *//*

    public static String getRequestUrl(HttpServletRequest httpServletRequest) {
        String requestUri = httpServletRequest.getRequestURI();
        String contextPath = httpServletRequest.getContextPath();
        String url = requestUri.substring(contextPath.length());
        if (StringUtils.isNotEmpty(httpServletRequest.getQueryString())) {
            url += "?" + httpServletRequest.getQueryString();
        }
        return url;
    }

}
*/
