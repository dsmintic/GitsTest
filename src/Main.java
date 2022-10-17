public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Damir Šmintić", "Zagreb",42);
        Person person2 = new Person("Denis Križak", "Zagreb", 35);
        System.out.println(person1.getName() + " - " + person1.getCity() + " - " + person1.getYear());
        System.out.println(person2.getName());

    }
}
