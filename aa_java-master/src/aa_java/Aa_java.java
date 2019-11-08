package aa_java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Belen
 */
public class Aa_java {

    static boolean qs = false;
    static boolean bs = false;
    static boolean o = false;
    static boolean dt = false;
    static boolean in = false;
    static boolean ms = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2 || args[0] == "-h") {
            System.out.println("usage: java -jar <name.jar> file.txt [-q] [-b] [-s] [-m] [-di] [-do] [-dt]");
            System.out.println("options: \n-q, Quicksort algorithm execution\n-b, "
                    + "BubbleSort Algorithm execution\n-s, Sum Elements execution\n-m, Sum Elements execution\n-di,"
                    + " Execution with input\n-do,"
                    + " Execution with output\n-dt, Execution with time");
        } else {
            String thisLine = null;
            ArrayList<String> arrlist = new ArrayList<>();

            try {
                // open input stream test.txt for reading purpose.
                BufferedReader br = new BufferedReader(new FileReader(args[0]));
                while ((thisLine = br.readLine()) != null) {
                    arrlist.add(thisLine);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            int[] arr = new int[arrlist.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(arrlist.get(i));
            }

            for (int i = 1; i < args.length; i++) {
                if ("-q".equals(args[i])) {
                    qs = true;
                } else if ("-b".equals(args[i])) {
                    bs = true;
                } else if ("-di".equals(args[i])) {
                    System.out.println("Input:");
                    for (int s : arr) {
                        System.out.println(s);
                    }
                } else if ("-do".equals(args[i])) {
                    o = true;
                } else if ("-dt".equals(args[i])) {
                    dt = true;
                } else  if ("-s".equals(args[i])){
                    in = true;
                    
                } else  if ("-m".equals(args[i])){
                    ms = true;
                } else {
                    System.out.println("usage: java -jar <name.jar>  file.txt [-q] [-b] [-s] [-m] [-di] [-do] [-dt]");
                    System.out.println("options: \n-q, Quicksort algorithm execution\n-b, "
                            + "BubbleSort Algorithm execution\n-s, Sum Elements execution\n-m, "
                            + "Sum Elements execution\n-di, Execution with input\n-do, "
                            + "Execution with output\n-dt, Execution with time");
                    break;
                }
            }
            if (qs) {
                if (dt) {
                    long startime = System.currentTimeMillis();
                    QuickSort.main(arr, o);
                    long res = System.currentTimeMillis() - startime;
                    System.out.println("Execution time: " + (long) res + " milliseconds");
                } else {
                    QuickSort.main(arr, o);
                }
            }
            if (bs) {
                if (dt) {
                    long currentTimeMillis = System.currentTimeMillis();
                    BubbleSort.main(arr, o);
                    long res = System.currentTimeMillis() - currentTimeMillis;
                    System.out.println("Execution time: " + (long) res + " milliseconds");
                } else {
                    BubbleSort.main(arr, o);
                }
            }
            if (in) {
                if (dt) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SumElements.main(arr, o);
                    long res = System.currentTimeMillis() - currentTimeMillis;
                    System.out.println("Execution time: " + (long) res + " milliseconds");
                } else {
                    SumElements.main(arr,o);
                }
            }
            
            if (ms) {
                if (dt) {
                    long currentTimeMillis = System.currentTimeMillis();
                    MergeSort.main(arr, o);
                    long res = System.currentTimeMillis() - currentTimeMillis;
                    System.out.println("Execution time: " + (long) res + " milliseconds");
                } else {
                    MergeSort.main(arr,o);
                }
            }
        }
    }
}
