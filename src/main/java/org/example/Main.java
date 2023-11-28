package org.example;

import org.example.model.ResizableCircle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(3.5) ;
        System.out.println("Radius = 3.5");
        System.out.println("Chu Vi: " + resizableCircle.getPerimeter() + "\nDien tich: "+ resizableCircle.getArea());
        System.out.println("Nếu giảm xuống 90% của bán kính thì chu vi và diện tích là: ");
        resizableCircle.resize(90);
        System.out.println("Chu Vi: " + resizableCircle.getPerimeter() + "\nDien tich: "+ resizableCircle.getArea());
    }
}