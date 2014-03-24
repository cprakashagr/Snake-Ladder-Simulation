package com.cprakashagr.games.snakeLadder;

import com.cprakashagr.LCG;

public class SnakeLadder {

	static int pos1 = 0;
	static int pos2 = 0;
	int refDice;
	
	boolean flag = true;
	
	double dice;
	
	public SnakeLadder() {
		
		LCG randNum1 = new LCG();
		
		while (flag == true) 
		{
			
			dice = randNum1.myRandom(1, 6);
			refDice = (int)dice;
			
			pos1 += refDice;
			pos1 = checkPos(pos1, refDice);
			
			System.out.print("Pos1: " + pos1 + ";");
			
			if (pos1 >= 100) {
				flag = false;
				return;
			}
			
			dice = randNum1.myRandom(1, 6);
			refDice = (int)dice;
			
			pos2 += refDice;
			pos2 = checkPos(pos2, refDice);
			
			System.out.print("Pos2: " + pos2 + ";\n");
			
			if (pos2 >= 100) {
				flag = false;
				return;
			}
		}
	}
	
	private int checkPos(int pos12, int refDice2) {
		int val = pos12;
		
		if (pos12 > 100)
			return pos12-refDice2;
		
		switch (pos12) {
			case 3:
				val = 24;
				break;
			case 25:
				val = 11;
				break;
			case 27:
				val = 45;
				break;
			case 32:
				val = 69;
				break;
			case 36:
				val = 11;
				break;
			case 47:
				val = 29;
				break;
			case 56:
				val = 40;
				break;
			case 63:
				val = 97;
				break;
			case 64:
				val = 84;
				break;
			case 85:
				val = 71;
				break;
			case 93:
				val = 88;
				break;
			case 99:
				val = 58;
				break;			
		}
		return val;
	}

	public static void main(String[] args) {
		System.out.println("Single Player Match.");
		new SnakeLadder();
	}
}
