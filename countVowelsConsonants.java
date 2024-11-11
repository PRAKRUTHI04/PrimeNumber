import java.util.Scanner;

public class countVowelsConsonants {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = s.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for(int i = 0;i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("number of vowels are: " + vowels);
        System.out.println("number of consonants are: " + consonants);
    }
}
