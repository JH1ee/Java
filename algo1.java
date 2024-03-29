import java.util.Scanner;

public class algo1 {
  public static void main(String[] args) {

    System.out.print("검색할 데이터를 입력하세요 :");
    Scanner sc = new Scanner(System.in);
    int search = sc.nextInt();
    int[] arr = {11,13,17,19,23,29,31};
    Bsearch(arr, search); //매소드에 보내기
    }

  public static void Bsearch(int[] arr, int search){
    int head = 0;
    int tail = arr.length - 1;
    int center;
    while (head <= tail){
        center = (head+tail)/2;

        if (arr[center] == search){
            System.out.println(center + "번째 요소가 일치");
            break;
        }

        if (arr[center] < search){
            head = center + 1;
        }
        else{
            tail = center - 1;
        }
            
        }
    }
    System.out.println("찾지 못했습니다.")
}
