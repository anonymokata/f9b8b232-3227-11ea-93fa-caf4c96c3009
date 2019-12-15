import People.FamilyA;
import java.time.LocalDateTime;
import java.time.Month;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;
public class FamilyATest {

  @Test
  public void PayRateTest(){
    FamilyA familyA = new FamilyA();
    familyA.setPivot(new Pair<>(23,15));
    Assert.assertEquals(30,
        familyA
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 21, 21, 0)));
  }
  @Test
  public void PayRateTest1(){
    FamilyA family = new FamilyA();
    family.setPivot(new Pair<>(23,15));
    family.setPivot(new Pair<>(4,20));
    Assert.assertEquals(120,
        family
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 22, 2, 0)));
  }

}
