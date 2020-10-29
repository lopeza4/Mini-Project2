import java.util.ArrayList;
import java.util.Random;

class Pillowcase {
  private int receivedCandy;
  private int totalnumCandy;
  
Pillowcase() {
 ArrayList<Integer> receivedCandy = new ArrayList<Integer>();
 int totalnumCandy = 0;
}

int getNum() {
  return totalnumCandy;
}

int getCandy() {
  System.out.println("Trick or Treat!");

  Random r = new Random();
  int randomNum = r.nextInt(101)+1;
   System.out.println(randomNum);
   return randomNum;
  }



/** 1 to 7 kitkat
8 to 15 milky way
16 to 25 M&Ms
26 to 38 Twix
39 to 55 Hershey's Bar
56 to 75 Pink Starbust
76 to 100 Reese's
*/


}

