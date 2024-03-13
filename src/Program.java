import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input: ");
        int num = scanner.nextInt();
        int result = getfactorial(num);
        System.out.printf("result: %d \n", result);
        scanner.close();
    }
    public static int getfactorial(int x){
        int result=1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return  result;
    }
}

