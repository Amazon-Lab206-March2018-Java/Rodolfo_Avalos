public class BasicsTest {
    public static void main (String[] args){
        Basics result = new Basics();
        // result.print1To255();
        // result.printOdds();
        // result.printNumAndSum();
        int[] newArray = {1, 3, 50, 7, 9, 13, -10, 30, 4};
        // result.iterateArray(newArray);
        // result.findMaxOfArray(newArray);
        // result.findAverage(newArray);
        // result.arrangeOddNumbers();
        // result.countGreaterThanY(newArray, 10);
        int[] smallArray = {1,3,-5,6};
        result.squareTheValues(smallArray);
        result.eliminateNegatives(smallArray);
        result.getMaxMinAvg(newArray);
        result.shiftValue(smallArray);
    }
}