import java.util.Stack;
public class parenthesischeck{
    public Boolean checkparity(String str){
        Stack <Character> stack = new Stack<>();
        for( char c : str.toCharArray()){
            if(c=='('|| c=='{'|| c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if((c ==')'&& top=='('|| c=='}'&& top=='{'|| c==']'&& c=='[')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }return stack.isEmpty();
    }
    public static void main(String[] args) {
        parenthesischeck pcheck=new parenthesischeck();
        String str="()";
        System.out.println(pcheck.checkparity(str));
    }
    
}