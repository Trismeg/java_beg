import java.awt.*;
import java.awt.event.*;

public class GUI4U extends Frame implements ActionListener, KeyListener{
  
  private Label label;
  private TextField text;
  private Button button, button2;
  private int count =0;
  
  public GUI4U() {
    setLayout(new FlowLayout());
    
    label = new Label("A LABEL");
    add(label);
    
    text = new TextField("153", 10);
    text.setEditable(true);
    add(text);
    //text.addActionListener(this);
    text.addKeyListener(this);
    
    this.addKeyListener(this);
    
    button = new Button("UP");
    add(button);
    button.addActionListener(this);
    
    button2 = new Button("DOWN");
    add(button2);
    button2.addActionListener(this);
     
    setTitle("GUI TITLE");
    setSize(450,70);   
    setVisible(true);   }
  
  public static void main(String[] args){
    GUI4U gui = new GUI4U();}
  
  public void actionPerformed(ActionEvent event){
    //System.out.println("it happened");
    //System.out.println(event.getActionCommand());
    count = Integer.parseInt(text.getText());
    if(event.getActionCommand().equals("UP")){
      count = count +1;}
    if(event.getActionCommand().equals("DOWN")){
      count = count -1;}
    text.setText(Integer.toString(count));
  }
  
  public void keyTyped(KeyEvent event) {
    System.out.println(event.getKeyChar());
     // taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void keyPressed(KeyEvent evt) { }
   @Override public void keyReleased(KeyEvent evt) { }
    
}