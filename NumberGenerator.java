package RandomNumberGuesser;
import java.util.Random;

public class NumberGenerator
{

  public NumberGenerator(){};
  
  public int generateNumber()
  {
    Random rd = new Random();

    int randNumber = rd.nextInt(50);

    randNumber += 1;

    return randNumber;
  }
   
}

