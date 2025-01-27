import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0) a.add("FizzBuzz");
            else if(i%3==0) a.add("Fizz");
            else if(i%5==0) a.add("Buzz");
            else{
                a.add(Integer.toString(i));
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int n=15;
        List<String> a=fizzBuzz(n);
        System.out.println(a);
    }
}
