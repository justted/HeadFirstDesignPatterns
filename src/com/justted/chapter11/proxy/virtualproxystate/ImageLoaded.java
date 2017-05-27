package com.justted.chapter11.proxy.virtualproxystate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by justted on 2017/5/15.
 */
public class ImageLoaded implements State {
    private ImageIcon imageIcon;

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }   //用setter代替构造器，更灵活

    @Override
    public int getWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);
    }

}
