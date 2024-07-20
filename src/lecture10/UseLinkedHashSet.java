package lecture10;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UseLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(List.of(5, 2, 31, 49, 66));
        set.add(100);
        set.forEach(System.out::println);

        System.out.println();

        set.remove(31);
        set.forEach(System.out::println);
    }
}
