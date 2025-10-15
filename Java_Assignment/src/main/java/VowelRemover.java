import java.util.Scanner;

public class VowelRemover {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String Input = scanner.nextLine();
        scanner.close();
        String repAll = Input.replaceAll("[aeiouAEIOU]", "");
        StringBuilder str=new StringBuilder();
        str.append(repAll);
        System.out.println(str);
    }
}
