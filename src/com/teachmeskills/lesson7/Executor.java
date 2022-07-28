package com.teachmeskills.lesson7;

import com.teachmeskills.lesson7.employees.*;
import com.teachmeskills.lesson7.shapes.Rectangle;
import com.teachmeskills.lesson7.shapes.Shape;
import com.teachmeskills.lesson7.shapes.Square;
import com.teachmeskills.lesson7.shapes.Triangle;

import java.util.Date;

import static com.teachmeskills.lesson7.Utils.*;

public class Executor {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 10, 5.3);
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(1.5);

        Triangle triangle1 = new Triangle();
        triangle1.setSideA(5);
        triangle1.setSideB(5);
        triangle1.setSideC(5);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setSideA(15.5);
        rectangle1.setSideA(9.84);

        Shape[] shapes = new Shape[]{triangle, rectangle, square, rectangle1, triangle1};

        for (Shape shape : shapes) {
            print(shape);
        }

        Accountant accountant = new Accountant("John Snow", new Date());
        Director director = new Director("Eugen Demyanovich", new Date());
        Worker worker = new Worker("Kolya", new Date());

        Printable[] employees = new Printable[]{accountant, director, worker};

        for (Printable employee : employees) {
            employee.printJobTitle();
        }

    }
}
