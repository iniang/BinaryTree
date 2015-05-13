import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*; 

import javax.swing.JOptionPane;

class TreeApp
   {
   public static void main(String[] args) throws IOException
      {
      int value;
      // call in the tree class unto main
      Tree myBinaryTree = new Tree();

      myBinaryTree.insert(50, 1.5);
      myBinaryTree.insert(25, 1.2);
      myBinaryTree.insert(75, 1.7);
      myBinaryTree.insert(12, 1.5);
      myBinaryTree.insert(37, 1.2);
      myBinaryTree.insert(43, 1.7);
      myBinaryTree.insert(30, 1.5);
      myBinaryTree.insert(33, 1.2);
      myBinaryTree.insert(87, 1.7);
      myBinaryTree.insert(93, 1.5);
      myBinaryTree.insert(97, 1.5);
      
      // use GUI 
      JOptionPane jPane = new JOptionPane();
      jPane.setBackground(Color.blue);
      
      JOptionPane.showMessageDialog(null, " Welcome faithful customer!\n"); 
      
      // loop around as long the statement is true
      while(true){
    	  
    	  String choice = JOptionPane.showInputDialog(null,
      	        " Please enter the following words for execution: " +
                " show, insert, find, delete, or traverse: ");
    	  
    	 // display binary if user chooses to "show"
    	  if (choice.equalsIgnoreCase("show")){
    		  myBinaryTree.displayTree(); 
              break;	  
    	  }
    	  
    	  // do this if user chooses to "insert"
    	  else if (choice.equalsIgnoreCase("insert")){
    		  String errorMessage = "";
    		  String enter = " ";
    		  // handle issue in case user enters a string
    		  do {
    		      // Show input dialog with current error message, if any
    		     
    		      enter = JOptionPane.showInputDialog(errorMessage + "Please enter value to insert");
    		      try {
    		         
    		          if (!enter.equalsIgnoreCase(enter)) {
    		              errorMessage =( "That number is not a number");
    		          } else {
    		              JOptionPane
    		                  .showMessageDialog(null, "The number you want to insert is " + enter + ".");
    		              errorMessage = ""; // no more error
    		          }
    		      } catch (NumberFormatException e) {
    		          // The typed text was not an integer
    		          errorMessage = "The text you typed is not a number.\n";
    		      }
    		  } while (!errorMessage.isEmpty());
    		  int number = Integer.parseInt(enter);
                value = number;
                myBinaryTree.insert(value, value + 0.9);
                JOptionPane.showMessageDialog(null, "The number" + value + " is inserted!");
                
                
           // do this if user chooses to "find"     
    	  }else if (choice.equalsIgnoreCase("find")){
    		  
    		  String errorMessage= "";
    		  String enter = "";
    		  // handle error in case user enters a string
    		  do {
    			  
    			  // show input dialog with current error message, if any
    		  enter = JOptionPane.showInputDialog(errorMessage + "Please a number to find");
    		  try {
    			  if (!enter.equalsIgnoreCase(enter)){
    				  
    			  errorMessage = "That is not a number";
    			  }else{
    				  JOptionPane.showMessageDialog(null, "The number you chose is " + enter + ".");
    			     errorMessage = "" ;
    			  }
    		  } catch(NumberFormatException e){
    			  
    		  errorMessage = " Your input is not a number! ";
    		  }
    		  } while(!errorMessage.isEmpty());
    		  int number = Integer.parseInt(enter);
    		  value = number;
              Node found = myBinaryTree.find(value);
             
    	       if (found != null){
    		  JOptionPane.showMessageDialog(null, + value +" is found");
    	       
    	  } else {
    		  JOptionPane.showMessageDialog(null, + value + "could not be found! " +
        			  value + '\n');
      }
    	       
   }   
    	  
    	  // Do this if user chooses to "delete"
    	  else if (choice.equalsIgnoreCase("delete")){
    		  
    		  String errorMessage= "";
    		  String enter = "";
    		  
    		  // handle when users enter an string
    		  do {
    			  
    			  // show input dialog with current error message, if any
    		  enter = JOptionPane.showInputDialog(errorMessage + "Please a number to delete");
    		  try {
    			  if (!enter.equalsIgnoreCase(enter)){
    				  
    			  errorMessage = "That is not a number";
    			  }else{
    				  JOptionPane.showMessageDialog(null, "The number you chose is " + enter + ".");
    			     errorMessage = "" ;
    			  }
    		  } catch(NumberFormatException e){
    			  
    		  errorMessage = " Your input is not a number! ";
    		  }
    		  } while(!errorMessage.isEmpty());
    		  int number = Integer.parseInt(enter);
    		  value = number;
              boolean didDelete = myBinaryTree.delete(value);
              
    	       if (didDelete == true){
    		  JOptionPane.showMessageDialog(null, + value + " is eleted! '\n'");
              // System.out.println("Deleted " + value + '\n');
    	       } else {
    		  
         	  JOptionPane.showMessageDialog(null, + value + "could not be deleted " + value + '\n');
    		  }
    	  } 
    	  
    	  // if user chooses "traverse" 
    	  else if (choice.equalsIgnoreCase("transverse")){
    		  
    		  String errorMessage= "";
    		  String enter = "";
    		  
    		  //handle in case user enters an string
    		  do {
    			  
    			  // show input dialog with current error message, if any
    		  enter = JOptionPane.showInputDialog(errorMessage + "Please a number to find");
    		  try {
    			  if (!enter.equalsIgnoreCase(enter)){
    				  
    			  errorMessage = "That is not a number";
    			  }else{
    				  JOptionPane.showMessageDialog(null, "The number you chose is " + enter + ".");
    			     errorMessage = "" ;
    			  }
    		  } catch(NumberFormatException e){
    			  
    		  errorMessage = " Your input is not a number! ";
    		  }
    		  } while(!errorMessage.isEmpty());
    		  int number = Integer.parseInt(enter);
    		  value = number;
    		  JOptionPane.showMessageDialog(null, "Enter type 1, 2, or 3: ");
              myBinaryTree.traverse(value);
              break;
              
    	  }else{
    		  JOptionPane.showMessageDialog(null, "Invalid input \n");
              
    	  }
      }
  }  	 

   }  // end class Main
