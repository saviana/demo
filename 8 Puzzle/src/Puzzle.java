import java.util.ArrayList;
import java.util.Stack;

public class Puzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {'1','0','3','4','2','5','7','8','6'};
		int[] goal = {'1','2','3','8','0','4','7','6','5'};
		//add omment
		Stack stack = new Stack();//stack
		stack.push(arr);
		int[] temp=(int[]) stack.pop();
		int k=0;
		for(k=0;k<9;k++)
		 {
		   	if(k==0)
		   		break;
		 }
		
		 switch(k)
		 {
		 case 0:swaparr(k,3, arr);
		 		swaparr(k,1, arr);
		 		break;
		 case 1:swaparr(k,0, arr);
	 			swaparr(k,2, arr);
	 			swaparr(k,4, arr);
	 			break;
		 case 2:swaparr(k,1, arr);
				swaparr(k,5, arr);
				break;
		 case 3:swaparr(k,0, arr);
				swaparr(k,4, arr);
				swaparr(k,6, arr);
				break;
		 case 4:swaparr(k,1, arr);
				swaparr(k,3, arr);
				swaparr(k,5, arr);
				swaparr(k,7, arr);
				break;
		 case 5:swaparr(k,2, arr);
				swaparr(k,4, arr);
				swaparr(k,8, arr);
				break;
		 case 6:swaparr(k,3, arr);
				swaparr(k,7, arr);
				break;
		 case 7:swaparr(k,4, arr);
				swaparr(k,6, arr);
				swaparr(k,8, arr);
				break;
		 case 8:swaparr(k,5, arr);
				swaparr(k,7, arr);
				break;
		 }
		 
		 
	}

	private static void swaparr(int k, int i, int arr[]) {
		// TODO Auto-generated method stub
		int temp;
		temp=arr[k];
		arr[k]=arr[i];
		arr[i]=temp;
	}


}
