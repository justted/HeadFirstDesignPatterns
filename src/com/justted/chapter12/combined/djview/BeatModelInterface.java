package com.justted.chapter12.combined.djview;

/**
 * Created by justted on 2017/5/24.
 * 节拍模型接口
 */
public interface BeatModelInterface {

    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    //以上方法是让控制器调用的，控制器根据用户的操作而对模型做出适当的处理

    int getBPM();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
    //这些方法允许视图和控制器取得状态，并变成观察者
}
