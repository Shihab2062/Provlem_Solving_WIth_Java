import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=scanner.nextLine();
        scanner.close();
        String [] Word=input.split(" ");
        System.out.println("Words:"+Word.length);
        int Count=0;
        for (char ch:input.toCharArray()){
            if (ch!=' '){
                Count++;
            }
        }
        System.out.println("Chars:"+Count);
        int Vowels=0;
        int Consonant=0;
        String LowerCase=input.toLowerCase();
        for (int i=0;i<LowerCase.length();i++){
            char ch=LowerCase.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                Vowels++;
            } else if (ch>'a'&&ch<'z') {
                Consonant++;
            }
        }
        System.out.println("Vowels:"+Vowels);
        System.out.println("Consonant:"+Consonant);
    }
}
