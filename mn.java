import java.io.*;
import java.util.*;
  
class Geek
{
    String name = "";
    public int count = 0;
  
    public void geekName(String geek, List<String> list)
    {
        
        synchronized(this)
        {
            name = geek;
            count++;  
        }
        list.add(geek);
    }
}
  
class GFG
{
    public static void main (String[] args)
    {
        Geek gk = new Geek();
        List<String> list = new ArrayList<String>();
        gk.geekName("mohit", list);
        System.out.println(gk.name);
  
    }
}