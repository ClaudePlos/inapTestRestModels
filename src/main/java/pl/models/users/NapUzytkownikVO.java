/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models.users;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author k.skowronski
 */
@Entity
@Table(name = "NAP_UZYTKOWNIK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NapUzytkownikVO.findAll", query = "SELECT n FROM NapUzytkownikVO n"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzId", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzId = :uzId"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzNazwa", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzNazwa = :uzNazwa"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzStanowisko", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzStanowisko = :uzStanowisko"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzOkres", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzOkres = :uzOkres"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzOkresyAkt", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzOkresyAkt = :uzOkresyAkt"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzStanowiskaAkt", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzStanowiskaAkt = :uzStanowiskaAkt"),
    @NamedQuery(name = "NapUzytkownikVO.findByPrcId", query = "SELECT n FROM NapUzytkownikVO n WHERE n.prcId = :prcId"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzHaslo", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzHaslo = :uzHaslo"),
    @NamedQuery(name = "NapUzytkownikVO.findByProfileLdap", query = "SELECT n FROM NapUzytkownikVO n WHERE n.profileLdap = :profileLdap"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzHasloZakodowane", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzHasloZakodowane = :uzHasloZakodowane"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzModifiedBy", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzModifiedBy = :uzModifiedBy"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzModifiedAt", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzModifiedAt = :uzModifiedAt"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzCreatedAt", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzCreatedAt = :uzCreatedAt"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzCreatedBy", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzCreatedBy = :uzCreatedBy"),
    @NamedQuery(name = "NapUzytkownikVO.findByUzAktywny", query = "SELECT n FROM NapUzytkownikVO n WHERE n.uzAktywny = :uzAktywny"),
    @NamedQuery(name = "NapUzytkownikVO.findByHasloBackup", query = "SELECT n FROM NapUzytkownikVO n WHERE n.hasloBackup = :hasloBackup"),
    @NamedQuery(name = "NapUzytkownikVO.findByZmienLdap", query = "SELECT n FROM NapUzytkownikVO n WHERE n.zmienLdap = :zmienLdap"),
    @NamedQuery(name = "NapUzytkownikVO.findBySkrot", query = "SELECT n FROM NapUzytkownikVO n WHERE n.skrot = :skrot"),
    @NamedQuery(name = "NapUzytkownikVO.findByKontoOracle", query = "SELECT n FROM NapUzytkownikVO n WHERE n.kontoOracle = :kontoOracle"),
    @NamedQuery(name = "NapUzytkownikVO.findByWymagaOdswiezenia", query = "SELECT n FROM NapUzytkownikVO n WHERE n.wymagaOdswiezenia = :wymagaOdswiezenia"),
    @NamedQuery(name = "NapUzytkownikVO.findBySprUprDok", query = "SELECT n FROM NapUzytkownikVO n WHERE n.sprUprDok = :sprUprDok"),
    @NamedQuery(name = "NapUzytkownikVO.findByToken", query = "SELECT n FROM NapUzytkownikVO n WHERE n.token = :token")})
