package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7));

        // 1. 并集 (Union) -> 用 addAll
        Set<Integer> union = new HashSet<>(a); // 创建副本，保护原集合 a
        union.addAll(b);
        System.out.println("1. 并集: " + new TreeSet<>(union)); // 放入 TreeSet 保证有序输出

        // 2. 交集 (Intersection) -> 用 retainAll
        Set<Integer> intersection = new HashSet<>(a); // 创建副本
        intersection.retainAll(b);
        System.out.println("2. 交集: " + new TreeSet<>(intersection));

        // 3. 差集 (a - b) -> 用 removeAll
        Set<Integer> diff = new HashSet<>(a); // 创建副本
        diff.removeAll(b);
        System.out.println("3. 差集: " + new TreeSet<>(diff));

        // 4. 对称差集 (Symmetric Difference) -> (a ∪ b) - (a ∩ b)
        Set<Integer> unionCopy = new HashSet<>(a);
        unionCopy.addAll(b); // 此时 unionCopy 是 a 和 b 的并集

        Set<Integer> intersectionCopy = new HashSet<>(a);
        intersectionCopy.retainAll(b); // 此时 intersectionCopy 是交集

        // 用并集减去交集
        unionCopy.removeAll(intersectionCopy);
        System.out.println("4. 对称差: " + new TreeSet<>(unionCopy));
    }
}