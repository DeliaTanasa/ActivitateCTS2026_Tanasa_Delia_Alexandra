package ro.ase.cts.singletonRegistry;

public abstract class AbstractMicroService {
    protected String serviceName;
    protected String serviceUrl;
    public AbstractMicroService(String name, String url) {
        this.serviceName = name;
        this.serviceUrl = url;
    }
    public abstract void connect();
}
