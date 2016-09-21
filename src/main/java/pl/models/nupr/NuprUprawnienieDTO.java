/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models.nupr;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import pl.models.css.StanowiskoKosztow;

/**
 *
 * @author k.skowronski
 */
//@Entity
//@Table(name="nupr_uprawnienia_sk")
//@IdClass( NuprUprawnienieSkPk.class )
//@XmlRootElement
public class NuprUprawnienieDTO implements Serializable
{
   private static final long serialVersionUID = 1L;

  
   private String grupaSk;
   
   
   private  BigDecimal uzId;

   
   private  BigDecimal skId ; 

   
   private  String  region ; 

   private String typNadania;

  
   private BigDecimal narzedzieId;

   
   private  BigDecimal    procesId;

   
   private BigDecimal defProcesuId;

   
   private BigDecimal zadanieId;
   
  
   private BigDecimal frmId; 
   
  
   private String dywizja;
   
 
   private BigDecimal zatId; 

   @Transient
   private StanowiskoKosztow sk;


   private  String modyfikacja;

    public String getGrupaSk() {
        return grupaSk;
    }

    public void setGrupaSk(String grupaSk) {
        this.grupaSk = grupaSk;
    }

    public BigDecimal getUzId() {
        return uzId;
    }

    public void setUzId(BigDecimal uzId) {
        this.uzId = uzId;
    }

    public BigDecimal getSkId() {
        return skId;
    }

    public void setSkId(BigDecimal skId) {
        this.skId = skId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTypNadania() {
        return typNadania;
    }

    public void setTypNadania(String typNadania) {
        this.typNadania = typNadania;
    }

    public BigDecimal getNarzedzieId() {
        return narzedzieId;
    }

    public void setNarzedzieId(BigDecimal narzedzieId) {
        this.narzedzieId = narzedzieId;
    }

    public BigDecimal getProcesId() {
        return procesId;
    }

    public void setProcesId(BigDecimal procesId) {
        this.procesId = procesId;
    }

    public BigDecimal getDefProcesuId() {
        return defProcesuId;
    }

    public void setDefProcesuId(BigDecimal defProcesuId) {
        this.defProcesuId = defProcesuId;
    }

    public BigDecimal getZadanieId() {
        return zadanieId;
    }

    public void setZadanieId(BigDecimal zadanieId) {
        this.zadanieId = zadanieId;
    }

    public BigDecimal getFrmId() {
        return frmId;
    }

    public void setFrmId(BigDecimal frmId) {
        this.frmId = frmId;
    }

    public String getDywizja() {
        return dywizja;
    }

    public void setDywizja(String dywizja) {
        this.dywizja = dywizja;
    }

    public BigDecimal getZatId() {
        return zatId;
    }

    public void setZatId(BigDecimal zatId) {
        this.zatId = zatId;
    }

    public StanowiskoKosztow getSk() {
        return sk;
    }

    public void setSk(StanowiskoKosztow sk) {
        this.sk = sk;
    }

    public String getModyfikacja() {
        return modyfikacja;
    }

    public void setModyfikacja(String modyfikacja) {
        this.modyfikacja = modyfikacja;
    }

   
   

}
