package org.rugbedbugg;

public class Desktop implements Computer {
    int manufacturedYear_var;

    public Desktop() {System.out.println("Desktop Constructor");}
    public Desktop(int manufacturedYear)
    {
        this.manufacturedYear_var = manufacturedYear;
        System.out.println("Desktop Constructor");
    }

    public void compile()
    {
        System.out.println("Compiling faster...");
    }
    public void setManufacturedYear_var(int manufacturedYear)
    {
        this.manufacturedYear_var = manufacturedYear;
    }
    public int getManufacturedYear_var()
    {
        return this.manufacturedYear_var;
    }
}
