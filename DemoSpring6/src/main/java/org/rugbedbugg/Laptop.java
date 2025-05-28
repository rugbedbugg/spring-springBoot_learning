package org.rugbedbugg;

public class Laptop implements Computer {
    int manufacturedYear_var;

    public Laptop() {System.out.println("Laptop Constructor");}
    public Laptop(int manufacturedYear)
    {
        this.manufacturedYear_var = manufacturedYear;
        System.out.println("Laptop Constructor");
    }

    public void compile()
    {
        System.out.println("Compiling...");
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
