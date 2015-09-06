/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-24")
public class IncrementRequest implements libthrift091.TBase<IncrementRequest, IncrementRequest._Fields>, java.io.Serializable, Cloneable, Comparable<IncrementRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("IncrementRequest");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField KEYS_FIELD_DESC = new libthrift091.protocol.TField("keys", libthrift091.protocol.TType.MAP, (short)2);
  private static final libthrift091.protocol.TField AMOUNTS_FIELD_DESC = new libthrift091.protocol.TField("amounts", libthrift091.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IncrementRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IncrementRequestTupleSchemeFactory());
  }

  public String tableName; // optional
  /**
   * 待自增的记录主键
   */
  public Map<String,Datum> keys; // optional
  /**
   * 需要进行自增操作的属性，必须为整形，且不能为索引属性
   */
  public Map<String,Datum> amounts; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    TABLE_NAME((short)1, "tableName"),
    /**
     * 待自增的记录主键
     */
    KEYS((short)2, "keys"),
    /**
     * 需要进行自增操作的属性，必须为整形，且不能为索引属性
     */
    AMOUNTS((short)3, "amounts");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // KEYS
          return KEYS;
        case 3: // AMOUNTS
          return AMOUNTS;
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
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.KEYS,_Fields.AMOUNTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEYS, new libthrift091.meta_data.FieldMetaData("keys", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.AMOUNTS, new libthrift091.meta_data.FieldMetaData("amounts", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(IncrementRequest.class, metaDataMap);
  }

  public IncrementRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IncrementRequest(IncrementRequest other) {
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetKeys()) {
      this.keys = other.keys;
    }
    if (other.isSetAmounts()) {
      this.amounts = other.amounts;
    }
  }

  public IncrementRequest deepCopy() {
    return new IncrementRequest(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.keys = null;
    this.amounts = null;
  }

  public String getTableName() {
    return this.tableName;
  }

  public IncrementRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public void putToKeys(String key, Datum val) {
    if (this.keys == null) {
      this.keys = new HashMap<String,Datum>();
    }
    this.keys.put(key, val);
  }

  /**
   * 待自增的记录主键
   */
  public Map<String,Datum> getKeys() {
    return this.keys;
  }

  /**
   * 待自增的记录主键
   */
  public IncrementRequest setKeys(Map<String,Datum> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been assigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  public int getAmountsSize() {
    return (this.amounts == null) ? 0 : this.amounts.size();
  }

  public void putToAmounts(String key, Datum val) {
    if (this.amounts == null) {
      this.amounts = new HashMap<String,Datum>();
    }
    this.amounts.put(key, val);
  }

  /**
   * 需要进行自增操作的属性，必须为整形，且不能为索引属性
   */
  public Map<String,Datum> getAmounts() {
    return this.amounts;
  }

  /**
   * 需要进行自增操作的属性，必须为整形，且不能为索引属性
   */
  public IncrementRequest setAmounts(Map<String,Datum> amounts) {
    this.amounts = amounts;
    return this;
  }

  public void unsetAmounts() {
    this.amounts = null;
  }

  /** Returns true if field amounts is set (has been assigned a value) and false otherwise */
  public boolean isSetAmounts() {
    return this.amounts != null;
  }

  public void setAmountsIsSet(boolean value) {
    if (!value) {
      this.amounts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((Map<String,Datum>)value);
      }
      break;

    case AMOUNTS:
      if (value == null) {
        unsetAmounts();
      } else {
        setAmounts((Map<String,Datum>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case KEYS:
      return getKeys();

    case AMOUNTS:
      return getAmounts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case KEYS:
      return isSetKeys();
    case AMOUNTS:
      return isSetAmounts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IncrementRequest)
      return this.equals((IncrementRequest)that);
    return false;
  }

  public boolean equals(IncrementRequest that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
        return false;
    }

    boolean this_present_amounts = true && this.isSetAmounts();
    boolean that_present_amounts = true && that.isSetAmounts();
    if (this_present_amounts || that_present_amounts) {
      if (!(this_present_amounts && that_present_amounts))
        return false;
      if (!this.amounts.equals(that.amounts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_keys = true && (isSetKeys());
    list.add(present_keys);
    if (present_keys)
      list.add(keys);

    boolean present_amounts = true && (isSetAmounts());
    list.add(present_amounts);
    if (present_amounts)
      list.add(amounts);

    return list.hashCode();
  }

  @Override
  public int compareTo(IncrementRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.keys, other.keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmounts()).compareTo(other.isSetAmounts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmounts()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.amounts, other.amounts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("IncrementRequest(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetKeys()) {
      if (!first) sb.append(", ");
      sb.append("keys:");
      if (this.keys == null) {
        sb.append("null");
      } else {
        sb.append(this.keys);
      }
      first = false;
    }
    if (isSetAmounts()) {
      if (!first) sb.append(", ");
      sb.append("amounts:");
      if (this.amounts == null) {
        sb.append("null");
      } else {
        sb.append(this.amounts);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IncrementRequestStandardSchemeFactory implements SchemeFactory {
    public IncrementRequestStandardScheme getScheme() {
      return new IncrementRequestStandardScheme();
    }
  }

  private static class IncrementRequestStandardScheme extends StandardScheme<IncrementRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, IncrementRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEYS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map192 = iprot.readMapBegin();
                struct.keys = new HashMap<String,Datum>(2*_map192.size);
                String _key193;
                Datum _val194;
                for (int _i195 = 0; _i195 < _map192.size; ++_i195)
                {
                  _key193 = iprot.readString();
                  _val194 = new Datum();
                  _val194.read(iprot);
                  struct.keys.put(_key193, _val194);
                }
                iprot.readMapEnd();
              }
              struct.setKeysIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AMOUNTS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map196 = iprot.readMapBegin();
                struct.amounts = new HashMap<String,Datum>(2*_map196.size);
                String _key197;
                Datum _val198;
                for (int _i199 = 0; _i199 < _map196.size; ++_i199)
                {
                  _key197 = iprot.readString();
                  _val198 = new Datum();
                  _val198.read(iprot);
                  struct.amounts.put(_key197, _val198);
                }
                iprot.readMapEnd();
              }
              struct.setAmountsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, IncrementRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.keys != null) {
        if (struct.isSetKeys()) {
          oprot.writeFieldBegin(KEYS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.keys.size()));
            for (Map.Entry<String, Datum> _iter200 : struct.keys.entrySet())
            {
              oprot.writeString(_iter200.getKey());
              _iter200.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.amounts != null) {
        if (struct.isSetAmounts()) {
          oprot.writeFieldBegin(AMOUNTS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.amounts.size()));
            for (Map.Entry<String, Datum> _iter201 : struct.amounts.entrySet())
            {
              oprot.writeString(_iter201.getKey());
              _iter201.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IncrementRequestTupleSchemeFactory implements SchemeFactory {
    public IncrementRequestTupleScheme getScheme() {
      return new IncrementRequestTupleScheme();
    }
  }

  private static class IncrementRequestTupleScheme extends TupleScheme<IncrementRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, IncrementRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetKeys()) {
        optionals.set(1);
      }
      if (struct.isSetAmounts()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetKeys()) {
        {
          oprot.writeI32(struct.keys.size());
          for (Map.Entry<String, Datum> _iter202 : struct.keys.entrySet())
          {
            oprot.writeString(_iter202.getKey());
            _iter202.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetAmounts()) {
        {
          oprot.writeI32(struct.amounts.size());
          for (Map.Entry<String, Datum> _iter203 : struct.amounts.entrySet())
          {
            oprot.writeString(_iter203.getKey());
            _iter203.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, IncrementRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map204 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.keys = new HashMap<String,Datum>(2*_map204.size);
          String _key205;
          Datum _val206;
          for (int _i207 = 0; _i207 < _map204.size; ++_i207)
          {
            _key205 = iprot.readString();
            _val206 = new Datum();
            _val206.read(iprot);
            struct.keys.put(_key205, _val206);
          }
        }
        struct.setKeysIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map208 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.amounts = new HashMap<String,Datum>(2*_map208.size);
          String _key209;
          Datum _val210;
          for (int _i211 = 0; _i211 < _map208.size; ++_i211)
          {
            _key209 = iprot.readString();
            _val210 = new Datum();
            _val210.read(iprot);
            struct.amounts.put(_key209, _val210);
          }
        }
        struct.setAmountsIsSet(true);
      }
    }
  }

}

