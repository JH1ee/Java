import java.util.Scanner;
import java.util.Random;


class Period {
  //변수
  private Day from; //시작일
  private Day to;   //종료일

  // 생성자
  public Period(Day form, Day to){
    this.from = new Day(from);
    this.to = new Day(to);
  
  // 매서드
  public Day getFrom() {return new Day(from);}
  public Day getTo()   {return new Day(to);}

  public String toString() {
    return "{" + from + "~" + to + ")";
  }
  }




class Main{
  public static void main(String[] args){

    Human hp = new Human();
    Computer cp = new Computer();
    String[] hands = {"가위","바위","보"};

    int humanHand = hp.humanHand();
    int computerHand = cp.ComputerHand();

    System.out.println("나는 "+hands[humanHand]+"이고, 당신은"+hands[computerHand]+"입니다. ");


  }
class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("문자열:");
  String s = sc.next();
  System.out.print("반대로 읽으면 ");
  for(int i = s.length()-1 ; i >= 0;i--){
    System.out.print(s.charAt(i));
  }
  System.out.print("입니다. ");

}
}

class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("문자열 s1:");
  String s1 = sc.next();
  System.out.print("문자열 s2:");
  String s2 = sc.next();

  int idx = s1.indexOf(s2);
  if (idx==-1)
    System.out.println("s1안에 s2가 포함되어있지 않습니다. ");
  else{
        System.out.println(s1);
        System.out.println(idx);


  }

}
}