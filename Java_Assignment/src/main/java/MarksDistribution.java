public class MarksDistribution {
    public static void main(String[] args) {
        int TotalMarks=100;
        int TotalQuestion=15;
        int FiveMarksQues=0, TenMarkQues=0;
        for (TenMarkQues=0;TenMarkQues<=TotalMarks/10;TenMarkQues++){
            FiveMarksQues=(TotalMarks-(TenMarkQues*10))/5;

            if (TenMarkQues+FiveMarksQues==TotalQuestion){
                System.out.println("5 marks question is "+FiveMarksQues);
                System.out.println("10 marks question is "+TenMarkQues);
            }
        }
    }
}
