public class Task {
    public static void main(String[] args) {
    }

    //1
    public static double convert (int n) {
        return n * 3.78541;
    }

    //2
    public static int fitCalc (int time, int intens) {
        return time*intens;
    }

    //3
    public static int containers (int box, int bag, int bar) {
        return box*20 + bag*50 + bar*100;

    }

    //4
    public static String triangleType (int x, int y, int z) {
        if (x + y  < z || x + z < y || z + y < x) {
            return "не треугольник";
        }
        if (x==y && y==z) {
            return "равносторонний треугольник";
        }
        return "равнобедренный треугольник";
    }


    //5
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a:b;
    }


    //6
    public static int howManyItems (int n, double w, double h) {
        return (int) ((n*2) /(w*h));

    }


    //7
    public static int factorial (int a) {
        if (a == 1) {
            return 1;
        }
        else {
            return a * factorial(a-1);
        }

    }

    //8
    public static int gcd (int a, int b) {
        while (a!=0 && b!=0) {
            if (a > b) {
                a = a %b;
            }
            else {
                b = b % a;
            }
        }
        return a+b;
    }

    //9
    public static int ticketSaler (int count, int price) {
        double fix_com = 0.28;
        return (int) (count*price*(1-fix_com));
    }

    //10
    public static int tables (int stud, int numtable) {
        int n = (stud+1)/2;
        return Math.max(0, n-numtable);
    }
}