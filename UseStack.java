
/**
 * Write a description of class UseStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class UseStack
{
    public static void Check(ArrayLinearList arr)
    {
        if(arr instanceof Stack){
            System.out.println("Error,size method cannot be accessed in Stack");
            
        }
        else
        {
            System.out.println("The size of array "+arr.size());
        }
        if(arr.isEmpty()){
            System.out.println("Array is Empty");
        }
        else
        {
            System.out.println("Array is not Empty");
        }
        if(arr instanceof Stack)
        {
            int k = arr.get(2);
        }
        else
        {
            System.out.println("The element of an array at index 2 is "+arr.get(2));
        }
        if(arr instanceof Stack)
        {
            int k = arr.indexOf(2);
        }
        else{
            System.out.println("The index of an element 2 is "+arr.indexOf(2));
        }
        arr.add(0,3);
        arr.remove(2);
        String s = arr.toString();
        if(arr instanceof Stack)
        {
            System.out.println("Error,toString method cannot be accessed in Stack");
        }
        else{
            for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
        }
        if(!(arr instanceof Stack))
        {
            System.out.println("\nSemantics of ArrayLinearList are satisfied");
        }
        else{
            System.out.println("\nSemantics are not satisfied");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
       
        ArrayLinearList ls = new ArrayLinearList(7,arr);
         System.out.println("ArrayLinearList is passed to the function to check semantics\n");
        Check(ls);
        
        Stack stack = new Stack(7,arr) ;
        System.out.println("Stack is passed to the function to check semantics\n");
        Check(stack);
    }
}
