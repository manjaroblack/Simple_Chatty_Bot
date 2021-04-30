import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rpbc = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        System.out.println(rpbc >= 10 && rpbc <= 20 && !weekend ||
                rpbc >= 15 && rpbc <= 25 && weekend);
    }
}