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

public class SquareEventNotifiedMarkAsRead implements org.apache.thrift.TBase<SquareEventNotifiedMarkAsRead, SquareEventNotifiedMarkAsRead._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedMarkAsRead> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedMarkAsRead");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField S_MEMBER_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("sMemberMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("messageId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareEventNotifiedMarkAsReadStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareEventNotifiedMarkAsReadTupleSchemeFactory());
  }

  public String squareChatMid; // required
  public String sMemberMid; // required
  public String messageId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    S_MEMBER_MID((short)2, "sMemberMid"),
    MESSAGE_ID((short)4, "messageId");

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
        case 2: // S_MEMBER_MID
          return S_MEMBER_MID;
        case 4: // MESSAGE_ID
          return MESSAGE_ID;
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
    tmpMap.put(_Fields.S_MEMBER_MID, new org.apache.thrift.meta_data.FieldMetaData("sMemberMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("messageId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedMarkAsRead.class, metaDataMap);
  }

  public SquareEventNotifiedMarkAsRead() {
  }

  public SquareEventNotifiedMarkAsRead(
    String squareChatMid,
    String sMemberMid,
    String messageId)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.sMemberMid = sMemberMid;
    this.messageId = messageId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedMarkAsRead(SquareEventNotifiedMarkAsRead other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSMemberMid()) {
      this.sMemberMid = other.sMemberMid;
    }
    if (other.isSetMessageId()) {
      this.messageId = other.messageId;
    }
  }

  public SquareEventNotifiedMarkAsRead deepCopy() {
    return new SquareEventNotifiedMarkAsRead(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.sMemberMid = null;
    this.messageId = null;
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedMarkAsRead setSquareChatMid(String squareChatMid) {
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

  public String getSMemberMid() {
    return this.sMemberMid;
  }

  public SquareEventNotifiedMarkAsRead setSMemberMid(String sMemberMid) {
    this.sMemberMid = sMemberMid;
    return this;
  }

  public void unsetSMemberMid() {
    this.sMemberMid = null;
  }

  /** Returns true if field sMemberMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSMemberMid() {
    return this.sMemberMid != null;
  }

  public void setSMemberMidIsSet(boolean value) {
    if (!value) {
      this.sMemberMid = null;
    }
  }

  public String getMessageId() {
    return this.messageId;
  }

  public SquareEventNotifiedMarkAsRead setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public void unsetMessageId() {
    this.messageId = null;
  }

  /** Returns true if field messageId is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageId() {
    return this.messageId != null;
  }

  public void setMessageIdIsSet(boolean value) {
    if (!value) {
      this.messageId = null;
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

    case S_MEMBER_MID:
      if (value == null) {
        unsetSMemberMid();
      } else {
        setSMemberMid((String)value);
      }
      break;

    case MESSAGE_ID:
      if (value == null) {
        unsetMessageId();
      } else {
        setMessageId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case S_MEMBER_MID:
      return getSMemberMid();

    case MESSAGE_ID:
      return getMessageId();

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
    case S_MEMBER_MID:
      return isSetSMemberMid();
    case MESSAGE_ID:
      return isSetMessageId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedMarkAsRead)
      return this.equals((SquareEventNotifiedMarkAsRead)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedMarkAsRead that) {
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

    boolean this_present_sMemberMid = true && this.isSetSMemberMid();
    boolean that_present_sMemberMid = true && that.isSetSMemberMid();
    if (this_present_sMemberMid || that_present_sMemberMid) {
      if (!(this_present_sMemberMid && that_present_sMemberMid))
        return false;
      if (!this.sMemberMid.equals(that.sMemberMid))
        return false;
    }

    boolean this_present_messageId = true && this.isSetMessageId();
    boolean that_present_messageId = true && that.isSetMessageId();
    if (this_present_messageId || that_present_messageId) {
      if (!(this_present_messageId && that_present_messageId))
        return false;
      if (!this.messageId.equals(that.messageId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareEventNotifiedMarkAsRead other) {
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
    lastComparison = Boolean.valueOf(isSetSMemberMid()).compareTo(other.isSetSMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSMemberMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sMemberMid, other.sMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageId()).compareTo(other.isSetMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageId, other.messageId);
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
    StringBuilder sb = new StringBuilder("SquareEventNotifiedMarkAsRead(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sMemberMid:");
    if (this.sMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.sMemberMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageId:");
    if (this.messageId == null) {
      sb.append("null");
    } else {
      sb.append(this.messageId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class SquareEventNotifiedMarkAsReadStandardSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedMarkAsReadStandardScheme getScheme() {
      return new SquareEventNotifiedMarkAsReadStandardScheme();
    }
  }

  private static class SquareEventNotifiedMarkAsReadStandardScheme extends StandardScheme<SquareEventNotifiedMarkAsRead> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedMarkAsRead struct) throws org.apache.thrift.TException {
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
          case 2: // S_MEMBER_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sMemberMid = iprot.readString();
              struct.setSMemberMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.messageId = iprot.readString();
              struct.setMessageIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedMarkAsRead struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.sMemberMid != null) {
        oprot.writeFieldBegin(S_MEMBER_MID_FIELD_DESC);
        oprot.writeString(struct.sMemberMid);
        oprot.writeFieldEnd();
      }
      if (struct.messageId != null) {
        oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
        oprot.writeString(struct.messageId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedMarkAsReadTupleSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedMarkAsReadTupleScheme getScheme() {
      return new SquareEventNotifiedMarkAsReadTupleScheme();
    }
  }

  private static class SquareEventNotifiedMarkAsReadTupleScheme extends TupleScheme<SquareEventNotifiedMarkAsRead> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedMarkAsRead struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetSMemberMid()) {
        optionals.set(1);
      }
      if (struct.isSetMessageId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetSMemberMid()) {
        oprot.writeString(struct.sMemberMid);
      }
      if (struct.isSetMessageId()) {
        oprot.writeString(struct.messageId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedMarkAsRead struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sMemberMid = iprot.readString();
        struct.setSMemberMidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.messageId = iprot.readString();
        struct.setMessageIdIsSet(true);
      }
    }
  }

}

