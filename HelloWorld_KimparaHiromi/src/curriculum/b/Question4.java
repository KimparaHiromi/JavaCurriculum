package curriculum.b;

/**********************************************************************************
* [概要] Question 4 の課題処理
* [詳細] Question 4_1 ～ Question 4_10 までの課題内容およびそれに基づく解答結果を出力する。
**********************************************************************************/

import java.util.Scanner; // 4_6 以降で使うためインポート

public class Question4 {

	/*-------------------------------------------------------------------------
	[概要] Question 4_1 ～ Question 4_10 の解答
	-------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_1 : int型の配列を作成し、その全要素を出力
		-------------------------------------------------------------------------*/
		
		int[] q1 = {1,2,3,4,5};
		for ( int q1Count = 0; q1Count < q1.length; q1Count++ ) {
		 System.out.print( q1[q1Count] + " " );
		}
		System.out.println(); 
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_2 : int型の配列を作成し、その全要素を逆順に出力
		-------------------------------------------------------------------------*/
		
		int[] q2 = {10,20,30,40,50};
		for ( int q2Count = q2.length - 1; q2Count >= 0; q2Count-- ) {
		 System.out.print( q2[q2Count] + " " );
		}
		System.out.println(); 
		
		
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_3 : int型の配列を作成し、その全要素の和を出力
		-------------------------------------------------------------------------*/
		
		int q3Sum = 0;
		int[] q3 = {3,5,7,9,11};
		for ( int q3Count = 0; q3Count < q3.length; q3Count++ ) {
		 q3Sum = q3Sum + q3[q3Count];
		}
		System.out.println( q3Sum ); 
		
		/*
		メモ : 「拡張for文」Ver.
		
		for (int q3Value : q3 ) {
		 q3Sum += q3Value;
		} 
		
		*/
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_4 : int型の配列を作成し、その中から最大値と最小値を出力
		-------------------------------------------------------------------------*/
		
		int[] q4 = {12,7,9,21,5,18};
		int q4Max = q4[0];
		int q4Min = q4[0];
		for (int q4Value : q4 ) { 
		 if ( q4Max < q4Value ) { 
		  q4Max = q4Value;
		 }
		 if ( q4Min > q4Value ) { 
		  q4Min = q4Value; 
		 }
		} 
		System.out.println("最大値: " + q4Max + " / " + "最小値: " + q4Min );
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_5 : int型の配列を作成し、その全要素を 2 倍にした後で結果を出力（※拡張for文を使用）
		-------------------------------------------------------------------------*/
		
		int[] q5 = {1,2,3,4,5};
		for ( int q5Value : q5 ) { 
		 System.out.print( q5Value * 2 + " " );
		} 
		System.out.println();
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_6 : int型の配列を作成し、コンソール入力した値と合致したものがあればその旨を出力
		-------------------------------------------------------------------------*/
		
		Scanner scanner = new Scanner(System.in); // scanner 開始
		
		 // 変数の宣言
		int[] q6 = {4,7,10,15,20};
		boolean q6Check = false;
		int q6Num = 0;
		
		 // 入力に間違いがないかチェック
		while ( true ) { 
		 System.out.print("いずれかの値を入力してください : "); // 受付可能状態がわかるように設置
		 String q6Input = scanner.nextLine();
		
		 if ( q6Input.matches( "^[0-9]+$" ) ) { 
          q6Num = Integer.parseInt( q6Input );
          break;
		 } else { 
		  System.out.println("エラー：半角数字のみを入力してください。");
		 }
		}
        
		 // 入力された値と配列内の値との比較
        for ( int q6Value : q6 ) { 
    	 if ( q6Value == q6Num ) { 
    	  q6Check = true;
    	  break;
    	 }
        }
        
         // 結果出力
        if ( q6Check ) { 
    	 System.out.println( "”" + q6Num + "”" + "は配列に含まれています"); 
        } else {
         System.out.println( "”" + q6Num + "”" + "は配列に含まれていません");
        }
        
