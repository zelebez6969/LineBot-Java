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

public class SquareFeatureSet implements org.apache.thrift.TBase<SquareFeatureSet, SquareFeatureSet._Fields>, java.io.Serializable, Cloneable, Comparable<SquareFeatureSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareFeatureSet");

  private static final org.apache.thrift.protocol.TField SQUARE_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CREATING_SECRET_SQUARE_CHAT_FIELD_DESC = new org.apache.thrift.protocol.TField("creatingSecretSquareChat", org.apache.thrift.protocol.TType.STRUCT, (short)11);
  private static final org.apache.thrift.protocol.TField INVITING_INTO_OPEN_SQUARE_CHAT_FIELD_DESC = new org.apache.thrift.protocol.TField("invitingIntoOpenSquareChat", org.apache.thrift.protocol.TType.STRUCT, (short)12);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareFeatureSetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareFeatureSetTupleSchemeFactory());
  }

  public String squareMid; // required
  public long revision; // required
  public SquareFeature creatingSecretSquareChat; // required
  public SquareFeature invitingIntoOpenSquareChat; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_MID((short)1, "squareMid"),
    REVISION((short)2, "revision"),
    CREATING_SECRET_SQUARE_CHAT((short)11, "creatingSecretSquareChat"),
    INVITING_INTO_OPEN_SQUARE_CHAT((short)12, "invitingIntoOpenSquareChat");

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
        case 1: // SQUARE_MID
          return SQUARE_MID;
        case 2: // REVISION
          return REVISION;
        case 11: // CREATING_SECRET_SQUARE_CHAT
          return CREATING_SECRET_SQUARE_CHAT;
        case 12: // INVITING_INTO_OPEN_SQUARE_CHAT
          return INVITING_INTO_OPEN_SQUARE_CHAT;
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
  private static final int __REVISION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CREATING_SECRET_SQUARE_CHAT, new org.apache.thrift.meta_data.FieldMetaData("creatingSecretSquareChat", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareFeature.class)));
    tmpMap.put(_Fields.INVITING_INTO_OPEN_SQUARE_CHAT, new org.apache.thrift.meta_data.FieldMetaData("invitingIntoOpenSquareChat", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareFeature.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareFeatureSet.class, metaDataMap);
  }

  public SquareFeatureSet() {
  }

  public SquareFeatureSet(
    String squareMid,
    long revision,
    SquareFeature creatingSecretSquareChat,
    SquareFeature invitingIntoOpenSquareChat)
  {
    this();
    this.squareMid = squareMid;
    this.revision = revision;
    setRevisionIsSet(true);
    this.creatingSecretSquareChat = creatingSecretSquareChat;
    this.invitingIntoOpenSquareChat = invitingIntoOpenSquareChat;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareFeatureSet(SquareFeatureSet other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    this.revision = other.revision;
    if (other.isSetCreatingSecretSquareChat()) {
      this.creatingSecretSquareChat = new SquareFeature(other.creatingSecretSquareChat);
    }
    if (other.isSetInvitingIntoOpenSquareChat()) {
      this.invitingIntoOpenSquareChat = new SquareFeature(other.invitingIntoOpenSquareChat);
    }
  }

  public SquareFeatureSet deepCopy() {
    return new SquareFeatureSet(this);
  }

  @Override
  public void clear() {
    this.squareMid = null;
    setRevisionIsSet(false);
    this.revision = 0;
    this.creatingSecretSquareChat = null;
    this.invitingIntoOpenSquareChat = null;
  }

  public String getSquareMid() {
    return this.squareMid;
  }

  public SquareFeatureSet setSquareMid(String squareMid) {
    this.squareMid = squareMid;
    return this;
  }

  public void unsetSquareMid() {
    this.squareMid = null;
  }

  /** Returns true if field squareMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMid() {
    return this.squareMid != null;
  }

  public void setSquareMidIsSet(boolean value) {
    if (!value) {
      this.squareMid = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public SquareFeatureSet setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  public SquareFeature getCreatingSecretSquareChat() {
    return this.creatingSecretSquareChat;
  }

  public SquareFeatureSet setCreatingSecretSquareChat(SquareFeature creatingSecretSquareChat) {
    this.creatingSecretSquareChat = creatingSecretSquareChat;
    return this;
  }

  public void unsetCreatingSecretSquareChat() {
    this.creatingSecretSquareChat = null;
  }

  /** Returns true if field creatingSecretSquareChat is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatingSecretSquareChat() {
    return this.creatingSecretSquareChat != null;
  }

  public void setCreatingSecretSquareChatIsSet(boolean value) {
    if (!value) {
      this.creatingSecretSquareChat = null;
    }
  }

  public SquareFeature getInvitingIntoOpenSquareChat() {
    return this.invitingIntoOpenSquareChat;
  }

  public SquareFeatureSet setInvitingIntoOpenSquareChat(SquareFeature invitingIntoOpenSquareChat) {
    this.invitingIntoOpenSquareChat = invitingIntoOpenSquareChat;
    return this;
  }

  public void unsetInvitingIntoOpenSquareChat() {
    this.invitingIntoOpenSquareChat = null;
  }

  /** Returns true if field invitingIntoOpenSquareChat is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitingIntoOpenSquareChat() {
    return this.invitingIntoOpenSquareChat != null;
  }

  public void setInvitingIntoOpenSquareChatIsSet(boolean value) {
    if (!value) {
      this.invitingIntoOpenSquareChat = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SQUARE_MID:
      if (value == null) {
        unsetSquareMid();
      } else {
        setSquareMid((String)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((Long)value);
      }
      break;

    case CREATING_SECRET_SQUARE_CHAT:
      if (value == null) {
        unsetCreatingSecretSquareChat();
      } else {
        setCreatingSecretSquareChat((SquareFeature)value);
      }
      break;

    case INVITING_INTO_OPEN_SQUARE_CHAT:
      if (value == null) {
        unsetInvitingIntoOpenSquareChat();
      } else {
        setInvitingIntoOpenSquareChat((SquareFeature)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_MID:
      return getSquareMid();

    case REVISION:
      return Long.valueOf(getRevision());

    case CREATING_SECRET_SQUARE_CHAT:
      return getCreatingSecretSquareChat();

    case INVITING_INTO_OPEN_SQUARE_CHAT:
      return getInvitingIntoOpenSquareChat();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_MID:
      return isSetSquareMid();
    case REVISION:
      return isSetRevision();
    case CREATING_SECRET_SQUARE_CHAT:
      return isSetCreatingSecretSquareChat();
    case INVITING_INTO_OPEN_SQUARE_CHAT:
      return isSetInvitingIntoOpenSquareChat();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareFeatureSet)
      return this.equals((SquareFeatureSet)that);
    return false;
  }

  public boolean equals(SquareFeatureSet that) {
    if (that == null)
      return false;

    boolean this_present_squareMid = true && this.isSetSquareMid();
    boolean that_present_squareMid = true && that.isSetSquareMid();
    if (this_present_squareMid || that_present_squareMid) {
      if (!(this_present_squareMid && that_present_squareMid))
        return false;
      if (!this.squareMid.equals(that.squareMid))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_creatingSecretSquareChat = true && this.isSetCreatingSecretSquareChat();
    boolean that_present_creatingSecretSquareChat = true && that.isSetCreatingSecretSquareChat();
    if (this_present_creatingSecretSquareChat || that_present_creatingSecretSquareChat) {
      if (!(this_present_creatingSecretSquareChat && that_present_creatingSecretSquareChat))
        return false;
      if (!this.creatingSecretSquareChat.equals(that.creatingSecretSquareChat))
        return false;
    }

    boolean this_present_invitingIntoOpenSquareChat = true && this.isSetInvitingIntoOpenSquareChat();
    boolean that_present_invitingIntoOpenSquareChat = true && that.isSetInvitingIntoOpenSquareChat();
    if (this_present_invitingIntoOpenSquareChat || that_present_invitingIntoOpenSquareChat) {
      if (!(this_present_invitingIntoOpenSquareChat && that_present_invitingIntoOpenSquareChat))
        return false;
      if (!this.invitingIntoOpenSquareChat.equals(that.invitingIntoOpenSquareChat))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareFeatureSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSquareMid()).compareTo(other.isSetSquareMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMid, other.squareMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreatingSecretSquareChat()).compareTo(other.isSetCreatingSecretSquareChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatingSecretSquareChat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creatingSecretSquareChat, other.creatingSecretSquareChat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvitingIntoOpenSquareChat()).compareTo(other.isSetInvitingIntoOpenSquareChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitingIntoOpenSquareChat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invitingIntoOpenSquareChat, other.invitingIntoOpenSquareChat);
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
    StringBuilder sb = new StringBuilder("SquareFeatureSet(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("creatingSecretSquareChat:");
    if (this.creatingSecretSquareChat == null) {
      sb.append("null");
    } else {
      sb.append(this.creatingSecretSquareChat);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invitingIntoOpenSquareChat:");
    if (this.invitingIntoOpenSquareChat == null) {
      sb.append("null");
    } else {
      sb.append(this.invitingIntoOpenSquareChat);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (creatingSecretSquareChat != null) {
      creatingSecretSquareChat.validate();
    }
    if (invitingIntoOpenSquareChat != null) {
      invitingIntoOpenSquareChat.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SquareFeatureSetStandardSchemeFactory implements SchemeFactory {
    public SquareFeatureSetStandardScheme getScheme() {
      return new SquareFeatureSetStandardScheme();
    }
  }

  private static class SquareFeatureSetStandardScheme extends StandardScheme<SquareFeatureSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareFeatureSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMid = iprot.readString();
              struct.setSquareMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // CREATING_SECRET_SQUARE_CHAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.creatingSecretSquareChat = new SquareFeature();
              struct.creatingSecretSquareChat.read(iprot);
              struct.setCreatingSecretSquareChatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // INVITING_INTO_OPEN_SQUARE_CHAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.invitingIntoOpenSquareChat = new SquareFeature();
              struct.invitingIntoOpenSquareChat.read(iprot);
              struct.setInvitingIntoOpenSquareChatIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareFeatureSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(struct.squareMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      if (struct.creatingSecretSquareChat != null) {
        oprot.writeFieldBegin(CREATING_SECRET_SQUARE_CHAT_FIELD_DESC);
        struct.creatingSecretSquareChat.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.invitingIntoOpenSquareChat != null) {
        oprot.writeFieldBegin(INVITING_INTO_OPEN_SQUARE_CHAT_FIELD_DESC);
        struct.invitingIntoOpenSquareChat.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareFeatureSetTupleSchemeFactory implements SchemeFactory {
    public SquareFeatureSetTupleScheme getScheme() {
      return new SquareFeatureSetTupleScheme();
    }
  }

  private static class SquareFeatureSetTupleScheme extends TupleScheme<SquareFeatureSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareFeatureSet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareMid()) {
        optionals.set(0);
      }
      if (struct.isSetRevision()) {
        optionals.set(1);
      }
      if (struct.isSetCreatingSecretSquareChat()) {
        optionals.set(2);
      }
      if (struct.isSetInvitingIntoOpenSquareChat()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSquareMid()) {
        oprot.writeString(struct.squareMid);
      }
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
      if (struct.isSetCreatingSecretSquareChat()) {
        struct.creatingSecretSquareChat.write(oprot);
      }
      if (struct.isSetInvitingIntoOpenSquareChat()) {
        struct.invitingIntoOpenSquareChat.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareFeatureSet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.squareMid = iprot.readString();
        struct.setSquareMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.creatingSecretSquareChat = new SquareFeature();
        struct.creatingSecretSquareChat.read(iprot);
        struct.setCreatingSecretSquareChatIsSet(true);
      }
      if (incoming.get(3)) {
        struct.invitingIntoOpenSquareChat = new SquareFeature();
        struct.invitingIntoOpenSquareChat.read(iprot);
        struct.setInvitingIntoOpenSquareChatIsSet(true);
      }
    }
  }

}

