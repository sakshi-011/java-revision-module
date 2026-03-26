package main.java.Udemy_Java_Masterclass_2025;

public class CodingExercise35 {

    private double real;
    private double imaginary;

    public CodingExercise35(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double r, double i){
        real += r;
        imaginary += i;
    }

    public void add(CodingExercise35 c){
        real += c.getReal();
        imaginary += c.getImaginary();
    }

    public void subtract(double r, double i){
        real -= r;
        imaginary -= i;
    }

    public void subtract(CodingExercise35 c){
        real -= c.getReal();
        imaginary -= c.getImaginary();
    }

    public static void main(String[] args) {
        CodingExercise35 one = new CodingExercise35(1.0, 1.0);
        CodingExercise35 number = new CodingExercise35(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
