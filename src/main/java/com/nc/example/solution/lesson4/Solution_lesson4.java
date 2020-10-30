package com.nc.example.solution.lesson4;
import com.nc.example.lesson4.*;

public class Solution_lesson4 {
    public static void run(String[] args) {
        Figure circle = new Circle(5);
        Figure square = new Square(5);
        Figure[] mas = new Figure[] {circle, square};

        for (Figure elem: mas) {
            System.out.println(elem.square());
            System.out.println(elem.perimeter());
            elem.draw();
        }
        
    }
}
