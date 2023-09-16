import java.util.*;

public class SortNumber {
    public static void sortNumber(int num[]) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0)
                zero++;
            if (num[i] == 1)
                one++;
            if (num[i] == 2)
                two++;
        }
        for (int i = 0; i < zero; i++)
            num[i] = 0;
        for (int i = zero; i < one + zero; i++)
            num[i] = 1;
        for (int i = one + zero; i < num.length; i++)
            num[i] = 2;
    }

    public static void main(String[] args) {
        int num[] = { 2, 0, 2, 1, 1, 0 };
        sortNumber(num);
        System.out.println(Arrays.toString(num));
    }
}
