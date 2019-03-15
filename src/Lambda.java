import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    void func1 ()  {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.print("������� ��� �����: ");
        evaluate(list, (n)->true);

        System.out.print("�� ������� �� ������ �����: ");
        evaluate(list, (n)->false);

        System.out.print("����� ������ �����: ");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.print("����� �������� �����: ");
        evaluate(list, (n)-> n%2 == 1 );

        System.out.print("����� ����� ������ 5: ");
        evaluate(list, (n)-> n > 5 );

    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

}