import java.util.Scanner;

public class Palindrome{

    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Palindrome, or don't. I will check it.");
        String str = sc.nextLine();
        boolean palindrome = false;
        str = str.toLowerCase();
        str = str.replace(" ","");
        str = str.replace(".","");
        str = str.replace(",","");
        str = str.replace("!","");
        str = str.replace("?","");
        str = str.replace(":","");
        System.out.println(str);

        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-(i+1) )){
                palindrome = false;
            }else{
                palindrome = true;
            }

        }

        if(palindrome == true){
            System.out.println("it is a palindrome!");
        }else{
            System.out.println("it is not a palindrome!");
        }

    }

}