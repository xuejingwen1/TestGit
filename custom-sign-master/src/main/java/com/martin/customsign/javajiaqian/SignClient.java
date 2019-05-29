/*
package com.martin.customsign.javajiaqian;

import com.ggj.finance.customs.clearance.filter.SignFilter;
import lombok.extern.slf4j.Slf4j;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

*/
/**
 * 加签客户端
 *//*

@Slf4j
public class SignClient extends WebSocketClient {
    private SignFilter filter;
    private Object lock = new Object();
    private CountDownLatch downLatch;
    private int awaitTimeOut;
    private ConcurrentHashMap<Integer, Object> cacheMap = new ConcurrentHashMap<>();

    public SignClient(URI serverURI, SignFilter filter, int connectTimeOut, int awaitTimeOut) {
        super(serverURI, new Draft_6455(), null, connectTimeOut);
        this.filter = filter;
        this.awaitTimeOut = awaitTimeOut;
    }

    */
/**
     * 发送请求
     *
     * @param object
     * @return
     *//*

    public Object sendParam(Object object, Integer id) {
        synchronized (lock) {
            downLatch = new CountDownLatch(1);
            sendImpl(object);
            try {
                downLatch.await(awaitTimeOut, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                log.warn("发送数据等待异常", e);
            }
            return cacheMap.remove(id);
        }
    }

    private void sendImpl(Object object) {
        if (object instanceof String) {
            super.send((String) object);
        } else if (object instanceof byte[]) {
            super.send((byte[]) object);
        }
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        cacheMap.clear();
        log.debug("==============打开链接==============");
    }

    @Override
    public void onMessage(String message) {
        log.info("message-{}", message);
        if (downLatch != null && filter.filter(message)) {
            cacheMap.put(filter.getRespId(message), message);
            downLatch.countDown();
        }
    }

    @Override
    public void onError(Exception ex) {
        log.error("签名时出错", ex);
        release();
    }

    @Override
    public void onClose(int arg0, String arg1, boolean arg2) {
        log.debug("==============关闭链接==============");
        cacheMap.clear();
        release();
    }

    @Override
    public void onMessage(ByteBuffer bytes) {
        try {
            String message = new String(bytes.array(), "utf-8");
            cacheMap.put(filter.getRespId(message), message);
        } catch (UnsupportedEncodingException e) {
            log.warn("解码返回信息异常", e);
        } finally {
            release();
        }
    }

    */
/**
     * 释放锁
     *//*

    private void release() {
        if (downLatch != null) {
            downLatch.countDown();
        }
    }
}
*/
