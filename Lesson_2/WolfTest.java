
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setGender("мужской");
        wolfOne.setName("Тузик");
        wolfOne.setColor("серый");
        wolfOne.setWeight(35.3f);
        wolfOne.setAge(7);

        System.out.println("Пол: " + wolfOne.getGender());
        System.out.println("Кличка: " + wolfOne.getName());
        System.out.println("Вес: " + wolfOne.getWeight());
        System.out.println("Возраст: " + wolfOne.getAge());
        System.out.println("Окрас: " + wolfOne.getColor());

        System.out.println("\nЧто делает: ");
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}