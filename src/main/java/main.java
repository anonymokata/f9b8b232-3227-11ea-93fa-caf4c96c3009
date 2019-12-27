import People.BabySitter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
  public static void main(String[] args){
    BabySitter  sitter = new BabySitter();
    try {
      sitter.setFamily();
    } catch (IOException e) {
      Logger.getAnonymousLogger().log(Level.SEVERE, e.getMessage());
    }
    try {
      sitter.getRate();
    } catch (IOException e) {
      Logger.getAnonymousLogger().log(Level.SEVERE, e.getMessage());
    }
  }
}