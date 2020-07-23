
package com.service.webservice;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductListResponse", namespace = "http://service.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductListResponse", namespace = "http://service.com/")
public class GetProductListResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<com.service.Product> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Product>
     */
    public ArrayList<com.service.Product> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<com.service.Product> _return) {
        this._return = _return;
    }

}
