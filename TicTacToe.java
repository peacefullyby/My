public class TicTacToe {
 	public static void main(String[] agre){
 		int[] arr = {1,1,1,1,1,2,2,2,2};
 		print2(classify(array(arr, arrayLen(arr)), 0));
 		
 	}

//评估器
// 	public static decisions() {
// 			
//	}
 
//分类器
 	public static int[][] classify(int[][] all, int answer) {
 		int[] temp = new int[9];
 		int[][] win = new int[100][9];
 		int[][]	los = new int[100][9];
 		int[][]	equ = new int[100][9];
 		int winNum=0;
 		int losNum=0;
 		int equNum=0;
 		for (int i = 0; i < all.length; i++) { //赋值
 			for (int j = 0; j < 9; j++) {
 				temp[j] = all[i][j];
			}
			if (result(temp)==1) {
	 			for (int k = 0; k < 9; k++) {
	 				win[winNum][k] = temp[k];
				}	
	 			winNum +=1;
			}
			else if (result(temp)==2) {
	 			for (int k = 0; k < 9; k++) {
	 				los[losNum][k] = temp[k];
				}	
	 			losNum +=1;
			}
			else {
	 			for (int k = 0; k < 9; k++) {
	 				equ[equNum][k] = temp[k];
				}	
	 			equNum +=1;
			}
		}
 		if (answer==1) {                               //确定返回值
 	 		return win;
		}
 		else if (answer==2) {
 	 		return los;
		}
 		else {
 	 		return equ;
		}
	}
 
//决策树数组长度
 	public static int arrayLen(int[] all) {
 		int answer;
 		int n=0,m=0;
 		int num1=1,num2=1,num3=1;
		for (int i = 0; i < all.length; i++) {
	 		if (all[i]==1) {
	 			n +=1;
			}
	 		if (all[i]==2) {
	 			m +=1;
			}
	 		num1 *=(i+1);
		}
		for (int j = 1; j <= n; j++) {
			num2 *=j;
		}
		for (int j = 1; j <= m; j++) {
			num3 *=j;
		}
		answer = num1/(num2*num3);
		return answer;
	}

//决策树
	public static int[][] array(int arr[],int len) {
		int m = 0;
		int i;
		int j = 0, k;
		int n = arr.length;
		int[][] b = new int[len][arr.length];
		while (true) {
			for (i = 0; i < n; i++){
				b[m][i]=arr[i];
			}
			for (j = n - 2; j >= 0 && arr[j] >= arr[j + 1]; j--);
			if (j < 0)
				return b;
			for (k = j + 1; k < n && arr[j] < arr[k]; k++);
			swap(arr, k-1, j);
				for (int l = j + 1, r = n - 1; l < r; l++, r--)
					swap(arr, l, r);	
				m +=1;				
			}	
		}	

//交换数组
	public static void swap(int[] nums, int l, int r) {
			int temp = nums[l];
			nums[l] = nums[r];
			nums[r] = temp;
		} 	

//判断赢输平  零=平或未知  壹=赢   贰=输 	
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
	 	
//打印一维结果
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
  
//打印二维结果
  public static void print2(int[][] arr) {
	  	String[][] arrP = new String[arr.length][9];
	  	for (int i = 0; i < arr.length; i++) {
			for (int j=0; j < 9; j++) {
				if (arr[i][j]==1) {
				 	arrP[i][j]="o";
				}	
				else if(arr[i][j]==2) {
				 	arrP[i][j]="x";
				}
				else {
					arrP[i][j]="0";
				}
			 	if(j%3==0 ) {
			 		System.out.println();
			 	}
			 	System.out.print(arrP[i][j]+" ");
			}
	 		System.out.println();

		}
	}
}

