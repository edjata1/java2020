class ArrayCopyDemo2{
	public static void main (String[] args){

		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
				   'i', 'n', 'a', 't', 'e', 'd'};

		char[] copyTo = java.util.Array.copyOfRange(copyFrom, 2, 9);

		System.out.println(new String (copyTo));
	}
}
