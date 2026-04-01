package g1096.singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class ServiciuRegistry {
    private ServiciuRegistry() {
    }
    private static Map<String,AbstractMicroService> map=new HashMap<>();
    public static void registry(String cheie,AbstractMicroService abstractMicroService) throws Exception {
        cheie= abstractMicroService.serviceName+" "+abstractMicroService.serviceUrl;
        if(map.containsKey(cheie)){
            throw new RuntimeException("Key '" + cheie + "' already registered");
        }
        else{
            map.put(cheie, abstractMicroService);
        }

    }

    public static AbstractMicroService getMicroService(String cheie){
        return map.get(cheie);
    }
}
