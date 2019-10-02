package com.cxb.pss.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class HelloController {

    @GetMapping("/get")
    public Object get(){
        List<Integer> data =new ArrayList<>();
        data.add(200);
        data.add(300);
        data.add(100);
        data.add(600);
        data.add(1200);
        data.add(2000);
        List<String> categories =new ArrayList<>();
        categories.add("10M");
        categories.add("50M");
        categories.add("200M");
        categories.add("300M");
        categories.add("1200M");
        categories.add("180M");
        Map<Object,Object> map = new HashMap<>();
        map.put("data",data);
        map.put("categories",categories);
        return map;
    }

    @GetMapping("/welcome")
    public Object welcome(){
        List<Object> result =new ArrayList<>();
        Map<Object,Object> map1 = new HashMap<>();
        map1.put("title","小石潭记");
        map1.put("content","从小丘西行百二十步");
        result.add(map1);
        Map<Object,Object> map2 = new HashMap<>();
        map2.put("title","陋室铭");
        map2.put("content","山不在高，有仙则灵");
        result.add(map2);
        Map<Object,Object> map3 = new HashMap<>();
        map3.put("dataList", result);
        return map3;
    }
}
