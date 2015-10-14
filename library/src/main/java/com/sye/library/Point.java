/**
 * @(#) Point 2015/8/18
 * <p>
 * Copyright (c), 2009 深圳孔方兄金融信息服务有限公司（Shenzhen kfxiong
 * Financial Information Service Co. Ltd.）
 * <p>
 * 著作权人保留一切权利，任何使用需经授权。
 */
package com.sye.library;

public class Point {
    public static int STATE_NORMAL = 0;
    public static int STATE_PRESS = 1;
    public static int STATE_ERROR = 2;

    float x;
    float y;
    int state = STATE_NORMAL;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distance(Point a) {
        float distance = (float) Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
        return distance;
    }

}
