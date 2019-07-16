
package task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class task1 {
    static int pagefaults(int pages[], int n, int capacity, int pagefalut)
    {
        HashSet<Integer>s=new HashSet<>(capacity);
        HashMap<Integer,Integer>indexes=new HashMap<>();
        
        int pagefaults=0;
        for(int i=0;i<n;i++)
        {
            if(s.size()< capacity)
            {
                if(!s.contains(pages[i]))
                        {
                            s.add(pages[i]);
                            pagefaults++;
                            
                        }
                indexes.put(pages[i],i);
             }
            else
            {
                 if(!s.contains(pages[i]))
                 {
                     int lru=Integer.MAX_VALUE,val=Integer.MIN_VALUE;
                     Iterator<Integer>itr=s.iterator();
                     
             while(itr.hasNext())
             {
                 int temp=itr.next();
                 if(indexes.get(temp)<lru)
                 {
                     lru=indexes.get(temp);
                     val=temp;
                 }
                 
             }
                 s.remove(val);
                 s.add(pages[i]);
                 pagefaults++;
                
            }
                 indexes.put(pages[i],i);
        }
    
        return pagefaults;
     
    
    public static void main(String[] args) {
       {
        int pages[]={6,1,0,3,0,4,0,3,4};
        int capacity=4;
        System.out.println(pagefaults(pages, pages.length, capacity));
       }
    }
}
    
    
