//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Stackadt {
	
	int top = -1;
    String stack[] = new String[2];

    boolean isFull(){

        if(top == (stack.length - 1)){
            return true;
        }
        return false;
    }
	
	
	
    public static void main(String[] args) {
        

    }
}