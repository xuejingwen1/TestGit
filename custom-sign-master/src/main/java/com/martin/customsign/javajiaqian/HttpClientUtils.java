/*
package com.martin.customsign.javajiaqian;

//import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import javax.net.ssl.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;

*/
/**
 * http请求工具类
 *//*

//@Slf4j
public class HttpClientUtils {
    static {
        try {
            trustAllHttpsCertificates();
            HttpsURLConnection.setDefaultHostnameVerifier((urlHostName, session) -> {
                        return true;
                    }
            );
        } catch (Exception e) {
        }
    }

    */
/**
     * 发起post https String的参数请求
     *
     * @param requestUrl
     * @param params
     * @return
     *//*

    public static String postStrMsg(String requestUrl, String params) {
        String result = "";
        OutputStreamWriter out = null;
        BufferedReader in = null;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(60000); // 设置连接主机超时（单位：毫秒)
            conn.setReadTimeout(60000); // 设置从主机读取数据超时（单位：毫秒)
            conn.setDoOutput(true); // post请求参数要放在http正文内，顾设置成true，默认是false
            conn.setDoInput(true); // 设置是否从httpUrlConnection读入，默认情况下是true
            conn.setUseCaches(false); // Post 请求不能使用缓存
            // 设定传送的内容类型是可序列化的java对象(如果不设此项,在传送序列化对象时,当WEB服务默认的不是这种类型时可能抛java.io.EOFException)
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); // ;text/html charset=UTF-8");
            conn.setRequestMethod("POST");// 设定请求的方法为"POST"，默认是GET
            conn.setRequestProperty("Content-Length", params.length() + "");
            String encode = "UTF-8";
            out = new OutputStreamWriter(conn.getOutputStream(), encode);
            out.write(params); // new String(requestUrl.getBytes("ISO8859-1")) );
            out.flush();
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return null;
            }
            // 获取响应内容体
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line = "";
            StringBuffer strBuf = new StringBuffer();
            while ((line = in.readLine()) != null) {
                strBuf.append(line).append("\n");
            }
            result = strBuf.toString().trim();
        } catch (Exception e) {
            //log.error("httpClient-sendPostMsg--error--is:", e);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
       // log.info("http请求响应返回:{}", result);
        return result;
    }

    private static void trustAllHttpsCertificates()
            throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustAllCerts = new TrustManager[1];
        trustAllCerts[0] = new TrustAllManager();
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(
                sc.getSocketFactory());
    }

    private static class TrustAllManager
            implements X509TrustManager {
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public void checkServerTrusted(X509Certificate[] certs,
                                       String authType)
                throws CertificateException {
        }

        public void checkClientTrusted(X509Certificate[] certs,
                                       String authType)
                throws CertificateException {
        }
    }
}
*/
