package com.justted.chapter8.templatemethod.MyApplet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Created by justted on 2017/4/21.
 * 这个applet并没有用上网上下载的源代码的appletsource文件，现在还不懂
 */
public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

