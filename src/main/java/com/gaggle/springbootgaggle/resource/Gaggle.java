package com.gaggle.springbootgaggle.resource;


import com.gaggle.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("Get")
public class Gaggle {

    @GetMapping
    public Map<String,String> setMessage(){


        Map<String,String> payload=new LinkedHashMap<>();
        payload.put("message","Welcome to the machine.");
        payload.put("ISO 8601 timestamp", Utils.iSO_CurrentTime());

        return payload;
    }
}
