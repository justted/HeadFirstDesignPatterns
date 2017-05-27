package com.justted.chapter11.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by justted on 2017/5/9.
 */
class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {     //在TestDrive中，第一张图片用的是构造器传入icon
        this.icon = icon;
    }

    public void setIcon(Icon icon) {     //第二张开始的图片则用的是setIcon方法传入icon
        this.icon = icon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w)/2;
        int y = (600 - h)/2;
        icon.paintIcon(this, g, x, y);
    }
}
