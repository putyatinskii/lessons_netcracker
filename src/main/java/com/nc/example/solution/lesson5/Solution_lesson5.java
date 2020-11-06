package com.nc.example.solution.lesson5;
import com.nc.example.LessonAPI;
import com.nc.example.lesson5.Classwork.Circle;
import com.nc.example.lesson5.Classwork.Figure;
import com.nc.example.lesson5.Classwork.Square;

public class Solution_lesson5 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
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
