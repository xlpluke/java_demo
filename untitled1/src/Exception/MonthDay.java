package Exception;

import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        int[] dom = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        System.out.println("请输入一个月份(整数)");

        try {
            int i= sc.nextInt();
            System.out.println(months[i-1]+"天数为"+dom[i-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong number");
        }
        sc.close();
    }
}
