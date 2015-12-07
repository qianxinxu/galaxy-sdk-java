/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-7")
public class ListPermissionRequest implements libthrift091.TBase<ListPermissionRequest, ListPermissionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ListPermissionRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListPermissionRequest");

  private static final libthrift091.protocol.TField TOPIC_INFO_FIELD_DESC = new libthrift091.protocol.TField("topicInfo", libthrift091.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListPermissionRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListPermissionRequestTupleSchemeFactory());
  }

  /**
   * Topic info for which to list permission;
   * 
   */
  public TopicInfo topicInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Topic info for which to list permission;
     * 
     */
    TOPIC_INFO((short)1, "topicInfo");

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
        case 1: // TOPIC_INFO
          return TOPIC_INFO;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_INFO, new libthrift091.meta_data.FieldMetaData("topicInfo", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListPermissionRequest.class, metaDataMap);
  }

  public ListPermissionRequest() {
  }

  public ListPermissionRequest(
    TopicInfo topicInfo)
  {
    this();
    this.topicInfo = topicInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListPermissionRequest(ListPermissionRequest other) {
    if (other.isSetTopicInfo()) {
      this.topicInfo = new TopicInfo(other.topicInfo);
    }
  }

  public ListPermissionRequest deepCopy() {
    return new ListPermissionRequest(this);
  }

  @Override
  public void clear() {
    this.topicInfo = null;
  }

  /**
   * Topic info for which to list permission;
   * 
   */
  public TopicInfo getTopicInfo() {
    return this.topicInfo;
  }

  /**
   * Topic info for which to list permission;
   * 
   */
  public ListPermissionRequest setTopicInfo(TopicInfo topicInfo) {
    this.topicInfo = topicInfo;
    return this;
  }

  public void unsetTopicInfo() {
    this.topicInfo = null;
  }

  /** Returns true if field topicInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicInfo() {
    return this.topicInfo != null;
  }

  public void setTopicInfoIsSet(boolean value) {
    if (!value) {
      this.topicInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_INFO:
      if (value == null) {
        unsetTopicInfo();
      } else {
        setTopicInfo((TopicInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_INFO:
      return getTopicInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_INFO:
      return isSetTopicInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListPermissionRequest)
      return this.equals((ListPermissionRequest)that);
    return false;
  }

  public boolean equals(ListPermissionRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicInfo = true && this.isSetTopicInfo();
    boolean that_present_topicInfo = true && that.isSetTopicInfo();
    if (this_present_topicInfo || that_present_topicInfo) {
      if (!(this_present_topicInfo && that_present_topicInfo))
        return false;
      if (!this.topicInfo.equals(that.topicInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicInfo = true && (isSetTopicInfo());
    list.add(present_topicInfo);
    if (present_topicInfo)
      list.add(topicInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListPermissionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicInfo()).compareTo(other.isSetTopicInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicInfo()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicInfo, other.topicInfo);
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
    StringBuilder sb = new StringBuilder("ListPermissionRequest(");
    boolean first = true;

    sb.append("topicInfo:");
    if (this.topicInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.topicInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicInfo == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicInfo' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicInfo != null) {
      topicInfo.validate();
    }
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

  private static class ListPermissionRequestStandardSchemeFactory implements SchemeFactory {
    public ListPermissionRequestStandardScheme getScheme() {
      return new ListPermissionRequestStandardScheme();
    }
  }

  private static class ListPermissionRequestStandardScheme extends StandardScheme<ListPermissionRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, ListPermissionRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_INFO
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicInfo = new TopicInfo();
              struct.topicInfo.read(iprot);
              struct.setTopicInfoIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ListPermissionRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicInfo != null) {
        oprot.writeFieldBegin(TOPIC_INFO_FIELD_DESC);
        struct.topicInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListPermissionRequestTupleSchemeFactory implements SchemeFactory {
    public ListPermissionRequestTupleScheme getScheme() {
      return new ListPermissionRequestTupleScheme();
    }
  }

  private static class ListPermissionRequestTupleScheme extends TupleScheme<ListPermissionRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicInfo.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListPermissionRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicInfo = new TopicInfo();
      struct.topicInfo.read(iprot);
      struct.setTopicInfoIsSet(true);
    }
  }

}

