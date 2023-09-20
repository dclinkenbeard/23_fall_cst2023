/**
 * @author Drew A. Clinkenbeard
 * @since 20 - sept - 2023
 * Representing a person for use in the command pattern.
 */
public class Person {
  private String name;
  private Double power = 100.0;
  private String location;


  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPower() {
    return power;
  }

  public void setPower(Double power) {
    this.power = power;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }

}
