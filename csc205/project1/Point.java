package com.csc205.project1;

import java.awt.*;
import java.lang.Math;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Point extends Project1{
    double x;
    double y;

    public double distance(Point b){

        return Math.sqrt(Math.pow(b.getX()-x, 2)+Math.pow(b.getY()-y, 2));
    }

    public Point() {
        x=0;
        y=0;
    }
    public Point(double i, double j) {
        x = i;
        y = j;
    }

    public double getX(){
        return x;
    }
    public void setX(double i){
        x=i;
    }
    public double getY(){
        return y;
    }
    public void setY(double j){
        y=j;
    }
    public void setPoint(double i, double j){
        x=i;
        y=j;
    }
    public void shiftX(double i){
        x+=i;
    }
    public void shiftY(double j){
        y+=j;
    }
    public void rotate(double r){
        double xr = x;
        double yr = y;

        x = xr*cos(r) - yr*sin(r);
        y = xr*sin(r) + yr*cos(r);
    }
    public String toString(){
        return "Point{x="+x+", y="+y+"}";
    }
}