public class node
    {
       //setting the int to data
        int data;
        //making the node next
        node next;
        
        //Node Constructor
      node(int d)
        {
          //setting data to d
            data = d;
            //making the next node null
            next = null;
        }
      public int getData()
      {
       return data;
      }
    }