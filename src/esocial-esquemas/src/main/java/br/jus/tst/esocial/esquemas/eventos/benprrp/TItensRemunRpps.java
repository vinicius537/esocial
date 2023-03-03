//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.02 at 02:44:45 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.benprrp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DESCRICAO_COMPLETA:Rubricas que compõem a remuneração do trabalhador.
 * 
 * <p>Java class for T_itensRemun_rpps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_itensRemun_rpps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codRubr" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_01_00}TS_codigo_esocial"/>
 *         &lt;element name="ideTabRubr" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_01_00}TS_ideTabRubr"/>
 *         &lt;element name="qtdRubr" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_01_00}TS_qtdRubr" minOccurs="0"/>
 *         &lt;element name="fatorRubr" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_01_00}TS_fator" minOccurs="0"/>
 *         &lt;element name="vrRubr" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_01_00}TS_vrRubr"/>
 *         &lt;element name="indApurIR" type="{http://www.esocial.gov.br/schema/evt/evtBenPrRP/v_S_01_01_00}TS_indApurIR"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_itensRemun_rpps", propOrder = {
    "codRubr",
    "ideTabRubr",
    "qtdRubr",
    "fatorRubr",
    "vrRubr",
    "indApurIR"
})
public class TItensRemunRpps {

    @XmlElement(required = true)
    protected String codRubr;
    @XmlElement(required = true)
    protected String ideTabRubr;
    protected BigDecimal qtdRubr;
    protected BigDecimal fatorRubr;
    @XmlElement(required = true)
    protected BigDecimal vrRubr;
    protected byte indApurIR;

    /**
     * Gets the value of the codRubr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRubr() {
        return codRubr;
    }

    /**
     * Sets the value of the codRubr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRubr(String value) {
        this.codRubr = value;
    }

    /**
     * Gets the value of the ideTabRubr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeTabRubr() {
        return ideTabRubr;
    }

    /**
     * Sets the value of the ideTabRubr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeTabRubr(String value) {
        this.ideTabRubr = value;
    }

    /**
     * Gets the value of the qtdRubr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtdRubr() {
        return qtdRubr;
    }

    /**
     * Sets the value of the qtdRubr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtdRubr(BigDecimal value) {
        this.qtdRubr = value;
    }

    /**
     * Gets the value of the fatorRubr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFatorRubr() {
        return fatorRubr;
    }

    /**
     * Sets the value of the fatorRubr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFatorRubr(BigDecimal value) {
        this.fatorRubr = value;
    }

    /**
     * Gets the value of the vrRubr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrRubr() {
        return vrRubr;
    }

    /**
     * Sets the value of the vrRubr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrRubr(BigDecimal value) {
        this.vrRubr = value;
    }

    /**
     * Gets the value of the indApurIR property.
     * 
     */
    public byte getIndApurIR() {
        return indApurIR;
    }

    /**
     * Sets the value of the indApurIR property.
     * 
     */
    public void setIndApurIR(byte value) {
        this.indApurIR = value;
    }

}
