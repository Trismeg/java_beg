import java.util.*;

public class HelloHand

{
  
  public static void main(String[] args){
    Hand deck1 = new Hand();
    System.out.println(deck1.getCard(10));
    
    String[] stuff = new String[4];
    stuff[0] = "Clubs";
    stuff[1] = "Diamonds";
    stuff[2] = "Hearts" ;
    stuff[3] = "Spades";
    
    Hand deck2 = new Hand(stuff);
    System.out.println(deck2.getCard(2));
  }
}