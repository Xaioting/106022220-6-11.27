import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int z1=in.nextInt(),z2=in.nextInt(),z3=in.nextInt();
        int r=n-z1*15-z2*20-z3*30;
        int a50,a5,a1;
        if(r<0)
            System.out.println(0);
        else
        {
            a50=r/50;
            a5=(r%50)/5;
            a1=r%5;
            System.out.println(a1+"\n"+a5+"\n"+a50);
        }
    }
}