
public class Stackadt {
	
	static int top = -1;
    static String stack[] = new String[2];
    

    static boolean isEmpty() {
    	boolean empty = top == -1 ? true : false; return empty;
    }
    
    static boolean isFull(){

        if(top == (stack.length - 1)){
            return true;
        }
        return false;
    }
	
	static void pop() {
		if(top != -1) {
			stack[top] = null;
			top--;
		}
		
	}
	
	static void push(String data) {
		
		if(isFull()) {
			System.out.println("Stack is full; its current size is " + stack.length);
			System.out.println("Will be expanding the size to " + stack.length*2);
			String temp[] = new String[stack.length*2];
			for(int i = 0;i < stack.length;i++) {
				temp[i] = stack[i];
			}
			stack = temp;
		}
		
		top++;
		stack[top] = data; 
		
		
	}
	
	static int size() {
		return stack.length;
	}
	
	static String top() {
		if(top != -1) {
			return stack[top];
		}else {
			return "too small!";
		}
	}
	
    public static void main(String[] args) {
        
    	push("hello");
    	push("bonjours");
    	push("grammarcy");
    	System.out.println(top());
    	System.out.println(top());
    	pop();
    	System.out.println(top());
    	pop();
    	System.out.println(top());
    	pop();
    	System.out.println(top());
    	
    	
    }
}