/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models.hr;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import pl.models.ckk.AdresyVO;
import pl.models.hr.ZatrudnienieVO;

/**
 *
 * @author k.skowronski
 */
@Entity
@Table(name = "EK_PRACOWNICY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PracownikVO.findAll", query = "SELECT p FROM PracownikVO p"),
    @NamedQuery(name = "PracownikVO.findByPrcId", query = "SELECT p FROM PracownikVO p WHERE p.prcId = :prcId"),
    @NamedQuery(name = "PracownikVO.findByPrcNumer", query = "SELECT p FROM PracownikVO p WHERE p.prcNumer = :prcNumer"),
    @NamedQuery(name = "PracownikVO.findByPrcNazwisko", query = "SELECT p FROM PracownikVO p WHERE p.prcNazwisko = :prcNazwisko"),
    @NamedQuery(name = "PracownikVO.findByPrcImie", query = "SELECT p FROM PracownikVO p WHERE p.prcImie = :prcImie"),
    @NamedQuery(name = "PracownikVO.findByPrcDataUr", query = "SELECT p FROM PracownikVO p WHERE p.prcDataUr = :prcDataUr"),
    @NamedQuery(name = "PracownikVO.findByPrcMiejsceUr", query = "SELECT p FROM PracownikVO p WHERE p.prcMiejsceUr = :prcMiejsceUr"),
    @NamedQuery(name = "PracownikVO.findByPrcPlec", query = "SELECT p FROM PracownikVO p WHERE p.prcPlec = :prcPlec"),
    @NamedQuery(name = "PracownikVO.findByPrcStanCywilny", query = "SELECT p FROM PracownikVO p WHERE p.prcStanCywilny = :prcStanCywilny"),
    @NamedQuery(name = "PracownikVO.findByPrcImieOjca", query = "SELECT p FROM PracownikVO p WHERE p.prcImieOjca = :prcImieOjca"),
    @NamedQuery(name = "PracownikVO.findByPrcImieMatki", query = "SELECT p FROM PracownikVO p WHERE p.prcImieMatki = :prcImieMatki"),
    @NamedQuery(name = "PracownikVO.findByPrcPesel", query = "SELECT p FROM PracownikVO p WHERE p.prcPesel = :prcPesel"),
    @NamedQuery(name = "PracownikVO.findByPrcKtoUtworzyl", query = "SELECT p FROM PracownikVO p WHERE p.prcKtoUtworzyl = :prcKtoUtworzyl"),
    @NamedQuery(name = "PracownikVO.findByPrcKiedyUtworzyl", query = "SELECT p FROM PracownikVO p WHERE p.prcKiedyUtworzyl = :prcKiedyUtworzyl"),
    @NamedQuery(name = "PracownikVO.findByPrcImie2", query = "SELECT p FROM PracownikVO p WHERE p.prcImie2 = :prcImie2"),
    @NamedQuery(name = "PracownikVO.findByPrcDowodOsob", query = "SELECT p FROM PracownikVO p WHERE p.prcDowodOsob = :prcDowodOsob"),
    @NamedQuery(name = "PracownikVO.findByPrcNazwiskoRod", query = "SELECT p FROM PracownikVO p WHERE p.prcNazwiskoRod = :prcNazwiskoRod"),
    @NamedQuery(name = "PracownikVO.findByPrcNip", query = "SELECT p FROM PracownikVO p WHERE p.prcNip = :prcNip"),
    @NamedQuery(name = "PracownikVO.findByPrcKomentarz", query = "SELECT p FROM PracownikVO p WHERE p.prcKomentarz = :prcKomentarz"),
    @NamedQuery(name = "PracownikVO.findByPrcKtoModyfikowal", query = "SELECT p FROM PracownikVO p WHERE p.prcKtoModyfikowal = :prcKtoModyfikowal"),
    @NamedQuery(name = "PracownikVO.findByPrcKiedyModyfikowal", query = "SELECT p FROM PracownikVO p WHERE p.prcKiedyModyfikowal = :prcKiedyModyfikowal"),
    @NamedQuery(name = "PracownikVO.findByPrcObywatelstwo", query = "SELECT p FROM PracownikVO p WHERE p.prcObywatelstwo = :prcObywatelstwo"),
    @NamedQuery(name = "PracownikVO.findByPrcKartaPobytu", query = "SELECT p FROM PracownikVO p WHERE p.prcKartaPobytu = :prcKartaPobytu"),
    @NamedQuery(name = "PracownikVO.findByPrcAktywny", query = "SELECT p FROM PracownikVO p WHERE p.prcAktywny = :prcAktywny"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowap", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowap = :prcUmowap"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowaz", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowaz = :prcUmowaz"),
    @NamedQuery(name = "PracownikVO.findByPrcPaszport", query = "SELECT p FROM PracownikVO p WHERE p.prcPaszport = :prcPaszport"),
    @NamedQuery(name = "PracownikVO.findByPrcOrganWydajacy", query = "SELECT p FROM PracownikVO p WHERE p.prcOrganWydajacy = :prcOrganWydajacy"),
    @NamedQuery(name = "PracownikVO.findByPrcIdentyfikacja", query = "SELECT p FROM PracownikVO p WHERE p.prcIdentyfikacja = :prcIdentyfikacja"),
    @NamedQuery(name = "PracownikVO.findByPrcUzytkownik", query = "SELECT p FROM PracownikVO p WHERE p.prcUzytkownik = :prcUzytkownik"),
    @NamedQuery(name = "PracownikVO.findByPrcMzam", query = "SELECT p FROM PracownikVO p WHERE p.prcMzam = :prcMzam"),
    @NamedQuery(name = "PracownikVO.findByPrcDataWydaniaDowodu", query = "SELECT p FROM PracownikVO p WHERE p.prcDataWydaniaDowodu = :prcDataWydaniaDowodu"),
    @NamedQuery(name = "PracownikVO.findByPrcNrKarty", query = "SELECT p FROM PracownikVO p WHERE p.prcNrKarty = :prcNrKarty"),
    @NamedQuery(name = "PracownikVO.findByPrcNipPrefiks", query = "SELECT p FROM PracownikVO p WHERE p.prcNipPrefiks = :prcNipPrefiks"),
    @NamedQuery(name = "PracownikVO.findByPrcNipDane", query = "SELECT p FROM PracownikVO p WHERE p.prcNipDane = :prcNipDane"),
    @NamedQuery(name = "PracownikVO.findByPrcAudytKt", query = "SELECT p FROM PracownikVO p WHERE p.prcAudytKt = :prcAudytKt"),
    @NamedQuery(name = "PracownikVO.findByPrcAudytKm", query = "SELECT p FROM PracownikVO p WHERE p.prcAudytKm = :prcAudytKm"),
    @NamedQuery(name = "PracownikVO.findByPrcAudytLm", query = "SELECT p FROM PracownikVO p WHERE p.prcAudytLm = :prcAudytLm"),
    @NamedQuery(name = "PracownikVO.findByPrcFObcy", query = "SELECT p FROM PracownikVO p WHERE p.prcFObcy = :prcFObcy"),
    @NamedQuery(name = "PracownikVO.findByPrcAkronim", query = "SELECT p FROM PracownikVO p WHERE p.prcAkronim = :prcAkronim"),
    @NamedQuery(name = "PracownikVO.findByPrcIdent", query = "SELECT p FROM PracownikVO p WHERE p.prcIdent = :prcIdent"),
    @NamedQuery(name = "PracownikVO.findByPrcNarodowosc", query = "SELECT p FROM PracownikVO p WHERE p.prcNarodowosc = :prcNarodowosc"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowan", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowan = :prcUmowan"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowana", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowana = :prcUmowana"),
    @NamedQuery(name = "PracownikVO.findByPrcNazwiskoRodoweMatki", query = "SELECT p FROM PracownikVO p WHERE p.prcNazwiskoRodoweMatki = :prcNazwiskoRodoweMatki"),
    @NamedQuery(name = "PracownikVO.findByPrcPoborcaReferent", query = "SELECT p FROM PracownikVO p WHERE p.prcPoborcaReferent = :prcPoborcaReferent"),
    @NamedQuery(name = "PracownikVO.findByPrcSymbolPoborcy", query = "SELECT p FROM PracownikVO p WHERE p.prcSymbolPoborcy = :prcSymbolPoborcy"),
    @NamedQuery(name = "PracownikVO.findByPrcHasloTym", query = "SELECT p FROM PracownikVO p WHERE p.prcHasloTym = :prcHasloTym"),
    @NamedQuery(name = "PracownikVO.findByPrcDataHaslo", query = "SELECT p FROM PracownikVO p WHERE p.prcDataHaslo = :prcDataHaslo"),
    @NamedQuery(name = "PracownikVO.findByPrcGuid", query = "SELECT p FROM PracownikVO p WHERE p.prcGuid = :prcGuid"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowak", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowak = :prcUmowak"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowas", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowas = :prcUmowas"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowasz", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowasz = :prcUmowasz"),
    @NamedQuery(name = "PracownikVO.findByPrcUmowaszn", query = "SELECT p FROM PracownikVO p WHERE p.prcUmowaszn = :prcUmowaszn")})
