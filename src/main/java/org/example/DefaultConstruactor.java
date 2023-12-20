package org.example;



class Animal{
    private int animalID;
    private String animalName;
    private int  animalAge;

    public Animal(){
        this.animalID = 1;
        this.animalName = "dog";
        this.animalAge = 8;
    }

    public Animal(int aID, String aName, int aAge){
        this.animalID = aID;
        this.animalName = aName;
        this.animalAge = aAge;
    }

    public void DisplayDetails(){
        System.out.println("Student ID : " + animalID);
        System.out.println("Student Name : " + animalName);
        System.out.println("Student Age : " + animalAge);
    }

}
public class DefaultConstruactor {
    public static void main(String[] arg){
        Animal animal = new Animal();
        animal.DisplayDetails();

        Animal animal1 = new Animal(2,"cat",3);
        animal1.DisplayDetails();
    }

}
