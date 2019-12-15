import People.FamilyA;
import java.time.LocalDateTime;
import java.time.Month;
import org.junit.Assert;
import org.junit.Test;
public class FamilyATest {

  @Test
  public void PayRateTest(){
    FamilyA familyA = new FamilyA();
    Assert.assertEquals(30,
        familyA
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 21, 21, 0)));
  }
  @Test
  public void PayRateTest1(){
    FamilyA familyA = new FamilyA();
    Assert.assertEquals(100,
        familyA
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 22, 2, 0)));
  }

}
