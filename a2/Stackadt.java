
public class Stackadt {
	
	static int top = -1;
    static String stack[] = new String[2];

    
    
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
			String temp[] = new String[stack.length*2];
			for(int i = 0;i < stack.length;i++) {
				temp[i] = stack[i];
			}
			stack = temp;
		}
		
		top++;
		stack[top] = data; // help
		
	}
	
	
    public static void main(String[] args) {
        
    	
    	
    	
    	
    }
}