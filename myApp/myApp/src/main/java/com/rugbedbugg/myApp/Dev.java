package com.rugbedbugg.myApp;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Dev
{
    //@Autowired // Field injection
    //@Qualifier("laptop") // To resolve priority when multiple Beans exist
    Computer comp; // assigned null by default (but)

    // Constructor injection
    //public Dev(Computer comp){this.comp = comp;}

    // Setter Injection
    @Autowired
    public void setComp(Computer comp){this.comp = comp;}

    public void build()
    {
        System.out.println("Working on an Awesome project");
        comp.compile();
        comp.debug();
    }
}
