// Programming Assignment #2 for CSCI3320 - Advanced Programming
// Written by Justin Shapiro

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SuppressWarnings("unchecked") // probably don't need this, but it's here just in case

public class SwingMD5 extends JFrame {

   public SwingMD5() { initUI(); } // default constructor

   public static void main(String[] args) { // ref: Senser, Robert - Swing1.pdf, 3 | taken from http://bit.ly/1LqR1NS
      EventQueue.invokeLater(new Runnable() {
         @Override public void run() { 
            SwingMD5 window_set = new SwingMD5();
            window_set.setVisible(true);   
         }
      }); 
   }
   
   public void initUI() { // I'd like to thank Stack Overflow and the Oracle website for making this possible
      // create JFrame
      setTitle("MD5 For String"); 
      setSize(700, 100); 
      setVisible(true);
      setLocationRelativeTo(null); 
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      // create JPanel and add to JFrame
      JPanel objects_container = new JPanel();
      objects_container.setOpaque(true);
      objects_container.setBackground(Color.black);
      add(objects_container);
      
      // create the input text area and add to JPanel
      JTextArea leftTextBox = new JTextArea("Input here", 3, 25); // approx. 305x112
      leftTextBox.setLineWrap(true);
      objects_container.add(leftTextBox);
      
      // create the hash button and add to JPanel
      JButton buttonMain = new JButton(">>>");
      objects_container.add(buttonMain);
      
      // create a DefaultListModel and provide initial list data
      DefaultListModel output_list = new DefaultListModel();
      output_list.addElement("MD5 input has " + leftTextBox.getText().length() + " chars.");
      output_list.addElement("MD5: " + md5(leftTextBox.getText()));  
      
      // create a JPanel to nest the JList in, for a consistent, white background. Add to main JPanel 
      JPanel list_container = new JPanel();
      list_container.setPreferredSize(new Dimension(305, 50));
      list_container.setOpaque(true);
      list_container.setBackground(Color.white);
      objects_container.add(list_container);
     
      // create a JList and add to nested JPanel
      JList rightTextBox = new JList(output_list);
      list_container.add(rightTextBox);
      
      // add an ActionListener to the hash button to update the JList with a button click
      buttonMain.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            output_list.removeAllElements();
            output_list.addElement("MD5 input has " + leftTextBox.getText().length() + " chars.");
            output_list.addElement("MD5: " + md5(leftTextBox.getText()));   
         }
      });
   }  

   public String md5(String toHash) { // from PA1, modified to work with this program
      StringBuilder md5_string_build = new StringBuilder(); 
      
      try {
         MessageDigest md = MessageDigest.getInstance("MD5");
         byte[] arr = md.digest(toHash.getBytes()); 
      
         for (int j = 0; j < arr.length; j++)
            md5_string_build.append(String.format("%02x", arr[j] & 0xff));
         
      } catch (NoSuchAlgorithmException e) { /* try/catch is just needed to compile */ }
      
      return md5_string_build.toString(); 
   } 
}   