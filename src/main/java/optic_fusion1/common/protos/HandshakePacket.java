// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatRoomProtocol.proto

package optic_fusion1.common.protos;

/**
 * <pre>
 * Client -&gt; Server
 * </pre>
 *
 * Protobuf type {@code HandshakePacket}
 */
public final class HandshakePacket extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HandshakePacket)
    HandshakePacketOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HandshakePacket.newBuilder() to construct.
  private HandshakePacket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HandshakePacket() {
    protocolVersion_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HandshakePacket();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HandshakePacket(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            optic_fusion1.common.protos.ProtocolVersion value = optic_fusion1.common.protos.ProtocolVersion.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              protocolVersion_ = rawValue;
            }
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return optic_fusion1.common.protos.ChatRoomProtocol.internal_static_HandshakePacket_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return optic_fusion1.common.protos.ChatRoomProtocol.internal_static_HandshakePacket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            optic_fusion1.common.protos.HandshakePacket.class, optic_fusion1.common.protos.HandshakePacket.Builder.class);
  }

  private int bitField0_;
  public static final int PROTOCOL_VERSION_FIELD_NUMBER = 2;
  private int protocolVersion_;
  /**
   * <code>required .ProtocolVersion protocol_version = 2;</code>
   * @return Whether the protocolVersion field is set.
   */
  @java.lang.Override public boolean hasProtocolVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required .ProtocolVersion protocol_version = 2;</code>
   * @return The protocolVersion.
   */
  @java.lang.Override public optic_fusion1.common.protos.ProtocolVersion getProtocolVersion() {
    @SuppressWarnings("deprecation")
    optic_fusion1.common.protos.ProtocolVersion result = optic_fusion1.common.protos.ProtocolVersion.valueOf(protocolVersion_);
    return result == null ? optic_fusion1.common.protos.ProtocolVersion.VERSION_000 : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasProtocolVersion()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(2, protocolVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, protocolVersion_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof optic_fusion1.common.protos.HandshakePacket)) {
      return super.equals(obj);
    }
    optic_fusion1.common.protos.HandshakePacket other = (optic_fusion1.common.protos.HandshakePacket) obj;

    if (hasProtocolVersion() != other.hasProtocolVersion()) return false;
    if (hasProtocolVersion()) {
      if (protocolVersion_ != other.protocolVersion_) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasProtocolVersion()) {
      hash = (37 * hash) + PROTOCOL_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + protocolVersion_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static optic_fusion1.common.protos.HandshakePacket parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(optic_fusion1.common.protos.HandshakePacket prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Client -&gt; Server
   * </pre>
   *
   * Protobuf type {@code HandshakePacket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HandshakePacket)
      optic_fusion1.common.protos.HandshakePacketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return optic_fusion1.common.protos.ChatRoomProtocol.internal_static_HandshakePacket_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return optic_fusion1.common.protos.ChatRoomProtocol.internal_static_HandshakePacket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              optic_fusion1.common.protos.HandshakePacket.class, optic_fusion1.common.protos.HandshakePacket.Builder.class);
    }

    // Construct using optic_fusion1.common.protos.HandshakePacket.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      protocolVersion_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return optic_fusion1.common.protos.ChatRoomProtocol.internal_static_HandshakePacket_descriptor;
    }

    @java.lang.Override
    public optic_fusion1.common.protos.HandshakePacket getDefaultInstanceForType() {
      return optic_fusion1.common.protos.HandshakePacket.getDefaultInstance();
    }

    @java.lang.Override
    public optic_fusion1.common.protos.HandshakePacket build() {
      optic_fusion1.common.protos.HandshakePacket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public optic_fusion1.common.protos.HandshakePacket buildPartial() {
      optic_fusion1.common.protos.HandshakePacket result = new optic_fusion1.common.protos.HandshakePacket(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.protocolVersion_ = protocolVersion_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof optic_fusion1.common.protos.HandshakePacket) {
        return mergeFrom((optic_fusion1.common.protos.HandshakePacket)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(optic_fusion1.common.protos.HandshakePacket other) {
      if (other == optic_fusion1.common.protos.HandshakePacket.getDefaultInstance()) return this;
      if (other.hasProtocolVersion()) {
        setProtocolVersion(other.getProtocolVersion());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasProtocolVersion()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      optic_fusion1.common.protos.HandshakePacket parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (optic_fusion1.common.protos.HandshakePacket) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int protocolVersion_ = 0;
    /**
     * <code>required .ProtocolVersion protocol_version = 2;</code>
     * @return Whether the protocolVersion field is set.
     */
    @java.lang.Override public boolean hasProtocolVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .ProtocolVersion protocol_version = 2;</code>
     * @return The protocolVersion.
     */
    @java.lang.Override
    public optic_fusion1.common.protos.ProtocolVersion getProtocolVersion() {
      @SuppressWarnings("deprecation")
      optic_fusion1.common.protos.ProtocolVersion result = optic_fusion1.common.protos.ProtocolVersion.valueOf(protocolVersion_);
      return result == null ? optic_fusion1.common.protos.ProtocolVersion.VERSION_000 : result;
    }
    /**
     * <code>required .ProtocolVersion protocol_version = 2;</code>
     * @param value The protocolVersion to set.
     * @return This builder for chaining.
     */
    public Builder setProtocolVersion(optic_fusion1.common.protos.ProtocolVersion value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      protocolVersion_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>required .ProtocolVersion protocol_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProtocolVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      protocolVersion_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HandshakePacket)
  }

  // @@protoc_insertion_point(class_scope:HandshakePacket)
  private static final optic_fusion1.common.protos.HandshakePacket DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new optic_fusion1.common.protos.HandshakePacket();
  }

  public static optic_fusion1.common.protos.HandshakePacket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<HandshakePacket>
      PARSER = new com.google.protobuf.AbstractParser<HandshakePacket>() {
    @java.lang.Override
    public HandshakePacket parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HandshakePacket(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HandshakePacket> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HandshakePacket> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public optic_fusion1.common.protos.HandshakePacket getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

