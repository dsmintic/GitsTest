public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Damir Šmintić", "Zagreb",42);
        System.out.println(person1.getName() + " - " + person1.getCity());
        System.out.println(person1.getName());
        System.out.println(person1.getCity());
        System.out.println(person1.getYear());

    }
}
