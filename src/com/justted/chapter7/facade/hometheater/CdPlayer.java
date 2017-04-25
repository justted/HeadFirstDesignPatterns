package com.justted.chapter7.facade.hometheater;

/**
 * Created by justted on 2017/4/13.
 */
public class CdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println(description + " on");
    }

    public void off(){
        System.out.println(description + " off");
    }

    public void eject(){
        title = null;
        System.out.println(description + " eject");
    }

    public void play(String title){
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"" );  //此处的\"为转义字符，因为我们要打印出双引号，但是打印语句中双引号会识别错误，所以必须用转义字符
    }

    public void play(int track){
        if (title == null){
            System.out.println(description + " can't play track " + track + ", no cd inserted");
        }else {
            currentTrack = track;
            System.out.println(description + " playing track " + track);
        }
    }

    public void stop(){
        currentTrack = 0;
        System.out.println(description + " stopped");
    }

    public void pause(){
        System.out.println(description + " paused \"" + title + "\"");
    }

    public String toString(){
        return description;
    }
}
