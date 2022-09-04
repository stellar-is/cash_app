package com.stellar.cash_app;

import okhttp3.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
@EnableSwagger2
public class CashAppApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CashAppApplication.class, args);

//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url("https://jsonplaceholder.typicode.com/posts")
//                .build();
//        Response response = client.newCall(request).execute();
//        System.out.println(response.body().string());


    }


}
