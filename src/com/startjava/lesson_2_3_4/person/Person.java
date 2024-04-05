package com.startjava.lesson_2_3_4.person;

public class Person {

    String gender = "male";
    String name = "John";
    float height = 183.5f;
    float weight = 70.2f;
    int age = 32;

    void walk() {
        System.out.println("Человек идет");
    }

    void sit() {
        System.out.println("Человек сидит");
    }

    void run() {
        System.out.println("Человек бежит");
    }

    void talk() {
        System.out.println("Человек говорит");
    }

    void learnJava() {
        System.out.println("Человек учит Java");
    }
}