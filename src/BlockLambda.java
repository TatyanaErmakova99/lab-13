interface NumericFunc {
    int func(int n);
}

class BlockLambda {
    void func2() {
        NumericFunc factorial = (n) -> {
            int result = 1;

            for(int i = 1; i <=n; i++) result = i * result;
            return result;
        };

        System.out.println("Факториал числа 2 равен " + factorial.func(2));
        System.out.println("Факториал числа 4 равен " + factorial.func(4));
        System.out.println("Факториал числа 6 равен " + factorial.func(6));
        System.out.println("Факториал числа 8 равен " + factorial.func(8));
        System.out.println("Факториал числа 10 равен " + factorial.func(10));
    }
}
