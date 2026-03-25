package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise33 {

    private int x;
    private int y;

    public CodingExercise33(){}

    public CodingExercise33(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }

    public double distance(CodingExercise33 p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }

    public static void main(String[] args) {
        CodingExercise33 c = new CodingExercise33(6,5);
        System.out.println(" distance from origin(0,0) : " + c.distance());
        System.out.println(" distance from point(2,2) : " + c.distance(2,2));
        System.out.println(" distance from point(3,1) : " + c.distance(new CodingExercise33(3,1)));
    }
}
