import java.util.Scanner;

/*
https://basecamp.eolymp.com/uk/problems/4076

80% correct
test #5 and #10 is time limit
 */

public class GeneratorPrimeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // count of tests

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++){ // для кожного тесту, i == test
            // зчитуємо два числа
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (i > 0) {
                output.append("\n");  // додаємо пустий рядок між тестами
            }

            for (int j = a; j <= b; j++){ // перевірка всі чисел з А до Б
                if (isPrime(j)){
                    output.append(j).append("\n");
                }
            }
        }
        System.out.print(output.toString());
        sc.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
