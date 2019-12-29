public class TicTacToe {
 	public static void main(String[] agre){
 		byte N = 2;
 		String pr;
 		String[][] arr = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};	
 		TicTacToe TicTacToe = new TicTacToe();
		tree(arr);
		print(N,arr);
 		System.out.print(TicTacToe.win(arr));
 	}
 	
//决策树 	
	public static void tree(String[][] arr){
		int step=0;
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				if (step == 8){
					break;
				}
				if (step%2==0) {
				 	arr[i][j]="o";
				}	else {
				 	arr[i][j]="x";
				}
				step +=1;
			}
		 	
		}
	}

//判断win 	
	public boolean win(String[][] arr){
		boolean result = false;

		for (int i=0; i<=2; i++) {
				if((arr[i][0]==arr[i][1]&&arr[i][1]==arr[i][2])||(arr[0][i]==arr[1][i]&&arr[1][i]==arr[2][i])||(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2])||(arr[0][2]==arr[1][1]&&arr[1][0]==arr[2][0])){
					result = true;
				}
		}
		return result;
	}
	 	
//打印结果
  public static void print(int N ,String[][] arr) {
  	System.out.println();
		for (int i=0; i<=N; i++) {
		 	for (int j=0; j<=N; j++) {
		 	 	System.out.print(arr[i][j]+" ");
		 	}
		 	System.out.println();
		}

 	}
}