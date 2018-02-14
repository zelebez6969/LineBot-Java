/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SquareEventNotifiedUpdateSquareChatProfileName implements org.apache.thrift.TBase<SquareEventNotifiedUpdateSquareChatProfileName, SquareEventNotifiedUpdateSquareChatProfileName._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedUpdateSquareChatProfileName> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedUpdateSquareChatProfileName");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EDITOR_FIELD_DESC = new org.apache.thrift.protocol.TField("editor", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATED_CHAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedChatName", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareEventNotifiedUpdateSquareChatProfileNameStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareEventNotifiedUpdateSquareChatProfileNameTupleSchemeFactory());
  }

  public String squareChatMid; // required
  public SquareMember editor; // required
  public String updatedChatName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    EDITOR((short)2, "editor"),
    UPDATED_CHAT_NAME((short)3, "updatedChatName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
        case 2: // EDITOR
          return EDITOR;
        case 3: // UPDATED_CHAT_NAME
          return UPDATED_CHAT_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EDITOR, new org.apache.thrift.meta_data.FieldMetaData("editor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    tmpMap.put(_Fields.UPDATED_CHAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("updatedChatName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedUpdateSquareChatProfileName.class, metaDataMap);
  }

  public SquareEventNotifiedUpdateSquareChatProfileName() {
  }

  public SquareEventNotifiedUpdateSquareChatProfileName(
    String squareChatMid,
    SquareMember editor,
    String updatedChatName)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.editor = editor;
    this.updatedChatName = updatedChatName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedUpdateSquareChatProfileName(SquareEventNotifiedUpdateSquareChatProfileName other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetEditor()) {
      this.editor = new SquareMember(other.editor);
    }
    if (other.isSetUpdatedChatName()) {
      this.updatedChatName = other.updatedChatName;
    }
  }

  public SquareEventNotifiedUpdateSquareChatProfileName deepCopy() {
    return new SquareEventNotifiedUpdateSquareChatProfileName(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.editor = null;
    this.updatedChatName = null;
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedUpdateSquareChatProfileName setSquareChatMid(String squareChatMid) {
    this.squareChatMid = squareChatMid;
    return this;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
    }
  }

  public SquareMember getEditor() {
    return this.editor;
  }

  public SquareEventNotifiedUpdateSquareChatProfileName setEditor(SquareMember editor) {
    this.editor = editor;
    return this;
  }

  public void unsetEditor() {
    this.editor = null;
  }

  /** Returns true if field editor is set (has been assigned a value) and false otherwise */
  public boolean isSetEditor() {
    return this.editor != null;
  }

  public void setEditorIsSet(boolean value) {
    if (!value) {
      this.editor = null;
    }
  }

  public String getUpdatedChatName() {
    return this.updatedChatName;
  }

  public SquareEventNotifiedUpdateSquareChatProfileName setUpdatedChatName(String updatedChatName) {
    this.updatedChatName = updatedChatName;
    return this;
  }

  public void unsetUpdatedChatName() {
    this.updatedChatName = null;
  }

  /** Returns true if field updatedChatName is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedChatName() {
    return this.updatedChatName != null;
  }

  public void setUpdatedChatNameIsSet(boolean value) {
    if (!value) {
      this.updatedChatName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SQUARE_CHAT_MID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        setSquareChatMid((String)value);
      }
      break;

    case EDITOR:
      if (value == null) {
        unsetEditor();
      } else {
        setEditor((SquareMember)value);
      }
      break;

    case UPDATED_CHAT_NAME:
      if (value == null) {
        unsetUpdatedChatName();
      } else {
        setUpdatedChatName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case EDITOR:
      return getEditor();

    case UPDATED_CHAT_NAME:
      return getUpdatedChatName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    case EDITOR:
      return isSetEditor();
    case UPDATED_CHAT_NAME:
      return isSetUpdatedChatName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedUpdateSquareChatProfileName)
      return this.equals((SquareEventNotifiedUpdateSquareChatProfileName)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedUpdateSquareChatProfileName that) {
    if (that == null)
      return false;

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_editor = true && this.isSetEditor();
    boolean that_present_editor = true && that.isSetEditor();
    if (this_present_editor || that_present_editor) {
      if (!(this_present_editor && that_present_editor))
        return false;
      if (!this.editor.equals(that.editor))
        return false;
    }

    boolean this_present_updatedChatName = true && this.isSetUpdatedChatName();
    boolean that_present_updatedChatName = true && that.isSetUpdatedChatName();
    if (this_present_updatedChatName || that_present_updatedChatName) {
      if (!(this_present_updatedChatName && that_present_updatedChatName))
        return false;
      if (!this.updatedChatName.equals(that.updatedChatName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareEventNotifiedUpdateSquareChatProfileName other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSquareChatMid()).compareTo(other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEditor()).compareTo(other.isSetEditor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEditor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.editor, other.editor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdatedChatName()).compareTo(other.isSetUpdatedChatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedChatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedChatName, other.updatedChatName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SquareEventNotifiedUpdateSquareChatProfileName(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("editor:");
    if (this.editor == null) {
      sb.append("null");
    } else {
      sb.append(this.editor);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedChatName:");
    if (this.updatedChatName == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedChatName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (editor != null) {
      editor.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SquareEventNotifiedUpdateSquareChatProfileNameStandardSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedUpdateSquareChatProfileNameStandardScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareChatProfileNameStandardScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareChatProfileNameStandardScheme extends StandardScheme<SquareEventNotifiedUpdateSquareChatProfileName> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedUpdateSquareChatProfileName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHAT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatMid = iprot.readString();
              struct.setSquareChatMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EDITOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.editor = new SquareMember();
              struct.editor.read(iprot);
              struct.setEditorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATED_CHAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.updatedChatName = iprot.readString();
              struct.setUpdatedChatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedUpdateSquareChatProfileName struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.editor != null) {
        oprot.writeFieldBegin(EDITOR_FIELD_DESC);
        struct.editor.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.updatedChatName != null) {
        oprot.writeFieldBegin(UPDATED_CHAT_NAME_FIELD_DESC);
        oprot.writeString(struct.updatedChatName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedUpdateSquareChatProfileNameTupleSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedUpdateSquareChatProfileNameTupleScheme getScheme() {
      return new SquareEventNotifiedUpdateSquareChatProfileNameTupleScheme();
    }
  }

  private static class SquareEventNotifiedUpdateSquareChatProfileNameTupleScheme extends TupleScheme<SquareEventNotifiedUpdateSquareChatProfileName> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareChatProfileName struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetEditor()) {
        optionals.set(1);
      }
      if (struct.isSetUpdatedChatName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetEditor()) {
        struct.editor.write(oprot);
      }
      if (struct.isSetUpdatedChatName()) {
        oprot.writeString(struct.updatedChatName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedUpdateSquareChatProfileName struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.editor = new SquareMember();
        struct.editor.read(iprot);
        struct.setEditorIsSet(true);
      }
      if (incoming.get(2)) {
        struct.updatedChatName = iprot.readString();
        struct.setUpdatedChatNameIsSet(true);
      }
    }
  }

}

