package dsarray;
import java.util.List;
import java.util.Scanner;

public class CountTheValue {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int val=0;
        int sum=0;
        if(ruleKey.equals("type"))
            val=0;
        else if(ruleKey.equals("color"))
            val=1;
        else
            val=2;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(val).equals(ruleValue)){
                    sum=sum+1;
            }
        }
        return sum;
    }
    
}

