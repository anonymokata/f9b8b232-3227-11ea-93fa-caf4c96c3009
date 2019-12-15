package People;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import javafx.util.Pair;

public class Family {
 LocalTime start, end;
 int rate = 0;
 LinkedList<Pair<Integer,Integer>> pivots;
 public Family(){
 this.start = LocalTime.of(16,59);
 this.end = LocalTime.of(4,0);
  pivots = new LinkedList<>();
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
        System.out.println(hours);

        while(!pivots.isEmpty() && hours != 0) {


          rate += pivots.getFirst().getValue();
          dateTimeStart = dateTimeStart.plusHours(1);
          if(dateTimeStart.getHour() == pivots.getFirst().getKey()){
            pivots.pop();
          }
          System.out.println(dateTimeStart);
          hours--;
        }

      }

return rate;
 }
}