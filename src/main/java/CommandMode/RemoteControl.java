package CommandMode;

/**
 * @author 袁赛阔
 * @date 2023-11-26 21:59
 * @description
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
