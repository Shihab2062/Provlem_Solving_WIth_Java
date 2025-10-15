public class SecondHighestCGPA {
    public static void main(String[] args) {
        double[] CGPAList = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.12};
        int StudentNo = (int) Second_Highest_Num(CGPAList);
        System.out.println("The student of index\t" + StudentNo + "\tachived the 2nd highest score.");
    }
    public static double Second_Highest_Num(double[] CGPAList) {
        double highest = 0;
        for (double CGPA : CGPAList) {
            if (CGPA > highest) {
                highest = CGPA;
            }
        }
        double SecHighest = 0;
        for (double CGPA : CGPAList) {
            if (CGPA < highest && CGPA > SecHighest) {
                SecHighest = CGPA;
            }
        }
        int StudentIndex = 0;
        for (int i = 0; i < CGPAList.length; i++) {
            if (CGPAList[i] == SecHighest) {
                StudentIndex = i + 1;
                break;
            }
        }
        return StudentIndex;
    }

}
