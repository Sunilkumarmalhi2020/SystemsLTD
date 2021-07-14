package Assingments.Assingments2;

public class BitVectorTask {

	public static boolean checkCharacter(String a,String b){

		for(char c:a.toCharArray()){
			int charBitVector=1<<(c-'a');
			for(char d:b.toCharArray()){
				int charBitVect=1<<(d-'a');
				if((charBitVector&charBitVect)>0)
					System.out.println(c);
				charBitVector= charBitVector | charBitVect;
			}
			//System.out.println(c+"......"+charBitVector);
		}
		return true;
	}

public static boolean isUnique(String input) {

		if(input.length() > 26 )
			return false;

		int checker = 0;
		for(char c : input.toCharArray()) {
			int charBitVector = 1 << (c-'a');
			if((checker & charBitVector) > 0 )
				return false;
			checker = checker | charBitVector;
		}
		return true;
	}
	public static void main(String arg[]){
		String a="sunilkumar";
		String b="kirshan";
		checkCharacter(a,b);
		//System.out.println(isUnique(b));
	}
}
