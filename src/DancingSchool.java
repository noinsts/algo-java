import java.util.Scanner;

/*
task is not complite
 */


/*
https://basecamp.eolymp.com/uk/problems/160

До школи бальних танців професора Падеграса записалися n учнів — хлопчики та дівчата.
Професор поставив їх в один ряд і хоче відібрати для першого заняття групу підряд стоячих учнів, у якій кількість хлопців і дівчат однакова.
Скільки різних варіантів вибору такої групи є у професора?
 */

public class DancingSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // довжина s, проте не використовується
        sc.nextLine(); // щоб записать s з нового рядку
        String s = sc.nextLine();
        boolean[] arr = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) == 'b';
        }

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
