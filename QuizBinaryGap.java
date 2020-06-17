

 given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int s =0;
		int r = 0;
		int l=0;		
		char [] arr = Integer.toBinaryString(N).toCharArray();
		for(int i = arr.length-1 ; i>= 0; i--) {
			if(arr[i] == '1') {
				r=s-i;
				if(r>l) {
					l=r-1;
				}
				s=i; 
			}
		}
		return l;
    }
}