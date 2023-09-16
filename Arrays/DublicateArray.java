public class DublicateArray {
    public static boolean dubliCateArray(int Number[]) {
        for (int i = 0; i < Number.length; i++) {
            for (int j = i + 1; j < Number.length; j++) {
                if (Number[i] == Number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int Number[] = { 2, 6, 7, 4 };
        System.out.println(dubliCateArray(Number));
    }
}
