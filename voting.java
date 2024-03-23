package P1;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;

public class voting {

   JFrame frame;
  private JTextField txtc;
  private JTextField txtn;
  private JTextField txta;
  private JTextField txtarea;
  private JTextField txtd;
    private JRadioButton btnm,f;
    int c=0;
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          voting window = new voting();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
  public voting() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 775, 667);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("VOTING");
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 54));
    lblNewLabel.setBounds(270, 28, 224, 48);
    frame.getContentPane().add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("NO OF VOTERS");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 38));
    lblNewLabel_1.setBounds(56, 109, 314, 35);
    frame.getContentPane().add(lblNewLabel_1);
    
    JLabel l = new JLabel("NAME");
    l.setFont(new Font("Tahoma", Font.BOLD, 33));
    l.setBounds(110, 198, 260, 40);
    frame.getContentPane().add(l);
    
    JLabel lblNewLabel_2_1 = new JLabel("AGE");
    lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 33));
    lblNewLabel_2_1.setBounds(110, 330, 260, 40);
    frame.getContentPane().add(lblNewLabel_2_1);
    
    JLabel lblNewLabel_2_2 = new JLabel("GENDER");
    lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 33));
    lblNewLabel_2_2.setBounds(110, 261, 260, 40);
    frame.getContentPane().add(lblNewLabel_2_2);
    
    JLabel lblNewLabel_2_3 = new JLabel("AREA");
    lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 33));
    lblNewLabel_2_3.setBounds(110, 397, 260, 40);
    frame.getContentPane().add(lblNewLabel_2_3);
    
    JLabel lblNewLabel_2_4 = new JLabel("DISTRICT");
    lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 33));
    lblNewLabel_2_4.setBounds(110, 458, 260, 40);
    frame.getContentPane().add(lblNewLabel_2_4);
    
    txtc = new JTextField();  
    txtc.setFont(new Font("Tahoma", Font.BOLD, 29));
    txtc.setBounds(441, 109, 275, 38);
    frame.getContentPane().add(txtc);
    txtc.setColumns(10);
    
    txtn = new JTextField();
    txtn.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) 
      {
        char c=e.getKeyChar();
        if(c>='0' && c<='9')
        {
          e.consume();          
            JOptionPane.showMessageDialog(null, "Enter letters only");
            
         }
      }
    });
    txtn.setFont(new Font("Tahoma", Font.BOLD, 29));
    txtn.setColumns(10);
    txtn.setBounds(394, 198, 275, 38);
    frame.getContentPane().add(txtn);
    
    txta = new JTextField();
    txta.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) 
      {
        char c=e.getKeyChar();
        if(c>='a' && c<='z' || c>='A' && c<='Z')
        {
          e.consume();          
            JOptionPane.showMessageDialog(null, "Enter digits only");
            
         }
      }
    });
    txta.setFont(new Font("Tahoma", Font.BOLD, 29));
    txta.setColumns(10);
    txta.setBounds(394, 332, 275, 38);
    frame.getContentPane().add(txta);
    txtarea = new JTextField();
    txtn.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) 
      {
        char c=e.getKeyChar();
        if(c>='0' && c<='9')
        {
          e.consume();          
            JOptionPane.showMessageDialog(null, "Enter letters only");
            
         }
      }
    });
    txtarea.setFont(new Font("Tahoma", Font.BOLD, 29));
    txtarea.setColumns(10);
    txtarea.setBounds(394, 397, 275, 38);
    frame.getContentPane().add(txtarea);
    
    txtd = new JTextField();
    txtn.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) 
      {
        char c=e.getKeyChar();
        if(c>='0' && c<='9')
        {
          e.consume();          
            JOptionPane.showMessageDialog(null, "Enter letters only");
            
         }
      }
    });
    txtd.setFont(new Font("Tahoma", Font.BOLD, 29));
    txtd.setColumns(10);
    txtd.setBounds(394, 460, 275, 38);
    frame.getContentPane().add(txtd);
    
       btnm = new JRadioButton("MALE");
    btnm.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) 
      {
        if(btnm.isSelected())
          f.setSelected(false);
      }
    });
    btnm.setFont(new Font("Tahoma", Font.BOLD, 28));
    btnm.setBounds(394, 263, 111, 40);
    frame.getContentPane().add(btnm);
    
     f = new JRadioButton("FEMALE");
    f.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) 
      {
        if(f.isSelected())
          btnm.setSelected(false);
      }
    });
    f.setFont(new Font("Tahoma", Font.BOLD, 28));
    f.setBounds(521, 263, 148, 40);
    frame.getContentPane().add(f);
    
    JButton btnNewButton = new JButton("OK");
    btnNewButton.setBackground(Color.GRAY);
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) 
      { 
        
        if(txtn.getText().isEmpty())
        {
          txtn.requestFocus();
          return;
        }
        if(txta.getText().isEmpty())
        {
          txta.requestFocus();
          return;
        }
        if(txtarea.getText().isEmpty())
        {
          txtarea.requestFocus();
          return;
        } 
        if(txtd.getText().isEmpty())
        {
          txtd.requestFocus();
          return;
        }
                
           
                System.out.println("welcome");
                try {
                  // loading of the driver
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    //connection
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/aoop", "root", "Akshay@123");
                  
                    String q = "insert into details(name,age,area,district) values(?.?,?,?)";
                    
                
                    System.out.println("welcome");
                   String name=txtn.getText();
                  String  age=txta.getText();
                  String  area=txtarea.getText();
                  String  district=txtd.getText();
                  
                  PreparedStatement p = c.prepareStatement(q);
                  p.setString(1,name );
                    p.setString(2,age);
                    p.setString(3,area);
                    p.setString(4,district);
                    System.out.println("welcome");
                int i=   p.executeUpdate();
                    
                if(i!=0){
                    System.out.println("added");
                  }
                  else{
                    System.out.println("failed to add");
                  }
                    
                    
                    c.close();
                    System.out.println("welcome");
              
            } catch (Exception ee) {
              // TODO: handle exception
              System.out.println(ee.getMessage());
            }
              
                
               
          
       
        
     
           
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(100, 100, 775, 667);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
         
        JButton btnww = new JButton("PARTY 1");
        btnww.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) 
          {
            JOptionPane.showMessageDialog(btnNewButton, "vote casted for party 1");
            frame.setVisible(false);
          }
        });
        btnww.setBounds(29,73,345,66);
        btnww.setFont(new Font("Tahoma", Font.BOLD, 30));
        frame.getContentPane().add(btnww);
        
        JButton btnw1 = new JButton("PARTY 2");
        btnw1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) 
          {
        	  JOptionPane.showMessageDialog(btnNewButton, "vote casted for party 2");
              frame.setVisible(false);
            }
          });
          btnw1.setBounds(29,152,345,66);  
          btnw1.setFont(new Font("Tahoma", Font.BOLD, 30));
          frame.getContentPane().add(btnw1);
          
          
          
          JButton btnw3 = new JButton("PARTY 3");
          btnw3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
              JOptionPane.showMessageDialog(btnNewButton, "vote casted for party 3");
              frame.setVisible(false);
            }
          });
          btnw3.setBounds(29,230,345,66);  
          btnw3.setFont(new Font("Tahoma", Font.BOLD, 30));
          frame.getContentPane().add(btnw3);
          
          JButton btnw4 = new JButton("PARTY 4");
          btnw4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
              JOptionPane.showMessageDialog(btnNewButton, "vote casted for party 4");
              frame.setVisible(false);
            }
          });
          btnw4.setBounds(29,310,345,66);  
          btnw4.setFont(new Font("Tahoma", Font.BOLD, 30));
          frame.getContentPane().add(btnw4);
          
          JButton btnw5 = new JButton("PARTY 5");
          btnw5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
              JOptionPane.showMessageDialog(btnNewButton, "vote casted for party 5");
              frame.setVisible(false);
            }
          });
          btnw5.setBounds(29,390,345,66);  
          btnw5.setFont(new Font("Tahoma", Font.BOLD, 30));
          frame.getContentPane().add(btnw5);
          
          JButton btnw = new JButton("NOTA ");
          btnw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
              JOptionPane.showMessageDialog(btnNewButton, "vote casted for NOTA");
              frame.setVisible(false);
            }
          });
          btnw.setBounds(29,470,345,66);  
          btnw.setFont(new Font("Tahoma", Font.BOLD, 30));
          frame.getContentPane().add(btnw);
          
          txtn.setText(null);
          txta.setText(null);
          txtarea.setText(null);
          txtd.setText(null);
          btnm.setSelected(false);
          f.setSelected(false);
          
          c++;
          txtc.setText(Integer.toString(c));
        }
      });
      btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 37));
      btnNewButton.setBounds(334, 544, 101, 35);
      frame.getContentPane().add(btnNewButton);
      
    }
  }
