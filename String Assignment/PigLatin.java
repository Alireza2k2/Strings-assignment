import java.util.Scanner;

public class PigLatin{

    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter word.");
        String str = sc.nextLine();

        operation(str);

    }

    public static void operation(String str){
     
        String[] output = str.split(" ");
    
        String finaloutput = "";
        for(int i = 0; i<output.length; i++){
            if(output[i].length()>=3){
                output[i] = "" + output[i].substring(1) + output[i].charAt(0) + "ay";
            }else if(output[i].length()<=2){
                output[i] = "" + output[i];
            }
            finaloutput = finaloutput + " " + output[i];
        }
        System.out.println(finaloutput);
    }
}
