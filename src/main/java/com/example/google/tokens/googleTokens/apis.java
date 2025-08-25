package com.example.google.tokens.googleTokens;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import com.example.google.tokens.googleTokens.Tokens;
@RestController
public class apis {
    @GetMapping("/")
    public Map<String,String> data(){
        HashMap<String,String> response = new HashMap<>();
        Tokens ntr = new Tokens();
        String wa = ntr.ww().toString();
        response.put("Tokens",wa);
        return response;
    }
}
