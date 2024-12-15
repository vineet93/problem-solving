package com.vineet.Tutort.systemdesign.loadbalancer;

public class LoadBalancer {

    public static void main(String[] args) {
        ServerCache serverCache = new ServerCache();
        serverCache.addServer("Server 1",10);
        serverCache.addServer("Server 2",20);
        serverCache.addServer("Server 3",30);

        RequestHandler requestHandler = new RequestHandler(serverCache);
        requestHandler.handleRequest("request 1");
        requestHandler.handleRequest("request 2");
        requestHandler.handleRequest("request 3");
        requestHandler.handleRequest("request 4");
        requestHandler.handleRequest("request 5");
        requestHandler.handleRequest("request 6");
        requestHandler.handleRequest("request 7");
        requestHandler.handleRequest("request 8");
        requestHandler.handleRequest("request 9");
        requestHandler.handleRequest("request 10");
        requestHandler.handleRequest("request 11");
        requestHandler.handleRequest("request 12");
    }
}
