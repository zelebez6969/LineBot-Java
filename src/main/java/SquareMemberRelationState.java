/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SquareMemberRelationState implements org.apache.thrift.TEnum {
  NONE(1),
  BLOCKED(2);

  private final int value;

  private SquareMemberRelationState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SquareMemberRelationState findByValue(int value) { 
    switch (value) {
      case 1:
        return NONE;
      case 2:
        return BLOCKED;
      default:
        return null;
    }
  }
}
