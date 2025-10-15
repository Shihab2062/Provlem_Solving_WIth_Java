import java.util.Arrays;
import java.util.Scanner;

public class SearchCGPAbyBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the CGPA");
        double Input=scanner.nextDouble();
        double[] CGPAList = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(CGPAList);
        int Left=0;
        int Right=CGPAList.length-1;
        while (Left<=Right){
            int Mid=Left+(Right-Left)/2;
            if (CGPAList[Mid]==Input){
                System.out.println("CGPA is present in the Array");
                break;
            }
            else if (CGPAList[Mid]<Input){
                Left=Mid+1;
            }else {
                Right=Mid-1;
            }
            scanner.close();
        }
    }
}
