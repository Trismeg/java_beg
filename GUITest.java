import java.awt.*;
import java.awt.event.*;

public class GUITest extends Frame implements ActionListener, KeyListener, 
  WindowListener{
  private Label label;
  private TextField text;
  private Button button, button2;
  private int count =0;
   
  public GUITest(){
    setLayout(new FlowLayout());
   
    //Make and add label
    label = new Label("Counter");
    add(label);
    
    //Make and add text field
    text = new TextField ("0",10);
    text.setEditable(false);
    add(text);
    text.addKeyListener(this);
    //text.addActionListener(this);
    
    //addKeyListener(this);
    
    addWindowListener(this);
    
    //Make button
    button = new Button("UP");
    add(button);   
    button.addActionListener(this);
    
    button2 = new Button("DOWN");
    add(button2);
    button2.addActionListener(this);
   
    //Make Title
    setTitle("THE TITLE");
    setSize(250, 100);
    setVisible(true);}

  public static void main(String[] args){
    GUITest mygui = new GUITest();}
  
  public void actionPerformed(ActionEvent event){
   // if(event.getActionCommand().equals("BUTTON")){count=0;}
   // count = count + 1;
   // text.setText(Integer.toString(count));
    count=Integer.parseInt(text.getText());
    if(event.getActionCommand().equals("UP")){count=count+1;}
    if(event.getActionCommand().equals("DOWN")){count=count-1;}
    text.setText(count+"");
    //System.out.println(event.getActionCommand());
  }
  
  public void keyTyped(KeyEvent event){
    //System.out.println(event.getKeyChar());
    char out = event.getKeyChar();
    if(out == 'u'){count=count+1;}
    if(out == 'd'){count=count-1;}
    if((out == 'r') | (out == 'z')){count=0;}
    text.setText(count+"");  
  }
  
  public void keyPressed(KeyEvent event){}
  public void keyReleased(KeyEvent event){}
  
  public void windowClosing(WindowEvent event){ System.exit(0);}
  public void windowOpened(WindowEvent event) {}
  public void windowClosed(WindowEvent event) {}
  public void windowIconified(WindowEvent event) {}
  public void windowDeiconified(WindowEvent event) {}
  public void windowActivated(WindowEvent event) {}
  public void windowDeactivated(WindowEvent event) {}
}