package be.ucll.spring.domain;

import org.springframework.beans.factory.BeanNameAware;

// BeanNameAware is one of the Aware methods like ApplicationContextAware
public class Triangle implements BeanNameAware {
    private Point pointA, pointB, pointC;
    private String beanName;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Triangle drawn at points:");
        System.out.println("A: (" + getPointA().getX() + ", " + getPointA().getY() +")");
        System.out.println("B: (" + getPointB().getX() + ", " + getPointB().getY() +")");
        System.out.println("C: (" + getPointC().getX() + ", " + getPointC().getY() +")");
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }


}
