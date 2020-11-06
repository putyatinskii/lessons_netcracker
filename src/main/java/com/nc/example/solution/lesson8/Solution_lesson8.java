package com.nc.example.solution.lesson8;

import java.lang.reflect.Method;

import com.nc.example.LessonAPI;
import com.nc.example.lesson8.Role;

public class Solution_lesson8 implements LessonAPI {
    @Override
    public void executeSolution(String[] args) {
        Role role = new Role();
        Class<? extends Role> clazz = role.getClass();
        Class<Role> roleClass = Role.class;
        System.out.println(clazz.getName());
        System.out.println(roleClass.getName());
        for (Method declaredMethod: clazz.getDeclaredMethods()) {
            System.out.println(declaredMethod.getName());
        }
        System.out.println(role instanceof  Object);
    }
}
