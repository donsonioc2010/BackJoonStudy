import java.util.Scanner;

/*
    문제
    준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
    동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
    둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

    출력
    첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

    input example
    10 4200
    1
    5
    10
    50
    100
    500
    1000
    5000
    10000
    50000
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input value받기
        int m = 0,n = sc.nextInt(), k = sc.nextInt();
        //n는 동전종류갯수 k=금액 m=동전사용갯수
        
        //동전갯수입력
        int []coin = new int[n];
        getCoinCollection(coin, sc);

        //9번방부터
        for(int i = n-1; i>=0; i--){
            m += (k/coin[i]);
            k = k%coin[i];
        }
        System.out.println(m);
    }

    static void getCoinCollection(int[] n, Scanner sc){
        System.out.println("동전금액입력");
        for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        sc.close();
    }
}
