import java.util.Scanner;
import java.util.List;

public class leetcode14{

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String pre = strs[0];
        int i=1;
        while(i<strs.length){
            while(strs[i].indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
                if(pre.isEmpty()){
                    return "";
                }
            }
            i++;
        }
        return pre;}}