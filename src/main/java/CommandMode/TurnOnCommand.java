package com.ysk;

/**
 * @author 袁赛阔
 * @date 2023-11-26 22:01
 * @description
 */
public class TurnOnCommand implements Command{
    private Device device;

    public TurnOnCommand(Device device){
        this.device = device;
    }

    public void execute(){
        device.turnOn();
    }
}
