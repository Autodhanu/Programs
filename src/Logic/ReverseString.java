package Logic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String s1="Java";//olleh
		
		char[] charArray = s1.toCharArray();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(charArray[i]);//o l l e H
		}
	}

}
