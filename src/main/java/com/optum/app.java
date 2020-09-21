package com.optum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "springapp.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();

        Workforce wf = (Workforce) context.getBean("taskforce");
        wf.display();

        Employee e1 = new Employee();
        e1.setName("Rohan");
        e1.setSalary(16000);
        wf.addEmployee("004", e1);
        wf.display();

        wf.removeEmployee("004");
        wf.display();

        Employee sr = (Employee) context.getBean("Srikar");
        sr.setSalary(12000);
        wf.updateEmployee("001", sr);
        wf.display();
    }
}
