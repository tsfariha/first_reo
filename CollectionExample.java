import java.util.*;
class CollectionExample
{
  public static void main(String args[])
  {
    ArrayList<String> names=new ArrayList<String>();
    names.add("fariha");
    names.add("niyoosha");
    names.add("nasheed");

///////////using iterator
    //Iterator itr=names.iterator();
    //while(itr.hasNext())
    //{
     // System.out.println(itr.next());
    //}
    
//////////using for-each
    //for(String a:names)
    // System.out.println(a);
      ArrayList<String> names_2=new ArrayList<String>(names);
     //for(String a:names_2)
     //System.out.println(a);
     ArrayList<String> names_3=new ArrayList<String>(10);
     names_3.addAll(names_2);
     int index;
   for(String a:names_3)
     {
       index=names_3.indexOf(a);
       names_3.set(index,a+"2");
       System.out.print(index);
     
  }


      for(String a:names_3)
     {
       System.out.println(a);
  }

  } 
}

