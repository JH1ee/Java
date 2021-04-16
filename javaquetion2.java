import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    /*Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    
    int no = 10 + rand.nextInt(90);
    System.out.print("숫자맞추기 게임");
    System.out.print("10~99사이 숫자를 맞추세요");
    int x;

    do{
      System.out.print("어떤숫자? : ");

      x = sc.nextInt();
      if(x > no){
        System.out.print("더 작은 숫자");
      }
      else if (x < no){
        System.out.print("더 큰 숫자");
      }
    }

    while (x != no);

    System.out.print("정답");*/

    // Scanner sc = new Scanner(System.in);

    // System.out.print("몇 개의 *을 표시할까요?");
    // int x = sc.nextInt();
    // int i = 0;

    // while (i < x){
    //   System.out.print("*");
    //   i++;
    // }
    // if (x >=1)
    //   System.out.println();
    // Scanner sc = new Scanner(System.in);

    // System.out.print("1부터 n까지의 합을 구합니다.\nn의 값: ");
    // int x = sc.nextInt();
    // int sum = 0;
 
    // for ( int i = 1 ; i < x ; i++) {
    //   sum = sum + i;
    //   System.out.print(i+" + ");
    // }
    //   System.out.println(x +" = "+ (sum+x));
    // Scanner sc = new Scanner(System.in);


    // System.out.print("정수값 : ");
    // int a = sc.nextInt();
    // int c = 0;

    // for (int i = 1; i <= a; i++){
    //   if (a % i ==0){
    //     System.out.print(i+ " ");
    //     c++;
    //   }
    // }
    // System.out.println("\n의 약수는 "+ c +"개입니다");
    
    // Scanner sc = new Scanner(System.in);

    // System.out.print("몇 cm부터: ");
    // int a = sc.nextInt();

    // System.out.print("몇 cm까지: ");
    // int b = sc.nextInt();

    // System.out.print("몇 cm단위: ");
    // int c = sc.nextInt();

    // System.out.println("신장  표준체중 ");
    // System.out.println("----------- ");

    // for (int i = a ; i <= b ; i = i + c ) {
    //   System.out.println(i + " " + (i-100)*0.9);
    // }


  // Scanner sc = new Scanner(System.in);
  // System.out.println("계절을 찾습니다.");
  //     int a = 0;
  //     int b = 0;
  //   do {
  //   do {
  //     System.out.print("몇 월입니까?: ");
  //     a = sc.nextInt();
  //   } while (a < 1 || a >= 13);

  //   if (a >= 3 && a <= 5) {
  //           System.out.print("봄 입니다. ");
  //   }
  //   else if (a >= 6 && a <= 8) {
  //           System.out.print("여름 입니다. ");
  //   }
  //   else if (a >= 9 && a <= 11) {
  //           System.out.print("가을 입니다. ");
  //   }
  //   else {
  //           System.out.print("겨울 입니다. ");
  //   }
  //   System.out.print("다시 하겠습니까? 1...Yes/0...No : ");      
  //   b = sc.nextInt();
  //   }while(b == 1);
  // Scanner sc = new Scanner(System.in);

    // System.out.print("2이상의 정숫값: ");
    // int a = sc.nextInt();
    // int i;
    // for(i = 2 ; i < a ; i++) {
    //   if(a % i == 0)
    //     break;
    // }

    //   if(i == a)
    //     System.out.print("소수입니다. ");
    //   else
    //     System.out.print("소수가 아닙니다.  ");
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 더합니다.  ");
    System.out.print("몇 개를 더할까요?: ");
    int n = sc.nextInt();
    int i;
    int sum=0;

    for (i = 0; i < n; i++) {
      System.out.println("정수(0으로 종료): ");
      int t = sc.nextInt();
      if(t == 0) break;
      sum = sum + t;
    }

    System.out.println("합계는 " + sum + "입니다. ");
    System.out.println("평균은 " + sum/i + "입니다. ");



  }
}