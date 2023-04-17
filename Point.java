package baitaptuan1;

public class Point {
    public float x ;
    public float y ;
    public Point (float x , float y ) {
        this.x = x ;
        this.y = y ;
    }

    public Point() {
        this.x = 0.0f ;
        this.y = 0.0f ;
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

    public void setXY(float x , float y) {
        this.x = x ;
        this.y = y ;
    }

    public float [] getXY() {
        float [] array = {this.x , this.y};
        return array ;
    }

    public String toString() {
        return "x la : " + getX() + "y la : " + getY() ;
    }
}

class TestPoint{
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2,3);
        System.out.println(point);
    }
}

class MovablePoint extends Point{
    public float Speed_x ;
    public float Speed_y;

    public MovablePoint() {
        this.Speed_x = 0.0f ;
        this.Speed_y = 0.0f ;
    }

    public MovablePoint(float speed_x , float speed_y) {
        this.Speed_x = speed_x ;
        this.Speed_y = speed_y ;
    }

    public float getSpeed_x() {
        return Speed_x;
    }

    public void setSpeed_x(float speed_x) {
        Speed_x = speed_x;
    }

    public float getSpeed_y() {
        return Speed_y;
    }

    public void setSpeed_y(float speed_y) {
        Speed_y = speed_y;
    }

    public void setSpeed(float Speed_x , float Speed_y)  {
        this.Speed_x = Speed_x ;
        this.Speed_y = Speed_y ;
    }

    public float [] getSpeed() {
        float [] array = {this.Speed_x , this.Speed_y} ;
        return  array ;
    }

    public String toString() {
        return super.toString()
                + "speed: "
                + getSpeed_x()
                + ", "
                + getSpeed_y();
    }
    public MovablePoint move(){
        x += Speed_x;
        y += Speed_y;
        return this;
    }


}

class TestMovablePoint{
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(2,3);
        System.out.println(movablePoint);


    }
}
