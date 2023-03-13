import java.util.Scanner;

public class InverteString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String txt = sc.nextLine();

        char[] chars = txt.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        String resultado = new String(chars);
        System.out.println("Texto invertido: " + resultado);
    }

}
