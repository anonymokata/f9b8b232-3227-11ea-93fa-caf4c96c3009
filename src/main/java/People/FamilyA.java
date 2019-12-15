package People;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FamilyA {
 LocalTime start, end;
 int rate = 0;
 int pivot;
 public FamilyA(){
 this.start = LocalTime.of(16,59);
 this.end = LocalTime.of(4,0);
 }
 private void setPivot(LocalDateTime dateTimeStart, LocalDateTime dateTimeEnd){
  pivot = LocalDateTime.of(dateTimeStart.getYear(),dateTimeStart.getMonth(),dateTimeStart.getDayOfMonth(),23,dateTimeStart.getMinute()).getHour();
 }
 public int calculateRate(LocalDateTime dateTimeStart, LocalDateTime dateTimeEnd){

  if(dateTimeStart.isAfter(LocalDateTime.of(dateTimeStart.toLocalDate(),start))
  && dateTimeEnd.isBefore(LocalDateTime.of(dateTimeEnd.toLocalDate().plusDays(1),end))){
   int firstRange = pivot - dateTimeStart.getHour();
   System.out.println(firstRange);

   if(dateTimeStart.getHour() < LocalDateTime.of(dateTimeStart.getYear(),dateTimeStart.getMonth(),dateTimeStart.getDayOfMonth(),23,dateTimeStart.getMinute()).getHour())
   for(int range = firstRange; range != 0; range--){
   System.out.println(range);
    if(range > 0)
    rate+=15;
    else
     rate+=20;
   }
   }

return rate;
 }
}