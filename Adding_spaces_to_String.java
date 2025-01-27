public class Adding_spaces_to_String {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder a=new StringBuilder();
        a.append(s.substring(0, spaces[0]));
        
        int i=1;
        for(;i<spaces.length;i++){
            a.append(" ");
            a.append(s.substring(spaces[i-1], spaces[i]));
        }
        a.append(" ");
        a.append(s.substring(spaces[i-1]));
        return a.toString();
    }
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(addSpaces(s, spaces));
    }
}