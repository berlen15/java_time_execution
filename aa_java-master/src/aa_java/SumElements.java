
package aa_java;

/**
 *
 * @author Belen
 */
public class SumElements {
     
    
    static int sumElements(int [] arr) 
    { 
        int sum=0;
        for (int e: arr){
            sum+=e;
        }
        return sum;
    } 
    void printArray(int arr[]) {
        int sum = 0;
        System.out.println("Output:");
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            sum+=arr[i];
            System.out.print(arr[i] + "\n");
        }
        System.out.println("SUMA TOTAL = "+sum);
    }
    // Driver method  
    public static void main(int [] arr, boolean o)  
    { 
        SumElements ob = new SumElements();
        ob.sumElements(arr);
        System.out.println("Sum Elements correctamente");
        if (o) {
            ob.printArray(arr);
        }
        
    } 
} 

