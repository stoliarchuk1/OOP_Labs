import java.util.Scanner;
public class lab_3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int C17;
        //залишок від ділення номера залікової книжки учня на 17
        C17 = 1124 % 17;
        System.out.println("C17 = " + C17 );
        //символ "!" в chars
        char exclamation_mark = 33;
        //символ "," в chars
        char coma = 44;
        //символ "." в chars
        char point = 46;
        //пробіл в chars
        char gap = 32;
        String s ="";
        String w ="";
        String a =" ";
        System.out.print("Enter the sentence: ");
        a = num.nextLine();
        System.out.println("the sentence is: " + a);
        //шукаю перше речення
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == point || a.charAt(i) == exclamation_mark){
                //перше речення
                s+=a.substring(0,i);
                //всі інші речення
                w+=a.substring(i+1);
                s+=" .";
                break;
            }
        }
        //знаходимо слова в першому реченні від пробіла до пробіла
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == gap){
                for (int j = i; j < s.length(); j++){
                    if (i!=j && s.charAt(j) == gap){
                        //перевіряєм чи в першому реченні є таке слово якого немає в інших реченнях
                        if (!w.contains(s.substring(i, j-1)) && (s.charAt(j-1) == coma)){
                            System.out.println("the word "+ "\""  + s.substring(i, j-1) + " \"" + " isn't in another sentence");
                        }
                        else if (!w.contains(s.substring(i, j))){
                            System.out.println("the word "+ "\""  + s.substring(i, j) + " \"" + " isn't in another sentence");
                        }
                        break;
                    }
                }
            }
        }
    }
}