package io.github.pedroagrs.server.impl;

import io.grpc.stub.StreamObserver;
import io.pedroagrs.server.proto.user.*;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void createUser(CreateUserRequest request, StreamObserver<CreateUserResponse> observer) {
        User user = request.getUser();
    }

    @Override
    public void deleteUser(DeleteUserRequest request, StreamObserver<DeleteUserResponse> observer) {}

    @Override
    public void listUser(ListUserRequest request, StreamObserver<ListUserResponse> observer) {}
}
