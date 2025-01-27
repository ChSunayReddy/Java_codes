class reverse{
public static void main(String[] args){
int n=120;
int rev=0;
while(n>0){
int m=n%10;
rev=rev*10+m;
n=n/10;
}
System.out.println(rev);
}
}