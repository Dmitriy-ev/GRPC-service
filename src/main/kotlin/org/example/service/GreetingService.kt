package org.example.service

import io.grpc.Server
import io.grpc.ServerBuilder
import org.example.GreetingServiceImpl

fun main() {

    val server = runServer()
    server.start()
    server.awaitTermination()
}

fun runServer() : Server =  ServerBuilder.forPort(8080).addService(GreetingServiceImpl()).build()
