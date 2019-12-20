import People.Family;
import java.time.LocalDateTime;
import java.time.Month;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.Assert;
import org.junit.Test;
public class FamilyTest {

  @Test
  public void PayRateTest(){
    Family family = new Family();
    family.setPivot(new ImmutablePair<>(23,15));
    Assert.assertEquals(30,
        family
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 21, 21, 0)));
  }
  @Test
  public void PayRateTest1(){
    Family family = new Family();
    family.setPivot(new ImmutablePair<>(23,15));
    family.setPivot(new ImmutablePair<>(4,20));
    Assert.assertEquals(120,
        family
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 22, 2, 0)));
  }

  @Test
  public void PayRateTest2(){
    Family family = new Family();
    family.setPivot(new ImmutablePair<>(22,12));
    family.setPivot(new ImmutablePair<>(0,8));
    family.setPivot(new ImmutablePair<>(4,16));
    Assert.assertEquals(84,
        family
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 22, 2, 0)));
  }

  @Test
  public void PayRateTest3(){
    Family family = new Family();
    family.setPivot(new ImmutablePair<>(22,12));
    family.setPivot(new ImmutablePair<>(0,8));
    family.setPivot(new ImmutablePair<>(4,16));
    Assert.assertEquals(52,
        family
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 21, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 22, 0, 0)));
  }

  @Test
  public void PayRateTest4(){
    Family family = new Family();
    family.setPivot(new ImmutablePair<>(21,21));
    family.setPivot(new ImmutablePair<>(4,15));
    Assert.assertEquals(87,
        family
            .calculateRate(LocalDateTime.of(2019, Month.AUGUST, 20, 19, 0),
                LocalDateTime.of(2019, Month.AUGUST, 21, 0, 0)));
  }

}
