package bean;
// Generated 21/09/2023 21:37:26 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PatrocinadoresGvo generated by hbm2java
 */
@Entity
@Table(name="patrocinadores_gvo"
    ,catalog="guilherme_osterberg2"
)
public class PatrocinadoresGvo  implements java.io.Serializable {


     private int idPatrocinadoresGvo;
     private String nomeEmpresaGvo;
     private String cnpjGvo;
     private String celularGvo;
     private String emailGvo;
     private Set produtosGvos = new HashSet(0);
     private Set jogosGvos = new HashSet(0);

    public PatrocinadoresGvo() {
    }

	
    public PatrocinadoresGvo(int idPatrocinadoresGvo, String nomeEmpresaGvo, String cnpjGvo, String celularGvo, String emailGvo) {
        this.idPatrocinadoresGvo = idPatrocinadoresGvo;
        this.nomeEmpresaGvo = nomeEmpresaGvo;
        this.cnpjGvo = cnpjGvo;
        this.celularGvo = celularGvo;
        this.emailGvo = emailGvo;
    }
    public PatrocinadoresGvo(int idPatrocinadoresGvo, String nomeEmpresaGvo, String cnpjGvo, String celularGvo, String emailGvo, Set produtosGvos, Set jogosGvos) {
       this.idPatrocinadoresGvo = idPatrocinadoresGvo;
       this.nomeEmpresaGvo = nomeEmpresaGvo;
       this.cnpjGvo = cnpjGvo;
       this.celularGvo = celularGvo;
       this.emailGvo = emailGvo;
       this.produtosGvos = produtosGvos;
       this.jogosGvos = jogosGvos;
    }
   
     @Id 

    
    @Column(name="idPatrocinadores_gvo", unique=true, nullable=false)
    public int getIdPatrocinadoresGvo() {
        return this.idPatrocinadoresGvo;
    }
    
    public void setIdPatrocinadoresGvo(int idPatrocinadoresGvo) {
        this.idPatrocinadoresGvo = idPatrocinadoresGvo;
    }

    
    @Column(name="NomeEmpresa_gvo", nullable=false, length=50)
    public String getNomeEmpresaGvo() {
        return this.nomeEmpresaGvo;
    }
    
    public void setNomeEmpresaGvo(String nomeEmpresaGvo) {
        this.nomeEmpresaGvo = nomeEmpresaGvo;
    }

    
    @Column(name="cnpj_gvo", nullable=false, length=14)
    public String getCnpjGvo() {
        return this.cnpjGvo;
    }
    
    public void setCnpjGvo(String cnpjGvo) {
        this.cnpjGvo = cnpjGvo;
    }

    
    @Column(name="celular_gvo", nullable=false, length=25)
    public String getCelularGvo() {
        return this.celularGvo;
    }
    
    public void setCelularGvo(String celularGvo) {
        this.celularGvo = celularGvo;
    }

    
    @Column(name="email_gvo", nullable=false, length=100)
    public String getEmailGvo() {
        return this.emailGvo;
    }
    
    public void setEmailGvo(String emailGvo) {
        this.emailGvo = emailGvo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="patrocinadoresGvo")
    public Set getProdutosGvos() {
        return this.produtosGvos;
    }
    
    public void setProdutosGvos(Set produtosGvos) {
        this.produtosGvos = produtosGvos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="patrocinadoresGvo")
    public Set getJogosGvos() {
        return this.jogosGvos;
    }
    
    public void setJogosGvos(Set jogosGvos) {
        this.jogosGvos = jogosGvos;
    }




}


