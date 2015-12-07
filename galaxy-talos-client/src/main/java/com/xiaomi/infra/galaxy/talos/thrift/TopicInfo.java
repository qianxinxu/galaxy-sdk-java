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
public class TopicInfo implements libthrift091.TBase<TopicInfo, TopicInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TopicInfo> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TopicInfo");

  private static final libthrift091.protocol.TField TOPIC_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicTalosResourceName", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField OWNER_ID_FIELD_DESC = new libthrift091.protocol.TField("ownerId", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TopicInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TopicInfoTupleSchemeFactory());
  }

  /**
   * The name for the topic;
   * 
   */
  public String topicName; // required
  /**
   * The Talos Resource Name for the topic;
   * 
   */
  public TopicTalosResourceName topicTalosResourceName; // required
  /**
   * The ownerId for the toic;
   * 
   */
  public String ownerId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The name for the topic;
     * 
     */
    TOPIC_NAME((short)1, "topicName"),
    /**
     * The Talos Resource Name for the topic;
     * 
     */
    TOPIC_TALOS_RESOURCE_NAME((short)2, "topicTalosResourceName"),
    /**
     * The ownerId for the toic;
     * 
     */
    OWNER_ID((short)3, "ownerId");

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
        case 1: // TOPIC_NAME
          return TOPIC_NAME;
        case 2: // TOPIC_TALOS_RESOURCE_NAME
          return TOPIC_TALOS_RESOURCE_NAME;
        case 3: // OWNER_ID
          return OWNER_ID;
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
    tmpMap.put(_Fields.TOPIC_NAME, new libthrift091.meta_data.FieldMetaData("topicName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOPIC_TALOS_RESOURCE_NAME, new libthrift091.meta_data.FieldMetaData("topicTalosResourceName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicTalosResourceName.class)));
    tmpMap.put(_Fields.OWNER_ID, new libthrift091.meta_data.FieldMetaData("ownerId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TopicInfo.class, metaDataMap);
  }

  public TopicInfo() {
  }

  public TopicInfo(
    String topicName,
    TopicTalosResourceName topicTalosResourceName,
    String ownerId)
  {
    this();
    this.topicName = topicName;
    this.topicTalosResourceName = topicTalosResourceName;
    this.ownerId = ownerId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopicInfo(TopicInfo other) {
    if (other.isSetTopicName()) {
      this.topicName = other.topicName;
    }
    if (other.isSetTopicTalosResourceName()) {
      this.topicTalosResourceName = new TopicTalosResourceName(other.topicTalosResourceName);
    }
    if (other.isSetOwnerId()) {
      this.ownerId = other.ownerId;
    }
  }

  public TopicInfo deepCopy() {
    return new TopicInfo(this);
  }

  @Override
  public void clear() {
    this.topicName = null;
    this.topicTalosResourceName = null;
    this.ownerId = null;
  }

  /**
   * The name for the topic;
   * 
   */
  public String getTopicName() {
    return this.topicName;
  }

  /**
   * The name for the topic;
   * 
   */
  public TopicInfo setTopicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  public void unsetTopicName() {
    this.topicName = null;
  }

  /** Returns true if field topicName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicName() {
    return this.topicName != null;
  }

  public void setTopicNameIsSet(boolean value) {
    if (!value) {
      this.topicName = null;
    }
  }

  /**
   * The Talos Resource Name for the topic;
   * 
   */
  public TopicTalosResourceName getTopicTalosResourceName() {
    return this.topicTalosResourceName;
  }

  /**
   * The Talos Resource Name for the topic;
   * 
   */
  public TopicInfo setTopicTalosResourceName(TopicTalosResourceName topicTalosResourceName) {
    this.topicTalosResourceName = topicTalosResourceName;
    return this;
  }

  public void unsetTopicTalosResourceName() {
    this.topicTalosResourceName = null;
  }

  /** Returns true if field topicTalosResourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicTalosResourceName() {
    return this.topicTalosResourceName != null;
  }

  public void setTopicTalosResourceNameIsSet(boolean value) {
    if (!value) {
      this.topicTalosResourceName = null;
    }
  }

  /**
   * The ownerId for the toic;
   * 
   */
  public String getOwnerId() {
    return this.ownerId;
  }

  /**
   * The ownerId for the toic;
   * 
   */
  public TopicInfo setOwnerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  public void unsetOwnerId() {
    this.ownerId = null;
  }

  /** Returns true if field ownerId is set (has been assigned a value) and false otherwise */
  public boolean isSetOwnerId() {
    return this.ownerId != null;
  }

  public void setOwnerIdIsSet(boolean value) {
    if (!value) {
      this.ownerId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_NAME:
      if (value == null) {
        unsetTopicName();
      } else {
        setTopicName((String)value);
      }
      break;

    case TOPIC_TALOS_RESOURCE_NAME:
      if (value == null) {
        unsetTopicTalosResourceName();
      } else {
        setTopicTalosResourceName((TopicTalosResourceName)value);
      }
      break;

    case OWNER_ID:
      if (value == null) {
        unsetOwnerId();
      } else {
        setOwnerId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_NAME:
      return getTopicName();

    case TOPIC_TALOS_RESOURCE_NAME:
      return getTopicTalosResourceName();

    case OWNER_ID:
      return getOwnerId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_NAME:
      return isSetTopicName();
    case TOPIC_TALOS_RESOURCE_NAME:
      return isSetTopicTalosResourceName();
    case OWNER_ID:
      return isSetOwnerId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopicInfo)
      return this.equals((TopicInfo)that);
    return false;
  }

  public boolean equals(TopicInfo that) {
    if (that == null)
      return false;

    boolean this_present_topicName = true && this.isSetTopicName();
    boolean that_present_topicName = true && that.isSetTopicName();
    if (this_present_topicName || that_present_topicName) {
      if (!(this_present_topicName && that_present_topicName))
        return false;
      if (!this.topicName.equals(that.topicName))
        return false;
    }

    boolean this_present_topicTalosResourceName = true && this.isSetTopicTalosResourceName();
    boolean that_present_topicTalosResourceName = true && that.isSetTopicTalosResourceName();
    if (this_present_topicTalosResourceName || that_present_topicTalosResourceName) {
      if (!(this_present_topicTalosResourceName && that_present_topicTalosResourceName))
        return false;
      if (!this.topicTalosResourceName.equals(that.topicTalosResourceName))
        return false;
    }

    boolean this_present_ownerId = true && this.isSetOwnerId();
    boolean that_present_ownerId = true && that.isSetOwnerId();
    if (this_present_ownerId || that_present_ownerId) {
      if (!(this_present_ownerId && that_present_ownerId))
        return false;
      if (!this.ownerId.equals(that.ownerId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicName = true && (isSetTopicName());
    list.add(present_topicName);
    if (present_topicName)
      list.add(topicName);

    boolean present_topicTalosResourceName = true && (isSetTopicTalosResourceName());
    list.add(present_topicTalosResourceName);
    if (present_topicTalosResourceName)
      list.add(topicTalosResourceName);

    boolean present_ownerId = true && (isSetOwnerId());
    list.add(present_ownerId);
    if (present_ownerId)
      list.add(ownerId);

    return list.hashCode();
  }

  @Override
  public int compareTo(TopicInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicName()).compareTo(other.isSetTopicName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicName, other.topicName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicTalosResourceName()).compareTo(other.isSetTopicTalosResourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicTalosResourceName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicTalosResourceName, other.topicTalosResourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOwnerId()).compareTo(other.isSetOwnerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnerId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.ownerId, other.ownerId);
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
    StringBuilder sb = new StringBuilder("TopicInfo(");
    boolean first = true;

    sb.append("topicName:");
    if (this.topicName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicTalosResourceName:");
    if (this.topicTalosResourceName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicTalosResourceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ownerId:");
    if (this.ownerId == null) {
      sb.append("null");
    } else {
      sb.append(this.ownerId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicName' was not present! Struct: " + toString());
    }
    if (topicTalosResourceName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicTalosResourceName' was not present! Struct: " + toString());
    }
    if (ownerId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'ownerId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicTalosResourceName != null) {
      topicTalosResourceName.validate();
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

  private static class TopicInfoStandardSchemeFactory implements SchemeFactory {
    public TopicInfoStandardScheme getScheme() {
      return new TopicInfoStandardScheme();
    }
  }

  private static class TopicInfoStandardScheme extends StandardScheme<TopicInfo> {

    public void read(libthrift091.protocol.TProtocol iprot, TopicInfo struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.topicName = iprot.readString();
              struct.setTopicNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_TALOS_RESOURCE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicTalosResourceName = new TopicTalosResourceName();
              struct.topicTalosResourceName.read(iprot);
              struct.setTopicTalosResourceNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OWNER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.ownerId = iprot.readString();
              struct.setOwnerIdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TopicInfo struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicName != null) {
        oprot.writeFieldBegin(TOPIC_NAME_FIELD_DESC);
        oprot.writeString(struct.topicName);
        oprot.writeFieldEnd();
      }
      if (struct.topicTalosResourceName != null) {
        oprot.writeFieldBegin(TOPIC_TALOS_RESOURCE_NAME_FIELD_DESC);
        struct.topicTalosResourceName.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.ownerId != null) {
        oprot.writeFieldBegin(OWNER_ID_FIELD_DESC);
        oprot.writeString(struct.ownerId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopicInfoTupleSchemeFactory implements SchemeFactory {
    public TopicInfoTupleScheme getScheme() {
      return new TopicInfoTupleScheme();
    }
  }

  private static class TopicInfoTupleScheme extends TupleScheme<TopicInfo> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TopicInfo struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.topicName);
      struct.topicTalosResourceName.write(oprot);
      oprot.writeString(struct.ownerId);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TopicInfo struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicName = iprot.readString();
      struct.setTopicNameIsSet(true);
      struct.topicTalosResourceName = new TopicTalosResourceName();
      struct.topicTalosResourceName.read(iprot);
      struct.setTopicTalosResourceNameIsSet(true);
      struct.ownerId = iprot.readString();
      struct.setOwnerIdIsSet(true);
    }
  }

}

