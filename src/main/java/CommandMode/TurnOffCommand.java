package com.ysk;

/**
 * @author 袁赛阔
 * @date 2023-11-26 22:00
 * @description
 */
public class TurnOffCommand implements Command {

    private Device device;

    public TurnOffCommand(Device device){
        this.device = device;
    }

    public void execute(){
        device.turnOff();
    }
}
