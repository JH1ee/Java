class Main {
    public static void main(String[] args) {
      //System.out.println("첫 자바 프로그램입니다");
      //System.out.println("화면에 출력하고 있습니다");
  
      /*Scanner sc = new Scanner(System.in);
  
      System.out.print("숫자 :");
      int x = sc.nextInt();
  
      if(x < 0) {
        System.out.println("음의 값 입니다.");
      }
      else if(x = 0) {
        System.out.println("0 입니다.");
      }
  
      else{
        System.out.println("양의 값 입니다.");
      }
      System.out.print("정수 a :");
      int num1 = sc.nextInt();
      System.out.print("정수 b :");
      int num2 = sc.nextInt();
  
      int min;
  
      min = (num1 > num2) ? num1 - num2 : num2 - num1;
      System.out.println("두 값의 차는" + min );*/
  
      Scanner sc = new Scanner(System.in);
  
      int mid = 0;
  
      System.out.print("정수 a : ");
      int a = sc.nextInt();
      System.out.print("정수 b : ");
      int b = sc.nextInt();
      System.out.print("정수 c : ");
      int c = sc.nextInt();
  
      if ((b > a && c < a) || (b < a && c> a))
        mid = a; // b > a > c         c > a > b
      else if ((a > b && c < b) || (a < b && c> b))
        mid = b;
      else 
        mid = c;
  
      System.out.println("중앙값은 " + mid +"입니다. ");
  
  
    }
  }