public class PracownikVO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRC_ID")
    private BigDecimal prcId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRC_NUMER")
    private BigDecimal prcNumer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PRC_NAZWISKO")
    private String prcNazwisko;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PRC_IMIE")
    private String prcImie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRC_DATA_UR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prcDataUr;
    @Size(max = 30)
    @Column(name = "PRC_MIEJSCE_UR")
    private String prcMiejsceUr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "PRC_PLEC")
    private String prcPlec;
    @Size(max = 1)
    @Column(name = "PRC_STAN_CYWILNY")
    private String prcStanCywilny;
    @Size(max = 20)
    @Column(name = "PRC_IMIE_OJCA")
    private String prcImieOjca;
    @Size(max = 20)
    @Column(name = "PRC_IMIE_MATKI")
    private String prcImieMatki;
    @Size(max = 11)
    @Column(name = "PRC_PESEL")
    private String prcPesel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PRC_KTO_UTWORZYL")
    private String prcKtoUtworzyl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRC_KIEDY_UTWORZYL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prcKiedyUtworzyl;
    @Size(max = 20)
    @Column(name = "PRC_IMIE2")
    private String prcImie2;
    @Size(max = 9)
    @Column(name = "PRC_DOWOD_OSOB")
    private String prcDowodOsob;
    @Size(max = 30)
    @Column(name = "PRC_NAZWISKO_ROD")
    private String prcNazwiskoRod;
    @Size(max = 25)
    @Column(name = "PRC_NIP")
    private String prcNip;
    @Size(max = 4000)
    @Column(name = "PRC_KOMENTARZ")
    private String prcKomentarz;
    @Size(max = 30)
    @Column(name = "PRC_KTO_MODYFIKOWAL")
    private String prcKtoModyfikowal;
    @Column(name = "PRC_KIEDY_MODYFIKOWAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prcKiedyModyfikowal;
    @Size(max = 50)
    @Column(name = "PRC_OBYWATELSTWO")
    private String prcObywatelstwo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "PRC_KARTA_POBYTU")
    private String prcKartaPobytu;
    @Size(max = 1)
    @Column(name = "PRC_AKTYWNY")
    private String prcAktywny;
    @Size(max = 1)
    @Column(name = "PRC_UMOWAP")
    private String prcUmowap;
    @Size(max = 1)
    @Column(name = "PRC_UMOWAZ")
    private String prcUmowaz;
    @Size(max = 20)
    @Column(name = "PRC_PASZPORT")
    private String prcPaszport;
    @Size(max = 100)
    @Column(name = "PRC_ORGAN_WYDAJACY")
    private String prcOrganWydajacy;
    @Size(max = 256)
    @Column(name = "PRC_IDENTYFIKACJA")
    private String prcIdentyfikacja;
    @Size(max = 256)
    @Column(name = "PRC_UZYTKOWNIK")
    private String prcUzytkownik;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "PRC_MZAM")
    private String prcMzam;
    @Column(name = "PRC_DATA_WYDANIA_DOWODU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prcDataWydaniaDowodu;
    @Size(max = 10)
    @Column(name = "PRC_NR_KARTY")
    private String prcNrKarty;
    @Size(max = 3)
    @Column(name = "PRC_NIP_PREFIKS")
    private String prcNipPrefiks;
    @Size(max = 22)
    @Column(name = "PRC_NIP_DANE")
    private String prcNipDane;
    @Size(max = 100)
    @Column(name = "PRC_AUDYT_KT")
    private String prcAudytKt;
    @Size(max = 100)
    @Column(name = "PRC_AUDYT_KM")
    private String prcAudytKm;
    @Column(name = "PRC_AUDYT_LM")
    private BigInteger prcAudytLm;
    @Size(max = 1)
    @Column(name = "PRC_F_OBCY")
    private String prcFObcy;
    @Size(max = 10)
    @Column(name = "PRC_AKRONIM")
    private String prcAkronim;
    @Size(max = 240)
    @Column(name = "PRC_IDENT")
    private String prcIdent;
    @Size(max = 10)
    @Column(name = "PRC_NARODOWOSC")
    private String prcNarodowosc;
    @Size(max = 1)
    @Column(name = "PRC_UMOWAN")
    private String prcUmowan;
    @Size(max = 1)
    @Column(name = "PRC_UMOWANA")
    private String prcUmowana;
    @Size(max = 100)
    @Column(name = "PRC_NAZWISKO_RODOWE_MATKI")
    private String prcNazwiskoRodoweMatki;
    @Size(max = 1)
    @Column(name = "PRC_POBORCA_REFERENT")
    private String prcPoborcaReferent;
    @Size(max = 3)
    @Column(name = "PRC_SYMBOL_POBORCY")
    private String prcSymbolPoborcy;
    @Size(max = 1)
    @Column(name = "PRC_HASLO_TYM")
    private String prcHasloTym;
    @Column(name = "PRC_DATA_HASLO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prcDataHaslo;
    @Size(max = 32)
    @Column(name = "PRC_GUID")
    private String prcGuid;
    @Size(max = 1)
    @Column(name = "PRC_UMOWAK")
    private String prcUmowak;
    @Size(max = 1)
    @Column(name = "PRC_UMOWAS")
    private String prcUmowas;
    @Size(max = 1)
    @Column(name = "PRC_UMOWASZ")
    private String prcUmowasz;
    @Size(max = 1)
    @Column(name = "PRC_UMOWASZN")
    private String prcUmowaszn;
    @OneToMany(mappedBy = "prcPrcId")
    private Collection<PracownikVO> pracownicyVOCollection;
    @JoinColumn(name = "PRC_PRC_ID", referencedColumnName = "PRC_ID")
    @ManyToOne
    private PracownikVO prcPrcId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zatPrcId")
    private Collection<ZatrudnienieVO> zatrudnienieVOCollection;
    @OneToMany(mappedBy = "zatPrcIdSzef")
    private Collection<ZatrudnienieVO> zatrudnienieVOCollection1;
    @OneToMany(mappedBy = "zatPrcIdZast")
    private Collection<ZatrudnienieVO> zatrudnienieVOCollection2;

    public PracownikVO() {
    }

    public PracownikVO(BigDecimal prcId) {
        this.prcId = prcId;
    }

    public PracownikVO(BigDecimal prcId, BigDecimal prcNumer, String prcNazwisko, String prcImie, Date prcDataUr, String prcPlec, String prcKtoUtworzyl, Date prcKiedyUtworzyl, String prcKartaPobytu, String prcMzam) {
        this.prcId = prcId;
        this.prcNumer = prcNumer;
        this.prcNazwisko = prcNazwisko;
        this.prcImie = prcImie;
        this.prcDataUr = prcDataUr;
        this.prcPlec = prcPlec;
        this.prcKtoUtworzyl = prcKtoUtworzyl;
        this.prcKiedyUtworzyl = prcKiedyUtworzyl;
        this.prcKartaPobytu = prcKartaPobytu;
        this.prcMzam = prcMzam;
    }

    public BigDecimal getPrcId() {
        return prcId;
    }

    public void setPrcId(BigDecimal prcId) {
        this.prcId = prcId;
    }

    public BigDecimal getPrcNumer() {
        return prcNumer;
    }

    public void setPrcNumer(BigDecimal prcNumer) {
        this.prcNumer = prcNumer;
    }

    public String getPrcNazwisko() {
        return prcNazwisko;
    }

    public void setPrcNazwisko(String prcNazwisko) {
        this.prcNazwisko = prcNazwisko;
    }

    public String getPrcImie() {
        return prcImie;
    }

    public void setPrcImie(String prcImie) {
        this.prcImie = prcImie;
    }

    public Date getPrcDataUr() {
        return prcDataUr;
    }

    public void setPrcDataUr(Date prcDataUr) {
        this.prcDataUr = prcDataUr;
    }

    public String getPrcMiejsceUr() {
        return prcMiejsceUr;
    }

    public void setPrcMiejsceUr(String prcMiejsceUr) {
        this.prcMiejsceUr = prcMiejsceUr;
    }

    public String getPrcPlec() {
        return prcPlec;
    }

    public void setPrcPlec(String prcPlec) {
        this.prcPlec = prcPlec;
    }

    public String getPrcStanCywilny() {
        return prcStanCywilny;
    }

    public void setPrcStanCywilny(String prcStanCywilny) {
        this.prcStanCywilny = prcStanCywilny;
    }

    public String getPrcImieOjca() {
        return prcImieOjca;
    }

    public void setPrcImieOjca(String prcImieOjca) {
        this.prcImieOjca = prcImieOjca;
    }

    public String getPrcImieMatki() {
        return prcImieMatki;
    }

    public void setPrcImieMatki(String prcImieMatki) {
        this.prcImieMatki = prcImieMatki;
    }

    public String getPrcPesel() {
        return prcPesel;
    }

    public void setPrcPesel(String prcPesel) {
        this.prcPesel = prcPesel;
    }

    public String getPrcKtoUtworzyl() {
        return prcKtoUtworzyl;
    }

    public void setPrcKtoUtworzyl(String prcKtoUtworzyl) {
        this.prcKtoUtworzyl = prcKtoUtworzyl;
    }

    public Date getPrcKiedyUtworzyl() {
        return prcKiedyUtworzyl;
    }

    public void setPrcKiedyUtworzyl(Date prcKiedyUtworzyl) {
        this.prcKiedyUtworzyl = prcKiedyUtworzyl;
    }

    public String getPrcImie2() {
        return prcImie2;
    }

    public void setPrcImie2(String prcImie2) {
        this.prcImie2 = prcImie2;
    }

    public String getPrcDowodOsob() {
        return prcDowodOsob;
    }

    public void setPrcDowodOsob(String prcDowodOsob) {
        this.prcDowodOsob = prcDowodOsob;
    }

    public String getPrcNazwiskoRod() {
        return prcNazwiskoRod;
    }

    public void setPrcNazwiskoRod(String prcNazwiskoRod) {
        this.prcNazwiskoRod = prcNazwiskoRod;
    }

    public String getPrcNip() {
        return prcNip;
    }

    public void setPrcNip(String prcNip) {
        this.prcNip = prcNip;
    }

    public String getPrcKomentarz() {
        return prcKomentarz;
    }

    public void setPrcKomentarz(String prcKomentarz) {
        this.prcKomentarz = prcKomentarz;
    }

    public String getPrcKtoModyfikowal() {
        return prcKtoModyfikowal;
    }

    public void setPrcKtoModyfikowal(String prcKtoModyfikowal) {
        this.prcKtoModyfikowal = prcKtoModyfikowal;
    }

    public Date getPrcKiedyModyfikowal() {
        return prcKiedyModyfikowal;
    }

    public void setPrcKiedyModyfikowal(Date prcKiedyModyfikowal) {
        this.prcKiedyModyfikowal = prcKiedyModyfikowal;
    }

    public String getPrcObywatelstwo() {
        return prcObywatelstwo;
    }

    public void setPrcObywatelstwo(String prcObywatelstwo) {
        this.prcObywatelstwo = prcObywatelstwo;
    }

    public String getPrcKartaPobytu() {
        return prcKartaPobytu;
    }

    public void setPrcKartaPobytu(String prcKartaPobytu) {
        this.prcKartaPobytu = prcKartaPobytu;
    }

    public String getPrcAktywny() {
        return prcAktywny;
    }

    public void setPrcAktywny(String prcAktywny) {
        this.prcAktywny = prcAktywny;
    }

    public String getPrcUmowap() {
        return prcUmowap;
    }

    public void setPrcUmowap(String prcUmowap) {
        this.prcUmowap = prcUmowap;
    }

    public String getPrcUmowaz() {
        return prcUmowaz;
    }

    public void setPrcUmowaz(String prcUmowaz) {
        this.prcUmowaz = prcUmowaz;
    }

    public String getPrcPaszport() {
        return prcPaszport;
    }

    public void setPrcPaszport(String prcPaszport) {
        this.prcPaszport = prcPaszport;
    }

    public String getPrcOrganWydajacy() {
        return prcOrganWydajacy;
    }

    public void setPrcOrganWydajacy(String prcOrganWydajacy) {
        this.prcOrganWydajacy = prcOrganWydajacy;
    }

    public String getPrcIdentyfikacja() {
        return prcIdentyfikacja;
    }

    public void setPrcIdentyfikacja(String prcIdentyfikacja) {
        this.prcIdentyfikacja = prcIdentyfikacja;
    }

    public String getPrcUzytkownik() {
        return prcUzytkownik;
    }

    public void setPrcUzytkownik(String prcUzytkownik) {
        this.prcUzytkownik = prcUzytkownik;
    }

    public String getPrcMzam() {
        return prcMzam;
    }

    public void setPrcMzam(String prcMzam) {
        this.prcMzam = prcMzam;
    }

    public Date getPrcDataWydaniaDowodu() {
        return prcDataWydaniaDowodu;
    }

    public void setPrcDataWydaniaDowodu(Date prcDataWydaniaDowodu) {
        this.prcDataWydaniaDowodu = prcDataWydaniaDowodu;
    }

    public String getPrcNrKarty() {
        return prcNrKarty;
    }

    public void setPrcNrKarty(String prcNrKarty) {
        this.prcNrKarty = prcNrKarty;
    }

    public String getPrcNipPrefiks() {
        return prcNipPrefiks;
    }

    public void setPrcNipPrefiks(String prcNipPrefiks) {
        this.prcNipPrefiks = prcNipPrefiks;
    }

    public String getPrcNipDane() {
        return prcNipDane;
    }

    public void setPrcNipDane(String prcNipDane) {
        this.prcNipDane = prcNipDane;
    }

    public String getPrcAudytKt() {
        return prcAudytKt;
    }

    public void setPrcAudytKt(String prcAudytKt) {
        this.prcAudytKt = prcAudytKt;
    }

    public String getPrcAudytKm() {
        return prcAudytKm;
    }

    public void setPrcAudytKm(String prcAudytKm) {
        this.prcAudytKm = prcAudytKm;
    }

    public BigInteger getPrcAudytLm() {
        return prcAudytLm;
    }

    public void setPrcAudytLm(BigInteger prcAudytLm) {
        this.prcAudytLm = prcAudytLm;
    }

    public String getPrcFObcy() {
        return prcFObcy;
    }

    public void setPrcFObcy(String prcFObcy) {
        this.prcFObcy = prcFObcy;
    }

    public String getPrcAkronim() {
        return prcAkronim;
    }

    public void setPrcAkronim(String prcAkronim) {
        this.prcAkronim = prcAkronim;
    }

    public String getPrcIdent() {
        return prcIdent;
    }

    public void setPrcIdent(String prcIdent) {
        this.prcIdent = prcIdent;
    }

    public String getPrcNarodowosc() {
        return prcNarodowosc;
    }

    public void setPrcNarodowosc(String prcNarodowosc) {
        this.prcNarodowosc = prcNarodowosc;
    }

    public String getPrcUmowan() {
        return prcUmowan;
    }

    public void setPrcUmowan(String prcUmowan) {
        this.prcUmowan = prcUmowan;
    }

    public String getPrcUmowana() {
        return prcUmowana;
    }

    public void setPrcUmowana(String prcUmowana) {
        this.prcUmowana = prcUmowana;
    }

    public String getPrcNazwiskoRodoweMatki() {
        return prcNazwiskoRodoweMatki;
    }

    public void setPrcNazwiskoRodoweMatki(String prcNazwiskoRodoweMatki) {
        this.prcNazwiskoRodoweMatki = prcNazwiskoRodoweMatki;
    }

    public String getPrcPoborcaReferent() {
        return prcPoborcaReferent;
    }

    public void setPrcPoborcaReferent(String prcPoborcaReferent) {
        this.prcPoborcaReferent = prcPoborcaReferent;
    }

    public String getPrcSymbolPoborcy() {
        return prcSymbolPoborcy;
    }

    public void setPrcSymbolPoborcy(String prcSymbolPoborcy) {
        this.prcSymbolPoborcy = prcSymbolPoborcy;
    }

    public String getPrcHasloTym() {
        return prcHasloTym;
    }

    public void setPrcHasloTym(String prcHasloTym) {
        this.prcHasloTym = prcHasloTym;
    }

    public Date getPrcDataHaslo() {
        return prcDataHaslo;
    }

    public void setPrcDataHaslo(Date prcDataHaslo) {
        this.prcDataHaslo = prcDataHaslo;
    }

    public String getPrcGuid() {
        return prcGuid;
    }

    public void setPrcGuid(String prcGuid) {
        this.prcGuid = prcGuid;
    }

    public String getPrcUmowak() {
        return prcUmowak;
    }

    public void setPrcUmowak(String prcUmowak) {
        this.prcUmowak = prcUmowak;
    }

    public String getPrcUmowas() {
        return prcUmowas;
    }

    public void setPrcUmowas(String prcUmowas) {
        this.prcUmowas = prcUmowas;
    }

    public String getPrcUmowasz() {
        return prcUmowasz;
    }

    public void setPrcUmowasz(String prcUmowasz) {
        this.prcUmowasz = prcUmowasz;
    }

    public String getPrcUmowaszn() {
        return prcUmowaszn;
    }

    public void setPrcUmowaszn(String prcUmowaszn) {
        this.prcUmowaszn = prcUmowaszn;
    }

    @XmlTransient
    public Collection<PracownikVO> getPracownikVOCollection() {
        return pracownicyVOCollection;
    }

    public void setPracownikVOCollection(Collection<PracownikVO> pracownicyVOCollection) {
        this.pracownicyVOCollection = pracownicyVOCollection;
    }

    public PracownikVO getPrcPrcId() {
        return prcPrcId;
    }

    public void setPrcPrcId(PracownikVO prcPrcId) {
        this.prcPrcId = prcPrcId;
    }

 

    @XmlTransient
    public Collection<ZatrudnienieVO> getZatrudnienieVOCollection() {
        return zatrudnienieVOCollection;
    }

    public void setZatrudnienieVOCollection(Collection<ZatrudnienieVO> zatrudnienieVOCollection) {
        this.zatrudnienieVOCollection = zatrudnienieVOCollection;
    }

    @XmlTransient
    public Collection<ZatrudnienieVO> getZatrudnienieVOCollection1() {
        return zatrudnienieVOCollection1;
    }

    public void setZatrudnienieVOCollection1(Collection<ZatrudnienieVO> zatrudnienieVOCollection1) {
        this.zatrudnienieVOCollection1 = zatrudnienieVOCollection1;
    }

    @XmlTransient
    public Collection<ZatrudnienieVO> getZatrudnienieVOCollection2() {
        return zatrudnienieVOCollection2;
    }

    public void setZatrudnienieVOCollection2(Collection<ZatrudnienieVO> zatrudnienieVOCollection2) {
        this.zatrudnienieVOCollection2 = zatrudnienieVOCollection2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prcId != null ? prcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PracownikVO)) {
            return false;
        }
        PracownikVO other = (PracownikVO) object;
        if ((this.prcId == null && other.prcId != null) || (this.prcId != null && !this.prcId.equals(other.prcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.PracownikVO[ prcId=" + prcId + " ]";
    }
    
}
