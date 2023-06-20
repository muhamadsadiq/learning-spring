package bean_creation.config;


import bean_creation.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {


    @Bean
    Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }
    /*
     * 2 beans with the same datatype if we don't specify the name in the context getBean() method
     * we will get No uniqueBeanDefinitionException
     * by default bean name is the method name
    */
    @Bean
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("honda");
        return vehicle;
    }
    /*
     * in this bean we provide a custom name for the bean
     * you can also use name property or just type the custom name
     * by adding the primary annotation we tell the spring to choose this bean when we don't specify the name
    */
    @Primary
    @Bean(value = "BMW")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

}
