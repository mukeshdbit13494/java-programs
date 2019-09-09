/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 *
 * @author user
 */
public class FirstNonRepeatString {

    static char checkNonRepeatChar(String s){
        List<Character> repeat=new ArrayList<>();
        List<Character> nonrepeat=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char letter=s.charAt(i);
            if(repeat.contains(letter))
            {
                continue;
            }
             if(nonrepeat.contains(letter))
            {
                nonrepeat.remove((Character)letter);
                repeat.add(letter);
            }
            else
                nonrepeat.add(letter);
        }
        return nonrepeat.get(0);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- >0)
        {
            String s=br.readLine();
            System.out.println(checkNonRepeatChar(s));
        }
    }
    
}
