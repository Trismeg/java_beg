import java.awt.*;
import java.awt.event.*;

public class GUITest2 extends Frame implements WindowListener{
  private Label label;
  private TextField text;
  private Button button, button2;
  private int count =0;
   
  public GUITest2(){
    setLayout(new FlowLayout());
   
    //Make and add label
    label = new Label("Counter");
    add(label);
    
    //Make and add text field
    text = new TextField ("0",10);
    text.setEditable(true);
    add(text);
    //text.addKeyListener(this);
    //text.addActionListener(this);   
    //addKeyListener(this);
    
    addWindowListener(this);
    
    //Make button
    button = new Button("UP");
    add(button);   
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event){
        count=count+1;
        text.setText(count +"");}}                           
                            );
    
    
    button2 = new Button("DOWN");
    add(button2);
    //button2.addActionListener(this);
   
    //Make Title
    setTitle("THE TITLE");
    setSize(250, 100);
    setVisible(true);}

  public static void main(String[] args){
    GUITest2 mygui = new GUITest2();}
  
/*  public void actionPerformed(ActionEvent event){
   // if(event.getActionCommand().equals("BUTTON")){count=0;}
   // count = count + 1;
   // text.setText(Integer.toString(count));
    count=Integer.parseInt(text.getText());
    if(event.getActionCommand().equals("UP")){count=count+1;}
    if(event.getActionCommand().equals("DOWN")){count=count-1;}
    text.setText(count+"");
    //System.out.println(event.getActionCommand());
  }
 */ 

  
  public void windowClosing(WindowEvent event){ System.exit(0);}
  public void windowOpened(WindowEvent event) {}
  public void windowClosed(WindowEvent event) {}
  public void windowIconified(WindowEvent event) {}
  public void windowDeiconified(WindowEvent event) {}
  public void windowActivated(WindowEvent event) {}
  public void windowDeactivated(WindowEvent event) {}
}