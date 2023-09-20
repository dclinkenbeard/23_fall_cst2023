public class PowerStone implements IStone{
  public static final double MULTIPLIER = 150.5;

  private static PowerStone powerStone = null;

  private PowerStone(){

  }

  public static PowerStone getPowerStone(){
    if(powerStone == null){
      powerStone = new PowerStone();
    }
    return powerStone;
  }

  /**
   * use the multiplier to increase the Persons power
   */
  @Override
  public void activate(Person person) {
    System.out.println("Powering up");
    System.out.printf("%s's power == %.2f%n", person, person.getPower());
    double currentPower = person.getPower();
    currentPower = currentPower * MULTIPLIER;
    person.setPower(currentPower);
    System.out.printf("%s's power is NOW == %.2f%n", person, person.getPower());
  }

  /**
   *use the multiplier to decrease the Persons power
   */
  @Override
  public void deactivate(Person person) {
    System.out.println("Powering Down");
    System.out.printf("%s's power == %.2f%n", person, person.getPower());
    double currentPower = person.getPower();
    currentPower = currentPower / MULTIPLIER;
    person.setPower(currentPower);
    System.out.printf("%s's power is NOW == %.2f%n", person, person.getPower());
  }
}
