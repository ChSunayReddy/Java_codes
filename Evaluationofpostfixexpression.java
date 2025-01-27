// Please make sure that the class name is 'Main'
import java.util.*;
class Evaluationofpostfixexpression{
    public static void main(String[] args){
        //write your code here
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        String[] f=m.split(" ");
        Stack<Integer> s=new Stack<>();
        for (String i:f){
            if(i.matches("-?\\d+")){
                s.push(Integer.parseInt(i));
            }
            else{
            int b=s.pop();
            int a=s.pop();
            if(i.equals("+")){
                s.push(a+b);
            }
            else if(i.equals("-")){
                s.push(a-b);
            }
            else if(i.equals("*")){
                s.push(a*b);
            }
            else if(i.equals("/")){
                s.push(a/b);
            }
            else if(i.equals("^")){
                s.push(a^b);
            }
        }
        }
        int r=s.pop();
        System.out.println(r);
    }
} 