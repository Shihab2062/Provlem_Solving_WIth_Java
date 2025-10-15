import java.util.Arrays;
import java.util.Random;

public class GenerateNumber {
    public static void main(String[] args) {
        int size=10;
        int[] RandomValue=new int[size];
        Random random=new Random();
        for (int i=0;i<RandomValue.length;i++){
            RandomValue[i]= random.nextInt(100)+1;
        }
        System.out.println("Generated Array"+ Arrays.toString(RandomValue));
        int Max=MaxValue(RandomValue);
        System.out.println("Max value of the array:"+Max);
        int Min=MinValue(RandomValue);
        System.out.println("Min value of the array:"+Min);
    }
    public static int MaxValue(int[] RandomValue){
        int max= RandomValue[0];
        for (int i=0;i<RandomValue.length;i++){
            if (RandomValue[i]>max){
                max=RandomValue[i];
            }
        }
        return max;
    }
    public static int MinValue(int[] RandomValue){
        int min=RandomValue[0];
        for (int i=0;i<RandomValue.length;i++){
            if (RandomValue[i]<min){
                min=RandomValue[i];
            }
        }
        return min;
    }
}
