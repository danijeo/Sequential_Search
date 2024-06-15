import javax.swing.JOptionPane;
public class SearchingDriver 
    {
    public static void main(String[] args) 
       {
       boolean isPrinting = true; // controls printing large data sets
       
       String length = JOptionPane.showInputDialog( "Number of array elements?" ) ; // User inputs length of string
       int numLength = Integer.parseInt( length );
       int[] numbers = new int[numLength];
       
       String message = "Which initial data set would you like?\n" + 
                        "A = Ascending order, \n" +
                        "D = Descending order, \n" + 
                        "R = Random order."; 
                        
       String scenario = JOptionPane.showInputDialog( message );
       if( scenario.equals( "A") || scenario.equals( "a")  ) // Best case : creates an array that is already sorted
          {
          for ( int index = 0; index < numbers.length; index++ )
             {
             numbers[index] = index;
             } // end for
          } // end if

       if( scenario.equals( "D") || scenario.equals( "d") ) // Worst case : creates an array with numbers in reverse order
          {
          for ( int index = 0; index < numbers.length; index++ ) 
             {
             numbers[index] = numbers.length-index;
             } // end for    
          } // end if        
        
       if( scenario.equals( "R") || scenario.equals( "r") ) // Random case : creates an array with input random numbers from 1 to 10
          {
          for ( int index = 0; index < numbers.length; index++ ) 
             {
             numbers[index] = (int)( 100 * Math.random() );
             } // end for
          } // end if
        
       if( isPrinting == true )
          {
          System.out.println( "Array contents: " );
          for (int index = 0; index < numbers.length; index++ )
             {
             System.out.print(numbers[index] + ", "); // Prints out a comma-separated visual of the array
             } // end for
          } // end if
          
      int numToFind = Integer.parseInt(JOptionPane.showInputDialog( "Please enter the number you wish to find: " ));   
      
      Stopwatch seiko = new Stopwatch();
      seiko.startTimer();
      
      System.out.println( "\n\n" + "Your number ( " + numToFind + " ) was found at index: " + SequentialSearch.search( numbers, numToFind ) );
      
      seiko.endTimer();
      seiko.printElapsedTime();
       
       } // end method main
    } // end class InsertionSort
    