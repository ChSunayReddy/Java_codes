import java.util.*;
class Keyboard_row {
    public static  String[] findWords(String[] words) {
        int l=words.length;
        Set<String> d=new HashSet<>(); 
        String a="qwertyuiop";
        String b="asdfghjkl";
        String c="zxcvbnm";
        for(int i=0;i<l;i++){
            String[] q=words[i].toLowerCase().split("");
            String t="";
            boolean f=true;
            if(a.contains(q[0])) t=a;
            else if(b.contains(q[0])) t=a;
            else t=c;
            for(int j=1;j<q.length;j++){
                if(t.contains(q[j])) {
                    f=false;
                    break;
            }
            if(f){
                d.add(words[i]);
            }
        }
    }
        return d.toArray(new String[d.size()]);
    }
    public static void main(String[] args) {
        String[] w={"Hello","Alaska","Dad","Peace"};
        String[] s=findWords(w);
        for(String i:s){
            System.out.print(i+" ");
        }
    }
}