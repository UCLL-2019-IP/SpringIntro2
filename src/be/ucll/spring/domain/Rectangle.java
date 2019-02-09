package be.ucll.spring.domain;

import java.util.List;

public class Rectangle {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        System.out.println("Rectangle drawn at points:");
        for(Point point: points){
            System.out.println("point: (" + point.getX() + ", " + point.getY() +")");
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "points=" + points +
                '}';
    }
}
