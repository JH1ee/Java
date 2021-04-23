import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    // 6-6

    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    // int n = sc.nextInt();

    //   int[] a = new int[n];

    //   for (int j = 0; j < n ; j++){
    //     System.out.print("a[" + j + "] = ");
    //     a[j]= sc.nextInt();
    //   }

    //   System.out.print("a = {");
    //   for (int i = 0 ; i < n - 1; i++)
    //     System.out.print(a[i] + ", ");
    //   System.out.println(a[n-1] + "}");

    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    // int n = sc.nextInt();
    // int[] a = new int[n];

    //   for (int j = 0; j < n ; j++){
    //     System.out.print("a["+j+"] = ");
    //     a[j]= sc.nextInt();
    //   }

    // System.out.println("요소를 섞었습니다.");

    //   for (int i = 0 ; i < n ; i++) {
    //     int x = rand.nextInt(n);
    //     int y = rand.nextInt(n);
    //     int t = a[x];
    //     a[x] = a[y];
    //     a[y] = t;
    //   }

    //   for (int j = 0; j < n ; j++){
    //       System.out.println("a["+j+"] = " + a[j]);
    //   }





    
    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);
    // System.out.print("요소 수:");
    // int n = sc.nextInt();
    // int[] a = new int[n];
    // int[] b = new int[n];
    //   for (int j = 0; j < n ; j++){
    //     System.out.print("a["+j+"] = ");
    //     a[j]= sc.nextInt();
    //   }

    //   for (int i = 0; i < n ; i++){
    //     b[i] = a[n-i-1]; 
    //   }

    //   for (int j = 0; j < n ; j++){
    //       System.out.println("b["+j+"] = " + b[j]);
    //   }

    // }


    // Scanner sc = new Scanner(System.in);
    // Random rand = new Random();
    // String[] months= {
    //   "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
    // };
    // int re = 0;
    // System.out.println("해당월의 영어 단어를 입력하시오.\n세 글자로 잛게 첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

    // do {
    // int month = 1 + rand.nextInt(12);

    // while(true){
    // System.out.print(month + "월 :");
    // String s = sc.next();
    
    // if (s.equels(months[month])) break;
    // System.out.println("틀렸습니다.");
    // }
    //   System.out.print("정답입니다.");
    //   System.out.print("다시 한번?1...Yes/0...No:0");
    //   re = sc.nextInt();
    // } while (re == 1);
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    String[] months= {
      "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
      };
        int re = 0;
        System.out.println("해당월의 영어 단어를 입력하시오.\n세 글자로 잛게 첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
    
        do {
        int month = 1 + rand.nextInt(12);
    
        while(true){
        System.out.print(month + "월 : ");
        String s = sc.next();
        
        if (s.equals(months[month-1])) break;
        System.out.println("틀렸습니다.");
        }
          System.out.print("정답입니다.");
          System.out.print("다시 한번?1...Yes/0...No:0");
          re = sc.nextInt();
      


  

}