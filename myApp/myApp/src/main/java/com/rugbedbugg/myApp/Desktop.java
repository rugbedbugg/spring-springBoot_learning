package com.rugbedbugg.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer
{
    public Desktop() {System.out.println("Desktop Constructor");}

    public void compile(){System.out.println("Compiling with 404 bugs but faster");}
    public void debug(){System.out.println("Debugging 69 errors but faster");}
}
