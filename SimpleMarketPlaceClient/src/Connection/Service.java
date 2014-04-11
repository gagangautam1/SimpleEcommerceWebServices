/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Connection;

public interface Service extends java.rmi.Remote {
    public java.lang.String signUp(java.lang.String username, java.lang.String pwd, java.lang.String email, java.lang.String hpone, java.lang.String wpone, java.lang.String address) throws java.rmi.RemoteException;
    public java.lang.String[] fetchCategory() throws java.rmi.RemoteException;
    public java.lang.String[] fetchProducts(java.lang.String category) throws java.rmi.RemoteException;
    public java.lang.String removeCart(java.lang.String username, int id) throws java.rmi.RemoteException;
    public java.lang.String[] displayCart(java.lang.String user) throws java.rmi.RemoteException;
    public java.lang.String addToCart(int id, java.lang.String user) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String username, java.lang.String pwd) throws java.rmi.RemoteException;
    public java.lang.String advertiseProduct(java.lang.String category, java.lang.String name, java.lang.String model, int price, java.lang.String user) throws java.rmi.RemoteException;
}
