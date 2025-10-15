public class CountNotes {
    public static void main(String[] args) {
        int[] notes={1000,500,200,100,50,20,10,5,2,1};
        int InputAmount=546;
        for (int note:notes){
            if (InputAmount>=note){
                int CountedNote=InputAmount/note;
                InputAmount=InputAmount%note;
                System.out.println(note+" -> "+CountedNote);
            }
        }
    }
}
