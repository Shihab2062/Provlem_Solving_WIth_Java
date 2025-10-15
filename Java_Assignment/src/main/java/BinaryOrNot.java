import java.util.Scanner;

public class BinaryOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a string");
        String Input=scanner.nextLine();
        Boolean check=true;

        for (int i=0;i<Input.length();i++){
            char ch=Input.charAt(i);
            if (ch!='0'&&ch!='1'){
                check=false;
            }
        }
        System.out.println(check);
    }
}
