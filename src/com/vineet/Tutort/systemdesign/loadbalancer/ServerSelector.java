package com.vineet.Tutort.systemdesign.loadbalancer;

import java.util.Map;

public class ServerSelector {

    public static String selectServer(Map<String,Integer> cache){
        String selectedServer = null;
        int minLoad= Integer.MAX_VALUE;
        int maxLoad=50;


        for(Map.Entry<String,Integer>  val : cache.entrySet()){
            String serverName = val.getKey();
            int load = val.getValue();

            if(load < minLoad){
                minLoad = load;
                selectedServer=serverName;
            }
        }
        System.out.println("Selected server is " + selectedServer + " and load is " + cache.get(selectedServer) );
        cache.put(selectedServer,cache.get(selectedServer)+10);

        return selectedServer;
    }

}
