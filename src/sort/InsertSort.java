package sort;

import java.util.Arrays;

/**
 * 插入排序 : 像玩撲克牌排順序方式
 * before {4,3,2,10,12,1,5,6} 
 * after  {1,2,3,4,5,6,10,12}
 * 
 * 時間複雜度 O(n²)
 *     
 * 會用到3個方法 public static void sort(Comparable[] a) : 對a陣列元素進行排序 private static
 * boolean greater(Comparable v, Comparable w) : 判斷v是否大於w private static void
 * exch(Comparable[] a, int i, int j) ：交換a陣列中, 索引i和j的位置
 */
public class InsertSort {

	public static void main(String[] args) {
		Integer[] arr = {4,3,2,10,12,1,5,6};
		sort(arr);
		System.err.println(Arrays.toString(arr));
	}
	
	/**
	 * 對a陣列元素進行排序
	 * @param a  
	 */
	public static void sort(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				// 比較 索引j 和 索引j-1 的值
				if (greater(a[j-1], a[j])) {
					exch(a, j-1, j);
				}else {
					break;
				}
			}

		}

	}

	/**
	 * 判斷v是否大於w
	 * @param v
	 * @param w
	 * @return
	 */
	private static boolean greater(Comparable v, Comparable w) {
		// 如果 v.compareTo(w) <0 代表v比w小
		return v.compareTo(w) > 0;
	}

	/**
	 * 交換a陣列中, 索引i和j的位置
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void exch(Comparable[] a, int i, int j) {
		// 定義臨時變量
		Comparable temp;

		// 進行交換
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
