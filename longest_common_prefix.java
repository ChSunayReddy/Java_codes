public class longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        if (strs == null || strs.length == 0) System.out.println("");
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) System.out.println("");
            }
        }
        System.out.println(prefix);
    //     StringBuilder a=new StringBuilder();
    //     if(strs.length==1){
    //         a.append(strs[0]);
    //     }
    //     else{
    //     boolean b=false;
    //     for(int i=0;i<strs.length-1;i++){
    //         String[] s=strs[i].split("");
    //         if(strs[i+1].contains(s[0])) b=true;
    //         for(int j=0;j<s.length;j++){
    //             if(b){
    //                 a.append(s[i]);
    //                 b=false;
    //             }
    //         }
           
    //     }
    //     //if(a.length()==1) a.delete(0, 1);
    // }
    //     System.out.println(a);
    /*StringBuilder res = new StringBuilder();
        Arrays.sort(strs, (a, b)->a.length() - b.length());
        int len = strs[0].length();
        for(int i = 0; i < len; i++){
            char ch = strs[0].charAt(i);
            for(String str: strs){
                if(str.charAt(i) != ch){
                    System.out.println(res.toString());
                    break;
                }
            }
            res.append(ch);
        }
        System.out.println(res.toString()); */
    }
}
