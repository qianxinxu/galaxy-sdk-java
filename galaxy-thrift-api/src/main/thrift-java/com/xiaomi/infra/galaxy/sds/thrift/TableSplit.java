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
/**
 * 表分片信息，包括起始和结束的row key
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-24")
public class TableSplit implements libthrift091.TBase<TableSplit, TableSplit._Fields>, java.io.Serializable, Cloneable, Comparable<TableSplit> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TableSplit");

  private static final libthrift091.protocol.TField START_KEY_FIELD_DESC = new libthrift091.protocol.TField("startKey", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField STOP_KEY_FIELD_DESC = new libthrift091.protocol.TField("stopKey", libthrift091.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableSplitStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableSplitTupleSchemeFactory());
  }

  public Map<String,Datum> startKey; // optional
  public Map<String,Datum> stopKey; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    START_KEY((short)1, "startKey"),
    STOP_KEY((short)2, "stopKey");

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
        case 1: // START_KEY
          return START_KEY;
        case 2: // STOP_KEY
          return STOP_KEY;
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
  private static final _Fields optionals[] = {_Fields.START_KEY,_Fields.STOP_KEY};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_KEY, new libthrift091.meta_data.FieldMetaData("startKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    tmpMap.put(_Fields.STOP_KEY, new libthrift091.meta_data.FieldMetaData("stopKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TableSplit.class, metaDataMap);
  }

  public TableSplit() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableSplit(TableSplit other) {
    if (other.isSetStartKey()) {
      this.startKey = other.startKey;
    }
    if (other.isSetStopKey()) {
      this.stopKey = other.stopKey;
    }
  }

  public TableSplit deepCopy() {
    return new TableSplit(this);
  }

  @Override
  public void clear() {
    this.startKey = null;
    this.stopKey = null;
  }

  public int getStartKeySize() {
    return (this.startKey == null) ? 0 : this.startKey.size();
  }

  public void putToStartKey(String key, Datum val) {
    if (this.startKey == null) {
      this.startKey = new HashMap<String,Datum>();
    }
    this.startKey.put(key, val);
  }

  public Map<String,Datum> getStartKey() {
    return this.startKey;
  }

  public TableSplit setStartKey(Map<String,Datum> startKey) {
    this.startKey = startKey;
    return this;
  }

  public void unsetStartKey() {
    this.startKey = null;
  }

  /** Returns true if field startKey is set (has been assigned a value) and false otherwise */
  public boolean isSetStartKey() {
    return this.startKey != null;
  }

  public void setStartKeyIsSet(boolean value) {
    if (!value) {
      this.startKey = null;
    }
  }

  public int getStopKeySize() {
    return (this.stopKey == null) ? 0 : this.stopKey.size();
  }

  public void putToStopKey(String key, Datum val) {
    if (this.stopKey == null) {
      this.stopKey = new HashMap<String,Datum>();
    }
    this.stopKey.put(key, val);
  }

  public Map<String,Datum> getStopKey() {
    return this.stopKey;
  }

  public TableSplit setStopKey(Map<String,Datum> stopKey) {
    this.stopKey = stopKey;
    return this;
  }

  public void unsetStopKey() {
    this.stopKey = null;
  }

  /** Returns true if field stopKey is set (has been assigned a value) and false otherwise */
  public boolean isSetStopKey() {
    return this.stopKey != null;
  }

  public void setStopKeyIsSet(boolean value) {
    if (!value) {
      this.stopKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_KEY:
      if (value == null) {
        unsetStartKey();
      } else {
        setStartKey((Map<String,Datum>)value);
      }
      break;

    case STOP_KEY:
      if (value == null) {
        unsetStopKey();
      } else {
        setStopKey((Map<String,Datum>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_KEY:
      return getStartKey();

    case STOP_KEY:
      return getStopKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_KEY:
      return isSetStartKey();
    case STOP_KEY:
      return isSetStopKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableSplit)
      return this.equals((TableSplit)that);
    return false;
  }

  public boolean equals(TableSplit that) {
    if (that == null)
      return false;

    boolean this_present_startKey = true && this.isSetStartKey();
    boolean that_present_startKey = true && that.isSetStartKey();
    if (this_present_startKey || that_present_startKey) {
      if (!(this_present_startKey && that_present_startKey))
        return false;
      if (!this.startKey.equals(that.startKey))
        return false;
    }

    boolean this_present_stopKey = true && this.isSetStopKey();
    boolean that_present_stopKey = true && that.isSetStopKey();
    if (this_present_stopKey || that_present_stopKey) {
      if (!(this_present_stopKey && that_present_stopKey))
        return false;
      if (!this.stopKey.equals(that.stopKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startKey = true && (isSetStartKey());
    list.add(present_startKey);
    if (present_startKey)
      list.add(startKey);

    boolean present_stopKey = true && (isSetStopKey());
    list.add(present_stopKey);
    if (present_stopKey)
      list.add(stopKey);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableSplit other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartKey()).compareTo(other.isSetStartKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startKey, other.startKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStopKey()).compareTo(other.isSetStopKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStopKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.stopKey, other.stopKey);
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
    StringBuilder sb = new StringBuilder("TableSplit(");
    boolean first = true;

    if (isSetStartKey()) {
      sb.append("startKey:");
      if (this.startKey == null) {
        sb.append("null");
      } else {
        sb.append(this.startKey);
      }
      first = false;
    }
    if (isSetStopKey()) {
      if (!first) sb.append(", ");
      sb.append("stopKey:");
      if (this.stopKey == null) {
        sb.append("null");
      } else {
        sb.append(this.stopKey);
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

  private static class TableSplitStandardSchemeFactory implements SchemeFactory {
    public TableSplitStandardScheme getScheme() {
      return new TableSplitStandardScheme();
    }
  }

  private static class TableSplitStandardScheme extends StandardScheme<TableSplit> {

    public void read(libthrift091.protocol.TProtocol iprot, TableSplit struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_KEY
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map134 = iprot.readMapBegin();
                struct.startKey = new HashMap<String,Datum>(2*_map134.size);
                String _key135;
                Datum _val136;
                for (int _i137 = 0; _i137 < _map134.size; ++_i137)
                {
                  _key135 = iprot.readString();
                  _val136 = new Datum();
                  _val136.read(iprot);
                  struct.startKey.put(_key135, _val136);
                }
                iprot.readMapEnd();
              }
              struct.setStartKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STOP_KEY
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map138 = iprot.readMapBegin();
                struct.stopKey = new HashMap<String,Datum>(2*_map138.size);
                String _key139;
                Datum _val140;
                for (int _i141 = 0; _i141 < _map138.size; ++_i141)
                {
                  _key139 = iprot.readString();
                  _val140 = new Datum();
                  _val140.read(iprot);
                  struct.stopKey.put(_key139, _val140);
                }
                iprot.readMapEnd();
              }
              struct.setStopKeyIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TableSplit struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.startKey != null) {
        if (struct.isSetStartKey()) {
          oprot.writeFieldBegin(START_KEY_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.startKey.size()));
            for (Map.Entry<String, Datum> _iter142 : struct.startKey.entrySet())
            {
              oprot.writeString(_iter142.getKey());
              _iter142.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.stopKey != null) {
        if (struct.isSetStopKey()) {
          oprot.writeFieldBegin(STOP_KEY_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.stopKey.size()));
            for (Map.Entry<String, Datum> _iter143 : struct.stopKey.entrySet())
            {
              oprot.writeString(_iter143.getKey());
              _iter143.getValue().write(oprot);
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

  private static class TableSplitTupleSchemeFactory implements SchemeFactory {
    public TableSplitTupleScheme getScheme() {
      return new TableSplitTupleScheme();
    }
  }

  private static class TableSplitTupleScheme extends TupleScheme<TableSplit> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TableSplit struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStartKey()) {
        optionals.set(0);
      }
      if (struct.isSetStopKey()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStartKey()) {
        {
          oprot.writeI32(struct.startKey.size());
          for (Map.Entry<String, Datum> _iter144 : struct.startKey.entrySet())
          {
            oprot.writeString(_iter144.getKey());
            _iter144.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetStopKey()) {
        {
          oprot.writeI32(struct.stopKey.size());
          for (Map.Entry<String, Datum> _iter145 : struct.stopKey.entrySet())
          {
            oprot.writeString(_iter145.getKey());
            _iter145.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TableSplit struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map146 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.startKey = new HashMap<String,Datum>(2*_map146.size);
          String _key147;
          Datum _val148;
          for (int _i149 = 0; _i149 < _map146.size; ++_i149)
          {
            _key147 = iprot.readString();
            _val148 = new Datum();
            _val148.read(iprot);
            struct.startKey.put(_key147, _val148);
          }
        }
        struct.setStartKeyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map150 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.stopKey = new HashMap<String,Datum>(2*_map150.size);
          String _key151;
          Datum _val152;
          for (int _i153 = 0; _i153 < _map150.size; ++_i153)
          {
            _key151 = iprot.readString();
            _val152 = new Datum();
            _val152.read(iprot);
            struct.stopKey.put(_key151, _val152);
          }
        }
        struct.setStopKeyIsSet(true);
      }
    }
  }

}

