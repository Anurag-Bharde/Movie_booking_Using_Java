import java.util.*;

public class Booking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean conti=true;
        while(conti!=false){
        int showno=sc.nextInt();
            HashMap<String, Boolean> seatbook;
            if(showno==1) {
                seatbook = SeatA.hmap;
            }else if(showno==2) {
                seatbook = SeatB.hmap2;
            }else {
                seatbook = SeatC.hmap3;
            }

            //display empty seats
            for(String disp:seatbook.keySet()){
                boolean dispbool=seatbook.get(disp);
                if(dispbool==false){
                    System.out.println(disp);
                }
            }

            //take seats no input and remove the ","
        sc.nextLine();
        String A1=sc.nextLine();
        String[] str=A1.split(",");


        //check if the seats taken are already booked and if booked break the loop
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

        //display the booked seats
        if(bookFlag==true){
            for(String a:seatbook.keySet()){
                boolean t=seatbook.get(a);
                if(t==true){
                    System.out.print(a+",");
                }
            }
            System.out.println("These seats are already booked");

        }

        if(bookFlag)


            System.out.println("Would you like to continue(y/n)?");
            String contii=sc.next();
            if(contii.equals("y")){
                conti=true;
            }
            else{
                conti=false;
            }
    }
    }

}
