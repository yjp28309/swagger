package com.swagger.controller;

import com.swagger.pojo.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api("person的controller")
@RestController
@RequestMapping("person")
public class PersonController {

    @GetMapping("getPerInfo")
    @ApiOperation("获取person信息")
    public Person personInfo(){
        return new Person(1,"lz","llll",18);
    }

    @PostMapping("getPerInfo2")
    @ApiOperation("获取person信息2")
    public Person personInfo2(@ApiParam("一个用户信息") Person person){

        return person;
    }

    @PostMapping("getString")
    @ApiOperation("获取String")
    public Map<Integer,Object> personInfo2(@ApiParam(value = "给我一个字符串",required = true) String str){

        Map<Integer, Object> map = new HashMap<>();
        map.put(1, str);

        return map;
    }
}