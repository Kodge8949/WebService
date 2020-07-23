
package com.service.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProduct", namespace = "http://service.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProduct", namespace = "http://service.com/")
public class GetProduct {

    @XmlElement(name = "arg0", namespace = "")
    private com.service.Product arg0;

    /**
     * 
     * @return
     *     returns Product
     */
    public com.service.Product getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.service.Product arg0) {
        this.arg0 = arg0;
    }

}
