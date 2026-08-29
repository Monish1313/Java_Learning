import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S= sc.nextLine(); 
        int l=S.length();
        System.out.println(l);
        S=S.toLowerCase();
        System.out.println(S);
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)== S.charAt(l-1-i)){
                continue;
            }
            else{
                System.out.println("Not Palindrome");
                return;
            }
        }
        sc.close();
    }
}
