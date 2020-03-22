package com.course.client.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class myHttpClient {

    @Test
    public void test() throws IOException {
        //用来存放结果
        String result;

        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(httpGet);

        result = EntityUtils.toString(response.getEntity(),"UTF-8");

        System.out.println(result);

    }


}
