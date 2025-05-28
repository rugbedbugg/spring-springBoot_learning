package com.rugbedbugg.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer
{
    public Laptop() {System.out.println("Laptop Constructor");}

    public void compile(){System.out.println("Compiling with 404 bugs");}
    public void debug(){System.out.println("Debugging 69 errors");}
}
