public class PowerStone implements IStone {

  private final Double MULTIPLIER = 1.5;

  @Override
  public void activate(Person person) {
    System.out.println("POWER UP!");
    Double currentPower = person.getPower();
    System.out.println("Current power is: " + currentPower);
    person.setPower(currentPower*MULTIPLIER);
    System.out.println("New power is: " + currentPower);
  }

  @Override
  public void deactivate(Person person) {
    System.out.println("Power Down");
    Double currentPower = person.getPower();
    System.out.println("Current power is: " + currentPower);
    person.setPower(currentPower/MULTIPLIER);
    System.out.println("New power is: " + currentPower);
  }
}
