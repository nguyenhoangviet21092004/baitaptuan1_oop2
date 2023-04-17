package baitaptuan1;

public class Circle {
    public double radius ;
    public String color ;

   public Circle() {

   }
    public Circle(double radius , String color) {
        this.radius  = radius ;
        this.color = color ;
    }

    public double getR() {
        return radius;
    }

    public void setR(int r) {
        this.radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     @Override

     public String toString() {
         return "djb djb jdb" + getColor() + getR() ;
     }

     public double Area() {
         return this.radius * this.radius * Math.PI;
     }

}

class Cylinder extends  Circle {
     public double height ;

     public Cylinder () {
         this.height = 0 ;
     }

     public Cylinder(double height) {
         this.height = height ;
     }

     public Cylinder(double height , double radius, String color){
         super(radius,color);
         this.height = height ;
     }

     public double thetich() {
         return Area() * this.height ;
     }


     public String toString() {
         return "in ra thong tin" + getColor()  + " !!!" + super.toString();
     }


}

class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder() ;
        System.out.println(cylinder);

        cylinder = new Cylinder(20,3,"blue");
        System.out.println(cylinder);

        System.out.println( cylinder.Area());
        System.out.println(cylinder.thetich());

    }
}

