public class CarExam {
    public static void main(String[] args){

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str3)
        System.out.println("str1과 str3은 같은 레퍼런스입니다"); 
        
        if(str3 == str4)
        System.out.println("str3과 str4는 같은 레퍼런스입니다"); 
        
       
    }
    
}
