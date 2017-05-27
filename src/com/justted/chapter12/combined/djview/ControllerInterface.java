package com.justted.chapter12.combined.djview;

/**
 * Created by justted on 2017/5/25.
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}

