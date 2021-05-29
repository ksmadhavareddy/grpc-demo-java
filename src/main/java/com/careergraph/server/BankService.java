package com.careergraph.server;

import com.careergraph.models.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import static java.lang.Thread.*;

public class BankService extends BankServiceGrpc.BankServiceImplBase
{

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<Balance> responseObserver)
    {
        int accountNumber = request.getAccountNumber();
        Balance balance = Balance.newBuilder().setAmount(accountNumber * 10)
                .build();

        responseObserver.onNext(balance);
        responseObserver.onCompleted();
    }

    @Override
    public void withdraw(WithdrawRequest request, StreamObserver<Money> responseObserver) {

        int accountNumber = request.getAccountNmber();
        int amount = request.getAmount();
        int balance = AccountDatabase.getBalance(accountNumber);
        if (balance < amount){
            Status status = Status.FAILED_PRECONDITION.withDescription((" No Enough Money. You only have balance amount of :") + balance);
            responseObserver.onError(status.asRuntimeException());
            return;
        }

        // all the validations passed
        for (int i = 0; i < (amount/10); i++) {
            Money money = Money.newBuilder().setValue(10).build();
            responseObserver.onNext(money);

            AccountDatabase.deductBalance(accountNumber,10);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<DepositRequest> cashDeposit(StreamObserver<Balance> responseObserver) {
        return new CashStreamingRequest(responseObserver);
    }
}
