import java.util.Scanner;

public class CheckCharater {
    public static void main(String[] arges) {
        Scanner invalue=new Scanner(System.in);
        String man=invalue.next();
        char ch =man.charAt(0);
        if('A'<=ch&&'Z'>=ch){
            System.out.println("ch in upper case");
        }else if('a'<=ch&&'z'>=ch){
            System.out.println("ch in lower case");
        }else{
            System.out.println("ch is not alphabate");
        }
    }
    
}
