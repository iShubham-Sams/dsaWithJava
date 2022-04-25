import java.util.Scanner;

public class AlphabaticPattern {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int i=value.nextInt();
        int k=1;

        while(k<=i){
        int currcol=1;
        char ch=(char)('A'+ k-1);
        while(currcol<=k){
            System.out.print(ch);
        currcol++;
        }


        System.out.println();
            k++;
        }
    }
}
