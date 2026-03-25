package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise32 {

    private double width;
    private double height;

    public CodingExercise32(){
    }

    public CodingExercise32(double width, double height){
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    public double getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        CodingExercise32 c = new CodingExercise32();
        c.setHeight(5.4);
        c.setWidth(4.8);
        System.out.println(" Height : "+c.getHeight());
        System.out.println(" Width : "+c.getWidth());
        System.out.println(" Area : "+c.getArea());
        c.setWidth(8);
        System.out.println(" New Width : "+c.getWidth());
        System.out.println(" New Area : "+c.getArea());
    }
}
