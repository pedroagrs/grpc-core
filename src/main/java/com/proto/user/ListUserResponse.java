// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user.proto

package com.proto.user;

/**
 * Protobuf type {@code user.ListUserResponse}
 */
public  final class ListUserResponse extends
    com.google.protobuf.GeneratedMessageLite<
        ListUserResponse, ListUserResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:user.ListUserResponse)
    ListUserResponseOrBuilder {
  private ListUserResponse() {
  }
  public static final int USER_FIELD_NUMBER = 1;
  private com.proto.user.User user_;
  /**
   * <code>.user.User user = 1;</code>
   */
  @java.lang.Override
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.user.User user = 1;</code>
   */
  @java.lang.Override
  public com.proto.user.User getUser() {
    return user_ == null ? com.proto.user.User.getDefaultInstance() : user_;
  }
  /**
   * <code>.user.User user = 1;</code>
   */
  private void setUser(com.proto.user.User value) {
    value.getClass();
  user_ = value;
    
    }
  /**
   * <code>.user.User user = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeUser(com.proto.user.User value) {
    value.getClass();
  if (user_ != null &&
        user_ != com.proto.user.User.getDefaultInstance()) {
      user_ =
        com.proto.user.User.newBuilder(user_).mergeFrom(value).buildPartial();
    } else {
      user_ = value;
    }
    
  }
  /**
   * <code>.user.User user = 1;</code>
   */
  private void clearUser() {  user_ = null;
    
  }

  public static com.proto.user.ListUserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.user.ListUserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.user.ListUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.user.ListUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.user.ListUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.user.ListUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.user.ListUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.user.ListUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.user.ListUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.user.ListUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.user.ListUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.user.ListUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.user.ListUserResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code user.ListUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.user.ListUserResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:user.ListUserResponse)
      com.proto.user.ListUserResponseOrBuilder {
    // Construct using com.proto.user.ListUserResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.user.User user = 1;</code>
     */
    @java.lang.Override
    public boolean hasUser() {
      return instance.hasUser();
    }
    /**
     * <code>.user.User user = 1;</code>
     */
    @java.lang.Override
    public com.proto.user.User getUser() {
      return instance.getUser();
    }
    /**
     * <code>.user.User user = 1;</code>
     */
    public Builder setUser(com.proto.user.User value) {
      copyOnWrite();
      instance.setUser(value);
      return this;
      }
    /**
     * <code>.user.User user = 1;</code>
     */
    public Builder setUser(
        com.proto.user.User.Builder builderForValue) {
      copyOnWrite();
      instance.setUser(builderForValue.build());
      return this;
    }
    /**
     * <code>.user.User user = 1;</code>
     */
    public Builder mergeUser(com.proto.user.User value) {
      copyOnWrite();
      instance.mergeUser(value);
      return this;
    }
    /**
     * <code>.user.User user = 1;</code>
     */
    public Builder clearUser() {  copyOnWrite();
      instance.clearUser();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:user.ListUserResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.user.ListUserResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "user_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.user.ListUserResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.user.ListUserResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.user.ListUserResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:user.ListUserResponse)
  private static final com.proto.user.ListUserResponse DEFAULT_INSTANCE;
  static {
    ListUserResponse defaultInstance = new ListUserResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ListUserResponse.class, defaultInstance);
  }

  public static com.proto.user.ListUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListUserResponse> PARSER;

  public static com.google.protobuf.Parser<ListUserResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
