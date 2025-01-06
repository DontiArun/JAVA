package java_practice;

public class ArraySumExample {

	public static void main(String[] args) {
		int sum=0;
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
		}
System.out.println(sum);
	}

}
