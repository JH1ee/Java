public class main {

    public static void main(String args[]) {
        //StringBuffer sb = new StringBuffer();
        //sb.append("Hello jump to java");
        //System.out.println(sb.substring(0,4));
        //String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        //for (int i =0; i < weeks.length; i++){
        //    System.out.print(weeks[i]);
        //}
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }
        else if(hasCard) {
            System.out.println("택시를 타고 가라");
        }
        else {         
            System.out.println("걸어가라");
        }
    }
}