import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Booking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean conti=true;
        while(conti!=false){
        int showno=sc.nextInt();
        sc.nextLine();
        String A1=sc.nextLine();
        System.out.println(A1);
        String[] str=A1.split(",");
        HashMap<String, Boolean> seatbook;
        if(showno==1) {
             seatbook = SeatA.hmap;
        }else if(showno==2) {
             seatbook = SeatB.hmap2;
        }else {
             seatbook = SeatC.hmap3;
        }
        ArrayList<String> AlreadyBooked=new ArrayList<>();
        boolean bookFlag=false;
        for(int i=0;i<str.length;i++){
            String seatKey = str[i].trim();
            if(seatbook.get(seatKey)==true){
                bookFlag=true;
                AlreadyBooked.add(seatKey);
            }
            else if(seatbook.containsKey(seatKey)){
                seatbook.put(seatKey,true);
            }
        }
        if(bookFlag==true){
           
        }
        System.out.println(seatbook);
    }
    }

}
