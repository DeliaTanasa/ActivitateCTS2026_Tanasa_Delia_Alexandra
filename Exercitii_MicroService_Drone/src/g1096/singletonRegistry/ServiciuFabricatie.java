package g1096.singletonRegistry;

public class ServiciuFabricatie extends AbstractMicroService{
    public ServiciuFabricatie(String name, String url) {
        super(name, url);
    }

    @Override
    public void connect() {
        System.out.println("Service is connecting...");
    }

    @Override
    public String toString() {
        return "ServiciuFabricatie{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceUrl='" + serviceUrl + '\'' +
                '}';
    }
}
