package com.justted.chapter11.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by justted on 2017/5/8.
 */
public class ImageProxy implements Icon{
    ImageIcon imageIcon;    //代理还是要创建一个ImageIcon，这个本身也是实现Icon接口的
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {   //通过构造器传入URL
        this.imageURL = url;
    }    //传入具体的URL给代理的构造器

    @Override
    public int getIconWidth() {
        if (imageIcon != null){   //如果图像本身有宽度，直接返回其本身宽度，否则返回指定宽度，高度同理
            return imageIcon.getIconWidth();
        }else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null){
            return imageIcon.getIconHeight();
        }else {
            return 600;
        }
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null){
            imageIcon.paintIcon(c, g, x, y);     //如果已经有icon，就让他画出自己
        }else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);   //否则，就显示这个“加载中”的消息，drawString方法即为写出字符串，然后是其坐标
            if (!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {      //整个runnable都放在了thread的构造器里，也在这里加载真正的icon，这里不用线程的话，就不会有“加载中...”的消息了
                    @Override
                    public void run() {
                        try{
                            imageIcon = new ImageIcon(imageURL, "CD Cover");   //ImageIcon的构造器，重写了？
                            c.repaint();    //重绘
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
