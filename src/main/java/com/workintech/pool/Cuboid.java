package com.workintech.pool;

public class Cuboid extends Rectangle{
    double height;

    public Cuboid(double width, double lenght, double height){
        super(width, lenght);
        if(height < 0){
            this.height =0;
        }
        else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}
