import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = 0;
        int sum = 0;
        while(sum < k){
            sum += ++n;
        }
        if(sum == k){
            System.out.println(n);
        } else {
            System.out.println("Для данного числа не существует значения n");
        }
    }
}
