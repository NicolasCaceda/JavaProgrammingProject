//Nicolas Caceda
//9.29.2018
//All items will have a pre-set type. Currently there are 4 types.
public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  //enum constant
  private final String Code;


  /* Constructor is private by default
   *  Allows me to use strings in the parenthesis above
   */
  ItemType(String Code) {
    this.Code = Code;
  }

  /* Overrides toString and allows the programmer to use the enum
   */
  @Override
  public String toString() {
    return Code;
  }
}
