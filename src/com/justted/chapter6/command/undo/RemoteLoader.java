package com.justted.chapter6.command.undo;

/**
 * Created by justted on 2017/4/10.
 */


public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        CeilingFan ceilingFan= new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);//打印出遥控器
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);//打印出遥控器
        remoteControl.undoButtonWasPushed();
    }
}

