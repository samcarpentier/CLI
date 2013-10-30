
package com.checkmarx.cxviewer.ws.resolver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CxWSResolverSoap", targetNamespace = "http://Checkmarx.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CxWSResolverSoap {


    /**
     * 
     * @param apiVersion
     * @param clientType
     * @return
     *     returns com.checkmarx.cxviewer.ws.resolver.CxWSResponseDiscovery
     */
    @WebMethod(operationName = "GetWebServiceUrl", action = "http://Checkmarx.com/GetWebServiceUrl")
    @WebResult(name = "GetWebServiceUrlResult", targetNamespace = "http://Checkmarx.com")
    @RequestWrapper(localName = "GetWebServiceUrl", targetNamespace = "http://Checkmarx.com", className = "com.checkmarx.cxviewer.ws.resolver.GetWebServiceUrl")
    @ResponseWrapper(localName = "GetWebServiceUrlResponse", targetNamespace = "http://Checkmarx.com", className = "com.checkmarx.cxviewer.ws.resolver.GetWebServiceUrlResponse")
    public CxWSResponseDiscovery getWebServiceUrl(
        @WebParam(name = "ClientType", targetNamespace = "http://Checkmarx.com")
        CxClientType clientType,
        @WebParam(name = "APIVersion", targetNamespace = "http://Checkmarx.com")
        int apiVersion);

}