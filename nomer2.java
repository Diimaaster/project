package lvl1.hw3;
import java.util.Scanner;
public class nomer2 {
   public static void main (String[] args){
       String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
       Scanner in = new Scanner(System.in);
       String[] ekran = {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
       String slovo = words[0 + (int) (Math.random() * words.length)];
       System.out.println(slovo);//Слово ,которое загадал комп
       while (true) {
           for(int i = 0; i < ekran.length; i++) {
               System.out.print(ekran[i]);
           }
           System.out.print("\nВведите слово(маленькими буквами): ");// добавить проверку.
           String Otv = in.nextLine();
           if (slovo.equals((Otv))) {
               System.out.println("Верно! Слово: " + Otv);
               break;
           } else {
               int n;
               if(slovo.length()<Otv.length()){
                   n=slovo.length();
               }else {
                   n=Otv.length();
               }
               for(int i = 0; i < n; i++) {
                   if(slovo.charAt(i)==Otv.charAt(i)){
                       ekran[i]= String.valueOf(Otv.charAt(i));
                   }
               }
               int i;
               for(i = 0; i < n; i++) {
                   if(String.valueOf(slovo.charAt(i)).equals(ekran[i])){
                   }else {
                       break;
                   }
               }
               if(slovo.length() == i){
                   System.out.println("Верно , но вы отгадали слово по буквам! Слово: " + slovo);
                   break;
               }else {
                   System.out.println("Попробуйте еще раз");
               }
           }
       }
   }
}