package g1096.singletonRegistry;

public class ServiciuMeteo extends AbstractMicroService{
    public ServiciuMeteo(String name, String url) {
        super(name, url);
    }


    @Override
    public void connect() {
        System.out.println("Service is connecting...");
    }

    @Override
    public String toString() {
        return "ServiciuMeteo{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceUrl='" + serviceUrl + '\'' +
                '}';
    }
}
