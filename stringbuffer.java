import java.util.*;
class stringbuffer{
    public static void main(String[]args){
        StringBuffer name =new StringBuffer();
        name.append("vishal");
        name.append("pugal");
        name.append("sanjay");
        name.append("kowshik");
        name.delete(0,5);
        name.insert(0,"vishal");
        name.replace(0,5,"hello");
        name.reverse();
        String str=name.toString();
        System.out.println(name);
        
    }
}


