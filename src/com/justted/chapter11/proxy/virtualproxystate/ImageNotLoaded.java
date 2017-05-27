package com.justted.chapter11.proxy.virtualproxystate;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by justted on 2017/5/15.
 */
public class ImageNotLoaded implements State {
    private ImageProxy imageProxy;
    private URL imageURL;
    private ImageIcon imageIcon;
    private boolean retrieving = false;
    private Thread retrievalThread;


    public ImageNotLoaded(ImageProxy imageProxy, URL imageURL) {
        this.imageProxy = imageProxy;
        this.imageURL = imageURL;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }  //通过getter来取得imageIcon

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public int getWidth() {
        return 800;
    }

    @Override
    public int getHeight() {
        return 600;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover, please wait...", x+300, y+190);
        if (!retrieving) {
            retrieving = true;

            retrievalThread = new Thread(new Runnable() {
                public void run() {
                    try {
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        imageProxy.setState(imageProxy.getImageLoaded());   //实现状态转换
                        ((ImageLoaded)imageProxy.getImageLoaded()).setImageIcon(((ImageNotLoaded)imageProxy.getImageNotLoaded()).getImageIcon()); //这里实现了ImageIcon的传递
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            retrievalThread.start();
        }
    }

}

