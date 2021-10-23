
package dsarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddValueToArray {
    
    class Solution {
    public List addToArrayForm(int[] num, int K) {
    ArrayList<Integer> result = new ArrayList<>();
    int size = num.length-1;
    while(K>0||size>=0){
    if(size>=0) {
        K = K + num[size];
        result.add(K%10);
    }
    else {
        result.add(K%10);
    }

        K=K/10;
        size--;
    }
    Collections.reverse(result);
    return result;
}
}
    
}
