public class Calculadora {
    public double sum(double num1, double num2){
        return num1+num2;
    }

    public double substraction(double num1, double num2){
        return num1-num2;
    }

    public double multiplication(double num1, double num2){
        return num1*num2;
    }

    public double division(double num1, double num2){
        return num1/num2;
    }

    public double absolute(double num){
        if(num<0){
            return -num;
        }
        return num;
    }
}
