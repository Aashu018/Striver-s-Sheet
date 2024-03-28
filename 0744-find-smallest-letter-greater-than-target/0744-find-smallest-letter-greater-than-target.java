class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int mid;
        
        while(start<= end){
            mid = (start+end)/2;
            // if(letters[mid]==target){
            //     return letters[mid];
            // }
            if(letters[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        if(start>=0 && start<letters.length)
        return letters[start];
        
        return letters[0];
    }
}