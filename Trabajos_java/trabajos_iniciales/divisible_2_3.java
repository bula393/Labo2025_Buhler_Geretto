public class divisible_2_3 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if ((i % 2 == 0)&&(i % 3 == 0)) {
                System.out.println(i);
            }
        }
    }
}
