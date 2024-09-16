package sort;

import java.util.Arrays;

/**
 * 冒泡排序 : 比較相鄰的元素, 前一個比後一個大就換位置
 * before {4,5,6,3,2,1} 
 * after  {1,2,3,4,5,6}
 * 
 * 時間複雜度 
 *     極端情况完全逆序  : O(n²)
 *     在完全有序的情况  : O(n),只需要1次冒泡
 *     
 * 會用到3個方法 public static void sort(Comparable[] a) : 對a陣列元素進行排序 private static
 * boolean greater(Comparable v, Comparable w) : 判斷v是否大於w private static void
 * exch(Comparable[] a, int i, int j) ：交換a陣列中, 索引i和j的位置
 */
public class BubbleSort {

	public static void main(String[] args) {
		Integer[] arr = {4,5,6,3,2,1};
		sort(arr);
		System.err.println(Arrays.toString(arr));
	}

	/**
	 * 對a陣列元素進行排序
	 * @param a
	 */
	public static void sort(Comparable[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				//比較 索引j 和 索引j+1 的值
				if(greater(a[j], a[j+1])){
					exch(a, j, j+1);
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
