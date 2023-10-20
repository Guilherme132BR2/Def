package bean;
// Generated 21/09/2023 21:37:26 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProdutosGvo generated by hbm2java
 */
@Entity
@Table(name="produtos_gvo"
    ,catalog="guilherme_osterberg2"
)
public class ProdutosGvo  implements java.io.Serializable {


     private int idProdutosGvo;
     private PatrocinadoresGvo patrocinadoresGvo;
     private String nomeGvo;
     private BigDecimal precoGvo;
     private String estoqueGvo;
     private int codigoBarrasGvo;

    public ProdutosGvo() {
    }

    public ProdutosGvo(int idProdutosGvo, PatrocinadoresGvo patrocinadoresGvo, String nomeGvo, BigDecimal precoGvo, String estoqueGvo, int codigoBarrasGvo) {
       this.idProdutosGvo = idProdutosGvo;
       this.patrocinadoresGvo = patrocinadoresGvo;
       this.nomeGvo = nomeGvo;
       this.precoGvo = precoGvo;
       this.estoqueGvo = estoqueGvo;
       this.codigoBarrasGvo = codigoBarrasGvo;
    }
   
     @Id 

    
    @Column(name="idProdutos_gvo", unique=true, nullable=false)
    public int getIdProdutosGvo() {
        return this.idProdutosGvo;
    }
    
    public void setIdProdutosGvo(int idProdutosGvo) {
        this.idProdutosGvo = idProdutosGvo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_Patrocinadores_gvo", nullable=false)
    public PatrocinadoresGvo getPatrocinadoresGvo() {
        return this.patrocinadoresGvo;
    }
    
    public void setPatrocinadoresGvo(PatrocinadoresGvo patrocinadoresGvo) {
        this.patrocinadoresGvo = patrocinadoresGvo;
    }

    
    @Column(name="nome_gvo", nullable=false, length=50)
    public String getNomeGvo() {
        return this.nomeGvo;
    }
    
    public void setNomeGvo(String nomeGvo) {
        this.nomeGvo = nomeGvo;
    }

    
    @Column(name="preco_gvo", nullable=false, precision=10)
    public BigDecimal getPrecoGvo() {
        return this.precoGvo;
    }
    
    public void setPrecoGvo(BigDecimal precoGvo) {
        this.precoGvo = precoGvo;
    }

    
    @Column(name="estoque_gvo", nullable=false, length=50)
    public String getEstoqueGvo() {
        return this.estoqueGvo;
    }
    
    public void setEstoqueGvo(String estoqueGvo) {
        this.estoqueGvo = estoqueGvo;
    }

    
    @Column(name="codigoBarras_gvo", nullable=false)
    public int getCodigoBarrasGvo() {
        return this.codigoBarrasGvo;
    }
    
    public void setCodigoBarrasGvo(int codigoBarrasGvo) {
        this.codigoBarrasGvo = codigoBarrasGvo;
    }




}

