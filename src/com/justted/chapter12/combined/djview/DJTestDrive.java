package com.justted.chapter12.combined.djview;

/**
 * Created by justted on 2017/5/25.
 */
public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();    //建立一个模型
        ControllerInterface controller = new BeatController(model);    //创建一个控制器，然后将模型传给它。控制器创建视图，所以不需要“把控制器介绍给视图”
    }
}

