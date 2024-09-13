package Interpreter;

public class Main {
    public static void main(String[] args) {
        // 表达式: (5 + 3) - 2
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression add = new AddExpression(five, three);
        Expression subtract = new SubtractExpression(add, two);

        // 计算结果
        System.out.println("Result: " + subtract.interpret()); // 输出结果: 6
    }
}
