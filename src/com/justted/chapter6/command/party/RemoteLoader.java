package com.justted.chapter6.command.party;

/**
 * Created by justted on 2017/4/10.
 */


public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        TV livingRoomTV = new TV("Living Room");
        Stereo livingRoomStereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        StereoOnCommand livingRoomStereoOn = new StereoOnCommand(livingRoomStereo);
        TVOnCommand livingRoomTVOn = new TVOnCommand(livingRoomTV);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        StereoOffCommand livingRoomStereoOff = new StereoOffCommand(livingRoomStereo);
        TVOffCommand livingRoomTVOff = new TVOffCommand(livingRoomTV);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { livingRoomLightOn, livingRoomStereoOn, livingRoomTVOn, hottubOn};
        Command[] partyOff = { livingRoomLightOff, livingRoomStereoOff, livingRoomTVOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);//打印出遥控器
        System.out.println("---Pushing Marco On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing Marco Off---");
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
    }
}

