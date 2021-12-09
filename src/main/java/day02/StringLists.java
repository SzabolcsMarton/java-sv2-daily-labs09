package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWord(List<String>words){
        List<String> temp = new ArrayList<>();
        int min = findMinLength(words);
        for (String actual : words){
            if(actual.length() == min){
                temp.add(actual);
            }
        }
        return temp;
    }


    private int findMinLength (List<String> words){
        int minLength = Integer.MAX_VALUE;
        for (String actual : words){
            if (actual.length() <=  minLength){
                minLength = actual.length();
            }
        }
        return minLength;
    }


}
