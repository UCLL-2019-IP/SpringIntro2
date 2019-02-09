package be.ucll.spring.ui;

import be.ucll.spring.domain.Rectangle;
import be.ucll.spring.domain.Triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Triangle triangle1 = (Triangle)context.getBean("triangle");
        // do the same thing but using an alias
        Triangle triangle2 = (Triangle)context.getBean("triangle-alias");

        triangle1.draw();
        triangle2.draw();
        System.out.println(triangle2);

        Rectangle rectangle = (Rectangle)context.getBean("rectangle");
        rectangle.draw();
        System.out.println(rectangle);
    }
}
