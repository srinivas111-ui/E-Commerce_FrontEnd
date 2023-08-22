import java.util.*;
class Line
{

    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
  
class Train extends Thread
{
   
    Line line;
  
    Train(Line line)
    {
        this.line = line;
    }
  

    public void run()
    {
        line.getLine();
    }
}
  
class GFg
{
    public static void main(String[] args)
    {
        Line obj = new Line();
  
      
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);
  
    
        train1.start();
        train2.start();
    }
}