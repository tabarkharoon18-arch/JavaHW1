
package hw1;


class Phone extends Device {
    public Phone (String name){super (name);}
    @Override
    public void turnOn(){System.out.println(getName()+"is turning on the phone.");}    
}
