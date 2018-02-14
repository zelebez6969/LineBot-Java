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

public class SquareEventNotifiedInviteIntoSquareChat implements org.apache.thrift.TBase<SquareEventNotifiedInviteIntoSquareChat, SquareEventNotifiedInviteIntoSquareChat._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotifiedInviteIntoSquareChat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotifiedInviteIntoSquareChat");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INVITEES_FIELD_DESC = new org.apache.thrift.protocol.TField("invitees", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField INVITOR_FIELD_DESC = new org.apache.thrift.protocol.TField("invitor", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField INVITOR_RELATION_FIELD_DESC = new org.apache.thrift.protocol.TField("invitorRelation", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SquareEventNotifiedInviteIntoSquareChatStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SquareEventNotifiedInviteIntoSquareChatTupleSchemeFactory());
  }

  public String squareChatMid; // required
  public List<SquareMember> invitees; // required
  public SquareMember invitor; // required
  public SquareMemberRelation invitorRelation; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    INVITEES((short)2, "invitees"),
    INVITOR((short)3, "invitor"),
    INVITOR_RELATION((short)4, "invitorRelation");

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
        case 2: // INVITEES
          return INVITEES;
        case 3: // INVITOR
          return INVITOR;
        case 4: // INVITOR_RELATION
          return INVITOR_RELATION;
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
    tmpMap.put(_Fields.INVITEES, new org.apache.thrift.meta_data.FieldMetaData("invitees", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class))));
    tmpMap.put(_Fields.INVITOR, new org.apache.thrift.meta_data.FieldMetaData("invitor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMember.class)));
    tmpMap.put(_Fields.INVITOR_RELATION, new org.apache.thrift.meta_data.FieldMetaData("invitorRelation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMemberRelation.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotifiedInviteIntoSquareChat.class, metaDataMap);
  }

  public SquareEventNotifiedInviteIntoSquareChat() {
  }

  public SquareEventNotifiedInviteIntoSquareChat(
    String squareChatMid,
    List<SquareMember> invitees,
    SquareMember invitor,
    SquareMemberRelation invitorRelation)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.invitees = invitees;
    this.invitor = invitor;
    this.invitorRelation = invitorRelation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedInviteIntoSquareChat(SquareEventNotifiedInviteIntoSquareChat other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetInvitees()) {
      List<SquareMember> __this__invitees = new ArrayList<SquareMember>(other.invitees.size());
      for (SquareMember other_element : other.invitees) {
        __this__invitees.add(new SquareMember(other_element));
      }
      this.invitees = __this__invitees;
    }
    if (other.isSetInvitor()) {
      this.invitor = new SquareMember(other.invitor);
    }
    if (other.isSetInvitorRelation()) {
      this.invitorRelation = new SquareMemberRelation(other.invitorRelation);
    }
  }

  public SquareEventNotifiedInviteIntoSquareChat deepCopy() {
    return new SquareEventNotifiedInviteIntoSquareChat(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.invitees = null;
    this.invitor = null;
    this.invitorRelation = null;
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotifiedInviteIntoSquareChat setSquareChatMid(String squareChatMid) {
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

  public int getInviteesSize() {
    return (this.invitees == null) ? 0 : this.invitees.size();
  }

  public java.util.Iterator<SquareMember> getInviteesIterator() {
    return (this.invitees == null) ? null : this.invitees.iterator();
  }

  public void addToInvitees(SquareMember elem) {
    if (this.invitees == null) {
      this.invitees = new ArrayList<SquareMember>();
    }
    this.invitees.add(elem);
  }

  public List<SquareMember> getInvitees() {
    return this.invitees;
  }

  public SquareEventNotifiedInviteIntoSquareChat setInvitees(List<SquareMember> invitees) {
    this.invitees = invitees;
    return this;
  }

  public void unsetInvitees() {
    this.invitees = null;
  }

  /** Returns true if field invitees is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitees() {
    return this.invitees != null;
  }

  public void setInviteesIsSet(boolean value) {
    if (!value) {
      this.invitees = null;
    }
  }

  public SquareMember getInvitor() {
    return this.invitor;
  }

  public SquareEventNotifiedInviteIntoSquareChat setInvitor(SquareMember invitor) {
    this.invitor = invitor;
    return this;
  }

  public void unsetInvitor() {
    this.invitor = null;
  }

  /** Returns true if field invitor is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitor() {
    return this.invitor != null;
  }

  public void setInvitorIsSet(boolean value) {
    if (!value) {
      this.invitor = null;
    }
  }

  public SquareMemberRelation getInvitorRelation() {
    return this.invitorRelation;
  }

  public SquareEventNotifiedInviteIntoSquareChat setInvitorRelation(SquareMemberRelation invitorRelation) {
    this.invitorRelation = invitorRelation;
    return this;
  }

  public void unsetInvitorRelation() {
    this.invitorRelation = null;
  }

  /** Returns true if field invitorRelation is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitorRelation() {
    return this.invitorRelation != null;
  }

  public void setInvitorRelationIsSet(boolean value) {
    if (!value) {
      this.invitorRelation = null;
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

    case INVITEES:
      if (value == null) {
        unsetInvitees();
      } else {
        setInvitees((List<SquareMember>)value);
      }
      break;

    case INVITOR:
      if (value == null) {
        unsetInvitor();
      } else {
        setInvitor((SquareMember)value);
      }
      break;

    case INVITOR_RELATION:
      if (value == null) {
        unsetInvitorRelation();
      } else {
        setInvitorRelation((SquareMemberRelation)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case INVITEES:
      return getInvitees();

    case INVITOR:
      return getInvitor();

    case INVITOR_RELATION:
      return getInvitorRelation();

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
    case INVITEES:
      return isSetInvitees();
    case INVITOR:
      return isSetInvitor();
    case INVITOR_RELATION:
      return isSetInvitorRelation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedInviteIntoSquareChat)
      return this.equals((SquareEventNotifiedInviteIntoSquareChat)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedInviteIntoSquareChat that) {
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

    boolean this_present_invitees = true && this.isSetInvitees();
    boolean that_present_invitees = true && that.isSetInvitees();
    if (this_present_invitees || that_present_invitees) {
      if (!(this_present_invitees && that_present_invitees))
        return false;
      if (!this.invitees.equals(that.invitees))
        return false;
    }

    boolean this_present_invitor = true && this.isSetInvitor();
    boolean that_present_invitor = true && that.isSetInvitor();
    if (this_present_invitor || that_present_invitor) {
      if (!(this_present_invitor && that_present_invitor))
        return false;
      if (!this.invitor.equals(that.invitor))
        return false;
    }

    boolean this_present_invitorRelation = true && this.isSetInvitorRelation();
    boolean that_present_invitorRelation = true && that.isSetInvitorRelation();
    if (this_present_invitorRelation || that_present_invitorRelation) {
      if (!(this_present_invitorRelation && that_present_invitorRelation))
        return false;
      if (!this.invitorRelation.equals(that.invitorRelation))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SquareEventNotifiedInviteIntoSquareChat other) {
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
    lastComparison = Boolean.valueOf(isSetInvitees()).compareTo(other.isSetInvitees());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitees()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invitees, other.invitees);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvitor()).compareTo(other.isSetInvitor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invitor, other.invitor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInvitorRelation()).compareTo(other.isSetInvitorRelation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitorRelation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invitorRelation, other.invitorRelation);
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
    StringBuilder sb = new StringBuilder("SquareEventNotifiedInviteIntoSquareChat(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invitees:");
    if (this.invitees == null) {
      sb.append("null");
    } else {
      sb.append(this.invitees);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invitor:");
    if (this.invitor == null) {
      sb.append("null");
    } else {
      sb.append(this.invitor);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invitorRelation:");
    if (this.invitorRelation == null) {
      sb.append("null");
    } else {
      sb.append(this.invitorRelation);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (invitor != null) {
      invitor.validate();
    }
    if (invitorRelation != null) {
      invitorRelation.validate();
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

  private static class SquareEventNotifiedInviteIntoSquareChatStandardSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedInviteIntoSquareChatStandardScheme getScheme() {
      return new SquareEventNotifiedInviteIntoSquareChatStandardScheme();
    }
  }

  private static class SquareEventNotifiedInviteIntoSquareChatStandardScheme extends StandardScheme<SquareEventNotifiedInviteIntoSquareChat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotifiedInviteIntoSquareChat struct) throws org.apache.thrift.TException {
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
          case 2: // INVITEES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list382 = iprot.readListBegin();
                struct.invitees = new ArrayList<SquareMember>(_list382.size);
                for (int _i383 = 0; _i383 < _list382.size; ++_i383)
                {
                  SquareMember _elem384;
                  _elem384 = new SquareMember();
                  _elem384.read(iprot);
                  struct.invitees.add(_elem384);
                }
                iprot.readListEnd();
              }
              struct.setInviteesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INVITOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.invitor = new SquareMember();
              struct.invitor.read(iprot);
              struct.setInvitorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INVITOR_RELATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.invitorRelation = new SquareMemberRelation();
              struct.invitorRelation.read(iprot);
              struct.setInvitorRelationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotifiedInviteIntoSquareChat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.invitees != null) {
        oprot.writeFieldBegin(INVITEES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.invitees.size()));
          for (SquareMember _iter385 : struct.invitees)
          {
            _iter385.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.invitor != null) {
        oprot.writeFieldBegin(INVITOR_FIELD_DESC);
        struct.invitor.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.invitorRelation != null) {
        oprot.writeFieldBegin(INVITOR_RELATION_FIELD_DESC);
        struct.invitorRelation.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotifiedInviteIntoSquareChatTupleSchemeFactory implements SchemeFactory {
    public SquareEventNotifiedInviteIntoSquareChatTupleScheme getScheme() {
      return new SquareEventNotifiedInviteIntoSquareChatTupleScheme();
    }
  }

  private static class SquareEventNotifiedInviteIntoSquareChatTupleScheme extends TupleScheme<SquareEventNotifiedInviteIntoSquareChat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedInviteIntoSquareChat struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetInvitees()) {
        optionals.set(1);
      }
      if (struct.isSetInvitor()) {
        optionals.set(2);
      }
      if (struct.isSetInvitorRelation()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetInvitees()) {
        {
          oprot.writeI32(struct.invitees.size());
          for (SquareMember _iter386 : struct.invitees)
          {
            _iter386.write(oprot);
          }
        }
      }
      if (struct.isSetInvitor()) {
        struct.invitor.write(oprot);
      }
      if (struct.isSetInvitorRelation()) {
        struct.invitorRelation.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotifiedInviteIntoSquareChat struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list387 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.invitees = new ArrayList<SquareMember>(_list387.size);
          for (int _i388 = 0; _i388 < _list387.size; ++_i388)
          {
            SquareMember _elem389;
            _elem389 = new SquareMember();
            _elem389.read(iprot);
            struct.invitees.add(_elem389);
          }
        }
        struct.setInviteesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.invitor = new SquareMember();
        struct.invitor.read(iprot);
        struct.setInvitorIsSet(true);
      }
      if (incoming.get(3)) {
        struct.invitorRelation = new SquareMemberRelation();
        struct.invitorRelation.read(iprot);
        struct.setInvitorRelationIsSet(true);
      }
    }
  }

}
