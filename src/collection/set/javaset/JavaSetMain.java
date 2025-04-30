package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>());
        run(new LinkedHashSet<>()); // 입력 순서
        run(new TreeSet<>()); // 데이터 순서
    }

    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }
}
