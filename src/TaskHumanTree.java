import java.util.Set;
import java.util.TreeSet;

public class TaskHumanTree {
    public static void main(String[] args) {
        Set<Human> tree = new TreeSet<>();
        tree.add(new Human(21, "Vasya"));
        tree.add(new Human(90, "Akakiy"));
        tree.add(new Human(69, "Nikifor"));
        System.out.println(tree);
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
