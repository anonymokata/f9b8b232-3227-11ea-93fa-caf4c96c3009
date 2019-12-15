package People;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

public class FamilyA {
 LocalTime start, end;
 int rate = 0;
 List<Pair<Integer,Integer>> pivots;
 public FamilyA(){
 this.start = LocalTime.of(16,59);
 this.end = LocalTime.of(4,0);
  pivots = new ArrayList<>();
 }
 public void setPivot(Pair<Integer,Integer> pair){
  pivots.add(pair);
  //System.out.println(pivot);
 }
 public int calculateRate(LocalDateTime dateTimeStart, LocalDateTime dateTimeEnd){
    if (dateTimeStart.isAfter(LocalDateTime.of(dateTimeStart.toLocalDate(), start))
        && dateTimeEnd.isBefore(LocalDateTime.of(dateTimeEnd.toLocalDate().plusDays(1), end))) {

        Duration first = Duration.between(dateTimeStart,dateTimeEnd);
        int hours = first.toHoursPart();

        for(Pair<Integer,Integer> pivot : pivots)
        for (int start =dateTimeStart.getHour(); start != pivot.getKey(); start++) {
          if(start == dateTimeEnd.getHour())
            break;
          System.out.println(start);
          rate += 15;
        }


      }

return rate;
 }
}