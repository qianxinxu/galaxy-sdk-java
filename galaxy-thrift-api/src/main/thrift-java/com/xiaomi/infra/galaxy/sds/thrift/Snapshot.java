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
 * 表快照
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-12-27")
public class Snapshot implements libthrift091.TBase<Snapshot, Snapshot._Fields>, java.io.Serializable, Cloneable, Comparable<Snapshot> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Snapshot");

  private static final libthrift091.protocol.TField SNAPSHOT_NAME_FIELD_DESC = new libthrift091.protocol.TField("snapshotName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SNAPSHOT_STATE_FIELD_DESC = new libthrift091.protocol.TField("snapshotState", libthrift091.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SnapshotStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SnapshotTupleSchemeFactory());
  }

  /**
   * 快照名
   */
  public String snapshotName; // optional
  /**
   * 快照状态
   * 
   * @see com.xiaomi.infra.galaxy.sds.thrift.SnapshotState
   */
  public com.xiaomi.infra.galaxy.sds.thrift.SnapshotState snapshotState; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 快照名
     */
    SNAPSHOT_NAME((short)1, "snapshotName"),
    /**
     * 快照状态
     * 
     * @see com.xiaomi.infra.galaxy.sds.thrift.SnapshotState
     */
    SNAPSHOT_STATE((short)2, "snapshotState");

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
        case 1: // SNAPSHOT_NAME
          return SNAPSHOT_NAME;
        case 2: // SNAPSHOT_STATE
          return SNAPSHOT_STATE;
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
  private static final _Fields optionals[] = {_Fields.SNAPSHOT_NAME,_Fields.SNAPSHOT_STATE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SNAPSHOT_NAME, new libthrift091.meta_data.FieldMetaData("snapshotName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SNAPSHOT_STATE, new libthrift091.meta_data.FieldMetaData("snapshotState", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, com.xiaomi.infra.galaxy.sds.thrift.SnapshotState.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Snapshot.class, metaDataMap);
  }

  public Snapshot() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Snapshot(Snapshot other) {
    if (other.isSetSnapshotName()) {
      this.snapshotName = other.snapshotName;
    }
    if (other.isSetSnapshotState()) {
      this.snapshotState = other.snapshotState;
    }
  }

  public Snapshot deepCopy() {
    return new Snapshot(this);
  }

  @Override
  public void clear() {
    this.snapshotName = null;
    this.snapshotState = null;
  }

  /**
   * 快照名
   */
  public String getSnapshotName() {
    return this.snapshotName;
  }

  /**
   * 快照名
   */
  public Snapshot setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
    return this;
  }

  public void unsetSnapshotName() {
    this.snapshotName = null;
  }

  /** Returns true if field snapshotName is set (has been assigned a value) and false otherwise */
  public boolean isSetSnapshotName() {
    return this.snapshotName != null;
  }

  public void setSnapshotNameIsSet(boolean value) {
    if (!value) {
      this.snapshotName = null;
    }
  }

  /**
   * 快照状态
   * 
   * @see com.xiaomi.infra.galaxy.sds.thrift.SnapshotState
   */
  public com.xiaomi.infra.galaxy.sds.thrift.SnapshotState getSnapshotState() {
    return this.snapshotState;
  }

  /**
   * 快照状态
   * 
   * @see com.xiaomi.infra.galaxy.sds.thrift.SnapshotState
   */
  public Snapshot setSnapshotState(com.xiaomi.infra.galaxy.sds.thrift.SnapshotState snapshotState) {
    this.snapshotState = snapshotState;
    return this;
  }

  public void unsetSnapshotState() {
    this.snapshotState = null;
  }

  /** Returns true if field snapshotState is set (has been assigned a value) and false otherwise */
  public boolean isSetSnapshotState() {
    return this.snapshotState != null;
  }

  public void setSnapshotStateIsSet(boolean value) {
    if (!value) {
      this.snapshotState = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SNAPSHOT_NAME:
      if (value == null) {
        unsetSnapshotName();
      } else {
        setSnapshotName((String)value);
      }
      break;

    case SNAPSHOT_STATE:
      if (value == null) {
        unsetSnapshotState();
      } else {
        setSnapshotState((com.xiaomi.infra.galaxy.sds.thrift.SnapshotState)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SNAPSHOT_NAME:
      return getSnapshotName();

    case SNAPSHOT_STATE:
      return getSnapshotState();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SNAPSHOT_NAME:
      return isSetSnapshotName();
    case SNAPSHOT_STATE:
      return isSetSnapshotState();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Snapshot)
      return this.equals((Snapshot)that);
    return false;
  }

  public boolean equals(Snapshot that) {
    if (that == null)
      return false;

    boolean this_present_snapshotName = true && this.isSetSnapshotName();
    boolean that_present_snapshotName = true && that.isSetSnapshotName();
    if (this_present_snapshotName || that_present_snapshotName) {
      if (!(this_present_snapshotName && that_present_snapshotName))
        return false;
      if (!this.snapshotName.equals(that.snapshotName))
        return false;
    }

    boolean this_present_snapshotState = true && this.isSetSnapshotState();
    boolean that_present_snapshotState = true && that.isSetSnapshotState();
    if (this_present_snapshotState || that_present_snapshotState) {
      if (!(this_present_snapshotState && that_present_snapshotState))
        return false;
      if (!this.snapshotState.equals(that.snapshotState))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_snapshotName = true && (isSetSnapshotName());
    list.add(present_snapshotName);
    if (present_snapshotName)
      list.add(snapshotName);

    boolean present_snapshotState = true && (isSetSnapshotState());
    list.add(present_snapshotState);
    if (present_snapshotState)
      list.add(snapshotState.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(Snapshot other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSnapshotName()).compareTo(other.isSetSnapshotName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnapshotName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.snapshotName, other.snapshotName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSnapshotState()).compareTo(other.isSetSnapshotState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnapshotState()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.snapshotState, other.snapshotState);
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
    StringBuilder sb = new StringBuilder("Snapshot(");
    boolean first = true;

    if (isSetSnapshotName()) {
      sb.append("snapshotName:");
      if (this.snapshotName == null) {
        sb.append("null");
      } else {
        sb.append(this.snapshotName);
      }
      first = false;
    }
    if (isSetSnapshotState()) {
      if (!first) sb.append(", ");
      sb.append("snapshotState:");
      if (this.snapshotState == null) {
        sb.append("null");
      } else {
        sb.append(this.snapshotState);
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

  private static class SnapshotStandardSchemeFactory implements SchemeFactory {
    public SnapshotStandardScheme getScheme() {
      return new SnapshotStandardScheme();
    }
  }

  private static class SnapshotStandardScheme extends StandardScheme<Snapshot> {

    public void read(libthrift091.protocol.TProtocol iprot, Snapshot struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SNAPSHOT_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.snapshotName = iprot.readString();
              struct.setSnapshotNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SNAPSHOT_STATE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.snapshotState = com.xiaomi.infra.galaxy.sds.thrift.SnapshotState.findByValue(iprot.readI32());
              struct.setSnapshotStateIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Snapshot struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.snapshotName != null) {
        if (struct.isSetSnapshotName()) {
          oprot.writeFieldBegin(SNAPSHOT_NAME_FIELD_DESC);
          oprot.writeString(struct.snapshotName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.snapshotState != null) {
        if (struct.isSetSnapshotState()) {
          oprot.writeFieldBegin(SNAPSHOT_STATE_FIELD_DESC);
          oprot.writeI32(struct.snapshotState.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SnapshotTupleSchemeFactory implements SchemeFactory {
    public SnapshotTupleScheme getScheme() {
      return new SnapshotTupleScheme();
    }
  }

  private static class SnapshotTupleScheme extends TupleScheme<Snapshot> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Snapshot struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSnapshotName()) {
        optionals.set(0);
      }
      if (struct.isSetSnapshotState()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSnapshotName()) {
        oprot.writeString(struct.snapshotName);
      }
      if (struct.isSetSnapshotState()) {
        oprot.writeI32(struct.snapshotState.getValue());
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Snapshot struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.snapshotName = iprot.readString();
        struct.setSnapshotNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.snapshotState = com.xiaomi.infra.galaxy.sds.thrift.SnapshotState.findByValue(iprot.readI32());
        struct.setSnapshotStateIsSet(true);
      }
    }
  }

}

