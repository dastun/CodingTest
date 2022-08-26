package Sum.Array;

public class SumOfArray {

	int[] arrNum;
	int sum;
	
public int sumofarray(int[] arr){
	
	for (int i = 0; i < arr.length; i++) {  
		sum = sum + arr[i];  
	}
	return sum;  
}
public void showPair(int[] arr,int sum){
	int i,j=0;
	System.out.println(sum);
	for(i=0;i< arr.length-1 ;i++){
		System.out.println(arr[i]);
		for(j=i+1;j< arr.length-1 ;j++){
			System.out.println(":"+arr[j]);
			if(arr[i] + arr[j] == sum){
				System.out.println("("+arr[i]+ "+"+ arr[j]+")");
			}
		}
	}
}

public void display(){
	
	System.out.println("the sum of array is: "+sum);
}


public static void main(String[] args) {
SumOfArray arrSum = new SumOfArray();
arrSum.arrNum = new int[] {1,2,3,4,5};
int sum = arrSum.sumofarray(arrSum.arrNum);
arrSum.showPair(arrSum.arrNum, sum);
arrSum.display();
}
	
	

}
