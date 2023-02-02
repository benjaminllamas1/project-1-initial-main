package com.csc205.project1;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
class PointTest {

    Point q= new Point(1,1);
    Point qq= new Point(4,4);
    @org.junit.jupiter.api.Test
    void distancetest() {
        double expected = 4.24264;
        double actual = q.distance(qq);
    }

    @org.junit.jupiter.api.Test
    void shiftXtest() {
        qq.shiftX(3.0);
        double expected = 7;
        double actual = qq.getX();
        Assertions.assertEquals(expected,actual);
        qq.setX(4);
    }

    @org.junit.jupiter.api.Test
    void shiftYtest() {
        q.shiftY(9.0);
        double expected = 10;
        double actual = q.getY();
        Assertions.assertEquals(expected,actual);
        q.setY(1);
    }

    @org.junit.jupiter.api.Test
    void rotatetest() {
        qq.rotate(10);
        double expectedx = -1.1802016727483307;
        double expectedy = -5.532370559863288;
        double actualx = qq.getX();
        double actualy = qq.getY();
        Assertions.assertEquals(expectedx,actualx);
        Assertions.assertEquals(expectedy,actualy);

    }
    }