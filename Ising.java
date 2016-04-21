import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


class Ising extends Canvas implements Runnable {

 int size = 100;        
 int squareWidth = 10;
 double sum =0.0;
 double M=0.0;
 int canvasSize = size * squareWidth;  
    int[][] s = new int[size][size];      
 boolean running = false;     
 Button startButton = new Button("  Start  ");
 Label mag = new Label("<M> =" + M);
 Scrollbar tScroller; 
 Label tLabel = new Label("Temperature = 4.0  "); 
 Scrollbar bScroller; 
 Label bLabel = new Label("Bfield = 0.0  ");
 Scrollbar JScroller; 
 Label JLabel = new Label("J constant = 0.0  ");
 DecimalFormat twoPlaces = new DecimalFormat("0.0"); 
 Image offScreenImage;      
 Graphics offScreenGraphics;
 Color upColor = new Color(128,128,128);  // Gray
 Color downColor = new Color(255,255,255); // White
 
 
 Ising() {
  Frame isingFrame = new Frame("Ising Model");
  isingFrame.addWindowListener(new WindowAdapter() {
   public void windowClosing(WindowEvent e) {
    System.exit(0);       
   }
  });
  Panel canvasPanel = new Panel();
  isingFrame.add(canvasPanel);
  canvasPanel.add(this);
  setSize(canvasSize,canvasSize);
  Panel controlPanel = new Panel();
  isingFrame.add(controlPanel,BorderLayout.SOUTH);
  
  controlPanel.add(bLabel);
  bScroller = new Scrollbar(Scrollbar.HORIZONTAL,227,1,1,1001) {
   public Dimension getPreferredSize() {
    return new Dimension(100,15);   
   }
  };
  bScroller.setBlockIncrement(1);  
  bScroller.addAdjustmentListener(new AdjustmentListener() {
   public void adjustmentValueChanged(AdjustmentEvent e) {
    bLabel.setText("Bfield = " + twoPlaces.format((bScroller.getValue()-500.0)/100.0));
   }
  });
  controlPanel.add(bScroller);
  controlPanel.add(new Label("     ")); 
  
  
  controlPanel.add(tLabel);
  tScroller = new Scrollbar(Scrollbar.HORIZONTAL,227,1,1,1001) {
   public Dimension getPreferredSize() {
    return new Dimension(100,15);   
   }
  };
  tScroller.setBlockIncrement(1);  
  tScroller.addAdjustmentListener(new AdjustmentListener() {
   public void adjustmentValueChanged(AdjustmentEvent e) {
    tLabel.setText("Temperature = " + twoPlaces.format(tScroller.getValue()/100.0));
   }
  });
  controlPanel.add(tScroller);
  controlPanel.add(new Label("     ")); 
  
  controlPanel.add(JLabel);
  JScroller = new Scrollbar(Scrollbar.HORIZONTAL,227,1,1,1001) {
   public Dimension getPreferredSize() {
    return new Dimension(100,15);   
   }
  };
  JScroller.setBlockIncrement(1);  
  JScroller.addAdjustmentListener(new AdjustmentListener() {
   public void adjustmentValueChanged(AdjustmentEvent e) {
    JLabel.setText("J constant = " + twoPlaces.format((JScroller.getValue()-500.0)/100.0));
   }
  });
  controlPanel.add(JScroller);
  controlPanel.add(new Label("     "));   
  startButton.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    running = !running;
    if (running) startButton.setLabel("Pause"); else startButton.setLabel("Resume");
   }
  });
  controlPanel.add(startButton);
  
  controlPanel.add(mag);
  
  isingFrame.pack();
  offScreenImage = createImage(canvasSize,canvasSize);
  offScreenGraphics = offScreenImage.getGraphics();

  for (int i=0; i<size; i++) {     
   for (int j=0; j<size; j++) {
    if (Math.random() <= 0.5) s[i][j] = 1; else s[i][j] = -1;
    sum=sum+s[i][j];

    colorSquare(i,j);
   }
  }

  isingFrame.setVisible(true);  

  Thread t = new Thread(this);  
  t.start();       
 }


 
 
 public void run() {
  while (true) {
   if (running) {
    double temp = tScroller.getValue() / 100.0;
     double bfield = (bScroller.getValue()-500.0)/ 100.0;
     double Jconstant = (JScroller.getValue()-500.0) / 100.0;
 
    for (int step=0; step<size; step++) {  // speed 
     int i = (int) (Math.random() * size);
     int j = (int) (Math.random() * size);
     double eDiff = deltaU(i,j,bfield,Jconstant); // compute energy change if flipped
     
 
     if ((eDiff <= 0) || (Math.random() < Math.exp(-eDiff/temp))) { 
      s[i][j] *= -1;
      sum = sum + s[i][j];
      M=2.0* sum / (size*size);
      mag.setText("<M> =" + M);
      colorSquare(i,j);
      
     }
    }
   
      
  
    
 
 
    repaint(); 
   }
   
    try { Thread.sleep(1); } catch (InterruptedException e) {} // sleep time in milliseconds
  }
 }
  
 
  
 
 
  
 double deltaU(int i, int j, double b,double J) {
        int leftS, rightS, topS, bottomS; 
        
          
        if (i == 0) leftS = s[size-1][j]; else leftS = s[i-1][j];
        if (i == size-1) rightS = s[0][j]; else rightS = s[i+1][j];
        if (j == 0) topS = s[i][size-1]; else topS = s[i][j-1];
        if (j == size-1) bottomS = s[i][0]; else bottomS = s[i][j+1];
        return J * s[i][j] * (leftS + rightS + topS + bottomS)- b * s[i][j];
        
    }  
  
 
   
 void colorSquare(int i, int j) {
  if (s[i][j] == 1) offScreenGraphics.setColor(upColor); 
      else offScreenGraphics.setColor(downColor);
  offScreenGraphics.fillRect(i*squareWidth,j*squareWidth,squareWidth,squareWidth);
 }

 
 public void update(Graphics g) {
  paint(g);
 }

 public void paint(Graphics g) {
  g.drawImage(offScreenImage,0,0,canvasSize,canvasSize,this);
 }

    public static void main(String[] args) {
  new Ising();    
    }  
}