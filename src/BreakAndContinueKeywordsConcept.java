import javax.sound.midi.Soundbank;

public class BreakAndContinueKeywordsConcept {

//    Break: Break keyword is used to terminate exection from a block or loop; Break is the line we use to terminate the loop based on condition.
//    Continue: Continue keyword is used to skip the current iteration of a loop.

    public static void main(String[] args) {

        System.out.println("Break Keyword usage");
        for(int i=0;i<10;i++){
            if(i==5)
                break;
                System.out.println(i);
        }

        System.out.println("Continue Keyword usage - Skipping the condition of current iteration and executing next elements of the iteration");
        for(int i=0;i<10;i++){
            if(i==5){
                continue;}
            System.out.println(i);
        }

    }
}
