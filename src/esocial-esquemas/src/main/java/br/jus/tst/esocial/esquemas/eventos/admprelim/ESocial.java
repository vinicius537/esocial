//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.02 at 02:44:40 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.admprelim;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="evtAdmPrelim">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}T_ideEvento_trab_admissao"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}T_ideEmpregador"/>
 *                   &lt;element name="infoRegPrelim">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_cpfTrab"/>
 *                             &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_codigo_esocial"/>
 *                             &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_codCateg"/>
 *                             &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_natAtividade" minOccurs="0"/>
 *                             &lt;element name="infoRegCTPS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_cbo"/>
 *                                       &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_vrSalFx"/>
 *                                       &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_undSalFixo"/>
 *                                       &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_tpContr"/>
 *                                       &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_Id" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evtAdmPrelim",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtAdmPrelim evtAdmPrelim;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtAdmPrelim property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtAdmPrelim }
     *     
     */
    public ESocial.EvtAdmPrelim getEvtAdmPrelim() {
        return evtAdmPrelim;
    }

    /**
     * Sets the value of the evtAdmPrelim property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtAdmPrelim }
     *     
     */
    public void setEvtAdmPrelim(ESocial.EvtAdmPrelim value) {
        this.evtAdmPrelim = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}T_ideEvento_trab_admissao"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}T_ideEmpregador"/>
     *         &lt;element name="infoRegPrelim">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_cpfTrab"/>
     *                   &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_codigo_esocial"/>
     *                   &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_codCateg"/>
     *                   &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_natAtividade" minOccurs="0"/>
     *                   &lt;element name="infoRegCTPS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_cbo"/>
     *                             &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_vrSalFx"/>
     *                             &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_undSalFixo"/>
     *                             &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_tpContr"/>
     *                             &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_Id" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoRegPrelim"
    })
    public static class EvtAdmPrelim {

        @XmlElement(required = true)
        protected TIdeEventoTrabAdmissao ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtAdmPrelim.InfoRegPrelim infoRegPrelim;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoTrabAdmissao }
         *     
         */
        public TIdeEventoTrabAdmissao getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoTrabAdmissao }
         *     
         */
        public void setIdeEvento(TIdeEventoTrabAdmissao value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the infoRegPrelim property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim }
         *     
         */
        public ESocial.EvtAdmPrelim.InfoRegPrelim getInfoRegPrelim() {
            return infoRegPrelim;
        }

        /**
         * Sets the value of the infoRegPrelim property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim }
         *     
         */
        public void setInfoRegPrelim(ESocial.EvtAdmPrelim.InfoRegPrelim value) {
            this.infoRegPrelim = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cpfTrab" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_cpfTrab"/>
         *         &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="matricula" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_codigo_esocial"/>
         *         &lt;element name="codCateg" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_codCateg"/>
         *         &lt;element name="natAtividade" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_natAtividade" minOccurs="0"/>
         *         &lt;element name="infoRegCTPS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_cbo"/>
         *                   &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_vrSalFx"/>
         *                   &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_undSalFixo"/>
         *                   &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_tpContr"/>
         *                   &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cpfTrab",
            "dtNascto",
            "dtAdm",
            "matricula",
            "codCateg",
            "natAtividade",
            "infoRegCTPS"
        })
        public static class InfoRegPrelim {

            @XmlElement(required = true)
            protected String cpfTrab;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtNascto;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dtAdm;
            @XmlElement(required = true)
            protected String matricula;
            @XmlElement(required = true)
            protected BigInteger codCateg;
            protected Byte natAtividade;
            protected ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS infoRegCTPS;

            /**
             * Gets the value of the cpfTrab property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfTrab() {
                return cpfTrab;
            }

            /**
             * Sets the value of the cpfTrab property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfTrab(String value) {
                this.cpfTrab = value;
            }

            /**
             * Gets the value of the dtNascto property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtNascto() {
                return dtNascto;
            }

            /**
             * Sets the value of the dtNascto property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtNascto(XMLGregorianCalendar value) {
                this.dtNascto = value;
            }

            /**
             * Gets the value of the dtAdm property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtAdm() {
                return dtAdm;
            }

            /**
             * Sets the value of the dtAdm property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtAdm(XMLGregorianCalendar value) {
                this.dtAdm = value;
            }

            /**
             * Gets the value of the matricula property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatricula() {
                return matricula;
            }

            /**
             * Sets the value of the matricula property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatricula(String value) {
                this.matricula = value;
            }

            /**
             * Gets the value of the codCateg property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodCateg() {
                return codCateg;
            }

            /**
             * Sets the value of the codCateg property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodCateg(BigInteger value) {
                this.codCateg = value;
            }

            /**
             * Gets the value of the natAtividade property.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getNatAtividade() {
                return natAtividade;
            }

            /**
             * Sets the value of the natAtividade property.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setNatAtividade(Byte value) {
                this.natAtividade = value;
            }

            /**
             * Gets the value of the infoRegCTPS property.
             * 
             * @return
             *     possible object is
             *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS }
             *     
             */
            public ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS getInfoRegCTPS() {
                return infoRegCTPS;
            }

            /**
             * Sets the value of the infoRegCTPS property.
             * 
             * @param value
             *     allowed object is
             *     {@link ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS }
             *     
             */
            public void setInfoRegCTPS(ESocial.EvtAdmPrelim.InfoRegPrelim.InfoRegCTPS value) {
                this.infoRegCTPS = value;
            }


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
             *         &lt;element name="CBOCargo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_cbo"/>
             *         &lt;element name="vrSalFx" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_vrSalFx"/>
             *         &lt;element name="undSalFixo" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_undSalFixo"/>
             *         &lt;element name="tpContr" type="{http://www.esocial.gov.br/schema/evt/evtAdmPrelim/v_S_01_01_00}TS_tpContr"/>
             *         &lt;element name="dtTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cboCargo",
                "vrSalFx",
                "undSalFixo",
                "tpContr",
                "dtTerm"
            })
            public static class InfoRegCTPS {

                @XmlElement(name = "CBOCargo", required = true)
                protected String cboCargo;
                @XmlElement(required = true)
                protected BigDecimal vrSalFx;
                protected byte undSalFixo;
                protected byte tpContr;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtTerm;

                /**
                 * Gets the value of the cboCargo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCBOCargo() {
                    return cboCargo;
                }

                /**
                 * Sets the value of the cboCargo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCBOCargo(String value) {
                    this.cboCargo = value;
                }

                /**
                 * Gets the value of the vrSalFx property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrSalFx() {
                    return vrSalFx;
                }

                /**
                 * Sets the value of the vrSalFx property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrSalFx(BigDecimal value) {
                    this.vrSalFx = value;
                }

                /**
                 * Gets the value of the undSalFixo property.
                 * 
                 */
                public byte getUndSalFixo() {
                    return undSalFixo;
                }

                /**
                 * Sets the value of the undSalFixo property.
                 * 
                 */
                public void setUndSalFixo(byte value) {
                    this.undSalFixo = value;
                }

                /**
                 * Gets the value of the tpContr property.
                 * 
                 */
                public byte getTpContr() {
                    return tpContr;
                }

                /**
                 * Sets the value of the tpContr property.
                 * 
                 */
                public void setTpContr(byte value) {
                    this.tpContr = value;
                }

                /**
                 * Gets the value of the dtTerm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtTerm() {
                    return dtTerm;
                }

                /**
                 * Sets the value of the dtTerm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtTerm(XMLGregorianCalendar value) {
                    this.dtTerm = value;
                }

            }

        }

    }

}
