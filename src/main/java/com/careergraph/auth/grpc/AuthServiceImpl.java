package com.careergraph.auth.grpc;

import com.careergraph.auth.models.*;
import io.grpc.stub.StreamObserver;

public class AuthServiceImpl extends AuthenticationServiceGrpc.AuthenticationServiceImplBase
{

    @Override
    public void authenticate(AuthenticationRequest request, StreamObserver<AuthenticationResponse> responseObserver) {

        //super.authenticate(request, responseObserver);

        String username = request.getUsername();
        String password = request.getPassword();

        System.out.println("User name :"+username);
        System.out.println(("password :"+password));

    }

    @Override
    public void authorization(AuthorizationRequest request, StreamObserver<AuthorizationResponse> responseObserver) {
        super.authorization(request, responseObserver);
    }
}
