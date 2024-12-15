package com.vineet.Tutort.systemdesign.loadbalancer;

import java.util.Map;

// The request handler will receive the incoming requests and forward them to the available server.
// It will use the ServerCache class to get the information about the available servers and their current load.
public class RequestHandler {

    private ServerCache serverCache;

    public RequestHandler(ServerCache serverCache){
        this.serverCache = serverCache;
    }

    public void handleRequest(String request){

        Map<String,Integer> cache = serverCache.getCache();

        if(cache.isEmpty()){
            System.out.println("No available server");
            return;
        }

        String serverName = ServerSelector.selectServer(cache);
        System.out.println("Request Forwarded to " + serverName);

    }
}
