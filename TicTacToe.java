public class TicTacToe {
 	public static void main(String[] agre){
 		int[] arr = {1,1,1,1,1,2,2,2,2};
 		int[][] all = new int[200][arr.length];
 		TicTacToe TicTacToe = new TicTacToe();
 		all = pailie(arr);
 		for (int i = 0; i < all.length; i++) {
 			int[] arr1 = new int[arr.length];
 			for (int j = 0; j < 9; j++) {
				arr1[j] = all[i][j];
			}
 	 		TicTacToe.print(arr1);
 	 		System.out.println();
 	 		System.out.println();
		}
 	}
 	

//决策树	
	public static int[][] pailie(int a[]) {
		int m = 0;
		int i;
		int j = 0, k;
		int n = a.length;
		int[][] b = new int[200][a.length];
		while (true) {
			for (i = 0; i < n; i++){
				b[m][i]=a[i];
			}
			for (j = n - 2; j >= 0 && a[j] >= a[j + 1]; j--);
			if (j < 0)
				return b;
			for (k = j + 1; k < n && a[j] < a[k]; k++);
			swap(a, k-1, j);
				for (int l = j + 1, r = n - 1; l < r; l++, r--)
					swap(a, l, r);	
				m +=1;				
			}	
//		return b;
		}	
		public static void swap(int[] nums, int l, int r) {
			int temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
		} 	

//判断赢输平 	
	public static int result(int[] arr){
		int result = 0;
		for (int i=0; i<=arr.length; i++) {
				if((arr[0]==1&&arr[1]==1&&arr[2]==1)||(arr[3]==1&&arr[4]==1&&arr[5]==1)||(arr[6]==1&&arr[7]==1&&arr[8]==1)||(arr[0]==1&&arr[4]==1&&arr[8]==1)||(arr[2]==1&&arr[4]==1&&arr[6]==1)){
					result = 1;
				}
				else if ((arr[0]==2&&arr[1]==2&&arr[2]==2)||(arr[3]==2&&arr[4]==2&&arr[5]==2)||(arr[6]==2&&arr[7]==2&&arr[8]==2)||(arr[0]==2&&arr[4]==2&&arr[8]==2)||(arr[2]==2&&arr[4]==2&&arr[6]==2)) {
					result = 2;
				}
				else {
					result = 0;
				}
		}
		return result;
	}
	 	
//打印结果
  public static void print(int[] arr) {
	  	String[] arrP = new String[arr.length];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==1) {
			 	arrP[i]="o";
			}	
			else if(arr[i]==2) {
			 	arrP[i]="x";
			}
			else {
				arrP[i]="0";
			}
		 	if(i%3==0 && i!=0) {
		 		System.out.println();
		 	}
		 	System.out.print(arrP[i]+" ");
		}

 	}
}