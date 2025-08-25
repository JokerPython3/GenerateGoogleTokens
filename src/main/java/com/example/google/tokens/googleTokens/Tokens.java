package com.example.google.tokens.googleTokens;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Tokens {
    public Map<String,String>  ww() {
        HttpClient client = HttpClient.newBuilder()

                .followRedirects(Redirect.ALWAYS)
                .connectTimeout(Duration.ofSeconds(15))
                .build();

        String url = "https://accounts.google.com/lifecycle/flows/signup?biz=false&continue=https%3A%2F%2Fwww.google.com%3Fhl%3Den-US&dsh=S1362780868%3A1756076274448790&ec=GAlA8wE&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://accounts.google.com/lifecycle/flows/signup?biz=false&continue=https%3A%2F%2Fwww.google.com%3Fhl%3Den-US&dsh=S1362780868%3A1756076274448790&ec=GAlA8wE&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en"))
                .GET()
                .setHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
                .setHeader("accept-language", "en,ar;q=0.9,en-US;q=0.8")
                .setHeader("priority", "u=0, i")
                .setHeader("referer", "https://accounts.google.com/")
                .setHeader("sec-ch-ua", "\"Not;A=Brand\";v=\"99\", \"Google Chrome\";v=\"139\", \"Chromium\";v=\"139\"")
                .setHeader("sec-ch-ua-arch", "\"x86\"")
                .setHeader("sec-ch-ua-bitness", "\"64\"")
                .setHeader("sec-ch-ua-form-factors", "\"Desktop\"")
                .setHeader("sec-ch-ua-full-version", "\"139.0.7258.139\"")
                .setHeader("sec-ch-ua-full-version-list", "\"Not;A=Brand\";v=\"99.0.0.0\", \"Google Chrome\";v=\"139.0.7258.139\", \"Chromium\";v=\"139.0.7258.139\"")
                .setHeader("sec-ch-ua-mobile", "?0")
                .setHeader("sec-ch-ua-model", "\"\"")
                .setHeader("sec-ch-ua-platform", "\"Windows\"")
                .setHeader("sec-ch-ua-platform-version", "\"10.0.0\"")
                .setHeader("sec-ch-ua-wow64", "?0")
                .setHeader("sec-fetch-dest", "document")
                .setHeader("sec-fetch-mode", "navigate")
                .setHeader("sec-fetch-site", "same-origin")
                .setHeader("sec-fetch-user", "?1")
                .setHeader("upgrade-insecure-requests", "1")
                .setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36")
                .setHeader("x-browser-channel", "stable")
                .setHeader("x-browser-copyright", "Copyright 2025 Google LLC. All rights reserved.")
                .setHeader("x-browser-validation", "XPdmRdCCj2OkELQ2uovjJFk6aKA=")
                .setHeader("x-browser-year", "2025")
                .setHeader("x-chrome-id-consistency-request", "version=1,client_id=77185425430.apps.googleusercontent.com,device_id=fa2b82e4-75fa-4fc7-819d-a928cec98c3b,signin_mode=all_accounts,signout_mode=show_confirmation")
                .setHeader("x-client-data", "CJC2yQEIorbJAQipncoBCIvoygEIlaHLAQjGo8sBCIWgzQEI/aXOAQiVhM8BCJ6FzwEItYXPAQjDhc8BCM6FzwEI4YbPARjh4s4BGOztzgEYzYLPARiKhs8B")
                .timeout(Duration.ofSeconds(20))
                .build();
//                .uri(URI.create(url))
//                .GET()
//                .setHeader()
//                .setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
//                .setHeader("Referer", "https://accounts.google.com/")

//                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

//
//            System.out.println(response.headers());
//            System.out.println(response.uri());
            String TL = response.uri().toString().split("TL=")[1];
            System.out.println(TL);
            String at = response.body().toString().split("\"SNlM0e\":\"")[1].split("\"")[0];
            System.out.println(at);
            String s1 = response.body().toString().split("\"Qzxixc\":\"")[1].split("\"")[0];
            System.out.println(s1);
            Map<String,String> responsee = new HashMap<>();
            responsee.put("TL",TL);
            responsee.put("at",at);
            responsee.put("s1",s1);
            return responsee;



        } catch (Exception e) {
            Map<String,String> responseee= new HashMap<>();responseee.put("ee","ee");return responseee;
            // java >> python
        }
    }
}

