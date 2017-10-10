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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-10-10")
public class Message implements libthrift091.TBase<Message, Message._Fields>, java.io.Serializable, Cloneable, Comparable<Message> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Message");

  private static final libthrift091.protocol.TField PARTITION_KEY_FIELD_DESC = new libthrift091.protocol.TField("partitionKey", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SEQUENCE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("sequenceNumber", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField MESSAGE_FIELD_DESC = new libthrift091.protocol.TField("message", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField CREATE_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("createTimestamp", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField APPEND_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("appendTimestamp", libthrift091.protocol.TType.I64, (short)5);
  private static final libthrift091.protocol.TField MESSAGE_TYPE_FIELD_DESC = new libthrift091.protocol.TField("messageType", libthrift091.protocol.TType.I32, (short)6);
  private static final libthrift091.protocol.TField SCHEMA_FINGERPRINT_FIELD_DESC = new libthrift091.protocol.TField("SchemaFingerprint", libthrift091.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageTupleSchemeFactory());
  }

  /**
   * The partitionkey for this message, Talos Producer will use the partitionKey
   * to determine which partition to send;
   * 
   */
  public String partitionKey; // optional
  /**
   * The sequenceNumber is the unique identifier for the message in Talos, user
   * can use this to determine whether the message is repeated when consume;
   * 
   */
  public String sequenceNumber; // optional
  /**
   * the message data, max size is 10MB (1B ~ 10MB);
   * 
   */
  public ByteBuffer message; // required
  /**
   * the create timestamp for this Message, in millis;
   * 
   */
  public long createTimestamp; // optional
  /**
   * the message arrive talos timestamp, im millis;
   * 
   */
  public long appendTimestamp; // optional
  /**
   * The message type for the message filed;
   * 
   * 
   * @see MessageType
   */
  public MessageType messageType; // optional
  /**
   * SchemaFingerprint is a string that uniquely identifiew the original schema
   * for this message;
   * 
   */
  public String SchemaFingerprint; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The partitionkey for this message, Talos Producer will use the partitionKey
     * to determine which partition to send;
     * 
     */
    PARTITION_KEY((short)1, "partitionKey"),
    /**
     * The sequenceNumber is the unique identifier for the message in Talos, user
     * can use this to determine whether the message is repeated when consume;
     * 
     */
    SEQUENCE_NUMBER((short)2, "sequenceNumber"),
    /**
     * the message data, max size is 10MB (1B ~ 10MB);
     * 
     */
    MESSAGE((short)3, "message"),
    /**
     * the create timestamp for this Message, in millis;
     * 
     */
    CREATE_TIMESTAMP((short)4, "createTimestamp"),
    /**
     * the message arrive talos timestamp, im millis;
     * 
     */
    APPEND_TIMESTAMP((short)5, "appendTimestamp"),
    /**
     * The message type for the message filed;
     * 
     * 
     * @see MessageType
     */
    MESSAGE_TYPE((short)6, "messageType"),
    /**
     * SchemaFingerprint is a string that uniquely identifiew the original schema
     * for this message;
     * 
     */
    SCHEMA_FINGERPRINT((short)7, "SchemaFingerprint");

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
        case 1: // PARTITION_KEY
          return PARTITION_KEY;
        case 2: // SEQUENCE_NUMBER
          return SEQUENCE_NUMBER;
        case 3: // MESSAGE
          return MESSAGE;
        case 4: // CREATE_TIMESTAMP
          return CREATE_TIMESTAMP;
        case 5: // APPEND_TIMESTAMP
          return APPEND_TIMESTAMP;
        case 6: // MESSAGE_TYPE
          return MESSAGE_TYPE;
        case 7: // SCHEMA_FINGERPRINT
          return SCHEMA_FINGERPRINT;
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
  private static final int __CREATETIMESTAMP_ISSET_ID = 0;
  private static final int __APPENDTIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARTITION_KEY,_Fields.SEQUENCE_NUMBER,_Fields.CREATE_TIMESTAMP,_Fields.APPEND_TIMESTAMP,_Fields.MESSAGE_TYPE,_Fields.SCHEMA_FINGERPRINT};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_KEY, new libthrift091.meta_data.FieldMetaData("partitionKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEQUENCE_NUMBER, new libthrift091.meta_data.FieldMetaData("sequenceNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new libthrift091.meta_data.FieldMetaData("message", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.CREATE_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("createTimestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.APPEND_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("appendTimestamp", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGE_TYPE, new libthrift091.meta_data.FieldMetaData("messageType", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MessageType.class)));
    tmpMap.put(_Fields.SCHEMA_FINGERPRINT, new libthrift091.meta_data.FieldMetaData("SchemaFingerprint", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Message.class, metaDataMap);
  }

  public Message() {
  }

  public Message(
    ByteBuffer message)
  {
    this();
    this.message = libthrift091.TBaseHelper.copyBinary(message);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Message(Message other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPartitionKey()) {
      this.partitionKey = other.partitionKey;
    }
    if (other.isSetSequenceNumber()) {
      this.sequenceNumber = other.sequenceNumber;
    }
    if (other.isSetMessage()) {
      this.message = libthrift091.TBaseHelper.copyBinary(other.message);
    }
    this.createTimestamp = other.createTimestamp;
    this.appendTimestamp = other.appendTimestamp;
    if (other.isSetMessageType()) {
      this.messageType = other.messageType;
    }
    if (other.isSetSchemaFingerprint()) {
      this.SchemaFingerprint = other.SchemaFingerprint;
    }
  }

  public Message deepCopy() {
    return new Message(this);
  }

  @Override
  public void clear() {
    this.partitionKey = null;
    this.sequenceNumber = null;
    this.message = null;
    setCreateTimestampIsSet(false);
    this.createTimestamp = 0;
    setAppendTimestampIsSet(false);
    this.appendTimestamp = 0;
    this.messageType = null;
    this.SchemaFingerprint = null;
  }

  /**
   * The partitionkey for this message, Talos Producer will use the partitionKey
   * to determine which partition to send;
   * 
   */
  public String getPartitionKey() {
    return this.partitionKey;
  }

  /**
   * The partitionkey for this message, Talos Producer will use the partitionKey
   * to determine which partition to send;
   * 
   */
  public Message setPartitionKey(String partitionKey) {
    this.partitionKey = partitionKey;
    return this;
  }

  public void unsetPartitionKey() {
    this.partitionKey = null;
  }

  /** Returns true if field partitionKey is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionKey() {
    return this.partitionKey != null;
  }

  public void setPartitionKeyIsSet(boolean value) {
    if (!value) {
      this.partitionKey = null;
    }
  }

  /**
   * The sequenceNumber is the unique identifier for the message in Talos, user
   * can use this to determine whether the message is repeated when consume;
   * 
   */
  public String getSequenceNumber() {
    return this.sequenceNumber;
  }

  /**
   * The sequenceNumber is the unique identifier for the message in Talos, user
   * can use this to determine whether the message is repeated when consume;
   * 
   */
  public Message setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  public void unsetSequenceNumber() {
    this.sequenceNumber = null;
  }

  /** Returns true if field sequenceNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceNumber() {
    return this.sequenceNumber != null;
  }

  public void setSequenceNumberIsSet(boolean value) {
    if (!value) {
      this.sequenceNumber = null;
    }
  }

  /**
   * the message data, max size is 10MB (1B ~ 10MB);
   * 
   */
  public byte[] getMessage() {
    setMessage(libthrift091.TBaseHelper.rightSize(message));
    return message == null ? null : message.array();
  }

  public ByteBuffer bufferForMessage() {
    return libthrift091.TBaseHelper.copyBinary(message);
  }

  /**
   * the message data, max size is 10MB (1B ~ 10MB);
   * 
   */
  public Message setMessage(byte[] message) {
    this.message = message == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(message, message.length));
    return this;
  }

  public Message setMessage(ByteBuffer message) {
    this.message = libthrift091.TBaseHelper.copyBinary(message);
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  /**
   * the create timestamp for this Message, in millis;
   * 
   */
  public long getCreateTimestamp() {
    return this.createTimestamp;
  }

  /**
   * the create timestamp for this Message, in millis;
   * 
   */
  public Message setCreateTimestamp(long createTimestamp) {
    this.createTimestamp = createTimestamp;
    setCreateTimestampIsSet(true);
    return this;
  }

  public void unsetCreateTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID);
  }

  /** Returns true if field createTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID);
  }

  public void setCreateTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID, value);
  }

  /**
   * the message arrive talos timestamp, im millis;
   * 
   */
  public long getAppendTimestamp() {
    return this.appendTimestamp;
  }

  /**
   * the message arrive talos timestamp, im millis;
   * 
   */
  public Message setAppendTimestamp(long appendTimestamp) {
    this.appendTimestamp = appendTimestamp;
    setAppendTimestampIsSet(true);
    return this;
  }

  public void unsetAppendTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __APPENDTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field appendTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetAppendTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __APPENDTIMESTAMP_ISSET_ID);
  }

  public void setAppendTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __APPENDTIMESTAMP_ISSET_ID, value);
  }

  /**
   * The message type for the message filed;
   * 
   * 
   * @see MessageType
   */
  public MessageType getMessageType() {
    return this.messageType;
  }

  /**
   * The message type for the message filed;
   * 
   * 
   * @see MessageType
   */
  public Message setMessageType(MessageType messageType) {
    this.messageType = messageType;
    return this;
  }

  public void unsetMessageType() {
    this.messageType = null;
  }

  /** Returns true if field messageType is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageType() {
    return this.messageType != null;
  }

  public void setMessageTypeIsSet(boolean value) {
    if (!value) {
      this.messageType = null;
    }
  }

  /**
   * SchemaFingerprint is a string that uniquely identifiew the original schema
   * for this message;
   * 
   */
  public String getSchemaFingerprint() {
    return this.SchemaFingerprint;
  }

  /**
   * SchemaFingerprint is a string that uniquely identifiew the original schema
   * for this message;
   * 
   */
  public Message setSchemaFingerprint(String SchemaFingerprint) {
    this.SchemaFingerprint = SchemaFingerprint;
    return this;
  }

  public void unsetSchemaFingerprint() {
    this.SchemaFingerprint = null;
  }

  /** Returns true if field SchemaFingerprint is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaFingerprint() {
    return this.SchemaFingerprint != null;
  }

  public void setSchemaFingerprintIsSet(boolean value) {
    if (!value) {
      this.SchemaFingerprint = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_KEY:
      if (value == null) {
        unsetPartitionKey();
      } else {
        setPartitionKey((String)value);
      }
      break;

    case SEQUENCE_NUMBER:
      if (value == null) {
        unsetSequenceNumber();
      } else {
        setSequenceNumber((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((ByteBuffer)value);
      }
      break;

    case CREATE_TIMESTAMP:
      if (value == null) {
        unsetCreateTimestamp();
      } else {
        setCreateTimestamp((Long)value);
      }
      break;

    case APPEND_TIMESTAMP:
      if (value == null) {
        unsetAppendTimestamp();
      } else {
        setAppendTimestamp((Long)value);
      }
      break;

    case MESSAGE_TYPE:
      if (value == null) {
        unsetMessageType();
      } else {
        setMessageType((MessageType)value);
      }
      break;

    case SCHEMA_FINGERPRINT:
      if (value == null) {
        unsetSchemaFingerprint();
      } else {
        setSchemaFingerprint((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_KEY:
      return getPartitionKey();

    case SEQUENCE_NUMBER:
      return getSequenceNumber();

    case MESSAGE:
      return getMessage();

    case CREATE_TIMESTAMP:
      return Long.valueOf(getCreateTimestamp());

    case APPEND_TIMESTAMP:
      return Long.valueOf(getAppendTimestamp());

    case MESSAGE_TYPE:
      return getMessageType();

    case SCHEMA_FINGERPRINT:
      return getSchemaFingerprint();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_KEY:
      return isSetPartitionKey();
    case SEQUENCE_NUMBER:
      return isSetSequenceNumber();
    case MESSAGE:
      return isSetMessage();
    case CREATE_TIMESTAMP:
      return isSetCreateTimestamp();
    case APPEND_TIMESTAMP:
      return isSetAppendTimestamp();
    case MESSAGE_TYPE:
      return isSetMessageType();
    case SCHEMA_FINGERPRINT:
      return isSetSchemaFingerprint();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Message)
      return this.equals((Message)that);
    return false;
  }

  public boolean equals(Message that) {
    if (that == null)
      return false;

    boolean this_present_partitionKey = true && this.isSetPartitionKey();
    boolean that_present_partitionKey = true && that.isSetPartitionKey();
    if (this_present_partitionKey || that_present_partitionKey) {
      if (!(this_present_partitionKey && that_present_partitionKey))
        return false;
      if (!this.partitionKey.equals(that.partitionKey))
        return false;
    }

    boolean this_present_sequenceNumber = true && this.isSetSequenceNumber();
    boolean that_present_sequenceNumber = true && that.isSetSequenceNumber();
    if (this_present_sequenceNumber || that_present_sequenceNumber) {
      if (!(this_present_sequenceNumber && that_present_sequenceNumber))
        return false;
      if (!this.sequenceNumber.equals(that.sequenceNumber))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_createTimestamp = true && this.isSetCreateTimestamp();
    boolean that_present_createTimestamp = true && that.isSetCreateTimestamp();
    if (this_present_createTimestamp || that_present_createTimestamp) {
      if (!(this_present_createTimestamp && that_present_createTimestamp))
        return false;
      if (this.createTimestamp != that.createTimestamp)
        return false;
    }

    boolean this_present_appendTimestamp = true && this.isSetAppendTimestamp();
    boolean that_present_appendTimestamp = true && that.isSetAppendTimestamp();
    if (this_present_appendTimestamp || that_present_appendTimestamp) {
      if (!(this_present_appendTimestamp && that_present_appendTimestamp))
        return false;
      if (this.appendTimestamp != that.appendTimestamp)
        return false;
    }

    boolean this_present_messageType = true && this.isSetMessageType();
    boolean that_present_messageType = true && that.isSetMessageType();
    if (this_present_messageType || that_present_messageType) {
      if (!(this_present_messageType && that_present_messageType))
        return false;
      if (!this.messageType.equals(that.messageType))
        return false;
    }

    boolean this_present_SchemaFingerprint = true && this.isSetSchemaFingerprint();
    boolean that_present_SchemaFingerprint = true && that.isSetSchemaFingerprint();
    if (this_present_SchemaFingerprint || that_present_SchemaFingerprint) {
      if (!(this_present_SchemaFingerprint && that_present_SchemaFingerprint))
        return false;
      if (!this.SchemaFingerprint.equals(that.SchemaFingerprint))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partitionKey = true && (isSetPartitionKey());
    list.add(present_partitionKey);
    if (present_partitionKey)
      list.add(partitionKey);

    boolean present_sequenceNumber = true && (isSetSequenceNumber());
    list.add(present_sequenceNumber);
    if (present_sequenceNumber)
      list.add(sequenceNumber);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    boolean present_createTimestamp = true && (isSetCreateTimestamp());
    list.add(present_createTimestamp);
    if (present_createTimestamp)
      list.add(createTimestamp);

    boolean present_appendTimestamp = true && (isSetAppendTimestamp());
    list.add(present_appendTimestamp);
    if (present_appendTimestamp)
      list.add(appendTimestamp);

    boolean present_messageType = true && (isSetMessageType());
    list.add(present_messageType);
    if (present_messageType)
      list.add(messageType.getValue());

    boolean present_SchemaFingerprint = true && (isSetSchemaFingerprint());
    list.add(present_SchemaFingerprint);
    if (present_SchemaFingerprint)
      list.add(SchemaFingerprint);

    return list.hashCode();
  }

  @Override
  public int compareTo(Message other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionKey()).compareTo(other.isSetPartitionKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionKey, other.partitionKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceNumber()).compareTo(other.isSetSequenceNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sequenceNumber, other.sequenceNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTimestamp()).compareTo(other.isSetCreateTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.createTimestamp, other.createTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppendTimestamp()).compareTo(other.isSetAppendTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppendTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.appendTimestamp, other.appendTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageType()).compareTo(other.isSetMessageType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageType, other.messageType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSchemaFingerprint()).compareTo(other.isSetSchemaFingerprint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaFingerprint()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.SchemaFingerprint, other.SchemaFingerprint);
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
    StringBuilder sb = new StringBuilder("Message(");
    boolean first = true;

    if (isSetPartitionKey()) {
      sb.append("partitionKey:");
      if (this.partitionKey == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionKey);
      }
      first = false;
    }
    if (isSetSequenceNumber()) {
      if (!first) sb.append(", ");
      sb.append("sequenceNumber:");
      if (this.sequenceNumber == null) {
        sb.append("null");
      } else {
        sb.append(this.sequenceNumber);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      libthrift091.TBaseHelper.toString(this.message, sb);
    }
    first = false;
    if (isSetCreateTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("createTimestamp:");
      sb.append(this.createTimestamp);
      first = false;
    }
    if (isSetAppendTimestamp()) {
      if (!first) sb.append(", ");
      sb.append("appendTimestamp:");
      sb.append(this.appendTimestamp);
      first = false;
    }
    if (isSetMessageType()) {
      if (!first) sb.append(", ");
      sb.append("messageType:");
      if (this.messageType == null) {
        sb.append("null");
      } else {
        sb.append(this.messageType);
      }
      first = false;
    }
    if (isSetSchemaFingerprint()) {
      if (!first) sb.append(", ");
      sb.append("SchemaFingerprint:");
      if (this.SchemaFingerprint == null) {
        sb.append("null");
      } else {
        sb.append(this.SchemaFingerprint);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (message == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
    }
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

  private static class MessageStandardSchemeFactory implements SchemeFactory {
    public MessageStandardScheme getScheme() {
      return new MessageStandardScheme();
    }
  }

  private static class MessageStandardScheme extends StandardScheme<Message> {

    public void read(libthrift091.protocol.TProtocol iprot, Message struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_KEY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.partitionKey = iprot.readString();
              struct.setPartitionKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SEQUENCE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.sequenceNumber = iprot.readString();
              struct.setSequenceNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.message = iprot.readBinary();
              struct.setMessageIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CREATE_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.createTimestamp = iprot.readI64();
              struct.setCreateTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APPEND_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.appendTimestamp = iprot.readI64();
              struct.setAppendTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MESSAGE_TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.messageType = com.xiaomi.infra.galaxy.talos.thrift.MessageType.findByValue(iprot.readI32());
              struct.setMessageTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SCHEMA_FINGERPRINT
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.SchemaFingerprint = iprot.readString();
              struct.setSchemaFingerprintIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, Message struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitionKey != null) {
        if (struct.isSetPartitionKey()) {
          oprot.writeFieldBegin(PARTITION_KEY_FIELD_DESC);
          oprot.writeString(struct.partitionKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.sequenceNumber != null) {
        if (struct.isSetSequenceNumber()) {
          oprot.writeFieldBegin(SEQUENCE_NUMBER_FIELD_DESC);
          oprot.writeString(struct.sequenceNumber);
          oprot.writeFieldEnd();
        }
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeBinary(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreateTimestamp()) {
        oprot.writeFieldBegin(CREATE_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.createTimestamp);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAppendTimestamp()) {
        oprot.writeFieldBegin(APPEND_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.appendTimestamp);
        oprot.writeFieldEnd();
      }
      if (struct.messageType != null) {
        if (struct.isSetMessageType()) {
          oprot.writeFieldBegin(MESSAGE_TYPE_FIELD_DESC);
          oprot.writeI32(struct.messageType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.SchemaFingerprint != null) {
        if (struct.isSetSchemaFingerprint()) {
          oprot.writeFieldBegin(SCHEMA_FINGERPRINT_FIELD_DESC);
          oprot.writeString(struct.SchemaFingerprint);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageTupleSchemeFactory implements SchemeFactory {
    public MessageTupleScheme getScheme() {
      return new MessageTupleScheme();
    }
  }

  private static class MessageTupleScheme extends TupleScheme<Message> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Message struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.message);
      BitSet optionals = new BitSet();
      if (struct.isSetPartitionKey()) {
        optionals.set(0);
      }
      if (struct.isSetSequenceNumber()) {
        optionals.set(1);
      }
      if (struct.isSetCreateTimestamp()) {
        optionals.set(2);
      }
      if (struct.isSetAppendTimestamp()) {
        optionals.set(3);
      }
      if (struct.isSetMessageType()) {
        optionals.set(4);
      }
      if (struct.isSetSchemaFingerprint()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPartitionKey()) {
        oprot.writeString(struct.partitionKey);
      }
      if (struct.isSetSequenceNumber()) {
        oprot.writeString(struct.sequenceNumber);
      }
      if (struct.isSetCreateTimestamp()) {
        oprot.writeI64(struct.createTimestamp);
      }
      if (struct.isSetAppendTimestamp()) {
        oprot.writeI64(struct.appendTimestamp);
      }
      if (struct.isSetMessageType()) {
        oprot.writeI32(struct.messageType.getValue());
      }
      if (struct.isSetSchemaFingerprint()) {
        oprot.writeString(struct.SchemaFingerprint);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Message struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.message = iprot.readBinary();
      struct.setMessageIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.partitionKey = iprot.readString();
        struct.setPartitionKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sequenceNumber = iprot.readString();
        struct.setSequenceNumberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.createTimestamp = iprot.readI64();
        struct.setCreateTimestampIsSet(true);
      }
      if (incoming.get(3)) {
        struct.appendTimestamp = iprot.readI64();
        struct.setAppendTimestampIsSet(true);
      }
      if (incoming.get(4)) {
        struct.messageType = com.xiaomi.infra.galaxy.talos.thrift.MessageType.findByValue(iprot.readI32());
        struct.setMessageTypeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.SchemaFingerprint = iprot.readString();
        struct.setSchemaFingerprintIsSet(true);
      }
    }
  }

}

