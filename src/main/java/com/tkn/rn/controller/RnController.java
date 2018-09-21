package com.tkn.rn.controller;

import com.tkn.rn.http.HttpClient;
import com.tkn.rn.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rn")
public class RnController {
    @Autowired
    private HttpClient httpClient;

    @GetMapping("/list")
    public Object rnl(){
        //api url地址
        String url = "https://www.apiopen.top/novelApi";
        //post请求
        HttpMethod method =HttpMethod.POST;
        // 封装参数，千万不要替换为Map与HashMap，否则参数无法传递
        MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
        params.add("access_token", "xxxxx");
        //发送http请求并返回结果
        return httpClient.client(url,method,params);
    }
}
