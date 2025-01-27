public class palindrome_string {
    public static void main(String[] args) {
        String string="A man, a plan, a canal: Panama";
        String n=string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(n);
        boolean t=false;
        if (n.isEmpty()) {
        	t=true;
        }
        int l=n.length()-1;
        for(int i=0;i<=l;i++){
            char cs=n.charAt(i);
            char cl=n.charAt(l-i);
            if(cs==cl) t=true;
            else {
                t=false;
                break;
            }
        }
        if(t==true) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