public class NapUzytkownikVO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "UZ_ID")
    private Long uzId;
    @Size(max = 100)
    @Column(name = "UZ_NAZWA")
    private String uzNazwa;
    @Column(name = "UZ_STANOWISKO")
    private Long uzStanowisko;
    @Column(name = "UZ_OKRES")
    private Long uzOkres;
    @Size(max = 5)
    @Column(name = "UZ_OKRESY_AKT")
    private String uzOkresyAkt;
    @Size(max = 5)
    @Column(name = "UZ_STANOWISKA_AKT")
    private String uzStanowiskaAkt;
    @Column(name = "PRC_ID")
    private Long prcId;
    @Size(max = 100)
    @Column(name = "UZ_HASLO")
    private String uzHaslo;
    @Size(max = 500)
    @Column(name = "PROFILE_LDAP")
    private String profileLdap;
    @Size(max = 500)
    @Column(name = "UZ_HASLO_ZAKODOWANE")
    private String uzHasloZakodowane;
    @Size(max = 200)
    @Column(name = "UZ_MODIFIED_BY")
    private String uzModifiedBy;
    @Column(name = "UZ_MODIFIED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uzModifiedAt;
    @Column(name = "UZ_CREATED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uzCreatedAt;
    @Size(max = 200)
    @Column(name = "UZ_CREATED_BY")
    private String uzCreatedBy;
    @Size(max = 1)
    @Column(name = "UZ_AKTYWNY")
    private String uzAktywny;
    @Size(max = 200)
    @Column(name = "HASLO_BACKUP")
    private String hasloBackup;
    @Size(max = 1)
    @Column(name = "ZMIEN_LDAP")
    private String zmienLdap;
    @Size(max = 6)
    @Column(name = "SKROT")
    private String skrot;
    @Size(max = 20)
    @Column(name = "KONTO_ORACLE")
    private String kontoOracle;
    @Size(max = 1)
    @Column(name = "WYMAGA_ODSWIEZENIA")
    private String wymagaOdswiezenia;
    @Size(max = 1)
    @Column(name = "SPR_UPR_DOK")
    private String sprUprDok;
    @Size(max = 100)
    @Column(name = "TOKEN")
    private String token;

    public NapUzytkownikVO() {
    }

    public NapUzytkownikVO(Long uzId) {
        this.uzId = uzId;
    }

    public Long getUzId() {
        return uzId;
    }

    public void setUzId(Long uzId) {
        this.uzId = uzId;
    }

    public String getUzNazwa() {
        return uzNazwa;
    }

    public void setUzNazwa(String uzNazwa) {
        this.uzNazwa = uzNazwa;
    }

    public Long getUzStanowisko() {
        return uzStanowisko;
    }

    public void setUzStanowisko(Long uzStanowisko) {
        this.uzStanowisko = uzStanowisko;
    }

    public Long getUzOkres() {
        return uzOkres;
    }

    public void setUzOkres(Long uzOkres) {
        this.uzOkres = uzOkres;
    }

    public String getUzOkresyAkt() {
        return uzOkresyAkt;
    }

    public void setUzOkresyAkt(String uzOkresyAkt) {
        this.uzOkresyAkt = uzOkresyAkt;
    }

    public String getUzStanowiskaAkt() {
        return uzStanowiskaAkt;
    }

    public void setUzStanowiskaAkt(String uzStanowiskaAkt) {
        this.uzStanowiskaAkt = uzStanowiskaAkt;
    }

    public Long getPrcId() {
        return prcId;
    }

    public void setPrcId(Long prcId) {
        this.prcId = prcId;
    }

    public String getUzHaslo() {
        return uzHaslo;
    }

    public void setUzHaslo(String uzHaslo) {
        this.uzHaslo = uzHaslo;
    }

    public String getProfileLdap() {
        return profileLdap;
    }

    public void setProfileLdap(String profileLdap) {
        this.profileLdap = profileLdap;
    }

    public String getUzHasloZakodowane() {
        return uzHasloZakodowane;
    }

    public void setUzHasloZakodowane(String uzHasloZakodowane) {
        this.uzHasloZakodowane = uzHasloZakodowane;
    }

    public String getUzModifiedBy() {
        return uzModifiedBy;
    }

    public void setUzModifiedBy(String uzModifiedBy) {
        this.uzModifiedBy = uzModifiedBy;
    }

    public Date getUzModifiedAt() {
        return uzModifiedAt;
    }

    public void setUzModifiedAt(Date uzModifiedAt) {
        this.uzModifiedAt = uzModifiedAt;
    }

    public Date getUzCreatedAt() {
        return uzCreatedAt;
    }

    public void setUzCreatedAt(Date uzCreatedAt) {
        this.uzCreatedAt = uzCreatedAt;
    }

    public String getUzCreatedBy() {
        return uzCreatedBy;
    }

    public void setUzCreatedBy(String uzCreatedBy) {
        this.uzCreatedBy = uzCreatedBy;
    }

    public String getUzAktywny() {
        return uzAktywny;
    }

    public void setUzAktywny(String uzAktywny) {
        this.uzAktywny = uzAktywny;
    }

    public String getHasloBackup() {
        return hasloBackup;
    }

    public void setHasloBackup(String hasloBackup) {
        this.hasloBackup = hasloBackup;
    }

    public String getZmienLdap() {
        return zmienLdap;
    }

    public void setZmienLdap(String zmienLdap) {
        this.zmienLdap = zmienLdap;
    }

    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
    }

    public String getKontoOracle() {
        return kontoOracle;
    }

    public void setKontoOracle(String kontoOracle) {
        this.kontoOracle = kontoOracle;
    }

    public String getWymagaOdswiezenia() {
        return wymagaOdswiezenia;
    }

    public void setWymagaOdswiezenia(String wymagaOdswiezenia) {
        this.wymagaOdswiezenia = wymagaOdswiezenia;
    }

    public String getSprUprDok() {
        return sprUprDok;
    }

    public void setSprUprDok(String sprUprDok) {
        this.sprUprDok = sprUprDok;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uzId != null ? uzId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NapUzytkownikVO)) {
            return false;
        }
        NapUzytkownikVO other = (NapUzytkownikVO) object;
        if ((this.uzId == null && other.uzId != null) || (this.uzId != null && !this.uzId.equals(other.uzId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.models.NapUzytkownikVO[ uzId=" + uzId + " ]";
    }
    
}
