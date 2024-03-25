package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Coyote Tango");
        jaegerOne.setWeapon("Ballistic mortar cannons");
        jaegerOne.setHeight(85.34f);
        jaegerOne.setWeight(7450);
        jaegerOne.setNumOfKilledKaiju(2);
        
        Jaeger jaegerTwo = new Jaeger("Saber Athena", "Ionic Twinblades", 76.91f, 1680, 1);

        System.out.println("Характеристики");
        System.out.printf("%-30s%-30s%s%n", "Модель", jaegerOne.getModelName(), jaegerTwo.getModelName());
        System.out.printf("%-30s%-30s%s%n", "Оружие", jaegerOne.getWeapon(), jaegerTwo.getWeapon());
        System.out.printf("%-30s%-30.2f%.2f%n", "Высота", jaegerOne.getHeight(), jaegerTwo.getHeight());
        System.out.printf("%-30s%-30d%d%n", "Вес", jaegerOne.getWeight(), jaegerTwo.getWeight());
        System.out.printf("%-30s%-30d%d%n%n", "Количество убитых Кайдзю", jaegerOne.getNumOfKilledKaiju(), 
                jaegerTwo.getNumOfKilledKaiju());
        
        if (jaegerOne.isWeaponReady()) {
            System.out.println("Оружие " + jaegerOne.getModelName() + " активировано" );
        } else {
            System.out.println("Оружие " + jaegerOne.getModelName() + " еще не активировано");
        }
        
        System.out.println(jaegerOne.attack());
        jaegerTwo.blockAttack();

        jaegerOne.setNumOfKilledKaiju(jaegerOne.getNumOfKilledKaiju() + 2);
        jaegerTwo.setNumOfKilledKaiju(jaegerTwo.getNumOfKilledKaiju() + 1);

        System.out.printf("%n%-30s%-30d%d%n", "Количество убитых Кайдзю", jaegerOne.getNumOfKilledKaiju(), 
                jaegerTwo.getNumOfKilledKaiju());
    }
}