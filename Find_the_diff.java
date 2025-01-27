public class Find_the_diff {
    public static char findTheDifference(String s, String t) {
        //StringBuilder a=new StringBuilder();
        // char result=0;
        // for(int i=0;i<s.length();i++){
        //     result =(char)(result^s.charAt(i));
        // }
        // for(int i=0;i<t.length();i++){
        //     result=(char)(result^t.charAt(i));  //Cancels all the characters and leaving the remaining char.
        // }
        // return result;
        int total = 0 ;
        for(char c:t.toCharArray()){
            total+=c;
        }
        for(char c:s.toCharArray()){
            total-=c;
        }
        return (char)total;
    }
    public static void main(String[] args) {
        String a="abcd";
        String b="abcde";
        System.out.println(findTheDifference(a, b));
    }
}
