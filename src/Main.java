public class Main {
    public static void main(String args[]) {

        Lambda Lmb = new Lambda();
        BlockLambda Block = new BlockLambda();
        LambdaTwoArgs Two = new LambdaTwoArgs();

        System.out.print("������������ Lambda-���������: \n");
        Lmb.func1();
        System.out.print("\n\n");
        System.out.print("������������ �������� Lambda-���������: \n");
        Block.func2();
        System.out.print("\n\n");
        System.out.print("������������ Lambda-��������� � ����� �����������: \n");
        Two.func3();

    }
}
