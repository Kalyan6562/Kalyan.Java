
/*import java.util.ArrayList;

class MyStack{
	ArrayList<Integer> list = new ArrayList<>();
	
	public int peek(){
		return list.get(list.size()-1);
	}
	public void push(int n) {
		list.add(n);
	}
	public int pop()
	{
		int temp=list.get(list.size()-1);
		list.remove(list.size()-1);
		return temp;
	}
}

public class day6    {
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		
		System.out.print("Topmost element: ");
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.print("New Topmost element: ");
		System.out.println(stack.peek());
		
		}
	}

import java.util.Stack;

public class day6 {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(1);
		stack1.push(2);
	    stack1.push(3);
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.add(4);
		System.out.println(stack1);
		stack1.clone();
		System.out.println(stack1);
		stack1.peek();
		System.out.println("top most element is : "+stack1.peek());
		
	}
}
import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class day6 {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>(); 
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);       // [10, 20, 30]
        System.out.println(q.poll()); // 10
        System.out.println(q);   // [20, 30]
        
    }
  }  */


