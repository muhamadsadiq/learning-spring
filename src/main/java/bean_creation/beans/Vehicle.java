package bean_creation.beans;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    * this method execute after the bean created
    */
    @PostConstruct
    public void initialize(){
        this.name = "G Class";
    }
}
