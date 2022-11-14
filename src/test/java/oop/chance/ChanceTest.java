package oop.chance;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ChanceTest {

  @Test
  public void itShouldReturnAChanceOFAnEventHappening() {
    Chance chance = new Chance(5);
    assertEquals(chance.chancesOfAnEventHappening(), 0.2);

  }

  @Test
  public void itShouldReturnChancesOfNotGettingAnSpecificDiceFace () {
    Chance chance = new Chance(5);
    assertEquals(chance.chancesOfAnEventNotHappening(), 0.8);

  }

  @Test
  public void itShouldCalculateProductOfTwoChances() {
    //0.1 chanceA
    //0.2 chanceB
    //chance.calculateChancesOfTwoEventsHappening()
    Chance chance1 = new Chance(2);
    Chance chance2 = new Chance(4);
    final Chance actualChance = chance1.calculateProduct(chance2);
      assertEquals(actualChance.chancesOfAnEventHappening(), new Chance(8).chancesOfAnEventHappening());
  }

}