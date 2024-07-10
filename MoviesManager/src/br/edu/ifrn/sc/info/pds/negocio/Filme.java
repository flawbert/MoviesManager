
package br.edu.ifrn.sc.info.pds.negocio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de filme complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="filme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="avaliacao" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="duracaoMinutos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filme", propOrder = {
    "ano",
    "avaliacao",
    "duracaoMinutos",
    "id",
    "titulo"
})
public class Filme {

    protected int ano;
    protected double avaliacao;
    protected int duracaoMinutos;
    protected int id;
    protected String titulo;

    /**
     * Obtém o valor da propriedade ano.
     * 
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     */
    public void setAno(int value) {
        this.ano = value;
    }

    /**
     * Obtém o valor da propriedade avaliacao.
     * 
     */
    public double getAvaliacao() {
        return avaliacao;
    }

    /**
     * Define o valor da propriedade avaliacao.
     * 
     */
    public void setAvaliacao(double value) {
        this.avaliacao = value;
    }

    /**
     * Obtém o valor da propriedade duracaoMinutos.
     * 
     */
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    /**
     * Define o valor da propriedade duracaoMinutos.
     * 
     */
    public void setDuracaoMinutos(int value) {
        this.duracaoMinutos = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
