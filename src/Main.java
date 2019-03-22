public class Main {
    public static void main(String args[]) {

        Lambda Lmb = new Lambda();
        BlockLambda Block = new BlockLambda();
        LambdaTwoArgs Two = new LambdaTwoArgs();

        System.out.print("Демонстрация Lambda-выражения: \n");
        Lmb.func1();
        System.out.print("\n\n");
        System.out.print("Демонстрация блочного Lambda-выражения: \n");
        Block.func2();
        System.out.print("\n\n");
        System.out.print("Демонстрация Lambda-выражения с двумя аргументами: \n");
        Two.func3();

    }
}
