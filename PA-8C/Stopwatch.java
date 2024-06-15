public class Stopwatch
   {
   private long startTime;
   private long endTime;
   
   public Stopwatch()
      {
      startTime = 0;
      endTime = 0;
      } // end constructor StopWatch
      
   public void startTimer()
      {
      startTime = System.nanoTime();
      } // end method startTimer
      
   public void endTimer()
      {
      endTime = System.nanoTime();
      } // end method endTimer
      
   public void printElapsedTime()
      {
      System.out.println( "\n\nElapsed time in nanoseconds is: " + (endTime - startTime)); // Prints out the time after everything is said and done
      } // end method printElaspedTime
  } // end class Stopwatch