//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
       Arrays.sort(arr,new Comparator<Item>(){
           
           public int compare(Item item1, Item item2){
               double ratio1 = (double) item1.value/item1.weight;
               double ratio2 = (double) item2.value/item2.weight;
               return Double.compare(ratio2,ratio1);
               
           }
           
       });
       double max = 0;
       
       for(int i=0;i<n;i++){
           if(W>= arr[i].weight){
               max += arr[i].value;
               W -= arr[i].weight;
           }else{
               double frac = (double) W/arr[i].weight;
               max += frac * arr[i].value;
               break;
           }
       }
       return max;
    }
}