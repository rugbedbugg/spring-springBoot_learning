package org.rugbedbugg;


public class Dev
{
    private Computer com_var;
    int age_var;
    int salary_var;

    public Dev() {System.out.println("Dev constructor");} // MANDATORY if <property> tag used in XML file, else OPTIONAL
    public Dev(int age, int salary, Computer com) {
        // Parameters mentioned here must EXACTLY match the parameters initialized by the <constructor-arg> tags
        this.age_var = age;
        this.salary_var = salary;
        this.com_var = com;
        System.out.println("Dev constructor");
    }

    public void build()
    {
        System.out.println("Working on an Awesome project");
        com_var.compile();
    }

    public void setAge_var(int age) {this.age_var = age;}
    public int getAge_var() {return this.age_var;}

    public void setSalary_var(int salary) {this.salary_var = salary;}
    public int getSalary_var() {return this.salary_var;}

    public void setCom_var(Computer com) {this.com_var = com;}
    public Computer getCom_var() {return com_var;}
}
