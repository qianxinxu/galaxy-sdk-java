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
 * DATUM_MAP的Datum Map记录定义
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-6")
public class DatumMapRecord implements libthrift091.TBase<DatumMapRecord, DatumMapRecord._Fields>, java.io.Serializable, Cloneable, Comparable<DatumMapRecord> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("DatumMapRecord");

  private static final libthrift091.protocol.TField DATA_FIELD_DESC = new libthrift091.protocol.TField("data", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField KEY_ID_MAP_FIELD_DESC = new libthrift091.protocol.TField("keyIdMap", libthrift091.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DatumMapRecordStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DatumMapRecordTupleSchemeFactory());
  }

  /**
   * 数据部分
   */
  public Map<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum> data; // optional
  /**
   * 属性id -> 属性名映射，
   * 只记录当前未知的属性，即如果文件头或者前面记录已经包含某属性，则此处不再包含，
   * 此特性仅用于支持在创建文件时表schema未知的情况
   */
  public Map<Short,String> keyIdMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 数据部分
     */
    DATA((short)1, "data"),
    /**
     * 属性id -> 属性名映射，
     * 只记录当前未知的属性，即如果文件头或者前面记录已经包含某属性，则此处不再包含，
     * 此特性仅用于支持在创建文件时表schema未知的情况
     */
    KEY_ID_MAP((short)2, "keyIdMap");

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
        case 1: // DATA
          return DATA;
        case 2: // KEY_ID_MAP
          return KEY_ID_MAP;
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
  private static final _Fields optionals[] = {_Fields.DATA,_Fields.KEY_ID_MAP};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA, new libthrift091.meta_data.FieldMetaData("data", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I16), 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.sds.thrift.Datum.class))));
    tmpMap.put(_Fields.KEY_ID_MAP, new libthrift091.meta_data.FieldMetaData("keyIdMap", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I16), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(DatumMapRecord.class, metaDataMap);
  }

  public DatumMapRecord() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DatumMapRecord(DatumMapRecord other) {
    if (other.isSetData()) {
      Map<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum> __this__data = new HashMap<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum>(other.data.size());
      for (Map.Entry<Short, com.xiaomi.infra.galaxy.sds.thrift.Datum> other_element : other.data.entrySet()) {

        Short other_element_key = other_element.getKey();
        com.xiaomi.infra.galaxy.sds.thrift.Datum other_element_value = other_element.getValue();

        Short __this__data_copy_key = other_element_key;

        com.xiaomi.infra.galaxy.sds.thrift.Datum __this__data_copy_value = new com.xiaomi.infra.galaxy.sds.thrift.Datum(other_element_value);

        __this__data.put(__this__data_copy_key, __this__data_copy_value);
      }
      this.data = __this__data;
    }
    if (other.isSetKeyIdMap()) {
      Map<Short,String> __this__keyIdMap = new HashMap<Short,String>(other.keyIdMap);
      this.keyIdMap = __this__keyIdMap;
    }
  }

  public DatumMapRecord deepCopy() {
    return new DatumMapRecord(this);
  }

  @Override
  public void clear() {
    this.data = null;
    this.keyIdMap = null;
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public void putToData(short key, com.xiaomi.infra.galaxy.sds.thrift.Datum val) {
    if (this.data == null) {
      this.data = new HashMap<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum>();
    }
    this.data.put(key, val);
  }

  /**
   * 数据部分
   */
  public Map<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum> getData() {
    return this.data;
  }

  /**
   * 数据部分
   */
  public DatumMapRecord setData(Map<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public int getKeyIdMapSize() {
    return (this.keyIdMap == null) ? 0 : this.keyIdMap.size();
  }

  public void putToKeyIdMap(short key, String val) {
    if (this.keyIdMap == null) {
      this.keyIdMap = new HashMap<Short,String>();
    }
    this.keyIdMap.put(key, val);
  }

  /**
   * 属性id -> 属性名映射，
   * 只记录当前未知的属性，即如果文件头或者前面记录已经包含某属性，则此处不再包含，
   * 此特性仅用于支持在创建文件时表schema未知的情况
   */
  public Map<Short,String> getKeyIdMap() {
    return this.keyIdMap;
  }

  /**
   * 属性id -> 属性名映射，
   * 只记录当前未知的属性，即如果文件头或者前面记录已经包含某属性，则此处不再包含，
   * 此特性仅用于支持在创建文件时表schema未知的情况
   */
  public DatumMapRecord setKeyIdMap(Map<Short,String> keyIdMap) {
    this.keyIdMap = keyIdMap;
    return this;
  }

  public void unsetKeyIdMap() {
    this.keyIdMap = null;
  }

  /** Returns true if field keyIdMap is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyIdMap() {
    return this.keyIdMap != null;
  }

  public void setKeyIdMapIsSet(boolean value) {
    if (!value) {
      this.keyIdMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((Map<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum>)value);
      }
      break;

    case KEY_ID_MAP:
      if (value == null) {
        unsetKeyIdMap();
      } else {
        setKeyIdMap((Map<Short,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA:
      return getData();

    case KEY_ID_MAP:
      return getKeyIdMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA:
      return isSetData();
    case KEY_ID_MAP:
      return isSetKeyIdMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DatumMapRecord)
      return this.equals((DatumMapRecord)that);
    return false;
  }

  public boolean equals(DatumMapRecord that) {
    if (that == null)
      return false;

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_keyIdMap = true && this.isSetKeyIdMap();
    boolean that_present_keyIdMap = true && that.isSetKeyIdMap();
    if (this_present_keyIdMap || that_present_keyIdMap) {
      if (!(this_present_keyIdMap && that_present_keyIdMap))
        return false;
      if (!this.keyIdMap.equals(that.keyIdMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    boolean present_keyIdMap = true && (isSetKeyIdMap());
    list.add(present_keyIdMap);
    if (present_keyIdMap)
      list.add(keyIdMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(DatumMapRecord other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeyIdMap()).compareTo(other.isSetKeyIdMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyIdMap()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.keyIdMap, other.keyIdMap);
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
    StringBuilder sb = new StringBuilder("DatumMapRecord(");
    boolean first = true;

    if (isSetData()) {
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        sb.append(this.data);
      }
      first = false;
    }
    if (isSetKeyIdMap()) {
      if (!first) sb.append(", ");
      sb.append("keyIdMap:");
      if (this.keyIdMap == null) {
        sb.append("null");
      } else {
        sb.append(this.keyIdMap);
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

  private static class DatumMapRecordStandardSchemeFactory implements SchemeFactory {
    public DatumMapRecordStandardScheme getScheme() {
      return new DatumMapRecordStandardScheme();
    }
  }

  private static class DatumMapRecordStandardScheme extends StandardScheme<DatumMapRecord> {

    public void read(libthrift091.protocol.TProtocol iprot, DatumMapRecord struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map36 = iprot.readMapBegin();
                struct.data = new HashMap<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum>(2*_map36.size);
                short _key37;
                com.xiaomi.infra.galaxy.sds.thrift.Datum _val38;
                for (int _i39 = 0; _i39 < _map36.size; ++_i39)
                {
                  _key37 = iprot.readI16();
                  _val38 = new com.xiaomi.infra.galaxy.sds.thrift.Datum();
                  _val38.read(iprot);
                  struct.data.put(_key37, _val38);
                }
                iprot.readMapEnd();
              }
              struct.setDataIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY_ID_MAP
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map40 = iprot.readMapBegin();
                struct.keyIdMap = new HashMap<Short,String>(2*_map40.size);
                short _key41;
                String _val42;
                for (int _i43 = 0; _i43 < _map40.size; ++_i43)
                {
                  _key41 = iprot.readI16();
                  _val42 = iprot.readString();
                  struct.keyIdMap.put(_key41, _val42);
                }
                iprot.readMapEnd();
              }
              struct.setKeyIdMapIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, DatumMapRecord struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.data != null) {
        if (struct.isSetData()) {
          oprot.writeFieldBegin(DATA_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.I16, libthrift091.protocol.TType.STRUCT, struct.data.size()));
            for (Map.Entry<Short, com.xiaomi.infra.galaxy.sds.thrift.Datum> _iter44 : struct.data.entrySet())
            {
              oprot.writeI16(_iter44.getKey());
              _iter44.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.keyIdMap != null) {
        if (struct.isSetKeyIdMap()) {
          oprot.writeFieldBegin(KEY_ID_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.I16, libthrift091.protocol.TType.STRING, struct.keyIdMap.size()));
            for (Map.Entry<Short, String> _iter45 : struct.keyIdMap.entrySet())
            {
              oprot.writeI16(_iter45.getKey());
              oprot.writeString(_iter45.getValue());
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

  private static class DatumMapRecordTupleSchemeFactory implements SchemeFactory {
    public DatumMapRecordTupleScheme getScheme() {
      return new DatumMapRecordTupleScheme();
    }
  }

  private static class DatumMapRecordTupleScheme extends TupleScheme<DatumMapRecord> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, DatumMapRecord struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetData()) {
        optionals.set(0);
      }
      if (struct.isSetKeyIdMap()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (Map.Entry<Short, com.xiaomi.infra.galaxy.sds.thrift.Datum> _iter46 : struct.data.entrySet())
          {
            oprot.writeI16(_iter46.getKey());
            _iter46.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetKeyIdMap()) {
        {
          oprot.writeI32(struct.keyIdMap.size());
          for (Map.Entry<Short, String> _iter47 : struct.keyIdMap.entrySet())
          {
            oprot.writeI16(_iter47.getKey());
            oprot.writeString(_iter47.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, DatumMapRecord struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map48 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.I16, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.data = new HashMap<Short,com.xiaomi.infra.galaxy.sds.thrift.Datum>(2*_map48.size);
          short _key49;
          com.xiaomi.infra.galaxy.sds.thrift.Datum _val50;
          for (int _i51 = 0; _i51 < _map48.size; ++_i51)
          {
            _key49 = iprot.readI16();
            _val50 = new com.xiaomi.infra.galaxy.sds.thrift.Datum();
            _val50.read(iprot);
            struct.data.put(_key49, _val50);
          }
        }
        struct.setDataIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TMap _map52 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.I16, libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.keyIdMap = new HashMap<Short,String>(2*_map52.size);
          short _key53;
          String _val54;
          for (int _i55 = 0; _i55 < _map52.size; ++_i55)
          {
            _key53 = iprot.readI16();
            _val54 = iprot.readString();
            struct.keyIdMap.put(_key53, _val54);
          }
        }
        struct.setKeyIdMapIsSet(true);
      }
    }
  }

}

