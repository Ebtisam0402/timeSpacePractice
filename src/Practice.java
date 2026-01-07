import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n) n = length of array
  // Space Complexity: O(n)
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity:o(n) n= length(matrix)
  // Space Complexity: o(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }

  // Time Complexity: O(n) where n is length of the array
  // Space Complexity: O(n)
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n) n = length of n
  // Space Complexity: O(n)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for (int i = 0; i <= n * n; i += 2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity:
   * Space Complexity:
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.size()

    Map<Integer, Integer> countMap = new HashMap<>();
    int result = nums[0];
    int mostCount = 0;
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];

      if (countMap.containsKey(num)) {
        countMap.put(num, countMap.get(num) + 1);
      } else {
        countMap.put(num, 1);
      }

      int currentCount = countMap.get(num);

      if (currentCount > mostCount) {
        mostCount = currentCount;
        result = num;
      }

    }

    return result;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity:
   * Space Complexity:
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    int number = 0;
    int count = 0;

    for (int num : nums) {
      if (count == 0) {
        number = num;
        count = 1;
      } else if (num == number) {
        count++;
      } else {
        count--;
      }
    }

    return number;
  }
}