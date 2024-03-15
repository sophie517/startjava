public class Calculator {

    public int a;
    public int b;
    private char sign;

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        if (sign != '/' && sign != '+' && sign != '-' && sign != '*' && sign != '%' && sign != '^') {
            System.out.println("Эта операция не поддерживается");
            this.sign = '?';
        }
        else {
            this.sign = sign;
        }
    }

    void calculate(int a, int b, char sign) {
        if (sign == '?') {
            System.out.println("Невозможно выполнить операцию");
        } else {
            System.out.print(a + " " + sign + " " + b + " = ");
            switch (sign) {
                case '+':
                    System.out.println(a + b);;
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                case '^':
                    int result = 1;
                    for (int i = 1; i <= b; i++) {
                        result *= a;
                    }
                    System.out.println(result);
                    break;
                case '/':
                    double resultOfDivision = (double) a / b;
                    System.out.printf("%.5f%n", resultOfDivision);
                    break;
            }
        }
    }
}