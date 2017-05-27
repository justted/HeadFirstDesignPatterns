package com.justted.chapter11.proxy.virtualproxystate;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by justted on 2017/5/8.
 */
public class ImageProxy implements Icon{    //客户端中除了状态及其相关实例，最好不要放本来的任何实例

    State imageLoaded;
    State imageNotLoaded;
    State state = imageNotLoaded;

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getImageLoaded() {
        return imageLoaded;
    }

    public State getImageNotLoaded() {
        return imageNotLoaded;
    }

    public void setImageLoaded(State imageLoaded) {
        this.imageLoaded = imageLoaded;
    }

    public void setImageNotLoaded(State imageNotLoaded) {
        this.imageNotLoaded = imageNotLoaded;
    }

    public ImageProxy(URL url) {
        imageNotLoaded = new ImageNotLoaded(this, url);
        imageLoaded = new ImageLoaded();
        state = imageNotLoaded;
    }


    @Override
    public int getIconWidth() {
        return state.getWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }
}
