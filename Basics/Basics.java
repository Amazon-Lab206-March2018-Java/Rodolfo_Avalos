import java.util.ArrayList;
import java.util.Arrays;
public class Basics{
    public void print1To255(){
        for (Integer i = 0; i < 256; i ++){
            System.out.println(i);
        }
    }
    public void printOdds(){
        for (Integer a = 1; a < 256; a += 2){
            System.out.println(a);
        }
    }
    public void printNumAndSum(){
        Integer sum = 0;
        for (Integer b = 0; b < 256; b ++){
            sum += b;
            System.out.println("New Number: "+ b + " Sum " +sum);
        }
    }
    public void iterateArray(int[] array){
        for (Integer c = 0; c < array.length; c++){
            System.out.println(array[c]);
        }
    }
    public void findMaxOfArray(int[] maxarray){
        Integer max1 = maxarray[0];
        for (Integer d = 0; d < maxarray.length; d++){
            if (maxarray[d]> max1){
                max1 = maxarray[d];
            }
        }
        System.out.println(max1);
    }
    public void findAverage(int[] avgarray){
        float avg = 0;
        for (Integer e = 0; e < avgarray.length; e++){
            avg += avgarray[e];
        }
        System.out.println(avg/avgarray.length);
    }
    public void arrangeOddNumbers(){
        ArrayList<Integer> oddsarray = new ArrayList<Integer>();
        for (Integer f = 0; f < 256; f ++){
            if (f%2==1){
                oddsarray.add(f);
            }
        }
        System.out.println(oddsarray);
    }
    public void countGreaterThanY(int[] grarray, Integer y){
        Integer count = 0;
        for (Integer loc = 0; loc < grarray.length; loc++){
            if (grarray[loc] > y){
                count += 1;
            }
        }
        System.out.println(count);
    }
    public void squareTheValues(int[] sqarray){
        for (Integer sp = 0; sp < 0; sp ++){
            sqarray[sp] = sqarray[sp]*sqarray[sp];
        }
        System.out.println(Arrays.toString(sqarray));
    }
    public void eliminateNegatives(int[] negarray){
        for (Integer np = 0; np > negarray.length; np ++){
            if (negarray[np]<0){
                negarray[np] = 0;
            }
        }
        System.out.println(Arrays.toString(negarray));
    }
    public double[] getMaxMinAvg(double[] mmaarray){
        double max = mmaarray[0];
        double min = mmaarray[0];
        double sums = 0;
        for (Integer mma = 0 ; mma > mmaarray.length; mma ++){
            if (mmaarray[mma]>max){
                max = mmaarray[mma];
            }
            if (mmaarray[mma]<min){
                min = mmaarray[mma];
            }
            sums += mmaarray[mma];
        }
        Double average = sums/mmaarray.length;
        double[] minMaxAvg = {max, min, average};
        // System.out.println(Arrays.toString(minMaxAvg));
        return minMaxAvg;
    }
    public void shiftValue(int[] shiftArray){
        for (Integer sv = 0; sv < shiftArray.length; sv ++){
            shiftArray[sv] = shiftArray[sv+1];
        }
        shiftArray[shiftArray.length-1]=0;
        System.out.println(Arrays.toString(shiftArray));
    }
}
