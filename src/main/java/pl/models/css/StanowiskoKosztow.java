/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models.css;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author k.skowronski
 */
@Entity
@Table(name = "cssv_sk_z_regionem")
@XmlRootElement
public class StanowiskoKosztow implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "SK_ID", nullable = false)
    private BigDecimal skId;
    
    @Column(name = "SK_STAN_DEFINICJI", nullable = false)
    private String skStanDefinicji;
    
    @Column(name = "SK_KOD", nullable = false)
    private String skKod;
    
    @Column(name = "SK_OPIS")
    private String skOpis;

    @Column
    private String  regionKod ;

    @Column
    private String  regionNazwa ;
    
    @Column
    private String  rodzajDzialalnosci ;
    
    @Column(name="frm_id")
    private Long  frmId ;
    
    @Column(name="skrot")
    private String skrot; 

    @Transient
    private String modyfikacja ;

    public String getRodzajDzialalnosci() {
        return rodzajDzialalnosci;
    }

    public void setRodzajDzialalnosci(String rodzajDzialalnosci) {
        this.rodzajDzialalnosci = rodzajDzialalnosci;
    }

    public Long getFrmId() {
        return frmId;
    }

    public void setFrmId(Long frmId) {
        this.frmId = frmId;
    }

    public String getRegionKod() {
        return regionKod;
    }
    
    // zwraca region z doklejonym skId
    public String getRegionex()
    {
        return regionKod+"-"+skId.toString();
    }

    public void setRegionKod(String regionKod) {
        this.regionKod = regionKod;
    }

    public String getRegionNazwa() {
        return regionNazwa;
    }

    public void setRegionNazwa(String regionNazwa) {
        this.regionNazwa = regionNazwa;
    }

    

    public String getModyfikacja() {
        return modyfikacja;
    }

    public void setModyfikacja(String modyfikacja) {
        this.modyfikacja = modyfikacja;
    }

    

    public StanowiskoKosztow() {
    }

    public StanowiskoKosztow(BigDecimal skId) {
        this.skId = skId;
    }

    public StanowiskoKosztow(BigDecimal skId, String skUserCreated, Date skDateCreated, String skStanDefinicji, String skKod, long skIdNiezatwierdzonego) {
        this.skId = skId;
        this.skStanDefinicji = skStanDefinicji;
        this.skKod = skKod;
    }


    public String getSkStanDefinicji() {
        return skStanDefinicji;
    }

    public void setSkStanDefinicji(String skStanDefinicji) {
        this.skStanDefinicji = skStanDefinicji;
    }

    public String getSkKod() {
        return skKod;
    }

    public void setSkKod(String skKod) {
        this.skKod = skKod;
    }

    public String getSkOpis() {
        return skOpis;
    }

    public void setSkOpis(String skOpis) {
        this.skOpis = skOpis;
    }

    public BigDecimal getSkId() {
        return skId;
    }

    public void setSkId(BigDecimal skId) {
        this.skId = skId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skId != null ? skId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StanowiskoKosztow)) {
            return false;
        }
        StanowiskoKosztow other = (StanowiskoKosztow) object;

        if ( other.skId == this.skId )
            return true;
        
        return false;
    }

    @Override
    public String toString() {
        return "SK[skId=" + skId + ",skKod="+skKod+",skOpis"+skOpis +"]";
    }

    public String getKodOpis()
    {
        return skKod + " " + skOpis;
    }

    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
    }

    public String skrotLubOpis(){
        if ( skrot!=null && skrot.length()!=0)
            return skrot;
        return skOpis;
    }
    
}