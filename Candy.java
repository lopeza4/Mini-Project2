/**
* This class print out a candy name.
* @author Jiun Kim
* @version 10.28.2020
*/

class Candy {
private String candyName;

Candy() {
  candyName = "";
}

/**
* This method set 
*/

Candy(String acandyName) {
  candyName = acandyName;
}

/**
* This method is an accessor method.
* This method returns a candy name to the user.
* @return candyName (The value input as a String).
*/

String getName() {
  return candyName;
}

/**
*
* This method inputs a candy name from the user
*/

void setName(String thecandyName) {
  candyName = thecandyName;
}

/**
*/

void print() {
  System.out.println(candyName);
}

}