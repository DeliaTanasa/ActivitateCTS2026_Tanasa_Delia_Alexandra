package ro.ase.cts.singletonRegistry;

public class ServiciuUtilizatori extends AbstractMicroService{
    public ServiciuUtilizatori(String name, String url) {
        super(name, url);
    }

    @Override
    public void connect() {
        System.out.println("Service is connecting...");
    }

    @Override
    public String toString() {
        return "ServiciuUtilizatori{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceUrl='" + serviceUrl + '\'' +
                '}';
    }
}
