package People;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.tuple.ImmutablePair;

public class BabySitter {
  Family family;
  BufferedReader reader;
  Logger logger;
  public BabySitter() {
family = new Family();
     reader =
        new BufferedReader(new InputStreamReader(System.in));
  }
  public void setFamily() throws IOException {
    System.out.println("Which family would you like to sit for?\n FamilyA (A)\n FamilyB (B)\n FamilyC (C):");
    String input = reader.readLine();
    input = input.toUpperCase();
    switch (input){
      case "A":
        {
          family.setPivot(new ImmutablePair<>(23, 15));
          family.setPivot(new ImmutablePair<>(4, 20));
        }
      case "B": {
        family.setPivot(new ImmutablePair<>(22,12));
        family.setPivot(new ImmutablePair<>(0,8));
        family.setPivot(new ImmutablePair<>(4,16));
      }
      case "C": {
        family.setPivot(new ImmutablePair<>(22,12));
        family.setPivot(new ImmutablePair<>(0,8));
        family.setPivot(new ImmutablePair<>(4,16));
      }
      default: throw new IOException("Invalid input");
    }

  }

  public void getRate() throws IOException {
    System.out.println("What is the time you want to start working?\n Enter time as yyyy/MM/dd HH:mm");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    reader = new BufferedReader(new InputStreamReader(System.in));
    String input = reader.readLine();
    LocalDateTime dateTimeStart = LocalDateTime.parse(input,dtf);
    if(!dateTimeStart.isAfter(LocalDateTime.of(dateTimeStart.toLocalDate(),
        LocalTime.of(16,59)))){
      logger =Logger.getLogger("StartTimeError");
      logger.log(Level.SEVERE,"Must start at 17:00 or after");
      throw new IOException("Invalid input");
    }

    System.out.println("What is the time you want to stop working?\n Enter time as yyyy/MM/dd HH:mm");
    reader = new BufferedReader(new InputStreamReader(System.in));
    input = reader.readLine();
    LocalDateTime dateTimeEnd = LocalDateTime.parse(input,dtf);
    if(!dateTimeEnd.isBefore(LocalDateTime.of(dateTimeEnd.toLocalDate().plusDays(1),
        LocalTime.of(4,0)))){
      logger = Logger.getLogger("EndTimeError");
      logger.log(Level.SEVERE,"Must end at 04:00 or before");
      throw new IOException("Invalid input");
    }

   System.out.println("Your total compensation will be $"+ family.calculateRate(dateTimeStart,dateTimeEnd));
  }
}
