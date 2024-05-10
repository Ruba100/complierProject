import java.util.Scanner;

public class complierProject {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String input:");
        String inputu = input.nextLine();
        // يستبدل كل مسافه ب "" يعني يخليها بدون مسافات
        String inputL = inputu.replaceAll("\\s+", "");
        System.out.println(inputL);
        System.out.println();

 // اراي تفصل لجمله حسب المسافه
        String[] words = inputu.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String x = maenTheword(words[i]);
            System.out.println(words[i] + " ----> " + x);
        }
    }

     public static String maenTheword(String word) {
        if (word.equals("int") || word.equals("double") || word.equals("float")) {
            return "data type";
        } else if(word.matches("[a-zA-Z0-9]+")){
            return"identifier";
        }else if(word.equals(";")){
            return "SEMI_COLON";
        }else if(word.equals("=")){
            return" ASSIGN_OP";
        }
        return"";
    }

}
