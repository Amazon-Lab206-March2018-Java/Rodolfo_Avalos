public class PuzzleJavaTest {
    public static void main (String[] args){
        PuzzleJava result = new PuzzleJava();
        int [] taskarray = {3,5,1,2,7,9,8,13,25,32};
        result.firstfunction(taskarray, 10);
        // String [] namearray = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // result.lname(namearray);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        result.shufflee(alphabet);
        result.getRandom55to100();
        result.setMultipleFirst();
        result.randomString();
        result.RandStr10();
    }
}

