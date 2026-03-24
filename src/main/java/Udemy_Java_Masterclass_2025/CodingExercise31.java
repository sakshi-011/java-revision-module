package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise31 {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String fname){
        firstName = fname;
    }

    public void setLastName(String lname){
        lastName = lname;
    }

    public void setAge(int age){
        if(age < 0 || age > 100)
            this.age = 0;
        else this.age = age;
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty())
            return "";
        else if(lastName.isEmpty())
            return firstName;
        else if(firstName.isEmpty())
            return lastName;
        else
            return firstName+" "+lastName;

    }
}
