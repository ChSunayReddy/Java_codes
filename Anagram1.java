import java.util.Scanner;

public class Anagram1{

    static boolean isAnagram(String a, String b) {
        if (a.length()!=b.length()){
            return false;
        }
        else{
            a=a.toLowerCase();
            b=b.toLowerCase();
            int[] arr=new int[26];
            for(int i=0;i<a.length();i++){
                arr[a.charAt(i)-'a']++;
            }
            for(int i=0;i<b.length();i++){
                arr[b.charAt(i)-'a']--;
            }
            for (int i:arr){
                if (i!=0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}