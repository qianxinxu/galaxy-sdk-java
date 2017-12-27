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
public class ColdStandBy implements libthrift091.TBase<ColdStandBy, ColdStandBy._Fields>, java.io.Serializable, Cloneable, Comparable<ColdStandBy> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ColdStandBy");

  private static final libthrift091.protocol.TField ENABLE_COLD_STAND_BY_FIELD_DESC = new libthrift091.protocol.TField("enableColdStandBy", libthrift091.protocol.TType.BOOL, (short)1);
  private static final libthrift091.protocol.TField COLD_STAND_BY_SIZE_FIELD_DESC = new libthrift091.protocol.TField("coldStandBySize", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField COLD_STAND_BY_CYCLE_FIELD_DESC = new libthrift091.protocol.TField("coldStandByCycle", libthrift091.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ColdStandByStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ColdStandByTupleSchemeFactory());
  }

  public boolean enableColdStandBy; // optional
  public int coldStandBySize; // optional
  /**
   * 
   * @see ColdStandByCycle
   */
  public ColdStandByCycle coldStandByCycle; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    ENABLE_COLD_STAND_BY((short)1, "enableColdStandBy"),
    COLD_STAND_BY_SIZE((short)2, "coldStandBySize"),
    /**
     * 
     * @see ColdStandByCycle
     */
    COLD_STAND_BY_CYCLE((short)3, "coldStandByCycle");

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
        case 1: // ENABLE_COLD_STAND_BY
          return ENABLE_COLD_STAND_BY;
        case 2: // COLD_STAND_BY_SIZE
          return COLD_STAND_BY_SIZE;
        case 3: // COLD_STAND_BY_CYCLE
          return COLD_STAND_BY_CYCLE;
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
  private static final int __ENABLECOLDSTANDBY_ISSET_ID = 0;
  private static final int __COLDSTANDBYSIZE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ENABLE_COLD_STAND_BY,_Fields.COLD_STAND_BY_SIZE,_Fields.COLD_STAND_BY_CYCLE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENABLE_COLD_STAND_BY, new libthrift091.meta_data.FieldMetaData("enableColdStandBy", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COLD_STAND_BY_SIZE, new libthrift091.meta_data.FieldMetaData("coldStandBySize", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.COLD_STAND_BY_CYCLE, new libthrift091.meta_data.FieldMetaData("coldStandByCycle", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, ColdStandByCycle.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ColdStandBy.class, metaDataMap);
  }

  public ColdStandBy() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColdStandBy(ColdStandBy other) {
    __isset_bitfield = other.__isset_bitfield;
    this.enableColdStandBy = other.enableColdStandBy;
    this.coldStandBySize = other.coldStandBySize;
    if (other.isSetColdStandByCycle()) {
      this.coldStandByCycle = other.coldStandByCycle;
    }
  }

  public ColdStandBy deepCopy() {
    return new ColdStandBy(this);
  }

  @Override
  public void clear() {
    setEnableColdStandByIsSet(false);
    this.enableColdStandBy = false;
    setColdStandBySizeIsSet(false);
    this.coldStandBySize = 0;
    this.coldStandByCycle = null;
  }

  public boolean isEnableColdStandBy() {
    return this.enableColdStandBy;
  }

  public ColdStandBy setEnableColdStandBy(boolean enableColdStandBy) {
    this.enableColdStandBy = enableColdStandBy;
    setEnableColdStandByIsSet(true);
    return this;
  }

  public void unsetEnableColdStandBy() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENABLECOLDSTANDBY_ISSET_ID);
  }

  /** Returns true if field enableColdStandBy is set (has been assigned a value) and false otherwise */
  public boolean isSetEnableColdStandBy() {
    return EncodingUtils.testBit(__isset_bitfield, __ENABLECOLDSTANDBY_ISSET_ID);
  }

  public void setEnableColdStandByIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENABLECOLDSTANDBY_ISSET_ID, value);
  }

  public int getColdStandBySize() {
    return this.coldStandBySize;
  }

  public ColdStandBy setColdStandBySize(int coldStandBySize) {
    this.coldStandBySize = coldStandBySize;
    setColdStandBySizeIsSet(true);
    return this;
  }

  public void unsetColdStandBySize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COLDSTANDBYSIZE_ISSET_ID);
  }

  /** Returns true if field coldStandBySize is set (has been assigned a value) and false otherwise */
  public boolean isSetColdStandBySize() {
    return EncodingUtils.testBit(__isset_bitfield, __COLDSTANDBYSIZE_ISSET_ID);
  }

  public void setColdStandBySizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COLDSTANDBYSIZE_ISSET_ID, value);
  }

  /**
   * 
   * @see ColdStandByCycle
   */
  public ColdStandByCycle getColdStandByCycle() {
    return this.coldStandByCycle;
  }

  /**
   * 
   * @see ColdStandByCycle
   */
  public ColdStandBy setColdStandByCycle(ColdStandByCycle coldStandByCycle) {
    this.coldStandByCycle = coldStandByCycle;
    return this;
  }

  public void unsetColdStandByCycle() {
    this.coldStandByCycle = null;
  }

  /** Returns true if field coldStandByCycle is set (has been assigned a value) and false otherwise */
  public boolean isSetColdStandByCycle() {
    return this.coldStandByCycle != null;
  }

  public void setColdStandByCycleIsSet(boolean value) {
    if (!value) {
      this.coldStandByCycle = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENABLE_COLD_STAND_BY:
      if (value == null) {
        unsetEnableColdStandBy();
      } else {
        setEnableColdStandBy((Boolean)value);
      }
      break;

    case COLD_STAND_BY_SIZE:
      if (value == null) {
        unsetColdStandBySize();
      } else {
        setColdStandBySize((Integer)value);
      }
      break;

    case COLD_STAND_BY_CYCLE:
      if (value == null) {
        unsetColdStandByCycle();
      } else {
        setColdStandByCycle((ColdStandByCycle)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENABLE_COLD_STAND_BY:
      return Boolean.valueOf(isEnableColdStandBy());

    case COLD_STAND_BY_SIZE:
      return Integer.valueOf(getColdStandBySize());

    case COLD_STAND_BY_CYCLE:
      return getColdStandByCycle();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENABLE_COLD_STAND_BY:
      return isSetEnableColdStandBy();
    case COLD_STAND_BY_SIZE:
      return isSetColdStandBySize();
    case COLD_STAND_BY_CYCLE:
      return isSetColdStandByCycle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColdStandBy)
      return this.equals((ColdStandBy)that);
    return false;
  }

  public boolean equals(ColdStandBy that) {
    if (that == null)
      return false;

    boolean this_present_enableColdStandBy = true && this.isSetEnableColdStandBy();
    boolean that_present_enableColdStandBy = true && that.isSetEnableColdStandBy();
    if (this_present_enableColdStandBy || that_present_enableColdStandBy) {
      if (!(this_present_enableColdStandBy && that_present_enableColdStandBy))
        return false;
      if (this.enableColdStandBy != that.enableColdStandBy)
        return false;
    }

    boolean this_present_coldStandBySize = true && this.isSetColdStandBySize();
    boolean that_present_coldStandBySize = true && that.isSetColdStandBySize();
    if (this_present_coldStandBySize || that_present_coldStandBySize) {
      if (!(this_present_coldStandBySize && that_present_coldStandBySize))
        return false;
      if (this.coldStandBySize != that.coldStandBySize)
        return false;
    }

    boolean this_present_coldStandByCycle = true && this.isSetColdStandByCycle();
    boolean that_present_coldStandByCycle = true && that.isSetColdStandByCycle();
    if (this_present_coldStandByCycle || that_present_coldStandByCycle) {
      if (!(this_present_coldStandByCycle && that_present_coldStandByCycle))
        return false;
      if (!this.coldStandByCycle.equals(that.coldStandByCycle))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_enableColdStandBy = true && (isSetEnableColdStandBy());
    list.add(present_enableColdStandBy);
    if (present_enableColdStandBy)
      list.add(enableColdStandBy);

    boolean present_coldStandBySize = true && (isSetColdStandBySize());
    list.add(present_coldStandBySize);
    if (present_coldStandBySize)
      list.add(coldStandBySize);

    boolean present_coldStandByCycle = true && (isSetColdStandByCycle());
    list.add(present_coldStandByCycle);
    if (present_coldStandByCycle)
      list.add(coldStandByCycle.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(ColdStandBy other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEnableColdStandBy()).compareTo(other.isSetEnableColdStandBy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnableColdStandBy()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.enableColdStandBy, other.enableColdStandBy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColdStandBySize()).compareTo(other.isSetColdStandBySize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColdStandBySize()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.coldStandBySize, other.coldStandBySize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColdStandByCycle()).compareTo(other.isSetColdStandByCycle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColdStandByCycle()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.coldStandByCycle, other.coldStandByCycle);
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
    StringBuilder sb = new StringBuilder("ColdStandBy(");
    boolean first = true;

    if (isSetEnableColdStandBy()) {
      sb.append("enableColdStandBy:");
      sb.append(this.enableColdStandBy);
      first = false;
    }
    if (isSetColdStandBySize()) {
      if (!first) sb.append(", ");
      sb.append("coldStandBySize:");
      sb.append(this.coldStandBySize);
      first = false;
    }
    if (isSetColdStandByCycle()) {
      if (!first) sb.append(", ");
      sb.append("coldStandByCycle:");
      if (this.coldStandByCycle == null) {
        sb.append("null");
      } else {
        sb.append(this.coldStandByCycle);
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

  private static class ColdStandByStandardSchemeFactory implements SchemeFactory {
    public ColdStandByStandardScheme getScheme() {
      return new ColdStandByStandardScheme();
    }
  }

  private static class ColdStandByStandardScheme extends StandardScheme<ColdStandBy> {

    public void read(libthrift091.protocol.TProtocol iprot, ColdStandBy struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENABLE_COLD_STAND_BY
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.enableColdStandBy = iprot.readBool();
              struct.setEnableColdStandByIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLD_STAND_BY_SIZE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.coldStandBySize = iprot.readI32();
              struct.setColdStandBySizeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLD_STAND_BY_CYCLE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.coldStandByCycle = com.xiaomi.infra.galaxy.sds.thrift.ColdStandByCycle.findByValue(iprot.readI32());
              struct.setColdStandByCycleIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ColdStandBy struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetEnableColdStandBy()) {
        oprot.writeFieldBegin(ENABLE_COLD_STAND_BY_FIELD_DESC);
        oprot.writeBool(struct.enableColdStandBy);
        oprot.writeFieldEnd();
      }
      if (struct.isSetColdStandBySize()) {
        oprot.writeFieldBegin(COLD_STAND_BY_SIZE_FIELD_DESC);
        oprot.writeI32(struct.coldStandBySize);
        oprot.writeFieldEnd();
      }
      if (struct.coldStandByCycle != null) {
        if (struct.isSetColdStandByCycle()) {
          oprot.writeFieldBegin(COLD_STAND_BY_CYCLE_FIELD_DESC);
          oprot.writeI32(struct.coldStandByCycle.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ColdStandByTupleSchemeFactory implements SchemeFactory {
    public ColdStandByTupleScheme getScheme() {
      return new ColdStandByTupleScheme();
    }
  }

  private static class ColdStandByTupleScheme extends TupleScheme<ColdStandBy> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ColdStandBy struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEnableColdStandBy()) {
        optionals.set(0);
      }
      if (struct.isSetColdStandBySize()) {
        optionals.set(1);
      }
      if (struct.isSetColdStandByCycle()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEnableColdStandBy()) {
        oprot.writeBool(struct.enableColdStandBy);
      }
      if (struct.isSetColdStandBySize()) {
        oprot.writeI32(struct.coldStandBySize);
      }
      if (struct.isSetColdStandByCycle()) {
        oprot.writeI32(struct.coldStandByCycle.getValue());
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ColdStandBy struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.enableColdStandBy = iprot.readBool();
        struct.setEnableColdStandByIsSet(true);
      }
      if (incoming.get(1)) {
        struct.coldStandBySize = iprot.readI32();
        struct.setColdStandBySizeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.coldStandByCycle = com.xiaomi.infra.galaxy.sds.thrift.ColdStandByCycle.findByValue(iprot.readI32());
        struct.setColdStandByCycleIsSet(true);
      }
    }
  }

}

