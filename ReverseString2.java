package javasession2;

public class ReverseString2 {

	public static void main(String[] args) {
		String str="this is input string";
		str=str.replaceAll(" ", "");
		System.out.println(str);
		char[]strArray=str.toCharArray();
		for(int i=strArray.length-1;i>=0;i--){
			System.out.print(strArray[i]);
			
		}

	}

}
