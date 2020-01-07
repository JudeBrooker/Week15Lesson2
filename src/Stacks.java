import java.util.Stack;
public class Stacks {
    public static void main(String[] args){
        Stack<String>  myStack = new Stack<>();
        myStack.push("Jude");
        myStack.push("Jack");
        System.out.println(myStack.peek());
        System.out.println(myStack);
        myStack.pop();
        myStack.push("Bob");
        System.out.println(myStack.pop());
    }
}
