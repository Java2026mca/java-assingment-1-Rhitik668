import java.util.Scanner;

public class Main {

    static int evaluatePostfix(String exp) {
        int[] stack = new int[100];
        int top = -1;

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Ignore spaces
            if (ch == ' ') continue;

            // If operand (digit)
            if (Character.isDigit(ch)) {
                stack[++top] = ch - '0';
            }
            // If operator
            else {
                int b = stack[top--];
                int a = stack[top--];

                int result = 0;

                switch (ch) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }

                stack[++top] = result;
            }
        }

        return stack[top];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String exp = sc.nextLine();

        int result = evaluatePostfix(exp);

        System.out.println("Result = " + result);

        sc.close();
    }
}
