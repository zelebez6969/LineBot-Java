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

public class SnsFriendContactRegistration implements org.apache.thrift.TBase<SnsFriendContactRegistration, SnsFriendContactRegistration._Fields>, java.io.Serializable, Cloneable, Comparable<SnsFriendContactRegistration> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SnsFriendContactRegistration");

  private static final org.apache.thrift.protocol.TField CONTACT_FIELD_DESC = new org.apache.thrift.protocol.TField("contact", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SNS_ID_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("snsIdType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SNS_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("snsUserId", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SnsFriendContactRegistrationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SnsFriendContactRegistrationTupleSchemeFactory());
  }

  public Contact contact; // required
  /**
   * 
   * @see SnsIdType
   */
  public SnsIdType snsIdType; // required
  public String snsUserId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTACT((short)1, "contact"),
    /**
     * 
     * @see SnsIdType
     */
    SNS_ID_TYPE((short)2, "snsIdType"),
    SNS_USER_ID((short)3, "snsUserId");

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
        case 1: // CONTACT
          return CONTACT;
        case 2: // SNS_ID_TYPE
          return SNS_ID_TYPE;
        case 3: // SNS_USER_ID
          return SNS_USER_ID;
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
    tmpMap.put(_Fields.CONTACT, new org.apache.thrift.meta_data.FieldMetaData("contact", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class)));
    tmpMap.put(_Fields.SNS_ID_TYPE, new org.apache.thrift.meta_data.FieldMetaData("snsIdType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SnsIdType.class)));
    tmpMap.put(_Fields.SNS_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("snsUserId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SnsFriendContactRegistration.class, metaDataMap);
  }

  public SnsFriendContactRegistration() {
  }

  public SnsFriendContactRegistration(
    Contact contact,
    SnsIdType snsIdType,
    String snsUserId)
  {
    this();
    this.contact = contact;
    this.snsIdType = snsIdType;
    this.snsUserId = snsUserId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnsFriendContactRegistration(SnsFriendContactRegistration other) {
    if (other.isSetContact()) {
      this.contact = new Contact(other.contact);
    }
    if (other.isSetSnsIdType()) {
      this.snsIdType = other.snsIdType;
    }
    if (other.isSetSnsUserId()) {
      this.snsUserId = other.snsUserId;
    }
  }

  public SnsFriendContactRegistration deepCopy() {
    return new SnsFriendContactRegistration(this);
  }

  @Override
  public void clear() {
    this.contact = null;
    this.snsIdType = null;
    this.snsUserId = null;
  }

  public Contact getContact() {
    return this.contact;
  }

  public SnsFriendContactRegistration setContact(Contact contact) {
    this.contact = contact;
    return this;
  }

  public void unsetContact() {
    this.contact = null;
  }

  /** Returns true if field contact is set (has been assigned a value) and false otherwise */
  public boolean isSetContact() {
    return this.contact != null;
  }

  public void setContactIsSet(boolean value) {
    if (!value) {
      this.contact = null;
    }
  }

  /**
   * 
   * @see SnsIdType
   */
  public SnsIdType getSnsIdType() {
    return this.snsIdType;
  }

  /**
   * 
   * @see SnsIdType
   */
  public SnsFriendContactRegistration setSnsIdType(SnsIdType snsIdType) {
    this.snsIdType = snsIdType;
    return this;
  }

  public void unsetSnsIdType() {
    this.snsIdType = null;
  }

  /** Returns true if field snsIdType is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsIdType() {
    return this.snsIdType != null;
  }

  public void setSnsIdTypeIsSet(boolean value) {
    if (!value) {
      this.snsIdType = null;
    }
  }

  public String getSnsUserId() {
    return this.snsUserId;
  }

  public SnsFriendContactRegistration setSnsUserId(String snsUserId) {
    this.snsUserId = snsUserId;
    return this;
  }

  public void unsetSnsUserId() {
    this.snsUserId = null;
  }

  /** Returns true if field snsUserId is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsUserId() {
    return this.snsUserId != null;
  }

  public void setSnsUserIdIsSet(boolean value) {
    if (!value) {
      this.snsUserId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONTACT:
      if (value == null) {
        unsetContact();
      } else {
        setContact((Contact)value);
      }
      break;

    case SNS_ID_TYPE:
      if (value == null) {
        unsetSnsIdType();
      } else {
        setSnsIdType((SnsIdType)value);
      }
      break;

    case SNS_USER_ID:
      if (value == null) {
        unsetSnsUserId();
      } else {
        setSnsUserId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTACT:
      return getContact();

    case SNS_ID_TYPE:
      return getSnsIdType();

    case SNS_USER_ID:
      return getSnsUserId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONTACT:
      return isSetContact();
    case SNS_ID_TYPE:
      return isSetSnsIdType();
    case SNS_USER_ID:
      return isSetSnsUserId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SnsFriendContactRegistration)
      return this.equals((SnsFriendContactRegistration)that);
    return false;
  }

  public boolean equals(SnsFriendContactRegistration that) {
    if (that == null)
      return false;

    boolean this_present_contact = true && this.isSetContact();
    boolean that_present_contact = true && that.isSetContact();
    if (this_present_contact || that_present_contact) {
      if (!(this_present_contact && that_present_contact))
        return false;
      if (!this.contact.equals(that.contact))
        return false;
    }

    boolean this_present_snsIdType = true && this.isSetSnsIdType();
    boolean that_present_snsIdType = true && that.isSetSnsIdType();
    if (this_present_snsIdType || that_present_snsIdType) {
      if (!(this_present_snsIdType && that_present_snsIdType))
        return false;
      if (!this.snsIdType.equals(that.snsIdType))
        return false;
    }

    boolean this_present_snsUserId = true && this.isSetSnsUserId();
    boolean that_present_snsUserId = true && that.isSetSnsUserId();
    if (this_present_snsUserId || that_present_snsUserId) {
      if (!(this_present_snsUserId && that_present_snsUserId))
        return false;
      if (!this.snsUserId.equals(that.snsUserId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(SnsFriendContactRegistration other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetContact()).compareTo(other.isSetContact());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContact()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contact, other.contact);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSnsIdType()).compareTo(other.isSetSnsIdType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsIdType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snsIdType, other.snsIdType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSnsUserId()).compareTo(other.isSetSnsUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snsUserId, other.snsUserId);
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
    StringBuilder sb = new StringBuilder("SnsFriendContactRegistration(");
    boolean first = true;

    sb.append("contact:");
    if (this.contact == null) {
      sb.append("null");
    } else {
      sb.append(this.contact);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("snsIdType:");
    if (this.snsIdType == null) {
      sb.append("null");
    } else {
      sb.append(this.snsIdType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("snsUserId:");
    if (this.snsUserId == null) {
      sb.append("null");
    } else {
      sb.append(this.snsUserId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (contact != null) {
      contact.validate();
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

  private static class SnsFriendContactRegistrationStandardSchemeFactory implements SchemeFactory {
    public SnsFriendContactRegistrationStandardScheme getScheme() {
      return new SnsFriendContactRegistrationStandardScheme();
    }
  }

  private static class SnsFriendContactRegistrationStandardScheme extends StandardScheme<SnsFriendContactRegistration> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SnsFriendContactRegistration struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTACT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.contact = new Contact();
              struct.contact.read(iprot);
              struct.setContactIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SNS_ID_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.snsIdType = SnsIdType.findByValue(iprot.readI32());
              struct.setSnsIdTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SNS_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.snsUserId = iprot.readString();
              struct.setSnsUserIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SnsFriendContactRegistration struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.contact != null) {
        oprot.writeFieldBegin(CONTACT_FIELD_DESC);
        struct.contact.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.snsIdType != null) {
        oprot.writeFieldBegin(SNS_ID_TYPE_FIELD_DESC);
        oprot.writeI32(struct.snsIdType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.snsUserId != null) {
        oprot.writeFieldBegin(SNS_USER_ID_FIELD_DESC);
        oprot.writeString(struct.snsUserId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SnsFriendContactRegistrationTupleSchemeFactory implements SchemeFactory {
    public SnsFriendContactRegistrationTupleScheme getScheme() {
      return new SnsFriendContactRegistrationTupleScheme();
    }
  }

  private static class SnsFriendContactRegistrationTupleScheme extends TupleScheme<SnsFriendContactRegistration> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SnsFriendContactRegistration struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetContact()) {
        optionals.set(0);
      }
      if (struct.isSetSnsIdType()) {
        optionals.set(1);
      }
      if (struct.isSetSnsUserId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetContact()) {
        struct.contact.write(oprot);
      }
      if (struct.isSetSnsIdType()) {
        oprot.writeI32(struct.snsIdType.getValue());
      }
      if (struct.isSetSnsUserId()) {
        oprot.writeString(struct.snsUserId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SnsFriendContactRegistration struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.contact = new Contact();
        struct.contact.read(iprot);
        struct.setContactIsSet(true);
      }
      if (incoming.get(1)) {
        struct.snsIdType = SnsIdType.findByValue(iprot.readI32());
        struct.setSnsIdTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.snsUserId = iprot.readString();
        struct.setSnsUserIdIsSet(true);
      }
    }
  }

}

