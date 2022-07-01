/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3degysz3dadatbinstobblev;

/**
 *
 * @author Lenovo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Arrays;
import java.util.Scanner;
import java.applet.Applet;

import java.awt.*;
import java.text.DecimalFormat;

import java.awt.event.*;

import java.awt.event.WindowAdapter;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;

import com.sun.j3d.utils.universe.*;

import javax.media.j3d.*;

import javax.vecmath.*;

import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.picking.PickCanvas;
import static java.awt.event.KeyEvent.VK_NUMPAD2;
import static java.awt.event.KeyEvent.VK_NUMPAD4;
import static java.awt.event.KeyEvent.VK_NUMPAD6;
import static java.awt.event.KeyEvent.VK_NUMPAD8;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import static javax.swing.Spring.height;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Timer;
import javax.media.j3d.Alpha;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.Node;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class c3degysz3dadatbinstobblev extends Applet implements ActionListener, KeyListener, Serializable  {
        Connection conn=null;
    PreparedStatement pst=null;
    private static final long serialVersionUID = 1L;
private Button go = new Button("Go");
private Button Stop = new Button("Stop");
private PickCanvas pickCanvas;
private PickCanvas pickCanvas1;
 private JLabel statusLabel;
 private JLabel statusLabel1;
JTextField textArea = new JTextField(10);
JTextField textArea1 = new JTextField(10);
JTextField textArea2 = new JTextField(10);
JFileChooser  fileDialog = new JFileChooser();
    java.io.File file;
    BufferedReader br;
     JFrame frame = new JFrame ("Authority");
     JFrame frame1 = new JFrame ("Opened file");
     JMenuBar menuBar1 = new JMenuBar();
JFileChooser save = new JFileChooser();
JFileChooser open = new JFileChooser();
JMenuItem saveMenuItem = new JMenuItem("Save");
 JMenuItem openMenuItem = new JMenuItem("Open"); 
  File fi;
 
      


//proton tomege 1
//elektron tomege 1/1836
//proton sugara 0,8775 *10e-15 
//elektron sugara 1,5347 *10e-18 
//Arány: proton:elektron=372,5634
//Tavolsag, viszoníitasi alap az elektron sugara:(5,2917721067*10e11) kb: 34480810,5819
//
 //float height=0.0f;
  int kapcs=-1;
double a[][];
double b[][];
double c[][];
double dm[][];
double ef[][];
double rad;
private float rprot[]={0.05f,1.0f};
private float xRot=0.0f;
private static float xr=0.0f;
private float fk=0.0f;
private static float yr=0.0f;
private static float zr=0.0f;
private float kvizsz=0.0f;
private float kfugg=0.0f;
private float zloc=0.0f;
 float height1=0.0f;
 float ps1=0.015119052f;
 float ps2=0.02180544700f;
 float ps[]={1.5119052598738476f/100, 2.4f/100, 3.2573011399138874f/100, 3.6439067662507946f/100,4.420837798368464f/100, 5.213377782922334f/100, 6.0159575219575006f/100};
 boolean pf=true;
 boolean nf=true;
float height=0.4f;
int h=1;
double g=1;
int sgnx;
int sgnx1;
double[] f;
double[] fj;
int sgny;
int sgny1;
int ej=1;
int valt=1;
int nm=1000;
float rs=0.01f;
 float rs1=0.01f;
float rs2=0.01f;
//float r=0.0f;
float G=6.67384f;
private Timer timer;
float ero=0.0f;
float xloc=-0.2f;
float xlocb=0.0f;
 float xloc1=0.0f;
 float xloc1a;
 int ellena=1;
 int ellenb=1;
 float xloc2=0.2f;
 float height2=0.0f;
float v1=(float) (xloc1-xloc);
float v2=(float) (height1-height);
float t=0;
float v3=(float) (xloc2-xloc);
float v4=(float) (height2-height);
float x=0;
float el=0.0f;
static int[] n={7,7};

static int o=2;
//static int n=18;
static int[] arr;
int max(int tmb[]){
    int max=tmb[0];
    for(int i=0;i<tmb.length;i++){
    if(tmb[i]>max){
    max=tmb[i];
    }
    
    }
    return max;
}

int[] ss = {2,8,20,28,50,82,126};
   Transform3D transform[][][]=new Transform3D[n[0]][n[0]][n[0]];
   Transform3D transformr[]=new Transform3D[n[0]];
   Transform3D rot[]=new Transform3D[n[0]];
   TransformGroup objTrans[][][] = new TransformGroup[n[0]][n[0]][n[0]];
   Sphere sphere[][]= new Sphere[n[0]][n[0]];
  
   BranchGroup objRoot = new BranchGroup();
//v2*x-v1*y=v2*xloc-v1*height
 
    
   
    
    
    int k=1; 
    int kn=n[0]+n[1];
    
  double[][][] xl=new double[n[k]][n[k]][n[k]];
 double[][][] hl = new double[n[k]][n[k]][n[k]];
 double[][][] zl = new double[n[k]][n[k]][n[k]];
 double[][][][][] df = new double[ss.length][n[k]][o][o][o];
 int gi;
  double[][] r = new double[n[k]][n[k]];

  //ssn number of subshells
  int ssn=8;
  //subshells
  int ssz=0;

   
  
  //308(2,8,22,50,100,182,308)
   // {-0.3, 0.0, 0.3};
 
     //0.3725634
int transt[];
//tavolsag
float[][][] d= new float[n[k]*n[k]][n[k]*n[k]][n[k]*n[k]];

float[][][] m=new float[n[k]][n[k]][n[k]];
float mp=1.67262f;
float mn=1.674927f;
float me=mp/1862f;
float ra=0.34f;

String rw;


//ra=0.0685
     public static double[][] multiplymm(double[][] a, double[][] b) {
        int m1 = a.length;
        int n1 = a[0].length;
        int m2 = b.length;
        int n2 = b[0].length;
        if (n1 != m2) throw new RuntimeException("Illegal matrix dimensions.");
        double[][] c = new double[m1][n2];
        for (int i = 0; i < m1; i++)
            for (int j = 0; j < n2; j++)
                for (int k = 0; k < n1; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }


    // matrix-vector multiplication (y = A * x)
    public static double[] multiplymv(double[][] a, double[] x) {
        int m = a.length;
        int n = a[0].length;
        if (x.length != n) throw new RuntimeException("Illegal matrix dimensions.");
        double[] y = new double[m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                y[i] += a[i][j] * x[j];
        return y;
    }

     
            
       
    
     @SuppressWarnings("empty-statement")
     public BranchGroup createSceneGraph() {


            for(int i=0;i<n[0];i++){
              for(int j=0;j<n[0];j++){   
                if(i%n[0]==0){
        r[i][j]=0.001;
        }
    
        else{r[i][j]=0.001;}
}
            }

   // Create the root of the branch graph

BranchGroup objRoot = new BranchGroup();
//xl[0]=-0.5;7
int[][] rdx=new int[3][3];
 rdx[0][0]=1;
for(int k=0;k<2;k++){ 
for(int i=0;i<n[k];i++){    
for(int j=0;j<n[k];j++){
    double rad[]=new double[n[k]];
    
    rad[i]=Math.toRadians(i*180/n[k]);
    rad[j]=Math.toRadians(j*360/n[k]);
    
 
    

  
       
   xl[i][j][k]=rprot[k]*(float) Math.sin(rad[i])*(float) Math.cos(rad[j]);
hl[i][j][k]=rprot[k]*(float) Math.sin(rad[i])*(float) Math.sin(rad[j]);
zl[i][j][k]=rprot[k]*(float) Math.cos(rad[i]);

 m[i][j][k]=me;
   
  
  
  
  

transform[i][j][k]=new Transform3D();
//transformr=new Transform3D();
   objTrans[i][j][k] = new TransformGroup(transform[i][j][k]);

   objTrans[i][j][k].setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
 objTrans[i][j][k].setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
 
 

//objRoot.compile();
   // Create a simple shape leaf node, add it to the scene graph.
   //1.
Appearance ap = new Appearance();

    sphere[i][j] = new Sphere((float) r[i][j]);
 

   

  // Transform3D pos[0] = new Transform3D();


   transform[i][j][k].setTranslation(new Vector3f((float) xl[i][j][k],(float)hl[i][j][k],(float) zl[i][j][k]));
    
    

   objTrans[i][j][k].setTransform(transform[i][j][k]);

 

   //objRoot.addChild(objTrans[i][j]);
  
 
    objTrans[i][j][k].addChild(sphere[i][j]);

   
    objRoot.addChild(objTrans[i][j][k]);
    
} 
}       
}
 
   
   BoundingSphere bounds =

      new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
   

   Color3f light1Color = new Color3f(1.0f, 0.0f, 0.2f);

   Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -12.0f);

   DirectionalLight light1

      = new DirectionalLight(light1Color, light1Direction);

   light1.setInfluencingBounds(bounds);

   objRoot.addChild(light1);

   // Set up the ambient light

   Color3f ambientColor = new Color3f(1.0f, 1.0f, 1.0f);

   AmbientLight ambientLightNode = new AmbientLight(ambientColor);

   ambientLightNode.setInfluencingBounds(bounds);

   objRoot.addChild(ambientLightNode);

   return objRoot;

}

   
    public c3degysz3dadatbinstobblev() {
     
       
       
    statusLabel = new JLabel("",JLabel.RIGHT); 
    
      statusLabel.setSize(350,100);
      
      frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
 JMenuBar menuBar1 = new JMenuBar();

      //create menus
      JMenu fileMenu = new JMenu("File");
      menuBar1.add(fileMenu);
frame.setJMenuBar(menuBar1);
      frame.setVisible(true); 
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      JMenuItem newMenuItem = new JMenuItem("New");
      newMenuItem.setMnemonic(KeyEvent.VK_N);
      newMenuItem.setActionCommand("New");
saveMenuItem.setActionCommand("Save");
      
      openMenuItem.setActionCommand("Open");

      

      JMenuItem exitMenuItem = new JMenuItem("Exit");
      exitMenuItem.setActionCommand("Exit");
    ActionListener menuItemListener = null;
     newMenuItem.addActionListener(menuItemListener);
      openMenuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        openMenuItem.addActionListener(this);
      saveMenuItem.addActionListener(menuItemListener);
      exitMenuItem.addActionListener(menuItemListener);
      
      fileMenu.add(newMenuItem);
      fileMenu.add(openMenuItem);
      fileMenu.add(saveMenuItem);
      fileMenu.addSeparator();
      fileMenu.add(exitMenuItem);       

      JPanel primary = new JPanel();
      primary.setBackground (Color.yellow);
      primary.setPreferredSize (new Dimension(250, 75));

      JLabel label1 = new JLabel ("Question authority,");
      JLabel label2 = new JLabel ("but raise your hand first.");
 
        textArea.setBounds(5, 5, 280, 50);
        primary.add(textArea);
        textArea1.setBounds(5, 5, 280, 50);
        primary.add(textArea1);
        textArea2.setBounds(5, 5, 280, 50);
        primary.add(textArea2);
      primary.add (statusLabel);
      primary.add (label1);
      primary.add (label2);
      saveMenuItem.addActionListener(new ActionListener() {
    
         
         public void actionPerformed(ActionEvent e) {
             
     int retriVal1 = save.showSaveDialog(frame);
if (retriVal1 == JFileChooser.APPROVE_OPTION) {
             
         
        try {
          // FileWriter writer = new FileWriter(save.getSelectedFile()+".txt");
           File fout = new File(save.getSelectedFile()+".txt");
           FileOutputStream fos = new FileOutputStream(fout);
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
          
	
           Float arr[][] = {{ 0.0f, 1.0f, 2.0f },{ 0.0f, 1.0f, 2.0f },{ 0.0f, 1.0f, 2.0f }};
           xloc=xloc+0.0001f;
           int len = arr.length;
           bw.write(ss[2]+"ezután");
           bw.write(rw+"azután");
               for (int it = 0; it < 2; it++) {
                  
                       bw.write( "\n"+xl[it] +" "+ hl[it]+" "+hl[it]);
                 
                        }
                       
           bw.close();
           System.out.println("Hello bello");
           System.out.println(xl[0]);
       } catch (IOException ex) {
           Logger.getLogger(c3degysz3dadatbinstobblev.class.getName()).log(Level.SEVERE, null, ex);
       }
            }
else {
               statusLabel.setText("Save command cancelled by user." );           
            }      
         }
         
    });
      
      openMenuItem.addActionListener(new ActionListener() {
    
         
        public void actionPerformed(ActionEvent e) {
             
     int retriVal1 = open.showOpenDialog(frame);
       fi = open.getSelectedFile();
if (retriVal1 == JFileChooser.APPROVE_OPTION) {
      //  open.getSelectedFile()+".txt"     
          try{
          
            Scanner s = new Scanner(fi);
            int ctr =0;
        while (s.hasNextInt()){
            ctr++;
            s.nextInt();
        }
         arr = new int[ctr];
        Scanner s1 = new Scanner(fi);
        for(int i=0;i<arr.length;i++)
        {arr[i]=s1.nextInt();
         System.out.println(arr[i]);}
       // return arr;
         
        }
           
         catch (Exception x) {
           Logger.getLogger(c3degysz3dadatbinstobblev.class.getName()).log(Level.SEVERE, null, x);
       }
            }
else {
               statusLabel.setText("Open command cancelled by user." );           
            }      
         }
         
    });
      
      frame.add(primary);
      frame.setResizable(true);
      
     
      
      
    int height = frame.getHeight();

    int width = frame.getWidth();
    primary.setSize(height, width);

   
 
      frame.pack();
      frame.setVisible(true);
   setLayout(new BorderLayout());

   GraphicsConfiguration config =

      SimpleUniverse.getPreferredConfiguration();

   Canvas3D c = new Canvas3D(config);

   c.setSize(200, 100);
   add("Center", c);

   
c.addKeyListener(this);
   timer = new Timer(100,this);
 
   

   Panel p =new Panel();

   p.add(go);
p.add(Stop);
   add("North",p);

   go.addActionListener(this);
go.addKeyListener(this);
Stop.addActionListener(this);
Stop.addKeyListener(this);

   // Create a simple scene and attach it to the virtual universe

   BranchGroup scene = createSceneGraph();

   SimpleUniverse u = new SimpleUniverse(c);

   u.getViewingPlatform().setNominalViewingTransform();

   u.addBranchGraph(scene);

}
public void keyPressed(KeyEvent e) {

   //Invoked when a key has been pressed.

  
 //  if (e.getKeyChar()=='+') {zloc = zloc + .1f;}
if (e.getKeyChar()=='-') {zloc = zloc - .01f;}
if (e.getKeyChar()=='+') {zloc = zloc + .01f;}
if (e.getKeyChar()=='a') {kvizsz = kvizsz - .1f;}
if (e.getKeyChar()=='d') {kvizsz = kvizsz + .1f;}
if (e.getKeyChar()=='w') {kfugg = kfugg - .1f;}
if (e.getKeyChar()=='s') {kfugg = kfugg + .1f;}

if (e.getKeyChar()=='k') {kvizsz = kvizsz - 52917.721f;
}
if (e.getKeyChar()=='l') {kvizsz = kvizsz + 52917.721f;
}
//Nagyitas
if (e.getKeyChar()=='i') {h = 1/15;
g=Math.pow(10,h);
}
if (e.getKeyChar()=='h') {h = 15;
g=Math.pow(10,h);
}
if (e.getKeyCode()==VK_NUMPAD8) {xr = xr + 0.1f;
fk=1.0f;



}
if (e.getKeyCode()==VK_NUMPAD2) {xr = xr - 0.1f;
}
if (e.getKeyCode()==VK_NUMPAD4) {yr = yr + 0.1f;
fk=1.0f;



}
if (e.getKeyCode()==VK_NUMPAD6) {yr = yr - 0.1f;
}
}

public void keyReleased(KeyEvent e){

   // Invoked when a key has been released.

}

public void keyTyped(KeyEvent e){

   //Invoked when a key has been typed.

}


public void actionPerformed(ActionEvent e ) {
   
    
         if(e.getSource()==open){
    
    JFileChooser open = new JFileChooser();
    int option = open.showOpenDialog(frame);
    if (option == JFileChooser.APPROVE_OPTION) {
        textArea2.setText("");
     
          try{
          
            Scanner s = new Scanner(new FileReader(open.getSelectedFile().getPath()));
            int ctr =0;
        while (s.hasNextInt()){
            ctr++;
            s.nextInt();
            
           
        }
         arr = new int[ctr];
        Scanner s1 = new Scanner(new FileReader(open.getSelectedFile().getPath()));
        for(int i=0;i<arr.length;i++)
        {arr[i]=s1.nextInt();
         System.out.println(arr[i]);
         textArea2.setText(Arrays.toString(arr));
        }
     
         
        }
           
         catch (Exception x) {
         
       }
            }

    
    
    
    }
    
        
          
         
    

    
            
     textArea.setText("pop"+ps1+ss[0]);
     textArea1.setText("pop"+ss[0]);
     rw= textArea2.getText();
    int mag=0;
    
     try{
            File f =new File("D:\\readfile2d\\src\\readfile2d\\File1.txt");
            Scanner s = new Scanner(f);
            int ctr =0;
        while (s.hasNextInt()){
            ctr++;
            s.nextInt();
        }
         arr = new int[ctr];
        Scanner s1 = new Scanner(f);
        for(int i=0;i<arr.length;i++)
        {arr[i]=s1.nextInt();
         System.out.println(arr[i]);}
      
         
        }
           
        catch(Exception x){
        
        }
    
    
     int ii;
     int ij;
      int i;
      int j;
     double angle=0.0;
     int hi;
     int hj;
     int hk;
     int gi;
      int mi=0;
      int mj=2;
      float t=0f;
      t+=0.01f;
      int kobra=1;
     if (e.getSource() == Stop ) 
      
      
        timer.stop();

      
  if (e.getSource() == go ) {
      
      if (!timer.isRunning()) {
        timer.start();

      }
    } else {
      System.out.println(xr+"Hello");
      System.out.println(zloc+"Baba");
      try {
           FileWriter writer = new FileWriter("D:/node/outt2.txt");
           File fout = new File("D:/node/inputt4.txt");
           FileOutputStream fos = new FileOutputStream(fout);
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
         
	
           Float arr[][] = {{ 0.0f, 1.0f, 2.0f },{ 0.0f, 1.0f, 2.0f },{ 0.0f, 1.0f, 2.0f }};
           xloc=xloc+0.0001f;
           int len = arr.length;
           
               for (int it = 0; it < 2; it++) {
                   
                       bw.write( "\n"+xl[it] +" "+ hl[it]+" "+hl[it]);
                       writer.write( "\n"+xl[it] +" "+ hl[it]+" "+hl[it]);
                      
                        }
                     
           bw.close();
      
           
           
           writer.close();
           System.out.println("Hello bello");
           System.out.println(xl[0]);
       } catch (IOException ex) {
           Logger.getLogger(c3degysz3dadatbinstobblev.class.getName()).log(Level.SEVERE, null, ex);
       }
    
     
             try {
                 //nm
                 
                 
                 Class.forName("com.mysql.cj.jdbc.Driver");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(c3degysz3dadatbinstobblev.class.getName()).log(Level.SEVERE, null, ex);
             }
      
             try { 
                 conn= DriverManager.getConnection("jdbc:mysql://localhost/coordinates","h485395","m8AL5wuL*");
             } catch (SQLException ex) {
                 Logger.getLogger(c3degysz3dadatbinstobblev.class.getName()).log(Level.SEVERE, null, ex);
             }
      for( k=0;k<2;k++){       
      for( i=0;i<n[k];i++){
              for( j=0;j<n[k];j++){
                  for( ii=i+1;ii<n[k];ii++){
                 for( ij=0;ij<n[k];ij++){
                     try{
    
      //String query1="SELECT * FROM user";
      String query1="INSERT INTO `3d`(`x`, `y`,`z`) VALUES (?,?,?)";
          pst=conn.prepareStatement(query1);
          pst.setDouble(1,xl[i][j][k]);
          pst.setDouble(2,hl[i][j][k]);
          pst.setDouble(3,zl[i][j][k]);
            pst.executeUpdate();
      
      }
          catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex);
      }
     
                     textArea.setText("pop"+ps1+ss[0]+xl[i][j][k]);
                     d[i][j][k]=(float) Math.sqrt((xl[i][j][k]-xl[ii][ij][k])*(xl[i][j][k]-xl[ii][ij][k])+(hl[i][j][k]-hl[ii][ij][k])*(hl[i][j][k]-hl[ii][ij][k])+(zl[i][j][k]-zl[ii][ij][k])*(zl[i][j][k]-zl[ii][ij][k]));
                     
                    // System.out.println(d[i][j]);
    if(xl[i][j][k]<=xl[ii][ij][k])
    {
    
      
      xl[i][j][k] +=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    xl[ii][ij][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    
    if(hl[i][j][k]<=hl[ii][ij][k]){
    hl[i][j][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    hl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    if(zl[i][j][k]<=zl[ii][ij][k]){
    zl[i][j][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    }
    else{
    zl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    }
    }
    else{
        hl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    hl[ii][ij][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);}
   // hl[i][j][k][j][gi]=(((hl[j][gi]-hl[i][j][k][j][gi])*xl[ii][ij][k][gi]-(xl[ii][ij][k][gi]-xl[i][j][k][gi])*hl[j][gi]-(hl[j][gi]-hl[i][j][k][j][gi])*xl[i][j][k][gi])/(-(xl[ii][ij][k][gi]-xl[i][j][k][gi])));
   // hl[j][gi]=(((hl[i][j][k][j][gi]-hl[j][gi])*xl[i][j][k][gi]-(xl[i][j][k][gi]-xl[ii][ij][k][gi])*hl[i][j][k][j][gi]-(hl[i][j][k][j][gi]-hl[j][gi])*xl[ii][ij][k][gi])/(-(xl[i][j][k][gi]-xl[ii][ij][k][gi])));
   if(zl[i][j][k]<=zl[ii][ij][k]){
    zl[i][j][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    }
    else{
    zl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    }
    objTrans[i][j][k].getTransform(transform[i][j][k]);
    




double[][] a = new double[][]{ { 1.0, 0.0, 0.0 }, { kfugg, Math.cos(xr), -Math.sin(xr) }, {zloc, Math.sin(xr), Math.cos(xr)} };
        double[][] b = new double[][]{ { Math.cos(yr), kvizsz, Math.sin(yr) }, { 0.0, 1.0, 0.0 }, { -Math.sin(yr), zloc, Math.cos(yr)} };
        double[][] c = new double[][]{ { Math.cos(zr), -Math.sin(zr), kvizsz }, { Math.sin(zr), Math.cos(zr), kfugg }, { 0.0, 0.0, 1.0} };
      //  double[] v=new double[3] ;
        
        double[][] dm= c3degysz3dadatbinstobblev.multiplymm(a, b);
        double[][] ef= c3degysz3dadatbinstobblev.multiplymm(dm, c);

       
    transform[i][j][k].setTranslation(new Vector3f((float) (xl[i][j][k]+kvizsz),(float) (hl[i][j][k]-kfugg), (float) (zl[i][j][k]+zloc)));
  
  
     System.out.println(xr+"Hello");
    transform[i][j][k].setScale(new Vector3d(g*1.0, g*1.0, g*1.0));
   
    objTrans[i][j][k].setTransform(transform[i][j][k]);

    transform[ii][ij][k] = new Transform3D();
  double[] v3dj = new double[]{xl[ii][ij][k],hl[ii][ij][k],zl[ii][ij][k]};
   
    
    transform[ii][ij][k].setTranslation(new Vector3f((float) (xl[ii][ij][k]+kvizsz), (float) (hl[ii][ij][k]-kfugg), (float) (zl[ii][ij][k]+zloc)));
   
    System.out.println(xr+"Hello");
    transform[ii][ij][k].setScale(new Vector3d(g*1.0, g*1.0, g*1.0));
    
    objTrans[ii][ij][k].setTransform(transform[ii][ij][k]);
    
 
  
    
    }
      
               
                       if(xl[i][j][k]>=xl[ii][ij][k]) {
                           xl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);xl[ii][ij][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
                            if(hl[i][j][k]>=hl[ii][ij][k]){
    hl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    hl[ii][ij][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
                           if(zl[i][j][k]<=zl[ii][ij][k]){
    zl[i][j][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    }
    else{
    zl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    } 
                            
                            
                            }
                            else{
        hl[i][j][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    hl[ii][ij][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);}
                        if(zl[i][j][k]<=zl[ii][ij][k]){
    zl[i][j][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    }
    else{
    zl[i][j][k]-=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    zl[ii][ij][k]+=6.67384*m[i][j][k]*m[ii][ij][k]/(d[i][j][k]*d[i][j][k])*(t*t);
    }
                         
                                 //hl[i][j][k][j][gi]=(((hl[j][gi]-hl[i][j][k][j][gi])*xl[ii][ij][k][gi]-(xl[ii][ij][k][gi]-xl[i][j][k][gi])*hl[j][gi]-(hl[j][gi]-hl[i][j][k][j][gi])*xl[i][j][k][gi])/(-(xl[ii][ij][k][gi]-xl[i][j][k][gi])));
                       transform[i][j][k] = new Transform3D();
                       double[] v3di = new double[]{xl[i][j][k],zl[i][j][k],hl[i][j][k]};


double[][] a = new double[][]{ { 1.0, 0.0, 0.0 }, { kfugg, Math.cos(xr), -Math.sin(xr) }, {zloc, Math.sin(xr), Math.cos(xr)} };
        double[][] b = new double[][]{ { Math.cos(yr), kvizsz, Math.sin(yr) }, { 0.0, 1.0, 0.0 }, { -Math.sin(yr), zloc, Math.cos(yr)} };
        double[][] c = new double[][]{ { Math.cos(zr), -Math.sin(zr), kvizsz }, { Math.sin(zr), Math.cos(zr), kfugg }, { 0.0, 0.0, 1.0} };
        
        double[][] dm= c3degysz3dadatbinstobblev.multiplymm(a, b);
        double[][] ef= c3degysz3dadatbinstobblev.multiplymm(dm, c);

        
              transform[i][j][k].setTranslation(new Vector3f((float) xl[i][j][k]+kvizsz, (float) hl[i][j][k]-kfugg, (float) zl[i][j][k]+zloc));
             
              transform[i][j][k].setScale(new Vector3d(g*1.0, g*1.0, g*1.0));
              
    objTrans[i][j][k].setTransform(transform[i][j][k]);
     System.out.println(xr+"Hello");
    transform[i][j][k] = new Transform3D();
    double[] v3dj = new double[]{xl[ii][ij][k],zl[ii][ij][k],hl[ii][ij][k]};
  
    transform[ii][ij][k].setTranslation(new Vector3f((float) xl[ii][ij][k]+kvizsz, (float) hl[ii][ij][k]-kfugg,(float) zl[ii][ij][k]+zloc)); 
 
    System.out.println(xr+"Hello");
   
    transform[ii][ij][k].setScale(new Vector3d(g*1.0, g*1.0, g*1.0));
    
   objTrans[ii][ij][k].setTransform(transform[ii][ij][k]);
  
                       }
                  }
  }
    
      }
      }
      }
  }
  //masodik

}


public static void main(String[] args) throws FileNotFoundException {

   System.out.println("Program Started");
   
   
   System.setProperty("sun.awt.noerasebackground", "true");

   c3degysz3dadatbinstobblev connect = new c3degysz3dadatbinstobblev();
    connect.addKeyListener( connect);

   
   MainFrame mf = new MainFrame(connect, 1800, 1800);   
   
            }
//Fájlból olvasásl 

         }
    



   

   


    














/*
Matrix3d zrot = new Matrix3d(Math.cos(zr),-Math.sin(zr),kvizsz, Math.sin(zr),Math.cos(zr),kfugg,0.0f,0.0f,1.0f);
Matrix3d yrot = new Matrix3d(Math.cos(yr),kvizsz,Math.sin(yr), 0.0f,1.0f,0.0f,-Math.sin(yr),zloc,Math.cos(yr));
Matrix3d xrot = new Matrix3d(1.0f,0.0f,0.0f, kfugg,Math.cos(xr),-Math.sin(xr),zloc,Math.sin(xr),Math.cos(xr));
Vector3d v3d = new Vector3d(xl[i][j][k][gi],zl[i][j][k][gi],hl[i][j][k][j][gi]);
xrot.mul(yrot);
yrot.mul(zrot);
zrot.mul(v3d);
  transform[i][j][k][k].setTranslation(new Vector3f((float) (xl[i][j][k][gi]*Math.cos(xr)-hl[i][j][k][j][gi]*Math.sin(xr)+kvizsz),(float) (xl[i][j][k][gi]*Math.sin(xr)+hl[i][j][k][j][gi]*Math.cos(xr)-getKfugg()), (float) (zl[i][j][k][gi]+zloc)));
    transform[i][j][k][k].setTranslation(new Vector3f((float) (xl[i][j][k][gi]+kvizsz),(float) (-zl[i][j][k][gi]*Math.sin(yr)+hl[i][j][k][j][gi]*Math.cos(yr)+getKfugg()), (float) (hl[i][j][k][j][gi]*Math.sin(yr)+zl[i][j][k][gi]*Math.cos(yr)+zloc)));*/













