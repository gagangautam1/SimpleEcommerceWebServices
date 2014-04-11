package Connection;

public class ServiceProxy implements Connection.Service {
  private String _endpoint = null;
  private Connection.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new Connection.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Connection.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public java.lang.String signUp(java.lang.String username, java.lang.String pwd, java.lang.String email, java.lang.String hpone, java.lang.String wpone, java.lang.String address) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signUp(username, pwd, email, hpone, wpone, address);
  }
  
  public java.lang.String[] fetchCategory() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchCategory();
  }
  
  public java.lang.String[] fetchProducts(java.lang.String category) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.fetchProducts(category);
  }
  
  public java.lang.String removeCart(java.lang.String username, int id) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.removeCart(username, id);
  }
  
  public java.lang.String[] displayCart(java.lang.String user) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.displayCart(user);
  }
  
  public java.lang.String addToCart(int id, java.lang.String user) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.addToCart(id, user);
  }
  
  public java.lang.String login(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.login(username, pwd);
  }
  
  public java.lang.String advertiseProduct(java.lang.String category, java.lang.String name, java.lang.String model, int price, java.lang.String user) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.advertiseProduct(category, name, model, price, user);
  }
  
  
}