package diceManager;

import java.util.ArrayList;

public class DiceManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiceManager dm = new DiceManager();
		dm.roll20();

	}
	
	private int D20MAX = 20;
	private int D12MAX = 12;
	private int D10MAX = 10;
	private int D8MAX = 8;
	private int D6MAX = 6;
	private int D4MAX = 4;
	private int COINFLIPMAX = 2;
	private int MIN = 1;
	
	// roll a d20
	public int roll20() {
		int result = (int) (Math.random()*D20MAX+MIN);
		
		System.out.println(result);
		return result;
	}
	
	// roll multiple d20s
	public ArrayList roll20(int num) {
		int result;
		ArrayList resultList = new ArrayList<Integer>();
		for(int i=0; i < num; i++) {
			result = roll20();
			
			resultList.add(result);
		}
		
		return resultList;
	}
	
	
	// roll a d12
	public int roll12() {
		int result = (int) (Math.random()*D12MAX+MIN);
		
		System.out.println(result);
		return result;
	}
	
	
	// roll a d10
	public int roll10() {
		int result = (int) (Math.random()*D10MAX+MIN);
		
		System.out.println(result);
		return result;
	}
	
	// roll a d8
	public int roll8() {
		int result = (int) (Math.random()*D8MAX+MIN);
		
		System.out.println(result);
		return result;
	}
	
	// roll a d6
	public int roll6() {
		int result = (int) (Math.random()*D6MAX+MIN);
		
		System.out.println(result);
		return result;
	}
	
	
	// roll a d4
	public int roll4() {
		int result = (int) (Math.random()*D4MAX+MIN);
		
		System.out.println(result);
		return result;
	}
	
	
	// flip a coin
	public int coinFlip() {
		int result = (int) (Math.random()*COINFLIPMAX+MIN);
		
		System.out.println(result);
		return result;
	}
	

}
