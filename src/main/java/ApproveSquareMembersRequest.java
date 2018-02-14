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

public class ApproveSquareMembersRequest implements org.apache.thrift.TBase<ApproveSquareMembersRequest, ApproveSquareMembersRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ApproveSquareMembersRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ApproveSquareMembersRequest");

  private static final org.apache.thrift.protocol.TField SQUARE_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REQUESTED_MEMBER_MIDS_FIELD_DESC = new org.apache.thrift.protocol.TField("requestedMemberMids", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ApproveSquareMembersRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ApproveSquareMembersRequestTupleSchemeFactory());
  }

  public String squareMid; // required
  public List<String> requestedMemberMids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_MID((short)2, "squareMid"),
    REQUESTED_MEMBER_MIDS((short)3, "requestedMemberMids");

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
        case 2: // SQUARE_MID
          return SQUARE_MID;
        case 3: // REQUESTED_MEMBER_MIDS
          return REQUESTED_MEMBER_MIDS;
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
    tmpMap.put(_Fields.SQUARE_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUESTED_MEMBER_MIDS, new org.apache.thrift.meta_data.FieldMetaData("requestedMemberMids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ApproveSquareMembersRequest.class, metaDataMap);
  }

  public ApproveSquareMembersRequest() {
  }

  public ApproveSquareMembersRequest(
    String squareMid,
    List<String> requestedMemberMids)
  {
    this();
    this.squareMid = squareMid;
    this.requestedMemberMids = requestedMemberMids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ApproveSquareMembersRequest(ApproveSquareMembersRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetRequestedMemberMids()) {
      List<String> __this__requestedMemberMids = new ArrayList<String>(other.requestedMemberMids);
      this.requestedMemberMids = __this__requestedMemberMids;
    }
  }

  public ApproveSquareMembersRequest deepCopy() {
    return new ApproveSquareMembersRequest(this);
  }

  @Override
  public void clear() {
    this.squareMid = null;
    this.requestedMemberMids = null;
  }

  public String getSquareMid() {
    return this.squareMid;
  }

  public ApproveSquareMembersRequest setSquareMid(String squareMid) {
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

  public int getRequestedMemberMidsSize() {
    return (this.requestedMemberMids == null) ? 0 : this.requestedMemberMids.size();
  }

  public java.util.Iterator<String> getRequestedMemberMidsIterator() {
    return (this.requestedMemberMids == null) ? null : this.requestedMemberMids.iterator();
  }

  public void addToRequestedMemberMids(String elem) {
    if (this.requestedMemberMids == null) {
      this.requestedMemberMids = new ArrayList<String>();
    }
    this.requestedMemberMids.add(elem);
  }

  public List<String> getRequestedMemberMids() {
    return this.requestedMemberMids;
  }

  public ApproveSquareMembersRequest setRequestedMemberMids(List<String> requestedMemberMids) {
    this.requestedMemberMids = requestedMemberMids;
    return this;
  }

  public void unsetRequestedMemberMids() {
    this.requestedMemberMids = null;
  }

  /** Returns true if field requestedMemberMids is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestedMemberMids() {
    return this.requestedMemberMids != null;
  }

  public void setRequestedMemberMidsIsSet(boolean value) {
    if (!value) {
      this.requestedMemberMids = null;
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

    case REQUESTED_MEMBER_MIDS:
      if (value == null) {
        unsetRequestedMemberMids();
      } else {
        setRequestedMemberMids((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_MID:
      return getSquareMid();

    case REQUESTED_MEMBER_MIDS:
      return getRequestedMemberMids();

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
    case REQUESTED_MEMBER_MIDS:
      return isSetRequestedMemberMids();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ApproveSquareMembersRequest)
      return this.equals((ApproveSquareMembersRequest)that);
    return false;
  }

  public boolean equals(ApproveSquareMembersRequest that) {
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

    boolean this_present_requestedMemberMids = true && this.isSetRequestedMemberMids();
    boolean that_present_requestedMemberMids = true && that.isSetRequestedMemberMids();
    if (this_present_requestedMemberMids || that_present_requestedMemberMids) {
      if (!(this_present_requestedMemberMids && that_present_requestedMemberMids))
        return false;
      if (!this.requestedMemberMids.equals(that.requestedMemberMids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ApproveSquareMembersRequest other) {
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
    lastComparison = Boolean.valueOf(isSetRequestedMemberMids()).compareTo(other.isSetRequestedMemberMids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestedMemberMids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestedMemberMids, other.requestedMemberMids);
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
    StringBuilder sb = new StringBuilder("ApproveSquareMembersRequest(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestedMemberMids:");
    if (this.requestedMemberMids == null) {
      sb.append("null");
    } else {
      sb.append(this.requestedMemberMids);
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

  private static class ApproveSquareMembersRequestStandardSchemeFactory implements SchemeFactory {
    public ApproveSquareMembersRequestStandardScheme getScheme() {
      return new ApproveSquareMembersRequestStandardScheme();
    }
  }

  private static class ApproveSquareMembersRequestStandardScheme extends StandardScheme<ApproveSquareMembersRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ApproveSquareMembersRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // SQUARE_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMid = iprot.readString();
              struct.setSquareMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REQUESTED_MEMBER_MIDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list366 = iprot.readListBegin();
                struct.requestedMemberMids = new ArrayList<String>(_list366.size);
                for (int _i367 = 0; _i367 < _list366.size; ++_i367)
                {
                  String _elem368;
                  _elem368 = iprot.readString();
                  struct.requestedMemberMids.add(_elem368);
                }
                iprot.readListEnd();
              }
              struct.setRequestedMemberMidsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ApproveSquareMembersRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(struct.squareMid);
        oprot.writeFieldEnd();
      }
      if (struct.requestedMemberMids != null) {
        oprot.writeFieldBegin(REQUESTED_MEMBER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.requestedMemberMids.size()));
          for (String _iter369 : struct.requestedMemberMids)
          {
            oprot.writeString(_iter369);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ApproveSquareMembersRequestTupleSchemeFactory implements SchemeFactory {
    public ApproveSquareMembersRequestTupleScheme getScheme() {
      return new ApproveSquareMembersRequestTupleScheme();
    }
  }

  private static class ApproveSquareMembersRequestTupleScheme extends TupleScheme<ApproveSquareMembersRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ApproveSquareMembersRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSquareMid()) {
        optionals.set(0);
      }
      if (struct.isSetRequestedMemberMids()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareMid()) {
        oprot.writeString(struct.squareMid);
      }
      if (struct.isSetRequestedMemberMids()) {
        {
          oprot.writeI32(struct.requestedMemberMids.size());
          for (String _iter370 : struct.requestedMemberMids)
          {
            oprot.writeString(_iter370);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ApproveSquareMembersRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareMid = iprot.readString();
        struct.setSquareMidIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list371 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.requestedMemberMids = new ArrayList<String>(_list371.size);
          for (int _i372 = 0; _i372 < _list371.size; ++_i372)
          {
            String _elem373;
            _elem373 = iprot.readString();
            struct.requestedMemberMids.add(_elem373);
          }
        }
        struct.setRequestedMemberMidsIsSet(true);
      }
    }
  }

}

