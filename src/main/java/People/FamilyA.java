package People;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FamilyA {
 LocalTime start, end;
 int rate = 0;
 public FamilyA(){
 this.start = LocalTime.of(16,59);
 this.end = LocalTime.of(4,0);
 ;
 }
 public int calculateRate(LocalDateTime dateTimeStart, LocalDateTime dateTimeEnd){
  if(dateTimeStart.isAfter(LocalDateTime.of(dateTimeStart.toLocalDate(),start))
  && dateTimeEnd.isBefore(LocalDateTime.of(dateTimeEnd.toLocalDate().plusDays(1),end))){
   Integer range = dateTimeEnd.getHour() - dateTimeStart.getHour();
   rate+=15;
  }
return rate;
 }
}