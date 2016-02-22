import java.util.*;

public class Hand{
  
  
  private String[] deck; 
  
  
  
  public Hand()
  {
    this.deck = new String[52];
    String[] suit = new String[4];
    int[] card = new int[13];
    
    for (int i=0; i<card.length; i++){
      card[i]=i+1;}
    String cardName;
    suit[0] = "Clubs";
    suit[1] = "Diamonds";
    suit[2] = "Hearts" ;
    suit[3] = "Spades";
      
      
    for(int i=0; i<4; i++){
      for(int j=0; j<13; j++){
        if(j==0){cardName="Ace";}
        else if(j==10){cardName="Jack";}
        else if(j==11){cardName="Queen";}
        else if(j==12){cardName="King";}
        else {cardName=Integer.toString(card[j]);}
        this.deck[ 13*i+j ]= cardName + "_" +suit[i];
      }
    }
  }
  
  public String getCard(int num){
    return this.deck[num];}
  
  public Hand(String[] some_cards)
  {
    this.deck = new String[ some_cards.length ];
    for (int i=0; i< this.deck.length; i++){
      this.deck[i]=some_cards[i];}
  
  }}