package com.cegielskir;

import java.util.ArrayList;
import java.util.List;

public class Chapter1 {

    public static void main(String[] args) {

    }

    public boolean areOnlyUniqueChars1(String string){
        List<Character> chars = new ArrayList<Character>();
        for(int i = 0 ; i < string.length() ; i++){
            for(int j = 0 ; j < i && j < chars.size();j++){
                if(chars.get(j).equals(string.charAt(i))) return false;
            }
            chars.add(string.charAt(i));
        }
        return true;
    }


    public boolean areOnlyUniqueChars2(String string){
        return true;
    }
}
