import java.util.Stack;

public class Reverse_vowels_of_a_String {
    public static String reverseVowels(String s) {
        StringBuilder b=new StringBuilder();
        Stack<Character> d=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))) {
                d.push(s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))) {
                b.append(d.pop());
            }
            else{   
            b.append(s.charAt(i));
            }
        }
        
        return b.toString();
    }
    static boolean isvowel(char a){
        return (a=='A' || a=='E' || a=='I' || a=='O'|| a=='U'|| a=='a' || a=='e' || a=='i' || a=='o'|| a=='u');
    }
    public static void main(String[] args) {
        String s="Leetcode";
        System.out.println(reverseVowels(s));
    }
}
