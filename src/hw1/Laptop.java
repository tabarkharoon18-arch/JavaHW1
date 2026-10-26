
package hw1;


 class Laptop extends Device {
    public Laptop (String name){super (name);}
    @Override
    public void turnOn(){System.out.println(getName()+"is turning on the Laptop.");}  
}
