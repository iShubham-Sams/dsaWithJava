import java.util.Scanner;

public class MirrorImag {
    public static  void main(String[] args) {
        
     
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int currRow=1;
while(currRow<=n){
    int crrcol=1;
    int space=1;
    while(space<=n-currRow){
        System.out.println(" ");
        space+=1;
    }
    currRow=currRow+1;
}

    }
}

