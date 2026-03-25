package com.niit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Setter 依赖注入演示
 */
public class Main 
{
    public static void main( String[] args )
    {
        // 加载 Spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 从容器中获取 Student Bean
        Student student = (Student) context.getBean("student");
        
        // 输出学生信息，验证依赖注入是否成功
        System.out.println("Student Information: " + student);
        System.out.println("\nDependency Injection Demo Successful!");
        System.out.println("- Basic Type Value (name): " + student.getName());
        System.out.println("- Object Type Value (address): " + student.getAddress());
        System.out.println("- City: " + student.getAddress().getCity());
    }
}
