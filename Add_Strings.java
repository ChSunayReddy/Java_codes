public class Add_Strings {
    public static String addStrings(String num1, String num2) {
        // int a=Integer.parseInt(num1);
        // int b=Integer.parseInt(num2);
        // return Integer.toString(a+b);
        String s="";
        int carry=0;
        if(num1.length()>num2.length()){
            while(num1.length()>num2.length()){
                num2=0+num2;
            }
        }
        else if(num2.length()>num1.length()){
            while(num2.length()>num1.length()){
                num1=0+num1;
            }
        }
        for(int i=num1.length()-1;i>=0;i--){
            int a=(int) num1.charAt(i)-'0';
            int b=(int) num2.charAt(i)-'0';
            if(carry!=0){
                s=(a+b+carry)%10+s;
            }
            else{
                s=(a+b)%10+s;
                carry=0;
            }
            if(a+b+carry>=10){
                carry=(a+b+carry)/10;
            }
            else carry=0;
        }
        if(carry!=0) s=carry+s;
        return s;
    }
    public static void main(String[] args) {
        String a="1";
        String b="9";
        System.out.println(addStrings(a, b));
    }
}
