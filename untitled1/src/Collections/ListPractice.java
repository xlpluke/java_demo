package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<Integer>();
        scores.add(85);
        scores.add(92);
        scores.add(67);
        scores.add(78);
        scores.add(92);
        scores.add(55);

        // 1. 输出集合大小、第一个元素、最后一个元素
        int size = scores.size();
        int first = scores.get(0);
        int last = scores.get(scores.size() - 1);
        System.out.println("大小: " + size + ", 第一个: " + first + ", 最后一个: " + last);

        // 2. 遍历求总分、平均分（保留两位小数）、最高分、最低分
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int score : scores) {
            total += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }
        double avg = (double) total / size;
        System.out.printf("总分: %d, 平均分: %.2f, 最高分: %d, 最低分: %d\n", total, avg, max, min);

        // 3. 把第 3 个元素（下标 2）修改为 70
        scores.set(2, 70);
        System.out.println("修改后: " + scores);

        // 4. 删除所有 92 分
        // 核心：List 有两个 remove 方法，remove(int index) 是删下标，remove(Object o) 才是删元素
        // 如果直接写 scores.remove(92)，Java 会以为你要删除下标为 92 的元素（会报越界错误）
        // 必须将 int 强转为 Object，或者使用 new Integer(92)
        while (scores.contains(92)) {
            scores.remove(Integer.valueOf(92));
        }
        System.out.println("删除92后: " + scores);

        // 5. 判断集合中是否包含 55，并输出它的下标
        int index = scores.indexOf(55);
        System.out.println("包含55: " + (index != -1) + ", 下标: " + index);
    }
}
