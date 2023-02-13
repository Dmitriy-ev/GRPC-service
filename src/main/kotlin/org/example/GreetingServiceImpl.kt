package org.example

import greeting.GreetingServiceGrpc
import greeting.Greetingservice
import io.grpc.stub.StreamObserver
import java.awt.image.ImageObserver

class GreetingServiceImpl: GreetingServiceGrpc.GreetingServiceImplBase() {

    override fun hello(helloRequest: Greetingservice.HelloRequest,
                       streabObserver: StreamObserver<Greetingservice.HelloReply>){
        println(helloRequest)

        val response: Greetingservice.HelloReply =
            Greetingservice.HelloReply.newBuilder().setMessage("Hello ${helloRequest.name}").build()

        streabObserver.onNext(response)
        streabObserver.onCompleted()
    }
}