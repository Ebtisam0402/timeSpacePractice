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
}
