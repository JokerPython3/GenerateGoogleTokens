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
                .setHeader("cookie", "OTZ=8226690_44_44__44_; HSID=AzQd0Nr7NdzEH5prz; SSID=Ab0ONX5L5tosA9jvg; APISID=QmLiUdnLtxROBgqs/AemMwzKkLJXp60xcw; SAPISID=95prms-lpx9xCvQX/A9HCwzuAMSp8EIMQw; __Secure-1PAPISID=95prms-lpx9xCvQX/A9HCwzuAMSp8EIMQw; __Secure-3PAPISID=95prms-lpx9xCvQX/A9HCwzuAMSp8EIMQw; ACCOUNT_CHOOSER=AFx_qI4yQzD8o4O0Um6aO26PdGbQK7tqFqYGnzQH1cgUf1dI8oxFiOTUz_dhQlriaHBaJ-LHeHiXVRXKCtxfOuADMOqJnmeuAhOLgUzAJeJtlgHLnFQdB2tFpMmCScXk-QklWu7bcoEA; SMSV=ADHTe-Ds953165js915Urs5bpZ7w2BEIGlPTY6_d-GZ2xZdnwzpVgFeKyBl-6PaSJdWxioAeZXqYJ037SIBGYmr4vwXq4B535O2xy7WldU3OZLJ7qZJLh-k; LSID=o.myaccount.google.com|s.IQ|s.youtube:g.a0000gjuaICfJZ_LpBbq1sBGl3T9wowNFkxvV9rZj-AP2LaZvLaSyc3M4hzE3nU0BWey5lk-BwACgYKAb8SARcSFQHGX2MiwKlfHkpmDQW783JkhiJ_LBoVAUF8yKrdyh4nd0LrSkPfAV0nC8gN0076; __Host-1PLSID=o.myaccount.google.com|s.IQ|s.youtube:g.a0000gjuaICfJZ_LpBbq1sBGl3T9wowNFkxvV9rZj-AP2LaZvLaSprEzyOhluwOYqjKdij4U8gACgYKAW8SARcSFQHGX2Mi58_k4jbCGSoZJLuPuk7unhoVAUF8yKoTBsACnURBWDrxPWCJk5Wy0076; __Host-3PLSID=o.myaccount.google.com|s.IQ|s.youtube:g.a0000gjuaICfJZ_LpBbq1sBGl3T9wowNFkxvV9rZj-AP2LaZvLaSl2Ivepq3oFCPNw2zWLMeaQACgYKAagSARcSFQHGX2Mi0Sx932iPYRN29Dd1Ia6hKBoVAUF8yKosh9jFQK_0PSiYBF_VINwL0076; SID=g.a0000gjuaDXiZp0hTiDcLj_Boc-MfoVKNOmpPn_ZUruS-FisQ07FyvuQOY-xxRtNZ3l5QFxhGgACgYKAXYSARcSFQHGX2MirBFebjKc6tRfvkBfGi9NGxoVAUF8yKpgpCvY7JmWymOJQFv1Wp4E0076; __Secure-1PSID=g.a0000gjuaDXiZp0hTiDcLj_Boc-MfoVKNOmpPn_ZUruS-FisQ07FBnO3IkhkikRbC2Z4zwGMQQACgYKAakSARcSFQHGX2MiSN6XUFqTflHCQOTjEY4yBBoVAUF8yKoZ9s9CBo_Tmdo0AlSHZVjG0076; __Secure-3PSID=g.a0000gjuaDXiZp0hTiDcLj_Boc-MfoVKNOmpPn_ZUruS-FisQ07F0iRm53E4bzeswqWILwYwMAACgYKAV0SARcSFQHGX2MiguaYreluYYMq44uTi4ZRRBoVAUF8yKp-WzfEM2kBFqW0LYTt-Lrd0076; SEARCH_SAMESITE=CgQI4p4B; AEC=AVh_V2jrf3g1JAlpQZtN23Mo1287d0IYQHosVAAe8aSnKDtAKSM9JXN6rJU; __Host-GAPS=1:UqbrV6gkw-KwqA9cKzTjVvPFAL1lXs9mqYZSD5Iu-4aR0keYUWS8clzYoxe20lJH4RXdKrxrTjbeOioZRQXtRQvDpnZcRp8o7kTvm_cLyFUD6J8XCFcRfTs_X-40x4-ZbYjcrPSxB-PvgR3jg5UPPzrxtOm_Pvfzw5Nac8Ts8lgisTdfhLxKsw:aosxrz38xHZPUc4G; NID=525=G6qfjRX7tZig8bRqcPEZ869x57eOm7_0ZXc6G2KB9hDxI4rkV85EuUPC_663SrwHFmqZUhD0c5QEK5PJAnd6djzpCCr57k7jzxaNZOVMyGetcc31PCPmaVyyX8Esqapp2dhxIwrT-6SD7cCySMFxGfxmhNb33W0xbx2aAcSDKF_ZCiheGdabMvc3ZlE2_6zXEpBoxk8izmwTcZi0DrAMwTuRMr5j4KY0z1cfA4jZUwoMPjH6QPWwKWFmkoMX8nVXHIlszP74k9beYJ8zpmNdbrKYpAlk1BkaO8XedKbpVkJDsvOn4gAC-KEVOroYEZLiDrYg42TPRn_azNBhh5D5cP19Pd7XMYLlLzBusR1Z2bHVChGtT-v5PZHf1ZvzzX2_4vbQoa5eh9_AwyxUvZgJH3rI6TdHpnoZPL1tasSO-D-oTBkPjBRLIk9rXACIYe26cQ7sBli2EXmJEJURgja5kJ34Em0c8BnsnzQ0VoWcHcPBMYdoDhQHS2UBkjOolPOOPfIem_bTdx2mdR_H8tjj_oWrLqYcBYfSB79PxLU8FWRAi97GiqxN3qEZl9fSsghCPB7R_FrK14Z_aDr4onBXqx0MQtHoHK1XVuzk3TtOsGmvUFdERZ1xG4RkmhUwLO-7G_tXYvENeX0uliabF23BoJFJISNV1ezXuiwHTyJCgW18XdmtIrhNB5uuCAuZXu5sLqL6ZKlpugpo0C6b9uS4xTAiiYcqbHpyb1acMF29xTUCYDFn; __Secure-1PSIDTS=sidts-CjYB5H03P0zb7gwWoJsC-39fGMRQ1HOD20bQI_KeHIgNWhGMHpLEF1eVufHGqsJBBHQYoSEDMIYQAA; __Secure-1PSIDRTS=sidts-CjYB5H03P0zb7gwWoJsC-39fGMRQ1HOD20bQI_KeHIgNWhGMHpLEF1eVufHGqsJBBHQYoSEDMIYQAA; __Secure-3PSIDTS=sidts-CjYB5H03P0zb7gwWoJsC-39fGMRQ1HOD20bQI_KeHIgNWhGMHpLEF1eVufHGqsJBBHQYoSEDMIYQAA; __Secure-3PSIDRTS=sidts-CjYB5H03P0zb7gwWoJsC-39fGMRQ1HOD20bQI_KeHIgNWhGMHpLEF1eVufHGqsJBBHQYoSEDMIYQAA; __Host-GAPSTS=gapsts-CiwBZgs1IL9VgcgzdZpsbc5YSFqQDVOImqe2vHgpuW5N8gbdYWDAoie06XfBbRAB; SIDCC=AKEyXzXEWSL8iPEWQnWUA0guQ-RUnIXiZcKdOcjvjZnd-adHHddQh5EFu35NnCcdJps_d3np_hI; __Secure-1PSIDCC=AKEyXzVNNv1KZ74Ilb9bjekgqtwRNUWgXycMPc-uMna0j89SXcwy63G28itfnC_PhV23yzUdl7I; __Secure-3PSIDCC=AKEyXzXrZc5KZWqKyEV5O76u_P6SOVziec9IZufS_e4B-rH_NKfWUuCLkw-jDG1BZx4a4984rA")
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

