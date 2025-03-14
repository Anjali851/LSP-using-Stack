
/**
 * Write a description of class Stack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stack extends ArrayLinearList
{
    //instance variables
    int top;
    
    //Constructor
    Stack(){
        super();
    }
    
    Stack(int n,int arr[])
    {
        super();
    }
    //Methods
    public void push(int item)
    {
        this.top = size();
        add(this.top,item);
    }
    
    public int pop()
    {
        this.top = size();
        return remove(this.top);
    }
    
    public int peek(){
        this.top = size();
        return get(this.top);
    }
    
    @Override
    public int get(int index)
    {
        System.out.println("Error,get method cannot be accessed in Stack");
    
        return -999;
    }
    
    @Override
    public int remove(int index)
    {
        System.out.println("Error,remove method cannot be accessed in Stack");
        return -1;
    }
    
    @Override
    public void add(int index,int theElement)
    {
        System.out.println("Error,add method cannot be accessed in Stack");
    }
    
    @Override
    public int indexOf(int theElement){
        System.out.println("Error,indexof method cannot be accessed in Stack");
        return 0;
    }
}
