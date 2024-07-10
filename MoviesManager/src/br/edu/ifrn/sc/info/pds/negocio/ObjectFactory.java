
package br.edu.ifrn.sc.info.pds.negocio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifrn.sc.info.pds.negocio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InserirFilme_QNAME = new QName("http://negocio.pds.info.sc.ifrn.edu.br/", "inserirFilme");
    private final static QName _InserirFilmeResponse_QNAME = new QName("http://negocio.pds.info.sc.ifrn.edu.br/", "inserirFilmeResponse");
    private final static QName _ListarFilmes_QNAME = new QName("http://negocio.pds.info.sc.ifrn.edu.br/", "listarFilmes");
    private final static QName _ListarFilmesResponse_QNAME = new QName("http://negocio.pds.info.sc.ifrn.edu.br/", "listarFilmesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifrn.sc.info.pds.negocio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InserirFilme }
     * 
     */
    public InserirFilme createInserirFilme() {
        return new InserirFilme();
    }

    /**
     * Create an instance of {@link InserirFilmeResponse }
     * 
     */
    public InserirFilmeResponse createInserirFilmeResponse() {
        return new InserirFilmeResponse();
    }

    /**
     * Create an instance of {@link ListarFilmes }
     * 
     */
    public ListarFilmes createListarFilmes() {
        return new ListarFilmes();
    }

    /**
     * Create an instance of {@link ListarFilmesResponse }
     * 
     */
    public ListarFilmesResponse createListarFilmesResponse() {
        return new ListarFilmesResponse();
    }

    /**
     * Create an instance of {@link Filme }
     * 
     */
    public Filme createFilme() {
        return new Filme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirFilme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirFilme }{@code >}
     */
    @XmlElementDecl(namespace = "http://negocio.pds.info.sc.ifrn.edu.br/", name = "inserirFilme")
    public JAXBElement<InserirFilme> createInserirFilme(InserirFilme value) {
        return new JAXBElement<InserirFilme>(_InserirFilme_QNAME, InserirFilme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirFilmeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirFilmeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://negocio.pds.info.sc.ifrn.edu.br/", name = "inserirFilmeResponse")
    public JAXBElement<InserirFilmeResponse> createInserirFilmeResponse(InserirFilmeResponse value) {
        return new JAXBElement<InserirFilmeResponse>(_InserirFilmeResponse_QNAME, InserirFilmeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFilmes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarFilmes }{@code >}
     */
    @XmlElementDecl(namespace = "http://negocio.pds.info.sc.ifrn.edu.br/", name = "listarFilmes")
    public JAXBElement<ListarFilmes> createListarFilmes(ListarFilmes value) {
        return new JAXBElement<ListarFilmes>(_ListarFilmes_QNAME, ListarFilmes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFilmesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarFilmesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://negocio.pds.info.sc.ifrn.edu.br/", name = "listarFilmesResponse")
    public JAXBElement<ListarFilmesResponse> createListarFilmesResponse(ListarFilmesResponse value) {
        return new JAXBElement<ListarFilmesResponse>(_ListarFilmesResponse_QNAME, ListarFilmesResponse.class, null, value);
    }

}
