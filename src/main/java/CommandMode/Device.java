package com.ysk;

/**
 * @author 袁赛阔
 * @date 2023-11-26 21:57
 * @description
 */
public class Device {

    private String name;

    public Device(String name){
        this.name = name;
    }

    public void turnOn(){
        System.out.println(name + " 设备打开");
    }

    public void turnOff(){
        System.out.println(name + " 设备关闭");
    }
}
