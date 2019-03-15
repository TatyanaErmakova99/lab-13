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

        System.out.println("��������� ����� 2 ����� " + factorial.func(2));
        System.out.println("��������� ����� 4 ����� " + factorial.func(4));
        System.out.println("��������� ����� 6 ����� " + factorial.func(6));
        System.out.println("��������� ����� 8 ����� " + factorial.func(8));
        System.out.println("��������� ����� 10 ����� " + factorial.func(10));
    }
}