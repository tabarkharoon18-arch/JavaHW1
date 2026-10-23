package hw1;
import java.awt.*;

public class HW1 {

    
    public static void main(String[] args) {
      Store<Phone>PhoneStore = new Store<>();
      PhoneStore.addItem(new Phone("Samsung"));
      PhoneStore.useItem();
      System.out.println("------------------");
       Store<Laptop>LabtopStore = new Store<>();
      LabtopStore.addItem(new Laptop("DELL"));
      LabtopStore.useItem();
      System.out.println("------------------");
      Phone p = PhoneStore.getItem();
      System.out.println("Retrieved"+p.getName()); 
    }
    
}
