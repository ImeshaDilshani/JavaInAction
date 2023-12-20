package org.example;


 class Person{
     private String firstName;
     private String lastName;

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }
 }
public class Encapsulation {
    public static void main(String[] arg){
        Person person = new Person();
        person.setFirstName("Imesha");
        System.out.println(person.getFirstName());
        person.setLastName("Dilshani");
        System.out.println(person.getLastName());

    }


}
