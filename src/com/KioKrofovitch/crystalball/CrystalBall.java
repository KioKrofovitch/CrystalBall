package com.KioKrofovitch.crystalball;

import java.util.Random;

import android.view.View;

public class CrystalBall {
	// Class Variables
	public String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My repy is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now"
		};
	
	// Class Methods
	public String getAnAnswer(){
			String answer = "";
			
			// Randomly select from the answers array
			Random randomGenerator = new Random();
			int randomNumber = randomGenerator.nextInt(mAnswers.length);
			answer = mAnswers[randomNumber];
			
			return answer;
		}
}
