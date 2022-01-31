class Student{

    int rollno;
    String name;

    void insertRecord(int r,String n){//Method to initialize object

        rollno=r;
        name=n;
    }

    void displayInformation(){

        System.out.println(rollno+" "+name);// printing data
    }
}

public class TestStudent1 {


    public static void main(String[] args) {

        //Creating objects
        Student s1=new Student();
        Student s2=new Student();
        //Initializing objects by calling the method 
        s1.insertRecord(111, "Nikaela");
        s2.insertRecord(222, "Ana");
        s1.displayInformation();
        s2.displayInformation();
        
    }

    
}