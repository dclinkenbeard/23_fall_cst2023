import java.util.ArrayList;
import java.util.List;

public class Invoker {

  public static void main(String[] args) {
    List<IStone> infinityStones = new ArrayList<>();
    Person person = new Person("Thanos");
    infinityStones.add(PowerStone.getPowerStone());
    infinityStones.add(SpaceStone.getSpaceStone());

    for(IStone stone : infinityStones){
      stone.activate(person);
    }

  }

}
