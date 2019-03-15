interface Operationable{
    int calculate(int x, int y);
}

public class LambdaTwoArgs {
    void func3() {

        Operationable operation1;
        operation1 = (x,y)->x*y;
        int result1 = operation1.calculate(10, 20);

        Operationable operation2;
        operation2 = (x,y)->x+y;
        int result2 = operation2.calculate(10, 20);

        Operationable operation3;
        operation3 = (x,y)->y*y;
        int result3 = operation3.calculate(10, 20);


        System.out.println("Результат умножения 10*20= "+result1);
        System.out.println("Результат сложения 10+20= "+result2);
        System.out.println("Результат возведения в квадрат у^2= "+result3);
    }
}