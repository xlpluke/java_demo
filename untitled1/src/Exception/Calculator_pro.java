package Exception;

public class Calculator_pro {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        if (!isValidInteger(args[0]) || !isValidInteger(args[2])) {
            System.out.println("错误：操作数类型错误，请输入有效的整数。");
            System.exit(0);
        }

        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+': result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-': result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '*': result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/': if (Integer.parseInt(args[2]) == 0) {
                        System.out.println("错误：除数不能为零。");
                        System.exit(0);
                    }
                    result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
            default:
                System.out.println("错误：不支持的运算符 '" + args[1] + "'");
                System.exit(0);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

    private static boolean isValidInteger(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        int start = 0;
        // 允许负号
        if (s.charAt(0) == '-') {
            if (s.length() == 1) {
                return false;
            }
            start = 1;
        }
        for (int i = start; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
