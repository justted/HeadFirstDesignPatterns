package com.justted.chapter12.combined.djview;

/**
 * Created by justted on 2017/5/25.
 */
public class BeatController implements ControllerInterface {
    BeatModelInterface model;
    DJView view;                 //控制器必须同时和模型以及视图接触，来当两者的粘结剂

    public BeatController(BeatModelInterface model) {
        this.model = model;
        view = new DJView(this, model);    //把控制器和模型当成参数传入创建视图的构造器中
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
        model.initialize();
    }

    public void start() {
        model.on();
        view.disableStartMenuItem();
        view.enableStopMenuItem();
    }

    public void stop() {
        model.off();
        view.disableStopMenuItem();
        view.enableStartMenuItem();
    }

    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}

