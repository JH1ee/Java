import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();


        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close();

        PrintWriter od = new PrintWriter("odd.txt");
        for(int i = 1; 1< 100; i++){
            if (i % 2 == 1)
            od.println(i);
        }
        od.close();
    }
}