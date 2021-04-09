class Main {
    public static void main(String[] args) {
      final double PI = 3.141592;
      int radius = 3;
      double result = radius * 2 * PI;
      System.out.println(result);
      int x = 50;
      int y = 60;
  
      if (x == y){
        System.out.println("x는 y와 같습니다.");
      }
      else{
        System.out.println("x와 y는 다릅니다.");
      }
      int value = 6;
  
      if(value % 3 == 0){
        System.out.println(value+"는 3의 배수입니다.");
      }
      else{
        System.out.println(value+"는 3의 배수가 아닙니다.");
      }
      int total = 0;
  
      for(int i =1; i <= 100; i++){
        if(i%2 != 0){
          continue;
        }
        total += 1;
      }
      System.out.println(total);
  
      for(int i = 1; i <=100; i++){
        if(i % 2 == 0){
          System.out.println(i);
  
        }
      }
  
    }