import java.util.Scanner;

public class Convert{

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int ans = 0;
        int i = 1;

        while(0 < original){
            if(original%2 == 1){
                original = original/2;
                ans += i;
            }else{
                original = original/2;
            }
            i = i*10;
        }
        System.out.println(ans);



    }
}