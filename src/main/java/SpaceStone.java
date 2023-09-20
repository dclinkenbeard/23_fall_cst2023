public class SpaceStone implements IStone{

  private static SpaceStone spaceStone = null;

  private SpaceStone(){

  }

  public static SpaceStone getSpaceStone(){
    if (spaceStone == null){
      spaceStone = new SpaceStone();
    }
    return spaceStone;
  }

  /**
   * @param person
   */
  @Override
  public void activate(Person person) {
    System.out.println("Activate space stone not implemented");
  }

  /**
   * @param person
   */
  @Override
  public void deactivate(Person person) {

  }
}
