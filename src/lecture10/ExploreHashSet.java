package lecture10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExploreHashSet {
    public static void main(String[] args) {
        Set<R> set = new HashSet<>();
        set.add(new R(5));
        set.add(new R(-3));
        set.add(new R(9));
        set.add(new R(-2));

        System.out.println("original elements: " + set);

        Iterator<R> iterator = set.iterator();
        R first = iterator.next();

        first.value = -3;
        System.out.println("after changing the first value to -3: " + set);

        set.remove(new R(-3));
        System.out.println("after removing element -3: " + set);
        System.out.println("Does set still contain element -3? " + set.contains(new R(-3)));
        System.out.println(set.contains(new R(-2)));
    }
}

class R {
    int value;

    public R(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof R) {
            R r = (R) obj;
            return r.value == this.value;
        }
        return false;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "R(value: " + value + ", hashCode: " + this.hashCode() + ")";
    }
}
