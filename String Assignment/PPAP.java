import java.util.Scanner;

public class PPAP{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String a = "";
        String b = "";

        a = "pen";
        b = "apple";

        lyrics(a,b);
    }
    public static void lyrics(String a, String b){
        String c = b.toUpperCase();
        
        System.out.println("I have a "+a+", I have a "+b);
        System.out.println("Uh! "+c.substring(0,1)+b.substring(1,b.length())+" "+a+".");
    }

}