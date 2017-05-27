package com.justted.chapter11.proxy.virtualproxystate;

import java.awt.*;

/**
 * Created by justted on 2017/5/15.
 */
public interface State {
    int getWidth();
    int getHeight();
    void paintIcon(final Component c, Graphics g, int x, int y);
}
