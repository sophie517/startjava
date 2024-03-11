
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.gender = "мужской";
        wolfOne.name = "Тузик";
        wolfOne.color = "серый";
        wolfOne.weight = 35.3f;
        wolfOne.age = 8;

        System.out.println("Пол: " + wolfOne.gender);
        System.out.println("Кличка: " + wolfOne.name);
        System.out.println("Вес: " + wolfOne.weight);
        System.out.println("Возраст: " + wolfOne.age);
        System.out.println("Окрас: " + wolfOne.color);

        System.out.println("\nЧто делает: ");
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}