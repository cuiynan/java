package com.cui.net;

import com.alibaba.fastjson.JSON;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.Map;

/**
 * @author : cuiyingnan
 * @date : 2019/7/29 13:49
 * @desc :
 */
public class HttpRest extends RestTemplate {

    public HttpRest() {
        super.getMessageConverters().add(new MyHttpMessageConvert());
    }

    @Override
    public <T> T getForObject(String url, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return super.getForObject(url, responseType, uriVariables);
    }

    @Override
    public URI postForLocation(String url, Object request, Map<String, ?> uriVariables) throws RestClientException {
        return super.postForLocation(url, request, uriVariables);
    }

    @Override
    public <T> T postForObject(String url, Object request, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return super.postForObject(url, request, responseType, uriVariables);
    }

    @Override
    public <T> ResponseEntity<T> postForEntity(String url, Object request, Class<T> responseType, Object... uriVariables) throws RestClientException {
        return super.postForEntity(url, request, responseType, uriVariables);
    }

    @Override
    public void put(String url, Object request, Map<String, ?> uriVariables) throws RestClientException {
        super.put(url, request, uriVariables);
    }

    @Override
    public void delete(String url, Map<String, ?> uriVariables) throws RestClientException {
        super.delete(url, uriVariables);
    }

    @Override
    public void delete(URI url) throws RestClientException {
        super.delete(url);
    }

    /**
     * post请求转对象
     */
    public <T> T getResponse(String url, Object uriVariables, Class<T> clazz) throws Exception {
        ResponseEntity<String> response = super.postForEntity(url, uriVariables, String.class);

        String resultStr = response.getBody();
        ThirdResponse thirdResponse = JSON.parseObject(resultStr, ThirdResponse.class);

        Response result = thirdResponse.getResponse();
        if (result == null) {
            throw new Exception("返回结果为空！");
        }

        if (!"200".equals(result.getReturn_Code())) {
            throw new Exception("返回结果异常！");
        }

        try {
            return JSON.parseObject(JSON.toJSONString(result.getReturn_Data()), clazz);
        } catch (Exception e) {
            throw new RuntimeException("转换异常！" + e.getMessage());
        }
    }

    /**
     * 判断 前端是否为ajax请求
     */
    public boolean isAjaxRequest(HttpServletRequest request) {
        boolean bFlag = false;
        String requestedWith = request.getHeader("x-requested-with");
        if (requestedWith != null && requestedWith.equalsIgnoreCase("XMLHttpRequest")) {
            bFlag = true;
        }
        return bFlag;
    }


}
