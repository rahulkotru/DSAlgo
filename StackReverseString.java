import java.util.Stack;
public class StackReverseString{
    public static String reverse (String str){
        Stack<Character> stack=new Stack<>();
        char [] chars =str.toCharArray();

        for (char c : chars){
            stack.push(c);
        }
        for (int i=0;i<str.length();i++){
            chars[i]=stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str ="ABCD";
        System.out.println("Beofre reverse "+str);
        System.out.println("After reverse "+reverse(str));

    }
}