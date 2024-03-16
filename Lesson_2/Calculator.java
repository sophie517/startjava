public class Calculator {

    private int a;
    private int b;
    private char sign;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    void calculate() {
        if (sign != '/' && sign != '+' && sign != '-' && sign != '*' && sign != '%' && sign != '^') {
            System.out.println("Эта операция не поддерживается");
        } else if (sign == '/') {
            double resultOfDivision = (double) a / b;

            System.out.print(a + " " + sign + " " + b + " = ");
            System.out.printf("%.3f%n", resultOfDivision);
        } else {
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
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
        System.out.println();
    }
}