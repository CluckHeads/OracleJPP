package jpp;

/*
-------------------------------------------------------------------------------
  Type:       Enum: ItemType
  BY:         Kettering, Gage
  ORG:        CRN: 80601
  DESC:       Contains the constants that represent the different types of
                audio available for production
  Resources:  CaveOfProgramming | docs.oracle.com
-------------------------------------------------------------------------------
*/

public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public final String type;

  ItemType(String type) {
    this.type = type;
  }

}
