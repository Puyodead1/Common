// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatRoomProtocol.proto

package optic_fusion1.common.protos;

public interface ErrorPacketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ErrorPacket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .ErrorPacket.Type error_type = 1;</code>
   * @return Whether the errorType field is set.
   */
  boolean hasErrorType();
  /**
   * <code>required .ErrorPacket.Type error_type = 1;</code>
   * @return The errorType.
   */
  optic_fusion1.common.protos.ErrorPacket.Type getErrorType();

  /**
   * <code>required string description = 2;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>required string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>required string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}