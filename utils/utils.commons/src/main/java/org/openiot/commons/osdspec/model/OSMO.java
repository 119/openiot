//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.25 at 12:49:31 �� EET 
//


package org.openiot.commons.osdspec.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openiot.commons.sparql.protocoltypes.model.QueryRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openiot.eu/osdspec}description" minOccurs="0"/>
 *         &lt;element ref="{http://www.openiot.eu/osdspec}queryControls"/>
 *         &lt;element ref="{http://www.openiot.eu/osdspec}requestPresentation"/>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.w3.org/2007/SPARQL/protocol-types#}query-request" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.openiot.eu/osdspec}dynamicAttrMaxValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "queryControls",
    "requestPresentation",
    "queryRequest",
    "dynamicAttrMaxValue"
})
@XmlRootElement(name = "OSMO")
public class OSMO {

    protected String description;
    @XmlElement(required = true)
    protected QueryControls queryControls;
    @XmlElement(required = true)
    protected RequestPresentation requestPresentation;
    @XmlElement(name = "query-request", namespace = "http://www.w3.org/2007/SPARQL/protocol-types#", required = true)
    protected List<QueryRequest> queryRequest;
    protected List<DynamicAttrMaxValue> dynamicAttrMaxValue;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the queryControls property.
     * 
     * @return
     *     possible object is
     *     {@link QueryControls }
     *     
     */
    public QueryControls getQueryControls() {
        return queryControls;
    }

    /**
     * Sets the value of the queryControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryControls }
     *     
     */
    public void setQueryControls(QueryControls value) {
        this.queryControls = value;
    }

    /**
     * Gets the value of the requestPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPresentation }
     *     
     */
    public RequestPresentation getRequestPresentation() {
        return requestPresentation;
    }

    /**
     * Sets the value of the requestPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPresentation }
     *     
     */
    public void setRequestPresentation(RequestPresentation value) {
        this.requestPresentation = value;
    }

    /**
     * Gets the value of the queryRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryRequest }
     * 
     * 
     */
    public List<QueryRequest> getQueryRequest() {
        if (queryRequest == null) {
            queryRequest = new ArrayList<QueryRequest>();
        }
        return this.queryRequest;
    }

    /**
     * Gets the value of the dynamicAttrMaxValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicAttrMaxValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicAttrMaxValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicAttrMaxValue }
     * 
     * 
     */
    public List<DynamicAttrMaxValue> getDynamicAttrMaxValue() {
        if (dynamicAttrMaxValue == null) {
            dynamicAttrMaxValue = new ArrayList<DynamicAttrMaxValue>();
        }
        return this.dynamicAttrMaxValue;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}