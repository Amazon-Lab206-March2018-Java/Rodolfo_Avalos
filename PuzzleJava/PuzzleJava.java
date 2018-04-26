import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.*;

public class PuzzleJava {
    public void firstfunction(int[] firstarray, int grth){
        int count = 0;
        ArrayList<Integer> greaterthan = new ArrayList<Integer>();
        for (int i = 0; i < firstarray.length; i++){
            if (firstarray[i]>grth){
                greaterthan.add(firstarray[i]);
            }
            count += firstarray[i];
        }
        System.out.println(count);
        System.out.println(greaterthan);
    }
    public ArrayList<String> lname(String[] arr){
        Random random = new Random();
        ArrayList<String> biggerThan = new ArrayList<String>();
        for (int a=0; a < arr.length; a++){
            int change = a + random.nextInt(arr.length-1);
            String temp = arr[a];
            arr[a] = arr[change];
            arr[change]=temp;
        }
        for (String b : arr){
            if (b.length()>5);
        }
        System.out.println(Arrays.toString(arr));
        return biggerThan;
    }
    public static List shufflee(String string){
        List<String> toshuffle = Arrays.asList(string.split(""));
        Collections.shuffle(toshuffle);
        String shuffled = "";
        for (String letter : toshuffle){
            shuffled += letter;
        }
        List<String> answer = Arrays.asList(string.split(""));
        String letter = answer.get(0);
        char first = letter.charAt(0);
        System.out.println(first);
        System.out.println("The last letter for the array is: "+answer.get(25));
        System.out.println("The first letter for the array is: "+answer.get(0));
        if (first == 'a' || first == 'e'|| first == 'i'|| first == 'o'|| first == 'u'){
            System.out.println("The first letter for the array was a vowel.");
        }
        return answer;
    }
    public ArrayList<Double> getRandom55to100(){
        ArrayList<Double> result = new ArrayList<Double>();
        Random random1 = new Random();
        int Low = 55;
        int High = 100;
        for (int rmd = 0; rmd<11; rmd++){
            double numb = random1.nextInt(High-Low) + Low;
            result.add(numb);
        }
        return result;
    }
    public ArrayList<Double> setMultipleFirst(){
        ArrayList<Double> sorted = new ArrayList<Double>();
        Random rand = new Random();
        int low = 55;
        int high = 100;
        for (int rmd = 0; rmd<11; rmd++){
            double numb = rand.nextInt(high-low) + low;
            sorted.add(numb);
        }
        Collections.sort(sorted);
        System.out.println("The highest value is "+ sorted.get(9));
        System.out.println("The lowest value is "+ sorted.get(0));
        return sorted;
    }
    public void randomString(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String rs = "";
        Random randst = new Random();
        for (int z=0; z<5;z++){
            rs += alphabet.charAt(randst.nextInt(26));
        }
        System.out.println(rs);
    }
    public static ArrayList<String> RandStr10(){
        ArrayList<String> random10 = new ArrayList<String>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        Random random = new Random();
        for (int x=0; x<11;x++){
            for (int z=0; z<5;z++){
                temp += alphabet.charAt(random.nextInt(26));
            }
            random10.add(temp);
        }
        return random10;
    }
}