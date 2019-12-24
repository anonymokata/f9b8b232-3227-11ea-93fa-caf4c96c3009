import People.BabySitter;
import java.io.IOException;

public class main {
  public static void main(String[] args){
    BabySitter  sitter = new BabySitter();
    try {
      sitter.setFamily();
    } catch (IOException e) {
      e.getMessage();
    }
    try {
      sitter.getRate();
    } catch (IOException e) {
      e.getMessage();
    }
  }
}