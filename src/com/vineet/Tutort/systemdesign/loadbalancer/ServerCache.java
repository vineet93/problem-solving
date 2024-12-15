package com.vineet.Tutort.systemdesign.loadbalancer;

import java.util.HashMap;
import java.util.Map;

//We will use an in-memory database to store information about the available servers and the current load.
// The cache will be implemented as a simple HashMap that stores server information as key-value pairs.
public class ServerCache {

    private Map<String,Integer> cache;

    public ServerCache(){
        cache = new HashMap<>();
    }

    public Map<String, Integer> getCache() {
        return cache;
    }

    public void addServer(String serverName,int load){
        cache.put(serverName,load);
    }

    public void updateServer(String serverName, int load){
        cache.put(serverName,load);
    }
}
