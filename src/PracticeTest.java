import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  @Test
    void testMostCommonTimeEfficient(){
    int[] nums = {1,2,4,5,5,6,6};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(5, actual);
}

  @Test 
  void testMostCommonTimeEfficientUnsorted() {
    int[] nums = {5, 6, 1, 1, 2, 8};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(1, actual);
  }

  @Test 
  void testMostCommonTimeEfficientTripleDigits() {
    int[] nums = {1, 2, 3, 3, 3};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(3, actual);
  }
}
