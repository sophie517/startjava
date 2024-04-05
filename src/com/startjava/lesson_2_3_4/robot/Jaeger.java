package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String weapon;
    private float height;
    private int weight;
    private int numOfKilledKaiju;

    public Jaeger() {}

    public Jaeger(String modelName, String weapon, float height, int weight, int numOfKilledKaiju) {
        this.modelName = modelName;
        this.weapon = weapon;
        this.height = height;
        this.weight = weight;
        this.numOfKilledKaiju = numOfKilledKaiju;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumOfKilledKaiju() {
        return numOfKilledKaiju;
    }

    public void setNumOfKilledKaiju(int numOfKilledKaiju) {
        this.numOfKilledKaiju = numOfKilledKaiju;
    }

    public boolean isWeaponReady() {
        return true;
    }

    public String attack() {
        return modelName + " атакует Кайдзю";
    }

    public void blockAttack() {
        System.out.println(modelName + " блокировал атаку Кайдзю");
    }
}