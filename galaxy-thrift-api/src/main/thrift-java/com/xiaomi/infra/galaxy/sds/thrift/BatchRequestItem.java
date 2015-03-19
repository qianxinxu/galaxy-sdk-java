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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-19")
public class BatchRequestItem implements libthrift091.TBase<BatchRequestItem, BatchRequestItem._Fields>, java.io.Serializable, Cloneable, Comparable<BatchRequestItem> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("BatchRequestItem");

  private static final libthrift091.protocol.TField ACTION_FIELD_DESC = new libthrift091.protocol.TField("action", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField REQUEST_FIELD_DESC = new libthrift091.protocol.TField("request", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BatchRequestItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BatchRequestItemTupleSchemeFactory());
  }

  /**
   * 
   * @see BatchOp
   */
  public BatchOp action; // optional
  public Request request; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 
     * @see BatchOp
     */
    ACTION((short)1, "action"),
    REQUEST((short)2, "request");

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
        case 1: // ACTION
          return ACTION;
        case 2: // REQUEST
          return REQUEST;
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
  private static final _Fields optionals[] = {_Fields.ACTION,_Fields.REQUEST};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION, new libthrift091.meta_data.FieldMetaData("action", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, BatchOp.class)));
    tmpMap.put(_Fields.REQUEST, new libthrift091.meta_data.FieldMetaData("request", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Request.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(BatchRequestItem.class, metaDataMap);
  }

  public BatchRequestItem() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BatchRequestItem(BatchRequestItem other) {
    if (other.isSetAction()) {
      this.action = other.action;
    }
    if (other.isSetRequest()) {
      this.request = new Request(other.request);
    }
  }

  public BatchRequestItem deepCopy() {
    return new BatchRequestItem(this);
  }

  @Override
  public void clear() {
    this.action = null;
    this.request = null;
  }

  /**
   * 
   * @see BatchOp
   */
  public BatchOp getAction() {
    return this.action;
  }

  /**
   * 
   * @see BatchOp
   */
  public BatchRequestItem setAction(BatchOp action) {
    this.action = action;
    return this;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public Request getRequest() {
    return this.request;
  }

  public BatchRequestItem setRequest(Request request) {
    this.request = request;
    return this;
  }

  public void unsetRequest() {
    this.request = null;
  }

  /** Returns true if field request is set (has been assigned a value) and false otherwise */
  public boolean isSetRequest() {
    return this.request != null;
  }

  public void setRequestIsSet(boolean value) {
    if (!value) {
      this.request = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((BatchOp)value);
      }
      break;

    case REQUEST:
      if (value == null) {
        unsetRequest();
      } else {
        setRequest((Request)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION:
      return getAction();

    case REQUEST:
      return getRequest();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION:
      return isSetAction();
    case REQUEST:
      return isSetRequest();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BatchRequestItem)
      return this.equals((BatchRequestItem)that);
    return false;
  }

  public boolean equals(BatchRequestItem that) {
    if (that == null)
      return false;

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_request = true && this.isSetRequest();
    boolean that_present_request = true && that.isSetRequest();
    if (this_present_request || that_present_request) {
      if (!(this_present_request && that_present_request))
        return false;
      if (!this.request.equals(that.request))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_action = true && (isSetAction());
    list.add(present_action);
    if (present_action)
      list.add(action.getValue());

    boolean present_request = true && (isSetRequest());
    list.add(present_request);
    if (present_request)
      list.add(request);

    return list.hashCode();
  }

  @Override
  public int compareTo(BatchRequestItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.action, other.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequest()).compareTo(other.isSetRequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequest()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.request, other.request);
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
    StringBuilder sb = new StringBuilder("BatchRequestItem(");
    boolean first = true;

    if (isSetAction()) {
      sb.append("action:");
      if (this.action == null) {
        sb.append("null");
      } else {
        sb.append(this.action);
      }
      first = false;
    }
    if (isSetRequest()) {
      if (!first) sb.append(", ");
      sb.append("request:");
      if (this.request == null) {
        sb.append("null");
      } else {
        sb.append(this.request);
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

  private static class BatchRequestItemStandardSchemeFactory implements SchemeFactory {
    public BatchRequestItemStandardScheme getScheme() {
      return new BatchRequestItemStandardScheme();
    }
  }

  private static class BatchRequestItemStandardScheme extends StandardScheme<BatchRequestItem> {

    public void read(libthrift091.protocol.TProtocol iprot, BatchRequestItem struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.action = com.xiaomi.infra.galaxy.sds.thrift.BatchOp.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUEST
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.request = new Request();
              struct.request.read(iprot);
              struct.setRequestIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, BatchRequestItem struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action != null) {
        if (struct.isSetAction()) {
          oprot.writeFieldBegin(ACTION_FIELD_DESC);
          oprot.writeI32(struct.action.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.request != null) {
        if (struct.isSetRequest()) {
          oprot.writeFieldBegin(REQUEST_FIELD_DESC);
          struct.request.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BatchRequestItemTupleSchemeFactory implements SchemeFactory {
    public BatchRequestItemTupleScheme getScheme() {
      return new BatchRequestItemTupleScheme();
    }
  }

  private static class BatchRequestItemTupleScheme extends TupleScheme<BatchRequestItem> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, BatchRequestItem struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAction()) {
        optionals.set(0);
      }
      if (struct.isSetRequest()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAction()) {
        oprot.writeI32(struct.action.getValue());
      }
      if (struct.isSetRequest()) {
        struct.request.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, BatchRequestItem struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.action = com.xiaomi.infra.galaxy.sds.thrift.BatchOp.findByValue(iprot.readI32());
        struct.setActionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.request = new Request();
        struct.request.read(iprot);
        struct.setRequestIsSet(true);
      }
    }
  }

}

