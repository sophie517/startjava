public class Calculator {

    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    void calculate() {
        int result = 1;

        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '%':
                result = a % b;;
                break;
            case '^':
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
                break;
            case '/':
                double resultOfDivision = (double) a / b;

                System.out.print(a + " " + sign + " " + b + " = ");
                System.out.printf("%.3f%n%n", resultOfDivision);
                return;
            default:
                System.out.println("Эта операция не поддерживается\n");
                return;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
        System.out.println();
    }
}