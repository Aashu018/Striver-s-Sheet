//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if (M>N)
            return -1;
        int max = -1;
        int sum = 0;
        for(int i=0;i<N;i++){
            if(A[i]>max){
                max = A[i];
            }
            sum += A[i];
        }
        
        int lo = max,hi = sum;
        while(lo<=hi){
            int mid = (lo+hi)>>1;
            
            if(countstu(A,mid)>M){
                 lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return lo;
    }
    public static int countstu(int[] arr, int pages){
        int n = arr.length; // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                // add pages to current student
                pagesStudent += arr[i];
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }
};