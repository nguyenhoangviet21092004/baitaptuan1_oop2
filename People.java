package baitaptuan1;

public class People {
    public String name ;
    public boolean gender ;
    public int age ;

    People() {
        this.name = "ten mac dinh " ;
        this.gender = false ;
        this.age = 0 ;
    }

    People(String name , int age , boolean gender) {
        this.name = name ;
        this.gender = gender ;
        this.age = age ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("an !");
    }

    public void sleep() {
        System.out.println("ngu !");
    }

    public String toString() {
        return "A people with name : " + getName() + "" + "age " + getAge() + "" + "Sex" + (isGender() ?  "nam" : "nu") ;
    }


}

class Student extends People {


    public String classname ;

    public Student() {
       super();
        this.classname = "" ;

    }
    public Student(String classname) {
       super();
       this.classname = classname ;
    }

    public Student(String classname , String name , int age , boolean gender) {
       super(name, age, gender);
       this.classname = classname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void study() {
        System.out.println("dang hoc bai");
    }

    public String toString() {
        return "A student with class name " + getClassname() + "which is a subclass of " + super.toString();
    }


}

class Employee extends People {
    public String enterprise ;

    public Employee() {
       this.enterprise = "Codegym" ;
    }

    public Employee(String enterprise) {
        this.enterprise = enterprise ;
    }

    public Employee(String name , int age , boolean gender , String enterprise ) {
        super(name, age, gender);
        this.enterprise = enterprise ;

    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public void work() {
        System.out.println("lam viec");
    }

    public String toString() {
        return "A employee work at enterprise " + "" + getEnterprise() + " which is a subclass" + super.toString() ;
    }
}

 class EmployeeTest {
     public static void main(String[] args) {
         Employee emloyee = new Employee();
         System.out.println(emloyee);

         emloyee = new Employee("nguyen hoang viet" , 21 , true , "fpt");
         System.out.println(emloyee);

         emloyee.work();
         emloyee.setEnterprise("viettel");
         System.out.println(emloyee);
     }
}
