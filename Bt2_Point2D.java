package baitaptuan1;

public class Bt2_Point2D {
    public float x;
    public float y;

    public Bt2_Point2D(float x, float y){
        super();
        this.x=x;
        this.y=y;
    }
    public Bt2_Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float [] getXY(){
        float[] array = {this.x,this.y};
        return array;
    }
    public String toString(){
        return " Tọa độ x : "
                + this.getX()
                +" Tọa độ y : "
                +this.getY();
    }
}
class Point2DTest{
    public static void main(String[] args) {
        Bt2_Point2D bt2_point2D = new Bt2_Point2D();
        System.out.println(bt2_point2D);

        bt2_point2D = new Bt2_Point2D(2.0f,3.0f);
        System.out.println(bt2_point2D);
    }
}
class Point3D extends Bt2_Point2D{
    private float z;
    public Point3D(){
        super();
        this.z=0.0f;
    }
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y , float z){
        setXY(x,y);
        this.z=z;
    }
    public float [] getXYZ(){
        float [] Array = {this.getX(),this.getY(),z};
        return Array;
    }
    public String  toString(){
        return "Tọa độ z là : "
                +this.getZ()
                +" và là con của : "
                +super.toString();
    }


}
class Point3DTest{
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(7.0f,8.0f,9.0f);
        System.out.println(point3D);

        point3D.setZ(7.9f);
        System.out.println(point3D);

        point3D.setXYZ(1,2,3);
        float [] array = point3D.getXYZ();
        for (float i :
             array) {
            System.out.println(i);
        }

    }
}

