public class Basics {
	public void print1to255() {
		for (int i = 0; i < 256; i++){
			System.out.println(i);
		}
	}
	public void printOdds1to255(){
		for (int i = 1; i < 256; i = i + 2){
			System.out.println(i);
		}
	}
	public void printSums1to255() {
		int sum = 0;
		for (int i = 0; i < 255; i++){
			sum += i;
			System.out.println("Number is: " + i + " and sum is: " + sum);
		}
	}
	public void iterateArray(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len; i++){
			System.out.println(arr[i]);
		}
	}
	public void arrayMax(int[] arr){
		int max = arr[0];
		int len = arr.length;
		for (int i = 1; i < len; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	public void average(int[] arr){
		double sum = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++){
			sum += arr[i];
		}
		double avg = sum / len;
		System.out.println(avg);
	}
	public void oddArray1to255(){
		int[] oddArray;
		oddArray = new int[128];
		for (int i = 0; i < 128; i++){
			oddArray[i] = i * 2 + 1;
		}
		System.out.println(oddArray); 
		// int len = oddArray.length;
		// for (int i = 0; i < len; i++){
		// 	System.out.println(oddArray[i]);
		// }
	}
	public void greaterThanY(int[] arr, int y){
		int num = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++){
			if(arr[i] > y){
				num++;
			}
		}
		System.out.println(num);
	}
	public void squareArray(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len; i++){
			arr[i] = arr[i] * arr[i];
		}
		System.out.println(arr);
		// for (int i = 0; i < len; i++){
		// 	System.out.println(arr[i]);
		// }
	}
	public void removeNegatives(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len; i++){
			if(arr[i] < 0){
				arr[i] = 0;
			}
		}
		System.out.println(arr);
		for (int i = 0; i < len; i++){
			System.out.println(arr[i]);
		}
	}
	public void minMaxAvg(int[] arr){
		int min = arr[0];
		int max = arr[0];
		double sum = arr[0];
		int len = arr.length;
		for (int i = 0; i < len; i++){
			sum += arr[i];
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		double avg = sum / len;
		System.out.println("The Max is: " + max + " the Min is: " + min + " and the Average is: " + avg);
	}
	public void shiftArray(int[] arr){
		int len = arr.length-2;
		for (int i = 0; i <= len; i++){
			arr[i] = arr[i+1];
		}
		arr[len] = 0;
		System.out.println(arr);
		// for (int i = 0; i < len+1; i++){
		// 	System.out.println(arr[i]);
		// }
	}
}