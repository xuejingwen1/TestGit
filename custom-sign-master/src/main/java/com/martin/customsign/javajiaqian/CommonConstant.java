package com.martin.customsign.javajiaqian;

/**
 * 公共常量
 */
public class CommonConstant {
    /**
     * 超时时间
     */
    public static final Integer TIME_OUT = 2 * 1000;
    /**
     * 锁超时时间
     */
    public static final Integer LOCK_TIME_OUT = 6;
    /**
     * 连接丢失时间
     */
    public static final Integer CONNECT_LOST_TIME_OUT = 60 * 60;
    /**
     * 等待超时时间
     */
    public static final Integer AWAIT_TIME_OUT = 5;
    /**
     * 签名方法
     */
    public static final String SIGN_METHOD = "cus-sec_SpcSignDataAsPEM";
    /**
     * 成功错误码
     */
    public static final String SUCCESS_CODE = "10000";
    /**
     * 失败错误码
     */
    public static final String FAILED_CODE = "20000";
}
