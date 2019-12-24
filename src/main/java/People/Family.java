package People;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import org.apache.commons.lang3.tuple.ImmutablePair;
public class Family {
 LocalTime start, end;
 int rate = 0;
 LinkedList<ImmutablePair<Integer,Integer>> pivots;
 public Family(){
 this.start = LocalTime.of(16,59);
 this.end = LocalTime.of(4,0);
  pivots = new LinkedList<>();
 }
 public void setPivot(ImmutablePair<Integer,Integer> pair){
  pivots.add(pair);
 }
 public int calculateRate(LocalDateTime dateTimeStart, LocalDateTime dateTimeEnd){
    if (dateTimeStart.isAfter(LocalDateTime.of(dateTimeStart.toLocalDate(), start))
        && dateTimeEnd.isBefore(LocalDateTime.of(dateTimeEnd.toLocalDate().plusDays(1), end))) {

        Duration first = Duration.between(dateTimeStart,dateTimeEnd);
        int hours = Math.toIntExact(first.toHours());

        while(!pivots.isEmpty() && hours != 0) {

          rate += pivots.getFirst().getValue();
          dateTimeStart = dateTimeStart.plusHours(1);
          if(dateTimeStart.getHour() == pivots.getFirst().getKey()){
            pivots.pop();
          }
          hours--;
        }

      }

return rate;
 }
}