// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface PersistFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.PersistFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 fileId = 1;</code>
   */
  boolean hasFileId();
  /**
   * <code>optional int64 fileId = 1;</code>
   */
  long getFileId();

  /**
   * <code>repeated int64 blockIds = 2;</code>
   */
  java.util.List<java.lang.Long> getBlockIdsList();
  /**
   * <code>repeated int64 blockIds = 2;</code>
   */
  int getBlockIdsCount();
  /**
   * <code>repeated int64 blockIds = 2;</code>
   */
  long getBlockIds(int index);
}
