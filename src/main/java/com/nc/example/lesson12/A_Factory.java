package com.nc.example.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Properties;

public class A_Factory {

    private static Properties PROPERTIES = new Properties();

    public A_Factory() {
    }

    public static A newInstance() {
        A a = new A();
        Class<? extends A> c = a.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field: fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation: annotations) {
                if (annotation instanceof PropertyValue) {
                    PropertyValue propertyValue = (PropertyValue) annotation;
                    String value = propertyValue.value();
                    if (value.startsWith("$")) {
                        String parsedValue = value.substring(value.indexOf("{")+1, value.indexOf("}"));
                        try {
                            PROPERTIES.load(new FileReader("dataBase.properties"));

                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        field.setAccessible(true);
                        String property = PROPERTIES.getProperty(parsedValue);
                        try {
                            field.set(a, property);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        field.setAccessible(false);
                    }

                }

                else if (annotation instanceof  PropertyObjectValue) {
                    PropertyObjectValue propertyObjectValue = (PropertyObjectValue) annotation;
                    String value = propertyObjectValue.value();
                    if (value.startsWith("$")) {
                        String parsedValue = value.substring(value.indexOf("{")+1, value.indexOf("}"));
                        try {
                            PROPERTIES.load(new FileReader("dataBase.properties"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        field.setAccessible(true);
                        String setValue = PROPERTIES.getProperty(parsedValue);
                        try {
                            Class clazz = Class.forName(setValue);
                            Object obj = clazz.newInstance();
                            if (obj instanceof SetObject) {
                                field.set(a, obj);
                            }
                        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
                            e.printStackTrace();
                        }
                        field.setAccessible(false);
                    }
                }
            }
        }
        return a;
    }
}
