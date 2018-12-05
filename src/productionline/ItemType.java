package productionline;

//Nicolas Caceda
//9.29.2018
//All items will have a pre-set type. Currently there are 4 types.

public enum ItemType {
  AU("AUDIO"),
  VI("VISUAL"),
  AM("AUDIOMOBILE"),
  VM("VISUALMOBILE");

  //enum constant
  private final String code;


  /* Constructor is private by default
   *  Allows me to use strings in the parenthesis above
   */
  ItemType(String code) {
    this.code = code;
  }

  /* Overrides toString and allows the programmer to use the enum
   */
  @Override
  public String toString() {
    return code;
  }
}
