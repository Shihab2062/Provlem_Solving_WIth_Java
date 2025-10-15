import java.util.Random;

public class MakePassword {
    public static void main(String[] args) {
        System.out.println(GeneratePass(8));
    }
    public static String GeneratePass(int Length) {
        String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Lowercase = "abcdefghijklmnopqrstuvwxyz";
        String Digit = "0123456789";
        String SpecialChars = "!@#$%^&*()_+=-[]{}|;:,.<>?/";
        Random random = new Random();
        char Up = Uppercase.charAt(random.nextInt(Uppercase.length()));
        char Low = Lowercase.charAt(random.nextInt(Lowercase.length()));
        char Dig = Digit.charAt(random.nextInt(Digit.length()));
        char Spe = SpecialChars.charAt(random.nextInt(SpecialChars.length()));

        String AllChars = Uppercase + Lowercase + Digit + SpecialChars;
        char[] Password = new char[Length];

        Password[0] = Up;
        Password[1] = Low;
        Password[2] = Dig;
        Password[3] = Spe;

        for (int i = 4; i < Length; i++) {
            Password[i] = AllChars.charAt(random.nextInt(AllChars.length()));
        }
        ShuffleArray(Password);
        return new String(Password);
    }
    private static void ShuffleArray(char[] Array){
        Random random=new Random();
        for (int i=Array.length-1;i>0;i--){
            int j=random.nextInt(i+1);
            char temp=Array[i];
            Array[i]=Array[j];
            Array[j]=temp;
        }
    }
}
