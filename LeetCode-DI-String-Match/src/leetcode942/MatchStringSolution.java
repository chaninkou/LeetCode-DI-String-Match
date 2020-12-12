package leetcode942;

public class MatchStringSolution {
    public int[] diStringMatch(String S) {
        int size = S.length();
        int left = 0;
        int right = S.length();
        
        int[] array = new int[size + 1];
            
        for(int i = 0; i < size; i++){
            if(S.charAt(i) == 'D'){
                array[i] = right--;
            } else{
                array[i] = left++;
            }
        }
        
        array[size] = left;
        
        return array;
    }
}