		/*-------------------------------------------------------------------------
		[概要] Question 4_7 : int型の２次元配列を作成し、その全要素を出力
		-------------------------------------------------------------------------*/
		
         // 変数の宣言（ ※先の設問にて使用しているため、実質的には書き換え）
		int[][] array = {
		  {1,2},
		  {3,4},
		  {5,6}
		};
        
		 // 表示
		for ( int q7Row = 0; q7Row < array.length; q7Row++ ) { 
		 for ( int q7Column = 0; q7Column < array[q7Row].length; q7Column++ ) { 
		  System.out.print(array[q7Row][q7Column] + " " );
		 }
		 System.out.println(); 
		}
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_8 : int型の２次元配列を作成し、その全要素の和を出力
		-------------------------------------------------------------------------*/
		
		 // 変数の宣言（ ※先の設問にて使用しているので new ）
		array = new int [][] {
		  {10,20,30},
		  {40,50,60},
		  {70,80,90}
		};
		int q8Sum = 0;
        
		 // 計算 → 表示
		for ( int q8Row = 0; q8Row < array.length; q8Row++ ) { 
		 for ( int q8Column = 0; q8Column < array[q8Row].length; q8Column++ ) { 
			 q8Sum += array[q8Row][q8Column];
		 } 
		}
		System.out.println( q8Sum );
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_9 : int型の２次元配列を作成し、その中から最大値と最小値を出力
		-------------------------------------------------------------------------*/
		
		 // 変数の宣言（ ※先の設問にて使用しているので new ）
		array = new int [][] {
		  {12,15,8},
		  {6,19,25},
		  {30,2,10}
		};
		int q9Max = array[0][0];
		int q9Min = array[0][0];
		
		 // 比較 → 表示
		for ( int[] q9Row : array ) { 
		 for ( int q9Column : q9Row ) {
		  if ( q9Max < q9Column ) { 
		   q9Max = q9Column; 
		  } // ← 修正 : ここで区切る
		  if ( q9Min > q9Column ) { // ← 修正 : 書き入れる
		   q9Min = q9Column; 
		  }
		 }
		} 
		System.out.println("最大値: " + q9Max + " / " + "最小値: " + q9Min );
		
		
		
		/* 保存 : 「最大値が動かないと最小値が動かない」問題対処前
		
		 // 変数の宣言（ ※先の設問にて使用しているので new ）
		array = new int [][] {
		  {12,15,8},
		  {6,19,25},
		  {30,2,10}
		};
		int q9Max = array[0][0];
		int q9Min = array[0][0];
		
		 // 比較 → 表示
		for ( int[] q9Row : array ) { 
		 for ( int q9Column : q9Row ) {
		  if ( q9Max < q9Column ) { 
		   q9Max = q9Column; 
		  if ( q9Min > q9Column ) 
		   q9Min = q9Column; 
		  }
		 }
		} 
		System.out.println("最大値: " + q9Max + " / " + "最小値: " + q9Min );
		
		*/
		
		/*-------------------------------------------------------------------------
		[概要] Question 4_10 : int型の３次元配列を作成し、その全要素を出力
		-------------------------------------------------------------------------*/
		
		 // 変数の宣言（ ※新しく作成 ）
		int[][][] arrayQ10 = {
		  {{1,2},{3,4}},
		  {{5,6},{7,8}}
		};
		
		 // 表示
		System.out.println( " * * * " );
		for (int[][] q10Area : arrayQ10 ) {
		 for (int[] q10Row : q10Area ) {
		  for (int q10Column : q10Row ) {
		   System.out.print( q10Column + " " );
		  }
		  System.out.println();
		 }
		 System.out.println( " * * * " );
		}
		
		
		
		/*-------------------------------------------------------------------------
		[概要] scanner 閉鎖
		-------------------------------------------------------------------------*/
		scanner.close();
		

	}

}
