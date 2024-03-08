public class Calculator {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        char sign = '+';
        double resultOfDivision;
        int result = 1;

        if (sign == '/') {
            resultOfDivision = (double) a / (double) b;
            System.out.print(a + " " + sign + " " + b + " = ");
            System.out.printf("%.5f", resultOfDivision);
        } else {
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = a * b;
            } else if (sign == '%') {
                result = a % b;
            } else if (sign == '^') {
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }

    }
}