package com.justted.chapter12.combined.djview;

/**
 * Created by justted on 2017/5/25.
 */
public class HeartTestDrive {

    public static void main (String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}

