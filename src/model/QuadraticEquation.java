package model;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {}

    public boolean setA(String a) {
        if (checkDouble(a)){
            return false;
        }else {
            this.a = Double.parseDouble(a);
        }
        return true;
    }

    public boolean setB(String b) {
        if (checkDouble(b)){
            return false;
        }else {
            this.b = Double.parseDouble(b);
        }
        return true;
    }

    public boolean setC(String c) {
        if (checkDouble(c)){
            return false;
        }else {
            this.c = Double.parseDouble(c);
        }
        return true;
    }

    public String calculation(){
        String res;
         double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            res ="x1 = " + x1 + ", x2 = " + x2;
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            res = "x = " + x;
        }
        else {
            res = "No equation roots!";
        }
        return res;
    }

    private boolean checkDouble(String x){
        return x == null || !x.matches("[-+]?\\d*\\.?\\d+"); //регул€рное выражение
    }


}
