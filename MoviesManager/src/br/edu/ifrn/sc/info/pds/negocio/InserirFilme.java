
package br.edu.ifrn.sc.info.pds.negocio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inserirFilme complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserirFilme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="novoFilme" type="{http://negocio.pds.info.sc.ifrn.edu.br/}filme" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirFilme", propOrder = {
    "novoFilme"
})
public class InserirFilme {

    protected Filme novoFilme;

    /**
     * Obtém o valor da propriedade novoFilme.
     * 
     * @return
     *     possible object is
     *     {@link Filme }
     *     
     */
    public Filme getNovoFilme() {
        return novoFilme;
    }

    /**
     * Define o valor da propriedade novoFilme.
     * 
     * @param value
     *     allowed object is
     *     {@link Filme }
     *     
     */
    public void setNovoFilme(Filme value) {
        this.novoFilme = value;
    }

}
