package sort;

import pojo.Student;

/**
 * 簡單排序, Student 實現 Comparable接口
 * @param args
 */
public class EasySort {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setUsername("Mike");
		s1.setAge(230);

		Student s2 = new Student();
		s2.setUsername("John");
		s2.setAge(230);

		int result = s1.compareTo(s2);

		// if result < 0 , s1 < s2
		if (result < 0) {
			System.err.println("Mike < John");
		}

		// if result > 0 , s1 > s2
		if (result > 0) {
			System.err.println("Mike > John");
		}

		// if result = 0 , s1 == s2
		if (result == 0) {
			System.err.println("same");
		}

	}

}
