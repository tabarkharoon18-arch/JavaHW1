
package hw1;


public class Store <T extends Device>{
 private T item ;
 public void addItem(T item){
     this.item=item;
 System.out.println("Added:"+item.getName());
 
 }
 public void useItem(){
     if (item!=null){item.turnOn();}
     else {System.out.println("Store is empty.");}
 }
     public T getItem(){return item;}
 }


