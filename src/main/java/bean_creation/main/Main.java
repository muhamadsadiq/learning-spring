package bean_creation.main;

import bean_creation.beans.Vehicle;
import bean_creation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Vehicle vehicle = context.getBean(Vehicle.class);
//        System.out.println(vehicle.getName());

        Vehicle vehicle1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println(vehicle1.getName());

        Vehicle BMW = context.getBean("BMW",Vehicle.class);
        System.out.println(BMW.getName());
    }
}
