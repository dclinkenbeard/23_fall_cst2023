import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PowerStoneTest {
  Person testPerson;
  PowerStone powerStone;

  @BeforeEach
  void setUp() {
    testPerson = new Person("Roberta the tester");
    powerStone = new PowerStone();
  }

  @AfterEach
  void tearDown() {
    testPerson = null;
    powerStone = null;
  }

  @Test
  void activate() {
    double currentPower = testPerson.getPower();
    assertEquals(currentPower,testPerson.getPower());
    currentPower = currentPower * PowerStone.MULTIPLIER;
    powerStone.activate(testPerson);
    assertEquals(currentPower,testPerson.getPower());
  }

  @Test
  void deactivate() {
  }
}