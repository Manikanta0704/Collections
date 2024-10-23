package com.lvg.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lvg.springdemo.beans.Wish;

public class App {
    public static void main(String[] args) {
      
        ClassPathXmlApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
        Wish w=container.getBean("wish1",Wish.class);
        System.out.println(w.getMessage());
        container.close();
    
    }
}
