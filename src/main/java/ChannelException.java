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

public class ChannelException extends TException implements org.apache.thrift.TBase<ChannelException, ChannelException._Fields>, java.io.Serializable, Cloneable, Comparable<ChannelException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChannelException");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("reason", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARAMETER_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("parameterMap", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChannelExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChannelExceptionTupleSchemeFactory());
  }

  /**
   * 
   * @see ChannelErrorCode
   */
  public ChannelErrorCode code; // required
  public String reason; // required
  public Map<String,String> parameterMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ChannelErrorCode
     */
    CODE((short)1, "code"),
    REASON((short)2, "reason"),
    PARAMETER_MAP((short)3, "parameterMap");

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
        case 1: // CODE
          return CODE;
        case 2: // REASON
          return REASON;
        case 3: // PARAMETER_MAP
          return PARAMETER_MAP;
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
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ChannelErrorCode.class)));
    tmpMap.put(_Fields.REASON, new org.apache.thrift.meta_data.FieldMetaData("reason", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETER_MAP, new org.apache.thrift.meta_data.FieldMetaData("parameterMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChannelException.class, metaDataMap);
  }

  public ChannelException() {
  }

  public ChannelException(
    ChannelErrorCode code,
    String reason,
    Map<String,String> parameterMap)
  {
    this();
    this.code = code;
    this.reason = reason;
    this.parameterMap = parameterMap;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChannelException(ChannelException other) {
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetReason()) {
      this.reason = other.reason;
    }
    if (other.isSetParameterMap()) {
      Map<String,String> __this__parameterMap = new HashMap<String,String>(other.parameterMap);
      this.parameterMap = __this__parameterMap;
    }
  }

  public ChannelException deepCopy() {
    return new ChannelException(this);
  }

  @Override
  public void clear() {
    this.code = null;
    this.reason = null;
    this.parameterMap = null;
  }

  /**
   * 
   * @see ChannelErrorCode
   */
  public ChannelErrorCode getCode() {
    return this.code;
  }

  /**
   * 
   * @see ChannelErrorCode
   */
  public ChannelException setCode(ChannelErrorCode code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getReason() {
    return this.reason;
  }

  public ChannelException setReason(String reason) {
    this.reason = reason;
    return this;
  }

  public void unsetReason() {
    this.reason = null;
  }

  /** Returns true if field reason is set (has been assigned a value) and false otherwise */
  public boolean isSetReason() {
    return this.reason != null;
  }

  public void setReasonIsSet(boolean value) {
    if (!value) {
      this.reason = null;
    }
  }

  public int getParameterMapSize() {
    return (this.parameterMap == null) ? 0 : this.parameterMap.size();
  }

  public void putToParameterMap(String key, String val) {
    if (this.parameterMap == null) {
      this.parameterMap = new HashMap<String,String>();
    }
    this.parameterMap.put(key, val);
  }

  public Map<String,String> getParameterMap() {
    return this.parameterMap;
  }

  public ChannelException setParameterMap(Map<String,String> parameterMap) {
    this.parameterMap = parameterMap;
    return this;
  }

  public void unsetParameterMap() {
    this.parameterMap = null;
  }

  /** Returns true if field parameterMap is set (has been assigned a value) and false otherwise */
  public boolean isSetParameterMap() {
    return this.parameterMap != null;
  }

  public void setParameterMapIsSet(boolean value) {
    if (!value) {
      this.parameterMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((ChannelErrorCode)value);
      }
      break;

    case REASON:
      if (value == null) {
        unsetReason();
      } else {
        setReason((String)value);
      }
      break;

    case PARAMETER_MAP:
      if (value == null) {
        unsetParameterMap();
      } else {
        setParameterMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case REASON:
      return getReason();

    case PARAMETER_MAP:
      return getParameterMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case REASON:
      return isSetReason();
    case PARAMETER_MAP:
      return isSetParameterMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChannelException)
      return this.equals((ChannelException)that);
    return false;
  }

  public boolean equals(ChannelException that) {
    if (that == null)
      return false;

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_reason = true && this.isSetReason();
    boolean that_present_reason = true && that.isSetReason();
    if (this_present_reason || that_present_reason) {
      if (!(this_present_reason && that_present_reason))
        return false;
      if (!this.reason.equals(that.reason))
        return false;
    }

    boolean this_present_parameterMap = true && this.isSetParameterMap();
    boolean that_present_parameterMap = true && that.isSetParameterMap();
    if (this_present_parameterMap || that_present_parameterMap) {
      if (!(this_present_parameterMap && that_present_parameterMap))
        return false;
      if (!this.parameterMap.equals(that.parameterMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ChannelException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReason()).compareTo(other.isSetReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReason()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reason, other.reason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameterMap()).compareTo(other.isSetParameterMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameterMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameterMap, other.parameterMap);
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
    StringBuilder sb = new StringBuilder("ChannelException(");
    boolean first = true;

    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reason:");
    if (this.reason == null) {
      sb.append("null");
    } else {
      sb.append(this.reason);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameterMap:");
    if (this.parameterMap == null) {
      sb.append("null");
    } else {
      sb.append(this.parameterMap);
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

  private static class ChannelExceptionStandardSchemeFactory implements SchemeFactory {
    public ChannelExceptionStandardScheme getScheme() {
      return new ChannelExceptionStandardScheme();
    }
  }

  private static class ChannelExceptionStandardScheme extends StandardScheme<ChannelException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChannelException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = ChannelErrorCode.findByValue(iprot.readI32());
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REASON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reason = iprot.readString();
              struct.setReasonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAMETER_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map78 = iprot.readMapBegin();
                struct.parameterMap = new HashMap<String,String>(2*_map78.size);
                for (int _i79 = 0; _i79 < _map78.size; ++_i79)
                {
                  String _key80;
                  String _val81;
                  _key80 = iprot.readString();
                  _val81 = iprot.readString();
                  struct.parameterMap.put(_key80, _val81);
                }
                iprot.readMapEnd();
              }
              struct.setParameterMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChannelException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeI32(struct.code.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.reason != null) {
        oprot.writeFieldBegin(REASON_FIELD_DESC);
        oprot.writeString(struct.reason);
        oprot.writeFieldEnd();
      }
      if (struct.parameterMap != null) {
        oprot.writeFieldBegin(PARAMETER_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.parameterMap.size()));
          for (Map.Entry<String, String> _iter82 : struct.parameterMap.entrySet())
          {
            oprot.writeString(_iter82.getKey());
            oprot.writeString(_iter82.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChannelExceptionTupleSchemeFactory implements SchemeFactory {
    public ChannelExceptionTupleScheme getScheme() {
      return new ChannelExceptionTupleScheme();
    }
  }

  private static class ChannelExceptionTupleScheme extends TupleScheme<ChannelException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChannelException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetReason()) {
        optionals.set(1);
      }
      if (struct.isSetParameterMap()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code.getValue());
      }
      if (struct.isSetReason()) {
        oprot.writeString(struct.reason);
      }
      if (struct.isSetParameterMap()) {
        {
          oprot.writeI32(struct.parameterMap.size());
          for (Map.Entry<String, String> _iter83 : struct.parameterMap.entrySet())
          {
            oprot.writeString(_iter83.getKey());
            oprot.writeString(_iter83.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChannelException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.code = ChannelErrorCode.findByValue(iprot.readI32());
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reason = iprot.readString();
        struct.setReasonIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map84 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.parameterMap = new HashMap<String,String>(2*_map84.size);
          for (int _i85 = 0; _i85 < _map84.size; ++_i85)
          {
            String _key86;
            String _val87;
            _key86 = iprot.readString();
            _val87 = iprot.readString();
            struct.parameterMap.put(_key86, _val87);
          }
        }
        struct.setParameterMapIsSet(true);
      }
    }
  }

}

