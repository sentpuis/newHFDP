//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.05.12 às 05:35:34 PM GMT-03:00 
//
package net.emoreira.hfd.xml;

import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Classe Java de component complex type.
 *
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 *
 * <pre>
 * &lt;complexType name="component">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providedInterface" type="{http://xml.hfd.emoreira.net}interface" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requiredInterface" type="{http://xml.hfd.emoreira.net}interface" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "component", propOrder = {
    "providedInterface",
    "requiredInterface",
    "shortDescription",
    "longDescription"
})
public class Component {

    protected List<Interface> providedInterface;
    protected List<Interface> requiredInterface;
    protected String shortDescription;
    protected String longDescription;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the providedInterface property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the providedInterface property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvidedInterface().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interface }
     *
     *
     */
    public List<Interface> getProvidedInterface() {
        if (providedInterface == null) {
            providedInterface = new ArrayList<Interface>();
        }
        return this.providedInterface;
    }

    /**
     * Gets the value of the requiredInterface property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the requiredInterface property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredInterface().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interface }
     *
     *
     */
    public List<Interface> getRequiredInterface() {
        if (requiredInterface == null) {
            requiredInterface = new ArrayList<Interface>();
        }
        return this.requiredInterface;
    }

    /**
     * Obtém o valor da propriedade shortDescription.
     *
     * @return possible object is {@link String }
     *
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Define o valor da propriedade shortDescription.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Obtém o valor da propriedade longDescription.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Define o valor da propriedade longDescription.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Obtém o valor da propriedade id.
     *
     * @return possible object is {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade name.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    @XmlTransient
    private Optional<Subarch> parent;

    /**
     * Obtem o valor da propriedade parent (Só é válida já na arquitetura).
     *
     * @return possible object is {@link Subarch}
     */
    public Optional<Subarch> getParent() {
        return parent;
    }

    public void setParent(Subarch parent) {
        this.parent = Optional.fromNullable(parent);
    }

    /**
     * Configura o parent do objeto no Unmarshalling (Apenas Subarch deve ser
     * considerado parent de um componente). Posteriormente ele configura as
     * interfaces do componente apropriadamente como providas ou requeridas pois
     * o processo de Unmarshalling não pode realizar essa operação sozinho com a
     * estrutura do XML adotado.
     *
     * @param unmarshaller
     * @param parent
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        if (parent instanceof Subarch) {
            setParent((Subarch) parent);
        } else {
            setParent(null);
        }
//        for(Interface p:providedInterface){
//            p.setProvidedInterface();
//        }
//        for(Interface r:requiredInterface){
//            r.setRequiredInterface();
//        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("\n"
                + "Component" + "\n"
                + (id == null ? "id: null" : "id: " + this.id) + "\n"
                + (name == null ? "name: null" : "name: " + this.name) + "\n"
                + (longDescription == null ? "longDescription: null" : "longDescription: " + this.longDescription) + "\n"
                + (shortDescription == null ? "shortDescription: null" : "shortDescription: " + this.shortDescription) + "\n"
                + (!parent.isPresent() ? "parent: absent" : "parent: present") + "\n");
        StringBuffer interfaceBuffer;
        interfaceBuffer = new StringBuffer("Provided Interfaces:\n");
        if (providedInterface != null) {
            for (Interface inter : providedInterface) {
                interfaceBuffer.append(inter.toString());
            }
        }
        buffer.append(interfaceBuffer.toString().replaceAll("\n", "\n\t"));

        interfaceBuffer = new StringBuffer("Required Interfaces:\n");
        if (requiredInterface != null) {
            for (Interface inter : requiredInterface) {
                interfaceBuffer.append(inter.toString());
            }
        }
        buffer.append(interfaceBuffer.toString().replaceAll("\n", "\n\t"));
        buffer.append("End of Component \n");
        return buffer.toString();
    }
}
