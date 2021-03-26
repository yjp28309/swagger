package com.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("person实体类")
public class Person {


    @ApiModelProperty(notes = "用户id",example = "1",required = true,position = 1)
    //描述，         参考值，       是否必须，        顺序
    private Integer id;

    @ApiModelProperty(notes = "用户名",example = "lz",required = true,position = 2)
    private String name;

    //@ApiModelProperty(hidden = true)//隐藏
    @ApiModelProperty(notes = "姓",example = "l",required = true,position = 3)
    private String lastName;

    @ApiModelProperty(notes = "年龄",example = "18",position = 4)
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(int i, String lz, String llll, int i1) {
    }
}