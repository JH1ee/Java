import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    // Random rand = new Random();
    // Scanner sc = new Scanner(System.in);

    // String[] dayKor = {"일","월","화","수","목","금","토"};
    // String[] dayEng = {"sun","mon","tue","wed","thu","fri","sat"};

    // System.out.println("요일명을 영어 소문자로 입력하시오");

    // int last= -1; // 이전 요일
    // int retry = 0; 
    // do {
    //   int day;
    //   do {
    //     day = rand.nextInt(7);
    //   } while(day == last);
    //   last = day;

    //   while (true) {
    //     System.out.print(dayKor[day]+"요일 : ");
    //     String s = sc.next();

    //     if (s.equals(dayEng[day])) break;  //정답일경우

    //     System.out.println("틀렸습니다. ");
    //   }
    //   System.out.print("정답입니다. 다시 한번? 1...Yes/0...No :");
    //   retry = sc.nextInt();
    // }while(retry == 1);
  // Scanner sc = new Scanner(System.in);

  // System.out.println("6명의 국어, 수학 점수를 입력하세요");

  // int[][] point = new int[6][2];
  // int[] sumStudent = new int[6];
  // int[] sumSubject = new int[2];

  // for (int i = 0; i < 6; i++){
  //   System.out.print(i+1+"번 국어:");
  //   point[i][0] = sc.nextInt();
  //   System.out.print("    수학:");
  //   point[i][1] = sc.nextInt();

  //   sumStudent[i] = point[i][0] + point[i][1];//학생점수
  //   sumSubject[0] += point[i][0];   //국어점수합
  //   sumSubject[1] += point[i][1];   //수학점수합

  // }

  //   System.out.println("No.\t국어\t수학\t평균");
  //   for (int i = 0; i < 6; i++) {
  //     System.out.print((i+1)+"\t"+point[i][0]+"\t\t"+point[i][1]+"\t\t"+(double)sumStudent[i]/2);
  //     System.out.println();
  //   }
  //   System.out.println("평균 "+(double)sumSubject[0]/6+"\t"+(double)sumSubject[1]/6);
  Scanner sc = new Scanner(System.in);

System.out.print("학급수 : ");
int classNum = sc.nextInt();
int[][] point = new int[classNum][];
int totNumber = 0;

for (int i = 0 ; i < point.length ; i ++){
  System.out.print(i+1+"반의 학생수 : ");
  int num = sc.nextInt();

  point[i] = new int[num];
  totNumber += num;

  for (int j = 0; j < point[i].length; j++){
    System.out.print((i+1) + "반"+ (j+1) +"번의 점수 :");
    point[i][j] = sc.nextInt();
  }
}
  System.out.println("  반 |   합계  평균");
  System.out.println("----+-----------------");
  int total = 0;
  for (int i = 0 ; i < point.length; i++) {
    int sum = 0;
    for (int j = 0; j <point[i].length; j++) {
      sum += point[i][j];
    }
    total += sum;
    System.out.printf("%2d반 | %7d %7.1f\n",i+1,sum, (double)sum/point[i].length);
  }    

  System.out.println("----+-----------------");
    System.out.printf("  합 | %7d %7.1f\n",total, (double)total/totNumber);

  

 


  }
}