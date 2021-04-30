import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEl = scanner.nextInt();
        int num;
        int sum = 0;

        for (int i = 0; i < numEl; i++) {
            if ((num = scanner.nextInt()) % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}