import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a quadratic equation");
        String equation = scanner.nextLine();
        if (inputIsCorrect(equation)) {
            int a, b, c;
            a = getA(equation);
            b = getB(equation);
            c = getC(equation);
            quadraticEquation(a, b, c);
        }else {
            System.out.println("format is illegal");
        }
    }

    public static boolean inputIsCorrect(String equation) {
        boolean inputCorrect = true;
        int i = 0;
        if (equation.charAt(0) == '-') {
            i = 1;
        }
        if ((equation.charAt(i+1) != 'x') && (equation.charAt(i+1) != 'X')) {
            inputCorrect = false;
        } else if (equation.charAt(i+2) != '^') {
            inputCorrect = false;
        } else if (equation.charAt(i+3) != '2') {
            inputCorrect = false;
        } else if ((equation.charAt(i+4) != '+') && (equation.charAt(i+4) != '-')) {
            inputCorrect = false;
        } else if ((equation.charAt(i+6) != 'x') && (equation.charAt(i+6) != 'X')) {
            inputCorrect = false;
        } else if ((equation.charAt(i+7) != '+') && (equation.charAt(i+7) != '-')) {
            inputCorrect = false;
        } else if (equation.charAt(i+9) != '=') {
            inputCorrect = false;
        } else if (equation.charAt(i+10) != '0') {
            inputCorrect = false;
        }
        return inputCorrect;
    }
    public static boolean isNegative(String equation){
        boolean isNegative=false;
        if (equation.charAt(0)=='-'){
            isNegative=true;
        }return isNegative;
    }

    public static int getA(String equation) {
        int a;
        if (isNegative(equation)) {
            a = equation.charAt(1) - 48;
            a *= -1;
        } else {
            a = equation.charAt(0) - 48;
        }
        return a;
    }

    public static int getB(String equation) {
        int b;
        if (isNegative(equation)) {
            if (equation.charAt(5) == '-') {
                b = equation.charAt(6) - 48;
                b *= -1;
            } else {
                b = equation.charAt(6) - 48;
            }
        } else {
            if (equation.charAt(4) == '-') {
                b = equation.charAt(5) - 48;
                b *= -1;
            } else {
                b = equation.charAt(5) - 48;
            }
        }return b;
    }
        public static int getC(String equation){
            int c;
            if (isNegative(equation)) {
                if (equation.charAt(8) == '-') {
                    c = equation.charAt(9) - 48;
                    c *= -1;
                } else {
                    c = equation.charAt(9) - 48;
                }
            }else{
                if (equation.charAt(8) == '-') {
                    c = equation.charAt(9) - 48;
                    c *= -1;
                } else {
                    c = equation.charAt(8) - 48;
                }
            }return c;
    }
    public static void quadraticEquation(int a,int b,int c){
        int discriminant=(b*b)-(4*a*c);
        if (discriminant>0){
            System.out.println("There are 2 solutions");
            double sqrt1=((-b)+(Math.sqrt(discriminant)))/2*a;
            System.out.println("answer 1 is "+sqrt1);
            double sqrt2=((-b)-(Math.sqrt(discriminant)))/2*a;
            System.out.println("answer 2 is "+sqrt2);
        }else if (discriminant==0){
            System.out.println("There is 1 solution");
            double sqrt1=((-b)+(Math.sqrt(discriminant)))/2*a;
            System.out.println("answer 1 is "+sqrt1);
        }else{
            System.out.println("There is no solutions");
        }
    }
}


