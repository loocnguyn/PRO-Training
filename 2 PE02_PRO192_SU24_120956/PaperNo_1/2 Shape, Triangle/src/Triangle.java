
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Triangle extends  Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean isValidData(){
        if(a < b + c && b < a +c && c < a +b)
            return true;
        return false;
    }
    @Override
    public double calArea() {
        double p;
        p = calPerimeter() /2;
        if(!isValidData())
            return 0;
        else
            return sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calPerimeter() {
        if(!isValidData())
            return 0;
        else
            return a + b + c;
    }

    @Override
    public String toString() {
        return color  + ", " + String.format("%.2f", a) + ", " + String.format("%.2f", b) + ", " + String.format("%.2f", c);
    }
    
}
