import java.util.Arrays;

public class SortCGPA {
    public static void main(String[] args) {
            double[] CGPAList = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
            double[] CGList = SortScoreAccordingCG(CGPAList);
            System.out.println(Arrays.toString(CGList));
        }

        public static double[] SortScoreAccordingCG(double[] CGPAList){
            for (int i = 0; i < CGPAList.length; i++) {
                for (int j = i + 1; j < CGPAList.length; j++) {
                    if (CGPAList[i] < CGPAList[j]) {
                        double HighestCGPA = CGPAList[i];
                        CGPAList[i] = CGPAList[j];
                        CGPAList[j] = HighestCGPA;
                    }
                }
            }
            return CGPAList;
    }
}
