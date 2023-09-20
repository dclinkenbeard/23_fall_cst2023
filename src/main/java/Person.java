public class Person {
  String name;
  Double power;

  public Double getPower() {
    return power;
  }

  public void setPower(Double power) {
    this.power = power;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", power=" + power +
        '}';
  }
}
