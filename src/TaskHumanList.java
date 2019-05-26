import java.util.ArrayList;
import java.util.List;

public class TaskHumanList {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            humans.add(new Human(20 + i, "Petya " + i));
        }
        System.out.println(humans);
        humans.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(humans);
        humans.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(humans);
    }

    static class Human implements Comparable<Human> {
        final Integer age;
        final String name;

        Human(Integer age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }


        @Override
        public int compareTo(Human o) {
            return age.compareTo(o.age);
        }
    }

}
