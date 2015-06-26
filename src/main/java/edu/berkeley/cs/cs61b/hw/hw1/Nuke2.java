package edu.berkeley.cs.cs61b.hw.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nuke2 {
	
	public static void main(String [] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));	
		
		String word = bufferedReader.readLine();
		
		if(word != null && word.length() > 2)
			System.out.println(word.substring(0, 1) + word.substring(2));
		else
			throw new  IllegalArgumentException("Please enter words with more characters");
		
		System.exit(0);
	}

}
