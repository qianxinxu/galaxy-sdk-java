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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-12-27")
public class KeysOnlyEntry implements libthrift091.TBase<KeysOnlyEntry, KeysOnlyEntry._Fields>, java.io.Serializable, Cloneable, Comparable<KeysOnlyEntry> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("KeysOnlyEntry");

  private static final libthrift091.protocol.TField RECORD_FIELD_DESC = new libthrift091.protocol.TField("record", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("timestamp", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new KeysOnlyEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new KeysOnlyEntryTupleSchemeFactory());
  }

  /**
   * row key
   */
  public Map<String,Datum> record; // optional
  /**
   * record mutated timestamp
   */
  public long timestamp; // optional
  /**
   * sds tableName
   */
  public String tableName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * row key
     */
    RECORD((short)1, "record"),
    /**
     * record mutated timestamp
     */
    TIMESTAMP((short)2, "timestamp"),
    /**
     * sds tableName
     */
    TABLE_NAME((short)3, "tableName");

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
        case 1: // RECORD
          return RECORD;
        case 2: // TIMESTAMP
          return TIMESTAMP;
        case 3: // TABLE_NAME
          return TABLE_NAME;
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
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RECORD,_Fields.TIMESTAMP,_Fields.TABLE_NAME};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECORD, new libthrift091.meta_data.FieldMetaData("record", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.TIMESTAMP, new libthrift091.meta_data.FieldMetaData("timestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(KeysOnlyEntry.class, metaDataMap);
  }

  public KeysOnlyEntry() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeysOnlyEntry(KeysOnlyEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRecord()) {
      this.record = other.record;
    }
    this.timestamp = other.timestamp;
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
  }

  public KeysOnlyEntry deepCopy() {
    return new KeysOnlyEntry(this);
  }

  @Override
  public void clear() {
    this.record = null;
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.tableName = null;
  }

  public int getRecordSize() {
    return (this.record == null) ? 0 : this.record.size();
  }

  public void putToRecord(String key, Datum val) {
    if (this.record == null) {
      this.record = new HashMap<String,Datum>();
    }
    this.record.put(key, val);
  }

  /**
   * row key
   */
  public Map<String,Datum> getRecord() {
    return this.record;
  }

  /**
   * row key
   */
  public KeysOnlyEntry setRecord(Map<String,Datum> record) {
    this.record = record;
    return this;
  }

  public void unsetRecord() {
    this.record = null;
  }

  /** Returns true if field record is set (has been assigned a value) and false otherwise */
  public boolean isSetRecord() {
    return this.record != null;
  }

  public void setRecordIsSet(boolean value) {
    if (!value) {
      this.record = null;
    }
  }

  /**
   * record mutated timestamp
   */
  public long getTimestamp() {
    return this.timestamp;
  }

  /**
   * record mutated timestamp
   */
  public KeysOnlyEntry setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  /**
   * sds tableName
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * sds tableName
   */
  public KeysOnlyEntry setTableName(String tableName) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECORD:
      if (value == null) {
        unsetRecord();
      } else {
        setRecord((Map<String,Datum>)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECORD:
      return getRecord();

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    case TABLE_NAME:
      return getTableName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECORD:
      return isSetRecord();
    case TIMESTAMP:
      return isSetTimestamp();
    case TABLE_NAME:
      return isSetTableName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof KeysOnlyEntry)
      return this.equals((KeysOnlyEntry)that);
    return false;
  }

  public boolean equals(KeysOnlyEntry that) {
    if (that == null)
      return false;

    boolean this_present_record = true && this.isSetRecord();
    boolean that_present_record = true && that.isSetRecord();
    if (this_present_record || that_present_record) {
      if (!(this_present_record && that_present_record))
        return false;
      if (!this.record.equals(that.record))
        return false;
    }

    boolean this_present_timestamp = true && this.isSetTimestamp();
    boolean that_present_timestamp = true && that.isSetTimestamp();
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_record = true && (isSetRecord());
    list.add(present_record);
    if (present_record)
      list.add(record);

    boolean present_timestamp = true && (isSetTimestamp());
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    return list.hashCode();
  }

  @Override
  public int compareTo(KeysOnlyEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRecord()).compareTo(other.isSetRecord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecord()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.record, other.record);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("KeysOnlyEntry(");
    boolean first = true;

    if (isSetRecord()) {
      sb.append("record:");
      if (this.record == null) {
        sb.append("null");
      } else {
        sb.append(this.record);
      }
      first = false;
    }
    if (isSetTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("timestamp:");
      sb.append(this.timestamp);
      first = false;
    }
    if (isSetTableName()) {
      if (!first) sb.append(", ");
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class KeysOnlyEntryStandardSchemeFactory implements SchemeFactory {
    public KeysOnlyEntryStandardScheme getScheme() {
      return new KeysOnlyEntryStandardScheme();
    }
  }

  private static class KeysOnlyEntryStandardScheme extends StandardScheme<KeysOnlyEntry> {

    public void read(libthrift091.protocol.TProtocol iprot, KeysOnlyEntry struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECORD
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map432 = iprot.readMapBegin();
                struct.record = new HashMap<String,Datum>(2*_map432.size);
                String _key433;
                Datum _val434;
                for (int _i435 = 0; _i435 < _map432.size; ++_i435)
                {
                  _key433 = iprot.readString();
                  _val434 = new Datum();
                  _val434.read(iprot);
                  struct.record.put(_key433, _val434);
                }
                iprot.readMapEnd();
              }
              struct.setRecordIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, KeysOnlyEntry struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.record != null) {
        if (struct.isSetRecord()) {
          oprot.writeFieldBegin(RECORD_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.record.size()));
            for (Map.Entry<String, Datum> _iter436 : struct.record.entrySet())
            {
              oprot.writeString(_iter436.getKey());
              _iter436.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimestamp()) {
        oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.timestamp);
        oprot.writeFieldEnd();
      }
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeysOnlyEntryTupleSchemeFactory implements SchemeFactory {
    public KeysOnlyEntryTupleScheme getScheme() {
      return new KeysOnlyEntryTupleScheme();
    }
  }

  private static class KeysOnlyEntryTupleScheme extends TupleScheme<KeysOnlyEntry> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, KeysOnlyEntry struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRecord()) {
        optionals.set(0);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(1);
      }
      if (struct.isSetTableName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRecord()) {
        {
          oprot.writeI32(struct.record.size());
          for (Map.Entry<String, Datum> _iter437 : struct.record.entrySet())
          {
            oprot.writeString(_iter437.getKey());
            _iter437.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, KeysOnlyEntry struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map438 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.record = new HashMap<String,Datum>(2*_map438.size);
          String _key439;
          Datum _val440;
          for (int _i441 = 0; _i441 < _map438.size; ++_i441)
          {
            _key439 = iprot.readString();
            _val440 = new Datum();
            _val440.read(iprot);
            struct.record.put(_key439, _val440);
          }
        }
        struct.setRecordIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
    }
  }

}

