import java.io.IOException;

import javax.swing.*;

public class lab6 {
	
	public static void main(String[] args) throws IOException {
		
		
		TextFileInput tfi = new TextFileInput(args[0]);
		
		int [] numbers = new int[100];
		
		int numbersLength = tfi.fillIntArray(numbers);
		int total = sum(numbers, numbersLength);
		double avg = average(numbers, numbersLength);
		
		JOptionPane.showMessageDialog(null, "Sum: " + total +"\nAverage " + avg);
		
		}//main
	
	public static int sum(int[] myArray, int myArraySize)
	{
		int total = 0;
		for(int i = 0; i < myArraySize; i++)
			total = total + myArray[i];
		return total;
	}

	public static double average(int [] myArray, int myArraySize)
	{
		return 1.0 * sum(myArray, myArraySize) / myArraySize; //Double conversion first
	}


}
