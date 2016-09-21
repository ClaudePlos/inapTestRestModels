/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models.ckk;

import pl.models.hr.PracownikVO;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CKK_ADRESY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdresyVO.findAll", query = "SELECT a FROM AdresyVO a"),
    @NamedQuery(name = "AdresyVO.findByAdrId", query = "SELECT a FROM AdresyVO a WHERE a.adrId = :adrId"),
    @NamedQuery(name = "AdresyVO.findByAdrTyp", query = "SELECT a FROM AdresyVO a WHERE a.adrTyp = :adrTyp"),
    @NamedQuery(name = "AdresyVO.findByAdrLp", query = "SELECT a FROM AdresyVO a WHERE a.adrLp = :adrLp"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc = :adrMiejscowosc"),
    @NamedQuery(name = "AdresyVO.findByAdrTypUlicy", query = "SELECT a FROM AdresyVO a WHERE a.adrTypUlicy = :adrTypUlicy"),
    @NamedQuery(name = "AdresyVO.findByAdrZatwierdzony", query = "SELECT a FROM AdresyVO a WHERE a.adrZatwierdzony = :adrZatwierdzony"),
    @NamedQuery(name = "AdresyVO.findByAdrFAktualne", query = "SELECT a FROM AdresyVO a WHERE a.adrFAktualne = :adrFAktualne"),
    @NamedQuery(name = "AdresyVO.findByAdrUtworzyl", query = "SELECT a FROM AdresyVO a WHERE a.adrUtworzyl = :adrUtworzyl"),
    @NamedQuery(name = "AdresyVO.findByAdrKiedyUtworzyl", query = "SELECT a FROM AdresyVO a WHERE a.adrKiedyUtworzyl = :adrKiedyUtworzyl"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz = :adrKomentarz"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina = :adrGmina"),
    @NamedQuery(name = "AdresyVO.findByAdrKodPocztowy", query = "SELECT a FROM AdresyVO a WHERE a.adrKodPocztowy = :adrKodPocztowy"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica = :adrUlica"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu = :adrNumerDomu"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerLokalu", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerLokalu = :adrNumerLokalu"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta = :adrPoczta"),
    @NamedQuery(name = "AdresyVO.findByAdrSkrytkaPocztowa", query = "SELECT a FROM AdresyVO a WHERE a.adrSkrytkaPocztowa = :adrSkrytkaPocztowa"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat = :adrAdresat"),
    @NamedQuery(name = "AdresyVO.findByAdrDef0", query = "SELECT a FROM AdresyVO a WHERE a.adrDef0 = :adrDef0"),
    @NamedQuery(name = "AdresyVO.findByAdrDef1", query = "SELECT a FROM AdresyVO a WHERE a.adrDef1 = :adrDef1"),
    @NamedQuery(name = "AdresyVO.findByAdrDef2", query = "SELECT a FROM AdresyVO a WHERE a.adrDef2 = :adrDef2"),
    @NamedQuery(name = "AdresyVO.findByAdrDef3", query = "SELECT a FROM AdresyVO a WHERE a.adrDef3 = :adrDef3"),
    @NamedQuery(name = "AdresyVO.findByAdrModyfikowal", query = "SELECT a FROM AdresyVO a WHERE a.adrModyfikowal = :adrModyfikowal"),
    @NamedQuery(name = "AdresyVO.findByAdrKiedyModyfikowal", query = "SELECT a FROM AdresyVO a WHERE a.adrKiedyModyfikowal = :adrKiedyModyfikowal"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat = :adrPowiat"),
    @NamedQuery(name = "AdresyVO.findByAdrPowodModyfikacji", query = "SELECT a FROM AdresyVO a WHERE a.adrPowodModyfikacji = :adrPowodModyfikacji"),
    @NamedQuery(name = "AdresyVO.findByAdrMail", query = "SELECT a FROM AdresyVO a WHERE a.adrMail = :adrMail"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc2", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc2 = :adrMiejscowosc2"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc3", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc3 = :adrMiejscowosc3"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc4", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc4 = :adrMiejscowosc4"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc5", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc5 = :adrMiejscowosc5"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc6", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc6 = :adrMiejscowosc6"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc7", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc7 = :adrMiejscowosc7"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc8", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc8 = :adrMiejscowosc8"),
    @NamedQuery(name = "AdresyVO.findByAdrMiejscowosc9", query = "SELECT a FROM AdresyVO a WHERE a.adrMiejscowosc9 = :adrMiejscowosc9"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina2", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina2 = :adrGmina2"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina3", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina3 = :adrGmina3"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina4", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina4 = :adrGmina4"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina5", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina5 = :adrGmina5"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina6", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina6 = :adrGmina6"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina7", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina7 = :adrGmina7"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina8", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina8 = :adrGmina8"),
    @NamedQuery(name = "AdresyVO.findByAdrGmina9", query = "SELECT a FROM AdresyVO a WHERE a.adrGmina9 = :adrGmina9"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica2", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica2 = :adrUlica2"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica3", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica3 = :adrUlica3"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica4", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica4 = :adrUlica4"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica5", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica5 = :adrUlica5"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica6", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica6 = :adrUlica6"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica7", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica7 = :adrUlica7"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica8", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica8 = :adrUlica8"),
    @NamedQuery(name = "AdresyVO.findByAdrUlica9", query = "SELECT a FROM AdresyVO a WHERE a.adrUlica9 = :adrUlica9"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu2", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu2 = :adrNumerDomu2"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu3", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu3 = :adrNumerDomu3"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu4", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu4 = :adrNumerDomu4"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu5", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu5 = :adrNumerDomu5"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu6", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu6 = :adrNumerDomu6"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu7", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu7 = :adrNumerDomu7"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu8", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu8 = :adrNumerDomu8"),
    @NamedQuery(name = "AdresyVO.findByAdrNumerDomu9", query = "SELECT a FROM AdresyVO a WHERE a.adrNumerDomu9 = :adrNumerDomu9"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta2", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta2 = :adrPoczta2"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta3", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta3 = :adrPoczta3"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta4", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta4 = :adrPoczta4"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta5", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta5 = :adrPoczta5"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta6", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta6 = :adrPoczta6"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta7", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta7 = :adrPoczta7"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta8", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta8 = :adrPoczta8"),
    @NamedQuery(name = "AdresyVO.findByAdrPoczta9", query = "SELECT a FROM AdresyVO a WHERE a.adrPoczta9 = :adrPoczta9"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat2", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat2 = :adrAdresat2"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat3", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat3 = :adrAdresat3"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat4", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat4 = :adrAdresat4"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat5", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat5 = :adrAdresat5"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat6", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat6 = :adrAdresat6"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat7", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat7 = :adrAdresat7"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat8", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat8 = :adrAdresat8"),
    @NamedQuery(name = "AdresyVO.findByAdrAdresat9", query = "SELECT a FROM AdresyVO a WHERE a.adrAdresat9 = :adrAdresat9"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat2", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat2 = :adrPowiat2"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat3", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat3 = :adrPowiat3"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat4", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat4 = :adrPowiat4"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat5", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat5 = :adrPowiat5"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat6", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat6 = :adrPowiat6"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat7", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat7 = :adrPowiat7"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat8", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat8 = :adrPowiat8"),
    @NamedQuery(name = "AdresyVO.findByAdrPowiat9", query = "SELECT a FROM AdresyVO a WHERE a.adrPowiat9 = :adrPowiat9"),
    @NamedQuery(name = "AdresyVO.findByAdrNip", query = "SELECT a FROM AdresyVO a WHERE a.adrNip = :adrNip"),
    @NamedQuery(name = "AdresyVO.findByAdrNipPrefiks", query = "SELECT a FROM AdresyVO a WHERE a.adrNipPrefiks = :adrNipPrefiks"),
    @NamedQuery(name = "AdresyVO.findByAdrNipDane", query = "SELECT a FROM AdresyVO a WHERE a.adrNipDane = :adrNipDane"),
    @NamedQuery(name = "AdresyVO.findByAdrAudytKt", query = "SELECT a FROM AdresyVO a WHERE a.adrAudytKt = :adrAudytKt"),
    @NamedQuery(name = "AdresyVO.findByAdrAudytKm", query = "SELECT a FROM AdresyVO a WHERE a.adrAudytKm = :adrAudytKm"),
    @NamedQuery(name = "AdresyVO.findByAdrAudytLm", query = "SELECT a FROM AdresyVO a WHERE a.adrAudytLm = :adrAudytLm"),
    @NamedQuery(name = "AdresyVO.findByAdrKodGusGminy", query = "SELECT a FROM AdresyVO a WHERE a.adrKodGusGminy = :adrKodGusGminy"),
    @NamedQuery(name = "AdresyVO.findByAdrTypMiejscowosci", query = "SELECT a FROM AdresyVO a WHERE a.adrTypMiejscowosci = :adrTypMiejscowosci"),
    @NamedQuery(name = "AdresyVO.findByAdrStan", query = "SELECT a FROM AdresyVO a WHERE a.adrStan = :adrStan"),
    @NamedQuery(name = "AdresyVO.findByAdrRegon", query = "SELECT a FROM AdresyVO a WHERE a.adrRegon = :adrRegon"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz2", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz2 = :adrKomentarz2"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz3", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz3 = :adrKomentarz3"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz4", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz4 = :adrKomentarz4"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz5", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz5 = :adrKomentarz5"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz6", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz6 = :adrKomentarz6"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz7", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz7 = :adrKomentarz7"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz8", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz8 = :adrKomentarz8"),
    @NamedQuery(name = "AdresyVO.findByAdrKomentarz9", query = "SELECT a FROM AdresyVO a WHERE a.adrKomentarz9 = :adrKomentarz9"),
    @NamedQuery(name = "AdresyVO.findByAdrPolozenieX", query = "SELECT a FROM AdresyVO a WHERE a.adrPolozenieX = :adrPolozenieX"),
    @NamedQuery(name = "AdresyVO.findByAdrPolozenieY", query = "SELECT a FROM AdresyVO a WHERE a.adrPolozenieY = :adrPolozenieY"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica = :adrDzielnica"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica2", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica2 = :adrDzielnica2"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica3", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica3 = :adrDzielnica3"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica4", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica4 = :adrDzielnica4"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica5", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica5 = :adrDzielnica5"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica6", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica6 = :adrDzielnica6"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica7", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica7 = :adrDzielnica7"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica8", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica8 = :adrDzielnica8"),
    @NamedQuery(name = "AdresyVO.findByAdrDzielnica9", query = "SELECT a FROM AdresyVO a WHERE a.adrDzielnica9 = :adrDzielnica9"),
    @NamedQuery(name = "AdresyVO.findByAdrIln", query = "SELECT a FROM AdresyVO a WHERE a.adrIln = :adrIln")})
public class AdresyVO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADR_ID")
    private Long adrId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ADR_TYP")
    private String adrTyp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADR_LP")
    private int adrLp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ADR_MIEJSCOWOSC")
    private String adrMiejscowosc;
    @Size(max = 2)
    @Column(name = "ADR_TYP_ULICY")
    private String adrTypUlicy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ADR_ZATWIERDZONY")
    private String adrZatwierdzony;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ADR_F_AKTUALNE")
    private String adrFAktualne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ADR_UTWORZYL")
    private String adrUtworzyl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADR_KIEDY_UTWORZYL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adrKiedyUtworzyl;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ")
    private String adrKomentarz;
    @Size(max = 255)
    @Column(name = "ADR_GMINA")
    private String adrGmina;
    @Size(max = 10)
    @Column(name = "ADR_KOD_POCZTOWY")
    private String adrKodPocztowy;
    @Size(max = 100)
    @Column(name = "ADR_ULICA")
    private String adrUlica;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU")
    private String adrNumerDomu;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_LOKALU")
    private String adrNumerLokalu;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA")
    private String adrPoczta;
    @Size(max = 5)
    @Column(name = "ADR_SKRYTKA_POCZTOWA")
    private String adrSkrytkaPocztowa;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT")
    private String adrAdresat;
    @Size(max = 240)
    @Column(name = "ADR_DEF0")
    private String adrDef0;
    @Size(max = 240)
    @Column(name = "ADR_DEF1")
    private String adrDef1;
    @Size(max = 240)
    @Column(name = "ADR_DEF2")
    private String adrDef2;
    @Size(max = 240)
    @Column(name = "ADR_DEF3")
    private String adrDef3;
    @Size(max = 30)
    @Column(name = "ADR_MODYFIKOWAL")
    private String adrModyfikowal;
    @Column(name = "ADR_KIEDY_MODYFIKOWAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adrKiedyModyfikowal;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT")
    private String adrPowiat;
    @Size(max = 2000)
    @Column(name = "ADR_POWOD_MODYFIKACJI")
    private String adrPowodModyfikacji;
    @Size(max = 240)
    @Column(name = "ADR_MAIL")
    private String adrMail;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC2")
    private String adrMiejscowosc2;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC3")
    private String adrMiejscowosc3;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC4")
    private String adrMiejscowosc4;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC5")
    private String adrMiejscowosc5;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC6")
    private String adrMiejscowosc6;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC7")
    private String adrMiejscowosc7;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC8")
    private String adrMiejscowosc8;
    @Size(max = 50)
    @Column(name = "ADR_MIEJSCOWOSC9")
    private String adrMiejscowosc9;
    @Size(max = 255)
    @Column(name = "ADR_GMINA2")
    private String adrGmina2;
    @Size(max = 255)
    @Column(name = "ADR_GMINA3")
    private String adrGmina3;
    @Size(max = 255)
    @Column(name = "ADR_GMINA4")
    private String adrGmina4;
    @Size(max = 255)
    @Column(name = "ADR_GMINA5")
    private String adrGmina5;
    @Size(max = 255)
    @Column(name = "ADR_GMINA6")
    private String adrGmina6;
    @Size(max = 255)
    @Column(name = "ADR_GMINA7")
    private String adrGmina7;
    @Size(max = 255)
    @Column(name = "ADR_GMINA8")
    private String adrGmina8;
    @Size(max = 255)
    @Column(name = "ADR_GMINA9")
    private String adrGmina9;
    @Size(max = 100)
    @Column(name = "ADR_ULICA2")
    private String adrUlica2;
    @Size(max = 100)
    @Column(name = "ADR_ULICA3")
    private String adrUlica3;
    @Size(max = 100)
    @Column(name = "ADR_ULICA4")
    private String adrUlica4;
    @Size(max = 100)
    @Column(name = "ADR_ULICA5")
    private String adrUlica5;
    @Size(max = 100)
    @Column(name = "ADR_ULICA6")
    private String adrUlica6;
    @Size(max = 100)
    @Column(name = "ADR_ULICA7")
    private String adrUlica7;
    @Size(max = 100)
    @Column(name = "ADR_ULICA8")
    private String adrUlica8;
    @Size(max = 100)
    @Column(name = "ADR_ULICA9")
    private String adrUlica9;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU2")
    private String adrNumerDomu2;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU3")
    private String adrNumerDomu3;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU4")
    private String adrNumerDomu4;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU5")
    private String adrNumerDomu5;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU6")
    private String adrNumerDomu6;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU7")
    private String adrNumerDomu7;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU8")
    private String adrNumerDomu8;
    @Size(max = 40)
    @Column(name = "ADR_NUMER_DOMU9")
    private String adrNumerDomu9;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA2")
    private String adrPoczta2;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA3")
    private String adrPoczta3;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA4")
    private String adrPoczta4;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA5")
    private String adrPoczta5;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA6")
    private String adrPoczta6;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA7")
    private String adrPoczta7;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA8")
    private String adrPoczta8;
    @Size(max = 50)
    @Column(name = "ADR_POCZTA9")
    private String adrPoczta9;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT2")
    private String adrAdresat2;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT3")
    private String adrAdresat3;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT4")
    private String adrAdresat4;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT5")
    private String adrAdresat5;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT6")
    private String adrAdresat6;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT7")
    private String adrAdresat7;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT8")
    private String adrAdresat8;
    @Size(max = 240)
    @Column(name = "ADR_ADRESAT9")
    private String adrAdresat9;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT2")
    private String adrPowiat2;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT3")
    private String adrPowiat3;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT4")
    private String adrPowiat4;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT5")
    private String adrPowiat5;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT6")
    private String adrPowiat6;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT7")
    private String adrPowiat7;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT8")
    private String adrPowiat8;
    @Size(max = 30)
    @Column(name = "ADR_POWIAT9")
    private String adrPowiat9;
    @Size(max = 25)
    @Column(name = "ADR_NIP")
    private String adrNip;
    @Size(max = 3)
    @Column(name = "ADR_NIP_PREFIKS")
    private String adrNipPrefiks;
    @Size(max = 22)
    @Column(name = "ADR_NIP_DANE")
    private String adrNipDane;
    @Size(max = 100)
    @Column(name = "ADR_AUDYT_KT")
    private String adrAudytKt;
    @Size(max = 100)
    @Column(name = "ADR_AUDYT_KM")
    private String adrAudytKm;
    @Column(name = "ADR_AUDYT_LM")
    private BigInteger adrAudytLm;
    @Size(max = 7)
    @Column(name = "ADR_KOD_GUS_GMINY")
    private String adrKodGusGminy;
    @Size(max = 1)
    @Column(name = "ADR_TYP_MIEJSCOWOSCI")
    private String adrTypMiejscowosci;
    @Size(max = 10)
    @Column(name = "ADR_STAN")
    private String adrStan;
    @Size(max = 5)
    @Column(name = "ADR_REGON")
    private String adrRegon;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ2")
    private String adrKomentarz2;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ3")
    private String adrKomentarz3;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ4")
    private String adrKomentarz4;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ5")
    private String adrKomentarz5;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ6")
    private String adrKomentarz6;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ7")
    private String adrKomentarz7;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ8")
    private String adrKomentarz8;
    @Size(max = 2000)
    @Column(name = "ADR_KOMENTARZ9")
    private String adrKomentarz9;
    @Column(name = "ADR_POLOZENIE_X")
    private BigInteger adrPolozenieX;
    @Column(name = "ADR_POLOZENIE_Y")
    private BigInteger adrPolozenieY;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA")
    private String adrDzielnica;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA2")
    private String adrDzielnica2;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA3")
    private String adrDzielnica3;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA4")
    private String adrDzielnica4;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA5")
    private String adrDzielnica5;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA6")
    private String adrDzielnica6;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA7")
    private String adrDzielnica7;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA8")
    private String adrDzielnica8;
    @Size(max = 50)
    @Column(name = "ADR_DZIELNICA9")
    private String adrDzielnica9;
    @Size(max = 13)
    @Column(name = "ADR_ILN")
    private String adrIln;
    @Column(name = "ADR_PRC_ID")
    private Long adrPrcId;

    public AdresyVO() {
    }

    public AdresyVO(Long adrId) {
        this.adrId = adrId;
    }

    public AdresyVO(Long adrId, String adrTyp, int adrLp, String adrMiejscowosc, String adrZatwierdzony, String adrFAktualne, String adrUtworzyl, Date adrKiedyUtworzyl) {
        this.adrId = adrId;
        this.adrTyp = adrTyp;
        this.adrLp = adrLp;
        this.adrMiejscowosc = adrMiejscowosc;
        this.adrZatwierdzony = adrZatwierdzony;
        this.adrFAktualne = adrFAktualne;
        this.adrUtworzyl = adrUtworzyl;
        this.adrKiedyUtworzyl = adrKiedyUtworzyl;
    }

    public Long getAdrId() {
        return adrId;
    }

    public void setAdrId(Long adrId) {
        this.adrId = adrId;
    }

    public String getAdrTyp() {
        return adrTyp;
    }

    public void setAdrTyp(String adrTyp) {
        this.adrTyp = adrTyp;
    }

    public int getAdrLp() {
        return adrLp;
    }

    public void setAdrLp(int adrLp) {
        this.adrLp = adrLp;
    }

    public String getAdrMiejscowosc() {
        return adrMiejscowosc;
    }

    public void setAdrMiejscowosc(String adrMiejscowosc) {
        this.adrMiejscowosc = adrMiejscowosc;
    }

    public String getAdrTypUlicy() {
        return adrTypUlicy;
    }

    public void setAdrTypUlicy(String adrTypUlicy) {
        this.adrTypUlicy = adrTypUlicy;
    }

    public String getAdrZatwierdzony() {
        return adrZatwierdzony;
    }

    public void setAdrZatwierdzony(String adrZatwierdzony) {
        this.adrZatwierdzony = adrZatwierdzony;
    }

    public String getAdrFAktualne() {
        return adrFAktualne;
    }

    public void setAdrFAktualne(String adrFAktualne) {
        this.adrFAktualne = adrFAktualne;
    }

    public String getAdrUtworzyl() {
        return adrUtworzyl;
    }

    public void setAdrUtworzyl(String adrUtworzyl) {
        this.adrUtworzyl = adrUtworzyl;
    }

    public Date getAdrKiedyUtworzyl() {
        return adrKiedyUtworzyl;
    }

    public void setAdrKiedyUtworzyl(Date adrKiedyUtworzyl) {
        this.adrKiedyUtworzyl = adrKiedyUtworzyl;
    }

    public String getAdrKomentarz() {
        return adrKomentarz;
    }

    public void setAdrKomentarz(String adrKomentarz) {
        this.adrKomentarz = adrKomentarz;
    }

    public String getAdrGmina() {
        return adrGmina;
    }

    public void setAdrGmina(String adrGmina) {
        this.adrGmina = adrGmina;
    }

    public String getAdrKodPocztowy() {
        return adrKodPocztowy;
    }

    public void setAdrKodPocztowy(String adrKodPocztowy) {
        this.adrKodPocztowy = adrKodPocztowy;
    }

    public String getAdrUlica() {
        return adrUlica;
    }

    public void setAdrUlica(String adrUlica) {
        this.adrUlica = adrUlica;
    }

    public String getAdrNumerDomu() {
        return adrNumerDomu;
    }

    public void setAdrNumerDomu(String adrNumerDomu) {
        this.adrNumerDomu = adrNumerDomu;
    }

    public String getAdrNumerLokalu() {
        return adrNumerLokalu;
    }

    public void setAdrNumerLokalu(String adrNumerLokalu) {
        this.adrNumerLokalu = adrNumerLokalu;
    }

    public String getAdrPoczta() {
        return adrPoczta;
    }

    public void setAdrPoczta(String adrPoczta) {
        this.adrPoczta = adrPoczta;
    }

    public String getAdrSkrytkaPocztowa() {
        return adrSkrytkaPocztowa;
    }

    public void setAdrSkrytkaPocztowa(String adrSkrytkaPocztowa) {
        this.adrSkrytkaPocztowa = adrSkrytkaPocztowa;
    }

    public String getAdrAdresat() {
        return adrAdresat;
    }

    public void setAdrAdresat(String adrAdresat) {
        this.adrAdresat = adrAdresat;
    }

    public String getAdrDef0() {
        return adrDef0;
    }

    public void setAdrDef0(String adrDef0) {
        this.adrDef0 = adrDef0;
    }

    public String getAdrDef1() {
        return adrDef1;
    }

    public void setAdrDef1(String adrDef1) {
        this.adrDef1 = adrDef1;
    }

    public String getAdrDef2() {
        return adrDef2;
    }

    public void setAdrDef2(String adrDef2) {
        this.adrDef2 = adrDef2;
    }

    public String getAdrDef3() {
        return adrDef3;
    }

    public void setAdrDef3(String adrDef3) {
        this.adrDef3 = adrDef3;
    }

    public String getAdrModyfikowal() {
        return adrModyfikowal;
    }

    public void setAdrModyfikowal(String adrModyfikowal) {
        this.adrModyfikowal = adrModyfikowal;
    }

    public Date getAdrKiedyModyfikowal() {
        return adrKiedyModyfikowal;
    }

    public void setAdrKiedyModyfikowal(Date adrKiedyModyfikowal) {
        this.adrKiedyModyfikowal = adrKiedyModyfikowal;
    }

    public String getAdrPowiat() {
        return adrPowiat;
    }

    public void setAdrPowiat(String adrPowiat) {
        this.adrPowiat = adrPowiat;
    }

    public String getAdrPowodModyfikacji() {
        return adrPowodModyfikacji;
    }

    public void setAdrPowodModyfikacji(String adrPowodModyfikacji) {
        this.adrPowodModyfikacji = adrPowodModyfikacji;
    }

    public String getAdrMail() {
        return adrMail;
    }

    public void setAdrMail(String adrMail) {
        this.adrMail = adrMail;
    }

    public String getAdrMiejscowosc2() {
        return adrMiejscowosc2;
    }

    public void setAdrMiejscowosc2(String adrMiejscowosc2) {
        this.adrMiejscowosc2 = adrMiejscowosc2;
    }

    public String getAdrMiejscowosc3() {
        return adrMiejscowosc3;
    }

    public void setAdrMiejscowosc3(String adrMiejscowosc3) {
        this.adrMiejscowosc3 = adrMiejscowosc3;
    }

    public String getAdrMiejscowosc4() {
        return adrMiejscowosc4;
    }

    public void setAdrMiejscowosc4(String adrMiejscowosc4) {
        this.adrMiejscowosc4 = adrMiejscowosc4;
    }

    public String getAdrMiejscowosc5() {
        return adrMiejscowosc5;
    }

    public void setAdrMiejscowosc5(String adrMiejscowosc5) {
        this.adrMiejscowosc5 = adrMiejscowosc5;
    }

    public String getAdrMiejscowosc6() {
        return adrMiejscowosc6;
    }

    public void setAdrMiejscowosc6(String adrMiejscowosc6) {
        this.adrMiejscowosc6 = adrMiejscowosc6;
    }

    public String getAdrMiejscowosc7() {
        return adrMiejscowosc7;
    }

    public void setAdrMiejscowosc7(String adrMiejscowosc7) {
        this.adrMiejscowosc7 = adrMiejscowosc7;
    }

    public String getAdrMiejscowosc8() {
        return adrMiejscowosc8;
    }

    public void setAdrMiejscowosc8(String adrMiejscowosc8) {
        this.adrMiejscowosc8 = adrMiejscowosc8;
    }

    public String getAdrMiejscowosc9() {
        return adrMiejscowosc9;
    }

    public void setAdrMiejscowosc9(String adrMiejscowosc9) {
        this.adrMiejscowosc9 = adrMiejscowosc9;
    }

    public String getAdrGmina2() {
        return adrGmina2;
    }

    public void setAdrGmina2(String adrGmina2) {
        this.adrGmina2 = adrGmina2;
    }

    public String getAdrGmina3() {
        return adrGmina3;
    }

    public void setAdrGmina3(String adrGmina3) {
        this.adrGmina3 = adrGmina3;
    }

    public String getAdrGmina4() {
        return adrGmina4;
    }

    public void setAdrGmina4(String adrGmina4) {
        this.adrGmina4 = adrGmina4;
    }

    public String getAdrGmina5() {
        return adrGmina5;
    }

    public void setAdrGmina5(String adrGmina5) {
        this.adrGmina5 = adrGmina5;
    }

    public String getAdrGmina6() {
        return adrGmina6;
    }

    public void setAdrGmina6(String adrGmina6) {
        this.adrGmina6 = adrGmina6;
    }

    public String getAdrGmina7() {
        return adrGmina7;
    }

    public void setAdrGmina7(String adrGmina7) {
        this.adrGmina7 = adrGmina7;
    }

    public String getAdrGmina8() {
        return adrGmina8;
    }

    public void setAdrGmina8(String adrGmina8) {
        this.adrGmina8 = adrGmina8;
    }

    public String getAdrGmina9() {
        return adrGmina9;
    }

    public void setAdrGmina9(String adrGmina9) {
        this.adrGmina9 = adrGmina9;
    }

    public String getAdrUlica2() {
        return adrUlica2;
    }

    public void setAdrUlica2(String adrUlica2) {
        this.adrUlica2 = adrUlica2;
    }

    public String getAdrUlica3() {
        return adrUlica3;
    }

    public void setAdrUlica3(String adrUlica3) {
        this.adrUlica3 = adrUlica3;
    }

    public String getAdrUlica4() {
        return adrUlica4;
    }

    public void setAdrUlica4(String adrUlica4) {
        this.adrUlica4 = adrUlica4;
    }

    public String getAdrUlica5() {
        return adrUlica5;
    }

    public void setAdrUlica5(String adrUlica5) {
        this.adrUlica5 = adrUlica5;
    }

    public String getAdrUlica6() {
        return adrUlica6;
    }

    public void setAdrUlica6(String adrUlica6) {
        this.adrUlica6 = adrUlica6;
    }

    public String getAdrUlica7() {
        return adrUlica7;
    }

    public void setAdrUlica7(String adrUlica7) {
        this.adrUlica7 = adrUlica7;
    }

    public String getAdrUlica8() {
        return adrUlica8;
    }

    public void setAdrUlica8(String adrUlica8) {
        this.adrUlica8 = adrUlica8;
    }

    public String getAdrUlica9() {
        return adrUlica9;
    }

    public void setAdrUlica9(String adrUlica9) {
        this.adrUlica9 = adrUlica9;
    }

    public String getAdrNumerDomu2() {
        return adrNumerDomu2;
    }

    public void setAdrNumerDomu2(String adrNumerDomu2) {
        this.adrNumerDomu2 = adrNumerDomu2;
    }

    public String getAdrNumerDomu3() {
        return adrNumerDomu3;
    }

    public void setAdrNumerDomu3(String adrNumerDomu3) {
        this.adrNumerDomu3 = adrNumerDomu3;
    }

    public String getAdrNumerDomu4() {
        return adrNumerDomu4;
    }

    public void setAdrNumerDomu4(String adrNumerDomu4) {
        this.adrNumerDomu4 = adrNumerDomu4;
    }

    public String getAdrNumerDomu5() {
        return adrNumerDomu5;
    }

    public void setAdrNumerDomu5(String adrNumerDomu5) {
        this.adrNumerDomu5 = adrNumerDomu5;
    }

    public String getAdrNumerDomu6() {
        return adrNumerDomu6;
    }

    public void setAdrNumerDomu6(String adrNumerDomu6) {
        this.adrNumerDomu6 = adrNumerDomu6;
    }

    public String getAdrNumerDomu7() {
        return adrNumerDomu7;
    }

    public void setAdrNumerDomu7(String adrNumerDomu7) {
        this.adrNumerDomu7 = adrNumerDomu7;
    }

    public String getAdrNumerDomu8() {
        return adrNumerDomu8;
    }

    public void setAdrNumerDomu8(String adrNumerDomu8) {
        this.adrNumerDomu8 = adrNumerDomu8;
    }

    public String getAdrNumerDomu9() {
        return adrNumerDomu9;
    }

    public void setAdrNumerDomu9(String adrNumerDomu9) {
        this.adrNumerDomu9 = adrNumerDomu9;
    }

    public String getAdrPoczta2() {
        return adrPoczta2;
    }

    public void setAdrPoczta2(String adrPoczta2) {
        this.adrPoczta2 = adrPoczta2;
    }

    public String getAdrPoczta3() {
        return adrPoczta3;
    }

    public void setAdrPoczta3(String adrPoczta3) {
        this.adrPoczta3 = adrPoczta3;
    }

    public String getAdrPoczta4() {
        return adrPoczta4;
    }

    public void setAdrPoczta4(String adrPoczta4) {
        this.adrPoczta4 = adrPoczta4;
    }

    public String getAdrPoczta5() {
        return adrPoczta5;
    }

    public void setAdrPoczta5(String adrPoczta5) {
        this.adrPoczta5 = adrPoczta5;
    }

    public String getAdrPoczta6() {
        return adrPoczta6;
    }

    public void setAdrPoczta6(String adrPoczta6) {
        this.adrPoczta6 = adrPoczta6;
    }

    public String getAdrPoczta7() {
        return adrPoczta7;
    }

    public void setAdrPoczta7(String adrPoczta7) {
        this.adrPoczta7 = adrPoczta7;
    }

    public String getAdrPoczta8() {
        return adrPoczta8;
    }

    public void setAdrPoczta8(String adrPoczta8) {
        this.adrPoczta8 = adrPoczta8;
    }

    public String getAdrPoczta9() {
        return adrPoczta9;
    }

    public void setAdrPoczta9(String adrPoczta9) {
        this.adrPoczta9 = adrPoczta9;
    }

    public String getAdrAdresat2() {
        return adrAdresat2;
    }

    public void setAdrAdresat2(String adrAdresat2) {
        this.adrAdresat2 = adrAdresat2;
    }

    public String getAdrAdresat3() {
        return adrAdresat3;
    }

    public void setAdrAdresat3(String adrAdresat3) {
        this.adrAdresat3 = adrAdresat3;
    }

    public String getAdrAdresat4() {
        return adrAdresat4;
    }

    public void setAdrAdresat4(String adrAdresat4) {
        this.adrAdresat4 = adrAdresat4;
    }

    public String getAdrAdresat5() {
        return adrAdresat5;
    }

    public void setAdrAdresat5(String adrAdresat5) {
        this.adrAdresat5 = adrAdresat5;
    }

    public String getAdrAdresat6() {
        return adrAdresat6;
    }

    public void setAdrAdresat6(String adrAdresat6) {
        this.adrAdresat6 = adrAdresat6;
    }

    public String getAdrAdresat7() {
        return adrAdresat7;
    }

    public void setAdrAdresat7(String adrAdresat7) {
        this.adrAdresat7 = adrAdresat7;
    }

    public String getAdrAdresat8() {
        return adrAdresat8;
    }

    public void setAdrAdresat8(String adrAdresat8) {
        this.adrAdresat8 = adrAdresat8;
    }

    public String getAdrAdresat9() {
        return adrAdresat9;
    }

    public void setAdrAdresat9(String adrAdresat9) {
        this.adrAdresat9 = adrAdresat9;
    }

    public String getAdrPowiat2() {
        return adrPowiat2;
    }

    public void setAdrPowiat2(String adrPowiat2) {
        this.adrPowiat2 = adrPowiat2;
    }

    public String getAdrPowiat3() {
        return adrPowiat3;
    }

    public void setAdrPowiat3(String adrPowiat3) {
        this.adrPowiat3 = adrPowiat3;
    }

    public String getAdrPowiat4() {
        return adrPowiat4;
    }

    public void setAdrPowiat4(String adrPowiat4) {
        this.adrPowiat4 = adrPowiat4;
    }

    public String getAdrPowiat5() {
        return adrPowiat5;
    }

    public void setAdrPowiat5(String adrPowiat5) {
        this.adrPowiat5 = adrPowiat5;
    }

    public String getAdrPowiat6() {
        return adrPowiat6;
    }

    public void setAdrPowiat6(String adrPowiat6) {
        this.adrPowiat6 = adrPowiat6;
    }

    public String getAdrPowiat7() {
        return adrPowiat7;
    }

    public void setAdrPowiat7(String adrPowiat7) {
        this.adrPowiat7 = adrPowiat7;
    }

    public String getAdrPowiat8() {
        return adrPowiat8;
    }

    public void setAdrPowiat8(String adrPowiat8) {
        this.adrPowiat8 = adrPowiat8;
    }

    public String getAdrPowiat9() {
        return adrPowiat9;
    }

    public void setAdrPowiat9(String adrPowiat9) {
        this.adrPowiat9 = adrPowiat9;
    }

    public String getAdrNip() {
        return adrNip;
    }

    public void setAdrNip(String adrNip) {
        this.adrNip = adrNip;
    }

    public String getAdrNipPrefiks() {
        return adrNipPrefiks;
    }

    public void setAdrNipPrefiks(String adrNipPrefiks) {
        this.adrNipPrefiks = adrNipPrefiks;
    }

    public String getAdrNipDane() {
        return adrNipDane;
    }

    public void setAdrNipDane(String adrNipDane) {
        this.adrNipDane = adrNipDane;
    }

    public String getAdrAudytKt() {
        return adrAudytKt;
    }

    public void setAdrAudytKt(String adrAudytKt) {
        this.adrAudytKt = adrAudytKt;
    }

    public String getAdrAudytKm() {
        return adrAudytKm;
    }

    public void setAdrAudytKm(String adrAudytKm) {
        this.adrAudytKm = adrAudytKm;
    }

    public BigInteger getAdrAudytLm() {
        return adrAudytLm;
    }

    public void setAdrAudytLm(BigInteger adrAudytLm) {
        this.adrAudytLm = adrAudytLm;
    }

    public String getAdrKodGusGminy() {
        return adrKodGusGminy;
    }

    public void setAdrKodGusGminy(String adrKodGusGminy) {
        this.adrKodGusGminy = adrKodGusGminy;
    }

    public String getAdrTypMiejscowosci() {
        return adrTypMiejscowosci;
    }

    public void setAdrTypMiejscowosci(String adrTypMiejscowosci) {
        this.adrTypMiejscowosci = adrTypMiejscowosci;
    }

    public String getAdrStan() {
        return adrStan;
    }

    public void setAdrStan(String adrStan) {
        this.adrStan = adrStan;
    }

    public String getAdrRegon() {
        return adrRegon;
    }

    public void setAdrRegon(String adrRegon) {
        this.adrRegon = adrRegon;
    }

    public String getAdrKomentarz2() {
        return adrKomentarz2;
    }

    public void setAdrKomentarz2(String adrKomentarz2) {
        this.adrKomentarz2 = adrKomentarz2;
    }

    public String getAdrKomentarz3() {
        return adrKomentarz3;
    }

    public void setAdrKomentarz3(String adrKomentarz3) {
        this.adrKomentarz3 = adrKomentarz3;
    }

    public String getAdrKomentarz4() {
        return adrKomentarz4;
    }

    public void setAdrKomentarz4(String adrKomentarz4) {
        this.adrKomentarz4 = adrKomentarz4;
    }

    public String getAdrKomentarz5() {
        return adrKomentarz5;
    }

    public void setAdrKomentarz5(String adrKomentarz5) {
        this.adrKomentarz5 = adrKomentarz5;
    }

    public String getAdrKomentarz6() {
        return adrKomentarz6;
    }

    public void setAdrKomentarz6(String adrKomentarz6) {
        this.adrKomentarz6 = adrKomentarz6;
    }

    public String getAdrKomentarz7() {
        return adrKomentarz7;
    }

    public void setAdrKomentarz7(String adrKomentarz7) {
        this.adrKomentarz7 = adrKomentarz7;
    }

    public String getAdrKomentarz8() {
        return adrKomentarz8;
    }

    public void setAdrKomentarz8(String adrKomentarz8) {
        this.adrKomentarz8 = adrKomentarz8;
    }

    public String getAdrKomentarz9() {
        return adrKomentarz9;
    }

    public void setAdrKomentarz9(String adrKomentarz9) {
        this.adrKomentarz9 = adrKomentarz9;
    }

    public BigInteger getAdrPolozenieX() {
        return adrPolozenieX;
    }

    public void setAdrPolozenieX(BigInteger adrPolozenieX) {
        this.adrPolozenieX = adrPolozenieX;
    }

    public BigInteger getAdrPolozenieY() {
        return adrPolozenieY;
    }

    public void setAdrPolozenieY(BigInteger adrPolozenieY) {
        this.adrPolozenieY = adrPolozenieY;
    }

    public String getAdrDzielnica() {
        return adrDzielnica;
    }

    public void setAdrDzielnica(String adrDzielnica) {
        this.adrDzielnica = adrDzielnica;
    }

    public String getAdrDzielnica2() {
        return adrDzielnica2;
    }

    public void setAdrDzielnica2(String adrDzielnica2) {
        this.adrDzielnica2 = adrDzielnica2;
    }

    public String getAdrDzielnica3() {
        return adrDzielnica3;
    }

    public void setAdrDzielnica3(String adrDzielnica3) {
        this.adrDzielnica3 = adrDzielnica3;
    }

    public String getAdrDzielnica4() {
        return adrDzielnica4;
    }

    public void setAdrDzielnica4(String adrDzielnica4) {
        this.adrDzielnica4 = adrDzielnica4;
    }

    public String getAdrDzielnica5() {
        return adrDzielnica5;
    }

    public void setAdrDzielnica5(String adrDzielnica5) {
        this.adrDzielnica5 = adrDzielnica5;
    }

    public String getAdrDzielnica6() {
        return adrDzielnica6;
    }

    public void setAdrDzielnica6(String adrDzielnica6) {
        this.adrDzielnica6 = adrDzielnica6;
    }

    public String getAdrDzielnica7() {
        return adrDzielnica7;
    }

    public void setAdrDzielnica7(String adrDzielnica7) {
        this.adrDzielnica7 = adrDzielnica7;
    }

    public String getAdrDzielnica8() {
        return adrDzielnica8;
    }

    public void setAdrDzielnica8(String adrDzielnica8) {
        this.adrDzielnica8 = adrDzielnica8;
    }

    public String getAdrDzielnica9() {
        return adrDzielnica9;
    }

    public void setAdrDzielnica9(String adrDzielnica9) {
        this.adrDzielnica9 = adrDzielnica9;
    }

    public String getAdrIln() {
        return adrIln;
    }

    public void setAdrIln(String adrIln) {
        this.adrIln = adrIln;
    }

    public Long getAdrPrcId() {
        return adrPrcId;
    }

    public void setAdrPrcId(Long adrPrcId) {
        this.adrPrcId = adrPrcId;
    }

    
 

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adrId != null ? adrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdresyVO)) {
            return false;
        }
        AdresyVO other = (AdresyVO) object;
        if ((this.adrId == null && other.adrId != null) || (this.adrId != null && !this.adrId.equals(other.adrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.AdresyVO[ adrId=" + adrId + " ]";
    }
    
}
