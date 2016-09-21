/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models.hr;

import pl.models.hr.PracownikVO;
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

/**
 *
 * @author k.skowronski
 */
@Entity
@Table(name = "EK_ZATRUDNIENIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZatrudnienieVO.findAll", query = "SELECT z FROM ZatrudnienieVO z"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatId", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatId = :zatId"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDataPrzyj", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDataPrzyj = :zatDataPrzyj"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDataZmiany", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDataZmiany = :zatDataZmiany"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStawka", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStawka = :zatStawka"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatTypUmowy", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatTypUmowy = :zatTypUmowy"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatGlownyZakladPracy", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatGlownyZakladPracy = :zatGlownyZakladPracy"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatKtoUtworzyl", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatKtoUtworzyl = :zatKtoUtworzyl"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatKiedyUtworzyl", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatKiedyUtworzyl = :zatKiedyUtworzyl"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatOkresDo", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatOkresDo = :zatOkresDo"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDataZwolnienia", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDataZwolnienia = :zatDataZwolnienia"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWymiar", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWymiar = :zatWymiar"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatTypStawki", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatTypStawki = :zatTypStawki"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatSposobPrzyjecia", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatSposobPrzyjecia = :zatSposobPrzyjecia"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatSposobZwolnienia", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatSposobZwolnienia = :zatSposobZwolnienia"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStatus", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStatus = :zatStatus"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatKtoModyfikowal", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatKtoModyfikowal = :zatKtoModyfikowal"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatKiedyModyfikowal", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatKiedyModyfikowal = :zatKiedyModyfikowal"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatNrUmowy", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatNrUmowy = :zatNrUmowy"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatTemat", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatTemat = :zatTemat"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatZus", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatZus = :zatZus"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatKoszty", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatKoszty = :zatKoszty"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatFProbny", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatFProbny = :zatFProbny"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatTypAngaz", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatTypAngaz = :zatTypAngaz"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatTerminZaplaty", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatTerminZaplaty = :zatTerminZaplaty"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDzienZaplaty", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDzienZaplaty = :zatDzienZaplaty"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPlatnosc", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPlatnosc = :zatPlatnosc"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWojskowyUp", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWojskowyUp = :zatWojskowyUp"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStawkaAkord", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStawkaAkord = :zatStawkaAkord"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStatusDataOd", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStatusDataOd = :zatStatusDataOd"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStatusDataDo", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStatusDataDo = :zatStatusDataDo"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpObData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpObData = :zatUbezpObData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpZdrowObData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpZdrowObData = :zatUbezpZdrowObData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpObEmeryt", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpObEmeryt = :zatUbezpObEmeryt"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpObRenta", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpObRenta = :zatUbezpObRenta"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpObChorob", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpObChorob = :zatUbezpObChorob"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpObWypadk", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpObWypadk = :zatUbezpObWypadk"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpZdrowDbData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpZdrowDbData = :zatUbezpZdrowDbData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpDbEmeryt", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpDbEmeryt = :zatUbezpDbEmeryt"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpDbEmerytData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpDbEmerytData = :zatUbezpDbEmerytData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpDbRenta", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpDbRenta = :zatUbezpDbRenta"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpDbRentaData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpDbRentaData = :zatUbezpDbRentaData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpDbChorob", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpDbChorob = :zatUbezpDbChorob"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpDbChorobData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpDbChorobData = :zatUbezpDbChorobData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatUbezpDbChorobKwota", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatUbezpDbChorobKwota = :zatUbezpDbChorobKwota"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatOdpowiedzialnosc", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatOdpowiedzialnosc = :zatOdpowiedzialnosc"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStawkaPostojowa", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStawkaPostojowa = :zatStawkaPostojowa"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDataDo", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDataDo = :zatDataDo"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrEmerData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrEmerData = :zatWyrEmerData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrRentData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrRentData = :zatWyrRentData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrChorData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrChorData = :zatWyrChorData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrWypData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrWypData = :zatWyrWypData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrZdrowData", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrZdrowData = :zatWyrZdrowData"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrEmerKod", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrEmerKod = :zatWyrEmerKod"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrRentKod", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrRentKod = :zatWyrRentKod"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrChorKod", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrChorKod = :zatWyrChorKod"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrWypKod", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrWypKod = :zatWyrWypKod"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrZdrowKod", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrZdrowKod = :zatWyrZdrowKod"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatEkdNumer", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatEkdNumer = :zatEkdNumer"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWskaznik", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWskaznik = :zatWskaznik"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWartoscBazowa", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWartoscBazowa = :zatWartoscBazowa"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatZakresObowiazkow", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatZakresObowiazkow = :zatZakresObowiazkow"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWarSzcz", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWarSzcz = :zatWarSzcz"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPodatek", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPodatek = :zatPodatek"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWypowiedzenie", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWypowiedzenie = :zatWypowiedzenie"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatInneWarunki", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatInneWarunki = :zatInneWarunki"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatGodzinyPonad", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatGodzinyPonad = :zatGodzinyPonad"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWapId", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWapId = :zatWapId"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatAudytKt", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatAudytKt = :zatAudytKt"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatAudytKm", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatAudytKm = :zatAudytKm"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatAudytLm", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatAudytLm = :zatAudytLm"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatKomentarz", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatKomentarz = :zatKomentarz"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDataPodpisania", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDataPodpisania = :zatDataPodpisania"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatAneks", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatAneks = :zatAneks"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatRodzajAkordu", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatRodzajAkordu = :zatRodzajAkordu"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatMiejscePracy", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatMiejscePracy = :zatMiejscePracy"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatOpodatkowanie", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatOpodatkowanie = :zatOpodatkowanie"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatFRodzaj", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatFRodzaj = :zatFRodzaj"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatFAktMianowania", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatFAktMianowania = :zatFAktMianowania"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPrzychodAut", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPrzychodAut = :zatPrzychodAut"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatFZmianaPoObliczeniu", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatFZmianaPoObliczeniu = :zatFZmianaPoObliczeniu"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPrzygZaw", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPrzygZaw = :zatPrzygZaw"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPozaKrajem", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPozaKrajem = :zatPozaKrajem"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPraceInterwencyjne", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPraceInterwencyjne = :zatPraceInterwencyjne"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatLimitNadRok", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatLimitNadRok = :zatLimitNadRok"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatOdzId", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatOdzId = :zatOdzId"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPowodZwolnienia", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPowodZwolnienia = :zatPowodZwolnienia"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatForma", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatForma = :zatForma"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatRodzajPlacowki", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatRodzajPlacowki = :zatRodzajPlacowki"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPoziomWykszt", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPoziomWykszt = :zatPoziomWykszt"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStopienAwansu", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStopienAwansu = :zatStopienAwansu"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWymiarLicznik", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWymiarLicznik = :zatWymiarLicznik"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWymiarMianownik", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWymiarMianownik = :zatWymiarMianownik"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStawkaPe", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStawkaPe = :zatStawkaPe"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatPensum", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatPensum = :zatPensum"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef0", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef0 = :zatDef0"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef1", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef1 = :zatDef1"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef2", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef2 = :zatDef2"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef3", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef3 = :zatDef3"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef4", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef4 = :zatDef4"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef5", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef5 = :zatDef5"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef6", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef6 = :zatDef6"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef7", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef7 = :zatDef7"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef8", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef8 = :zatDef8"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef9", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef9 = :zatDef9"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWydzial", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWydzial = :zatWydzial"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatFPoraNocna", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatFPoraNocna = :zatFPoraNocna"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatZarejestrowanie", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatZarejestrowanie = :zatZarejestrowanie"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatWyrejestrowanie", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatWyrejestrowanie = :zatWyrejestrowanie"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDataStanowiska", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDataStanowiska = :zatDataStanowiska"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatSzczWarChar", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatSzczWarChar = :zatSzczWarChar"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatFrmId", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatFrmId = :zatFrmId"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef50", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef50 = :zatDef50"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef51", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef51 = :zatDef51"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef52", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef52 = :zatDef52"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef53", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef53 = :zatDef53"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef54", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef54 = :zatDef54"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef55", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef55 = :zatDef55"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef56", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef56 = :zatDef56"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef57", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef57 = :zatDef57"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef58", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef58 = :zatDef58"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef59", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef59 = :zatDef59"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef80", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef80 = :zatDef80"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef81", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef81 = :zatDef81"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef82", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef82 = :zatDef82"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef83", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef83 = :zatDef83"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef84", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef84 = :zatDef84"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef85", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef85 = :zatDef85"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef86", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef86 = :zatDef86"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef87", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef87 = :zatDef87"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef88", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef88 = :zatDef88"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef89", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef89 = :zatDef89"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatStawkaInfo", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatStawkaInfo = :zatStawkaInfo"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef10", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef10 = :zatDef10"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef11", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef11 = :zatDef11"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef12", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef12 = :zatDef12"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef13", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef13 = :zatDef13"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef14", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef14 = :zatDef14"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef15", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef15 = :zatDef15"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef16", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef16 = :zatDef16"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef17", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef17 = :zatDef17"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef18", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef18 = :zatDef18"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef19", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef19 = :zatDef19"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef20", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef20 = :zatDef20"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef21", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef21 = :zatDef21"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef22", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef22 = :zatDef22"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef23", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef23 = :zatDef23"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef24", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef24 = :zatDef24"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef25", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef25 = :zatDef25"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef26", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef26 = :zatDef26"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef27", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef27 = :zatDef27"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef28", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef28 = :zatDef28"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef29", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef29 = :zatDef29"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef30", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef30 = :zatDef30"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef31", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef31 = :zatDef31"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef32", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef32 = :zatDef32"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef33", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef33 = :zatDef33"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef34", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef34 = :zatDef34"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef35", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef35 = :zatDef35"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef36", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef36 = :zatDef36"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef37", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef37 = :zatDef37"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef38", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef38 = :zatDef38"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef39", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef39 = :zatDef39"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef40", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef40 = :zatDef40"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef41", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef41 = :zatDef41"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef42", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef42 = :zatDef42"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef43", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef43 = :zatDef43"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef44", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef44 = :zatDef44"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef45", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef45 = :zatDef45"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef46", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef46 = :zatDef46"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef47", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef47 = :zatDef47"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef48", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef48 = :zatDef48"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatDef49", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatDef49 = :zatDef49"),
    @NamedQuery(name = "ZatrudnienieVO.findByZatProfil", query = "SELECT z FROM ZatrudnienieVO z WHERE z.zatProfil = :zatProfil")})
public class ZatrudnienieVO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZAT_ID")
    private Long zatId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZAT_DATA_PRZYJ")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatDataPrzyj;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZAT_DATA_ZMIANY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatDataZmiany;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ZAT_STAWKA")
    private BigDecimal zatStawka;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZAT_TYP_UMOWY")
    private short zatTypUmowy;
    @Size(max = 1)
    @Column(name = "ZAT_GLOWNY_ZAKLAD_PRACY")
    private String zatGlownyZakladPracy;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ZAT_KTO_UTWORZYL")
    private String zatKtoUtworzyl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZAT_KIEDY_UTWORZYL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatKiedyUtworzyl;
    @Column(name = "ZAT_OKRES_DO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatOkresDo;
    @Column(name = "ZAT_DATA_ZWOLNIENIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatDataZwolnienia;
    @Column(name = "ZAT_WYMIAR")
    private Short zatWymiar;
    @Size(max = 1)
    @Column(name = "ZAT_TYP_STAWKI")
    private String zatTypStawki;
    @Column(name = "ZAT_SPOSOB_PRZYJECIA")
    private Short zatSposobPrzyjecia;
    @Column(name = "ZAT_SPOSOB_ZWOLNIENIA")
    private Short zatSposobZwolnienia;
    @Column(name = "ZAT_STATUS")
    private Long zatStatus;
    @Size(max = 30)
    @Column(name = "ZAT_KTO_MODYFIKOWAL")
    private String zatKtoModyfikowal;
    @Column(name = "ZAT_KIEDY_MODYFIKOWAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatKiedyModyfikowal;
    @Size(max = 30)
    @Column(name = "ZAT_NR_UMOWY")
    private String zatNrUmowy;
    @Size(max = 600)
    @Column(name = "ZAT_TEMAT")
    private String zatTemat;
    @Size(max = 1)
    @Column(name = "ZAT_ZUS")
    private String zatZus;
    @Column(name = "ZAT_KOSZTY")
    private BigDecimal zatKoszty;
    @Size(max = 1)
    @Column(name = "ZAT_F_PROBNY")
    private String zatFProbny;
    @Size(max = 1)
    @Column(name = "ZAT_TYP_ANGAZ")
    private String zatTypAngaz;
    @Column(name = "ZAT_TERMIN_ZAPLATY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatTerminZaplaty;
    @Column(name = "ZAT_DZIEN_ZAPLATY")
    private Short zatDzienZaplaty;
    @Column(name = "ZAT_PLATNOSC")
    private Short zatPlatnosc;
    @Size(max = 1)
    @Column(name = "ZAT_WOJSKOWY_UP")
    private String zatWojskowyUp;
    @Column(name = "ZAT_STAWKA_AKORD")
    private BigDecimal zatStawkaAkord;
    @Column(name = "ZAT_STATUS_DATA_OD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatStatusDataOd;
    @Column(name = "ZAT_STATUS_DATA_DO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatStatusDataDo;
    @Column(name = "ZAT_UBEZP_OB_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatUbezpObData;
    @Column(name = "ZAT_UBEZP_ZDROW_OB_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatUbezpZdrowObData;
    @Size(max = 1)
    @Column(name = "ZAT_UBEZP_OB_EMERYT")
    private String zatUbezpObEmeryt;
    @Size(max = 1)
    @Column(name = "ZAT_UBEZP_OB_RENTA")
    private String zatUbezpObRenta;
    @Size(max = 1)
    @Column(name = "ZAT_UBEZP_OB_CHOROB")
    private String zatUbezpObChorob;
    @Size(max = 1)
    @Column(name = "ZAT_UBEZP_OB_WYPADK")
    private String zatUbezpObWypadk;
    @Column(name = "ZAT_UBEZP_ZDROW_DB_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatUbezpZdrowDbData;
    @Size(max = 1)
    @Column(name = "ZAT_UBEZP_DB_EMERYT")
    private String zatUbezpDbEmeryt;
    @Column(name = "ZAT_UBEZP_DB_EMERYT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatUbezpDbEmerytData;
    @Size(max = 1)
    @Column(name = "ZAT_UBEZP_DB_RENTA")
    private String zatUbezpDbRenta;
    @Column(name = "ZAT_UBEZP_DB_RENTA_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatUbezpDbRentaData;
    @Size(max = 1)
    @Column(name = "ZAT_UBEZP_DB_CHOROB")
    private String zatUbezpDbChorob;
    @Column(name = "ZAT_UBEZP_DB_CHOROB_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatUbezpDbChorobData;
    @Column(name = "ZAT_UBEZP_DB_CHOROB_KWOTA")
    private BigDecimal zatUbezpDbChorobKwota;
    @Size(max = 1)
    @Column(name = "ZAT_ODPOWIEDZIALNOSC")
    private String zatOdpowiedzialnosc;
    @Column(name = "ZAT_STAWKA_POSTOJOWA")
    private BigDecimal zatStawkaPostojowa;
    @Column(name = "ZAT_DATA_DO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatDataDo;
    @Column(name = "ZAT_WYR_EMER_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatWyrEmerData;
    @Column(name = "ZAT_WYR_RENT_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatWyrRentData;
    @Column(name = "ZAT_WYR_CHOR_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatWyrChorData;
    @Column(name = "ZAT_WYR_WYP_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatWyrWypData;
    @Column(name = "ZAT_WYR_ZDROW_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatWyrZdrowData;
    @Size(max = 3)
    @Column(name = "ZAT_WYR_EMER_KOD")
    private String zatWyrEmerKod;
    @Size(max = 3)
    @Column(name = "ZAT_WYR_RENT_KOD")
    private String zatWyrRentKod;
    @Size(max = 3)
    @Column(name = "ZAT_WYR_CHOR_KOD")
    private String zatWyrChorKod;
    @Size(max = 3)
    @Column(name = "ZAT_WYR_WYP_KOD")
    private String zatWyrWypKod;
    @Size(max = 3)
    @Column(name = "ZAT_WYR_ZDROW_KOD")
    private String zatWyrZdrowKod;
    @Size(max = 3)
    @Column(name = "ZAT_EKD_NUMER")
    private String zatEkdNumer;
    @Column(name = "ZAT_WSKAZNIK")
    private BigDecimal zatWskaznik;
    @Size(max = 240)
    @Column(name = "ZAT_WARTOSC_BAZOWA")
    private String zatWartoscBazowa;
    @Size(max = 4000)
    @Column(name = "ZAT_ZAKRES_OBOWIAZKOW")
    private String zatZakresObowiazkow;
    @Size(max = 9)
    @Column(name = "ZAT_WAR_SZCZ")
    private String zatWarSzcz;
    @Column(name = "ZAT_PODATEK")
    private Short zatPodatek;
    @Size(max = 100)
    @Column(name = "ZAT_WYPOWIEDZENIE")
    private String zatWypowiedzenie;
    @Size(max = 240)
    @Column(name = "ZAT_INNE_WARUNKI")
    private String zatInneWarunki;
    @Size(max = 100)
    @Column(name = "ZAT_GODZINY_PONAD")
    private String zatGodzinyPonad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZAT_WAP_ID")
    private long zatWapId;
    @Size(max = 100)
    @Column(name = "ZAT_AUDYT_KT")
    private String zatAudytKt;
    @Size(max = 100)
    @Column(name = "ZAT_AUDYT_KM")
    private String zatAudytKm;
    @Column(name = "ZAT_AUDYT_LM")
    private BigInteger zatAudytLm;
    @Size(max = 240)
    @Column(name = "ZAT_KOMENTARZ")
    private String zatKomentarz;
    @Column(name = "ZAT_DATA_PODPISANIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatDataPodpisania;
    @Size(max = 1)
    @Column(name = "ZAT_ANEKS")
    private String zatAneks;
    @Size(max = 1)
    @Column(name = "ZAT_RODZAJ_AKORDU")
    private String zatRodzajAkordu;
    @Size(max = 100)
    @Column(name = "ZAT_MIEJSCE_PRACY")
    private String zatMiejscePracy;
    @Size(max = 30)
    @Column(name = "ZAT_OPODATKOWANIE")
    private String zatOpodatkowanie;
    @Size(max = 1)
    @Column(name = "ZAT_F_RODZAJ")
    private String zatFRodzaj;
    @Size(max = 1)
    @Column(name = "ZAT_F_AKT_MIANOWANIA")
    private String zatFAktMianowania;
    @Column(name = "ZAT_PRZYCHOD_AUT")
    private BigDecimal zatPrzychodAut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ZAT_F_ZMIANA_PO_OBLICZENIU")
    private String zatFZmianaPoObliczeniu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ZAT_PRZYG_ZAW")
    private String zatPrzygZaw;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ZAT_POZA_KRAJEM")
    private String zatPozaKrajem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ZAT_PRACE_INTERWENCYJNE")
    private String zatPraceInterwencyjne;
    @Column(name = "ZAT_LIMIT_NAD_ROK")
    private Short zatLimitNadRok;
    @Column(name = "ZAT_ODZ_ID")
    private Long zatOdzId;
    @Size(max = 10)
    @Column(name = "ZAT_POWOD_ZWOLNIENIA")
    private String zatPowodZwolnienia;
    @Size(max = 10)
    @Column(name = "ZAT_FORMA")
    private String zatForma;
    @Size(max = 10)
    @Column(name = "ZAT_RODZAJ_PLACOWKI")
    private String zatRodzajPlacowki;
    @Size(max = 10)
    @Column(name = "ZAT_POZIOM_WYKSZT")
    private String zatPoziomWykszt;
    @Size(max = 10)
    @Column(name = "ZAT_STOPIEN_AWANSU")
    private String zatStopienAwansu;
    @Column(name = "ZAT_WYMIAR_LICZNIK")
    private BigInteger zatWymiarLicznik;
    @Column(name = "ZAT_WYMIAR_MIANOWNIK")
    private BigInteger zatWymiarMianownik;
    @Column(name = "ZAT_STAWKA_PE")
    private BigDecimal zatStawkaPe;
    @Column(name = "ZAT_PENSUM")
    private Short zatPensum;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_0")
    private String zatDef0;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_1")
    private String zatDef1;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_2")
    private String zatDef2;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_3")
    private String zatDef3;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_4")
    private String zatDef4;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_5")
    private String zatDef5;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_6")
    private String zatDef6;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_7")
    private String zatDef7;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_8")
    private String zatDef8;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_9")
    private String zatDef9;
    @Size(max = 10)
    @Column(name = "ZAT_WYDZIAL")
    private String zatWydzial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ZAT_F_PORA_NOCNA")
    private String zatFPoraNocna;
    @Column(name = "ZAT_ZAREJESTROWANIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatZarejestrowanie;
    @Column(name = "ZAT_WYREJESTROWANIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatWyrejestrowanie;
    @Column(name = "ZAT_DATA_STANOWISKA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zatDataStanowiska;
    @Size(max = 3)
    @Column(name = "ZAT_SZCZ_WAR_CHAR")
    private String zatSzczWarChar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZAT_FRM_ID")
    private long zatFrmId;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_50")
    private String zatDef50;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_51")
    private String zatDef51;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_52")
    private String zatDef52;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_53")
    private String zatDef53;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_54")
    private String zatDef54;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_55")
    private String zatDef55;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_56")
    private String zatDef56;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_57")
    private String zatDef57;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_58")
    private String zatDef58;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_59")
    private String zatDef59;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_80")
    private String zatDef80;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_81")
    private String zatDef81;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_82")
    private String zatDef82;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_83")
    private String zatDef83;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_84")
    private String zatDef84;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_85")
    private String zatDef85;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_86")
    private String zatDef86;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_87")
    private String zatDef87;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_88")
    private String zatDef88;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_89")
    private String zatDef89;
    @Column(name = "ZAT_STAWKA_INFO")
    private BigDecimal zatStawkaInfo;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_10")
    private String zatDef10;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_11")
    private String zatDef11;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_12")
    private String zatDef12;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_13")
    private String zatDef13;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_14")
    private String zatDef14;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_15")
    private String zatDef15;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_16")
    private String zatDef16;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_17")
    private String zatDef17;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_18")
    private String zatDef18;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_19")
    private String zatDef19;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_20")
    private String zatDef20;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_21")
    private String zatDef21;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_22")
    private String zatDef22;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_23")
    private String zatDef23;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_24")
    private String zatDef24;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_25")
    private String zatDef25;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_26")
    private String zatDef26;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_27")
    private String zatDef27;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_28")
    private String zatDef28;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_29")
    private String zatDef29;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_30")
    private String zatDef30;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_31")
    private String zatDef31;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_32")
    private String zatDef32;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_33")
    private String zatDef33;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_34")
    private String zatDef34;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_35")
    private String zatDef35;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_36")
    private String zatDef36;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_37")
    private String zatDef37;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_38")
    private String zatDef38;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_39")
    private String zatDef39;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_40")
    private String zatDef40;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_41")
    private String zatDef41;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_42")
    private String zatDef42;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_43")
    private String zatDef43;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_44")
    private String zatDef44;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_45")
    private String zatDef45;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_46")
    private String zatDef46;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_47")
    private String zatDef47;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_48")
    private String zatDef48;
    @Size(max = 4000)
    @Column(name = "ZAT_DEF_49")
    private String zatDef49;
    @Size(max = 10)
    @Column(name = "ZAT_PROFIL")
    private String zatProfil;
    @JoinColumn(name = "ZAT_PRC_ID", referencedColumnName = "PRC_ID")
    @ManyToOne(optional = false)
    private PracownikVO zatPrcId;
    @JoinColumn(name = "ZAT_PRC_ID_SZEF", referencedColumnName = "PRC_ID")
    @ManyToOne
    private PracownikVO zatPrcIdSzef;
    @JoinColumn(name = "ZAT_PRC_ID_ZAST", referencedColumnName = "PRC_ID")
    @ManyToOne
    private PracownikVO zatPrcIdZast;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zatZatId")
    private Collection<ZatrudnienieVO> zatrudnienieVOCollection;
    @JoinColumn(name = "ZAT_ZAT_ID", referencedColumnName = "ZAT_ID")
    @ManyToOne(optional = false)
    private ZatrudnienieVO zatZatId;

    public ZatrudnienieVO() {
    }

    public ZatrudnienieVO(Long zatId) {
        this.zatId = zatId;
    }

    public ZatrudnienieVO(Long zatId, Date zatDataPrzyj, Date zatDataZmiany, short zatTypUmowy, String zatKtoUtworzyl, Date zatKiedyUtworzyl, long zatWapId, String zatFZmianaPoObliczeniu, String zatPrzygZaw, String zatPozaKrajem, String zatPraceInterwencyjne, String zatFPoraNocna, long zatFrmId) {
        this.zatId = zatId;
        this.zatDataPrzyj = zatDataPrzyj;
        this.zatDataZmiany = zatDataZmiany;
        this.zatTypUmowy = zatTypUmowy;
        this.zatKtoUtworzyl = zatKtoUtworzyl;
        this.zatKiedyUtworzyl = zatKiedyUtworzyl;
        this.zatWapId = zatWapId;
        this.zatFZmianaPoObliczeniu = zatFZmianaPoObliczeniu;
        this.zatPrzygZaw = zatPrzygZaw;
        this.zatPozaKrajem = zatPozaKrajem;
        this.zatPraceInterwencyjne = zatPraceInterwencyjne;
        this.zatFPoraNocna = zatFPoraNocna;
        this.zatFrmId = zatFrmId;
    }

    public Long getZatId() {
        return zatId;
    }

    public void setZatId(Long zatId) {
        this.zatId = zatId;
    }

    public Date getZatDataPrzyj() {
        return zatDataPrzyj;
    }

    public void setZatDataPrzyj(Date zatDataPrzyj) {
        this.zatDataPrzyj = zatDataPrzyj;
    }

    public Date getZatDataZmiany() {
        return zatDataZmiany;
    }

    public void setZatDataZmiany(Date zatDataZmiany) {
        this.zatDataZmiany = zatDataZmiany;
    }

    public BigDecimal getZatStawka() {
        return zatStawka;
    }

    public void setZatStawka(BigDecimal zatStawka) {
        this.zatStawka = zatStawka;
    }

    public short getZatTypUmowy() {
        return zatTypUmowy;
    }

    public void setZatTypUmowy(short zatTypUmowy) {
        this.zatTypUmowy = zatTypUmowy;
    }

    public String getZatGlownyZakladPracy() {
        return zatGlownyZakladPracy;
    }

    public void setZatGlownyZakladPracy(String zatGlownyZakladPracy) {
        this.zatGlownyZakladPracy = zatGlownyZakladPracy;
    }

    public String getZatKtoUtworzyl() {
        return zatKtoUtworzyl;
    }

    public void setZatKtoUtworzyl(String zatKtoUtworzyl) {
        this.zatKtoUtworzyl = zatKtoUtworzyl;
    }

    public Date getZatKiedyUtworzyl() {
        return zatKiedyUtworzyl;
    }

    public void setZatKiedyUtworzyl(Date zatKiedyUtworzyl) {
        this.zatKiedyUtworzyl = zatKiedyUtworzyl;
    }

    public Date getZatOkresDo() {
        return zatOkresDo;
    }

    public void setZatOkresDo(Date zatOkresDo) {
        this.zatOkresDo = zatOkresDo;
    }

    public Date getZatDataZwolnienia() {
        return zatDataZwolnienia;
    }

    public void setZatDataZwolnienia(Date zatDataZwolnienia) {
        this.zatDataZwolnienia = zatDataZwolnienia;
    }

    public Short getZatWymiar() {
        return zatWymiar;
    }

    public void setZatWymiar(Short zatWymiar) {
        this.zatWymiar = zatWymiar;
    }

    public String getZatTypStawki() {
        return zatTypStawki;
    }

    public void setZatTypStawki(String zatTypStawki) {
        this.zatTypStawki = zatTypStawki;
    }

    public Short getZatSposobPrzyjecia() {
        return zatSposobPrzyjecia;
    }

    public void setZatSposobPrzyjecia(Short zatSposobPrzyjecia) {
        this.zatSposobPrzyjecia = zatSposobPrzyjecia;
    }

    public Short getZatSposobZwolnienia() {
        return zatSposobZwolnienia;
    }

    public void setZatSposobZwolnienia(Short zatSposobZwolnienia) {
        this.zatSposobZwolnienia = zatSposobZwolnienia;
    }

    public Long getZatStatus() {
        return zatStatus;
    }

    public void setZatStatus(Long zatStatus) {
        this.zatStatus = zatStatus;
    }

    public String getZatKtoModyfikowal() {
        return zatKtoModyfikowal;
    }

    public void setZatKtoModyfikowal(String zatKtoModyfikowal) {
        this.zatKtoModyfikowal = zatKtoModyfikowal;
    }

    public Date getZatKiedyModyfikowal() {
        return zatKiedyModyfikowal;
    }

    public void setZatKiedyModyfikowal(Date zatKiedyModyfikowal) {
        this.zatKiedyModyfikowal = zatKiedyModyfikowal;
    }

    public String getZatNrUmowy() {
        return zatNrUmowy;
    }

    public void setZatNrUmowy(String zatNrUmowy) {
        this.zatNrUmowy = zatNrUmowy;
    }

    public String getZatTemat() {
        return zatTemat;
    }

    public void setZatTemat(String zatTemat) {
        this.zatTemat = zatTemat;
    }

    public String getZatZus() {
        return zatZus;
    }

    public void setZatZus(String zatZus) {
        this.zatZus = zatZus;
    }

    public BigDecimal getZatKoszty() {
        return zatKoszty;
    }

    public void setZatKoszty(BigDecimal zatKoszty) {
        this.zatKoszty = zatKoszty;
    }

    public String getZatFProbny() {
        return zatFProbny;
    }

    public void setZatFProbny(String zatFProbny) {
        this.zatFProbny = zatFProbny;
    }

    public String getZatTypAngaz() {
        return zatTypAngaz;
    }

    public void setZatTypAngaz(String zatTypAngaz) {
        this.zatTypAngaz = zatTypAngaz;
    }

    public Date getZatTerminZaplaty() {
        return zatTerminZaplaty;
    }

    public void setZatTerminZaplaty(Date zatTerminZaplaty) {
        this.zatTerminZaplaty = zatTerminZaplaty;
    }

    public Short getZatDzienZaplaty() {
        return zatDzienZaplaty;
    }

    public void setZatDzienZaplaty(Short zatDzienZaplaty) {
        this.zatDzienZaplaty = zatDzienZaplaty;
    }

    public Short getZatPlatnosc() {
        return zatPlatnosc;
    }

    public void setZatPlatnosc(Short zatPlatnosc) {
        this.zatPlatnosc = zatPlatnosc;
    }

    public String getZatWojskowyUp() {
        return zatWojskowyUp;
    }

    public void setZatWojskowyUp(String zatWojskowyUp) {
        this.zatWojskowyUp = zatWojskowyUp;
    }

    public BigDecimal getZatStawkaAkord() {
        return zatStawkaAkord;
    }

    public void setZatStawkaAkord(BigDecimal zatStawkaAkord) {
        this.zatStawkaAkord = zatStawkaAkord;
    }

    public Date getZatStatusDataOd() {
        return zatStatusDataOd;
    }

    public void setZatStatusDataOd(Date zatStatusDataOd) {
        this.zatStatusDataOd = zatStatusDataOd;
    }

    public Date getZatStatusDataDo() {
        return zatStatusDataDo;
    }

    public void setZatStatusDataDo(Date zatStatusDataDo) {
        this.zatStatusDataDo = zatStatusDataDo;
    }

    public Date getZatUbezpObData() {
        return zatUbezpObData;
    }

    public void setZatUbezpObData(Date zatUbezpObData) {
        this.zatUbezpObData = zatUbezpObData;
    }

    public Date getZatUbezpZdrowObData() {
        return zatUbezpZdrowObData;
    }

    public void setZatUbezpZdrowObData(Date zatUbezpZdrowObData) {
        this.zatUbezpZdrowObData = zatUbezpZdrowObData;
    }

    public String getZatUbezpObEmeryt() {
        return zatUbezpObEmeryt;
    }

    public void setZatUbezpObEmeryt(String zatUbezpObEmeryt) {
        this.zatUbezpObEmeryt = zatUbezpObEmeryt;
    }

    public String getZatUbezpObRenta() {
        return zatUbezpObRenta;
    }

    public void setZatUbezpObRenta(String zatUbezpObRenta) {
        this.zatUbezpObRenta = zatUbezpObRenta;
    }

    public String getZatUbezpObChorob() {
        return zatUbezpObChorob;
    }

    public void setZatUbezpObChorob(String zatUbezpObChorob) {
        this.zatUbezpObChorob = zatUbezpObChorob;
    }

    public String getZatUbezpObWypadk() {
        return zatUbezpObWypadk;
    }

    public void setZatUbezpObWypadk(String zatUbezpObWypadk) {
        this.zatUbezpObWypadk = zatUbezpObWypadk;
    }

    public Date getZatUbezpZdrowDbData() {
        return zatUbezpZdrowDbData;
    }

    public void setZatUbezpZdrowDbData(Date zatUbezpZdrowDbData) {
        this.zatUbezpZdrowDbData = zatUbezpZdrowDbData;
    }

    public String getZatUbezpDbEmeryt() {
        return zatUbezpDbEmeryt;
    }

    public void setZatUbezpDbEmeryt(String zatUbezpDbEmeryt) {
        this.zatUbezpDbEmeryt = zatUbezpDbEmeryt;
    }

    public Date getZatUbezpDbEmerytData() {
        return zatUbezpDbEmerytData;
    }

    public void setZatUbezpDbEmerytData(Date zatUbezpDbEmerytData) {
        this.zatUbezpDbEmerytData = zatUbezpDbEmerytData;
    }

    public String getZatUbezpDbRenta() {
        return zatUbezpDbRenta;
    }

    public void setZatUbezpDbRenta(String zatUbezpDbRenta) {
        this.zatUbezpDbRenta = zatUbezpDbRenta;
    }

    public Date getZatUbezpDbRentaData() {
        return zatUbezpDbRentaData;
    }

    public void setZatUbezpDbRentaData(Date zatUbezpDbRentaData) {
        this.zatUbezpDbRentaData = zatUbezpDbRentaData;
    }

    public String getZatUbezpDbChorob() {
        return zatUbezpDbChorob;
    }

    public void setZatUbezpDbChorob(String zatUbezpDbChorob) {
        this.zatUbezpDbChorob = zatUbezpDbChorob;
    }

    public Date getZatUbezpDbChorobData() {
        return zatUbezpDbChorobData;
    }

    public void setZatUbezpDbChorobData(Date zatUbezpDbChorobData) {
        this.zatUbezpDbChorobData = zatUbezpDbChorobData;
    }

    public BigDecimal getZatUbezpDbChorobKwota() {
        return zatUbezpDbChorobKwota;
    }

    public void setZatUbezpDbChorobKwota(BigDecimal zatUbezpDbChorobKwota) {
        this.zatUbezpDbChorobKwota = zatUbezpDbChorobKwota;
    }

    public String getZatOdpowiedzialnosc() {
        return zatOdpowiedzialnosc;
    }

    public void setZatOdpowiedzialnosc(String zatOdpowiedzialnosc) {
        this.zatOdpowiedzialnosc = zatOdpowiedzialnosc;
    }

    public BigDecimal getZatStawkaPostojowa() {
        return zatStawkaPostojowa;
    }

    public void setZatStawkaPostojowa(BigDecimal zatStawkaPostojowa) {
        this.zatStawkaPostojowa = zatStawkaPostojowa;
    }

    public Date getZatDataDo() {
        return zatDataDo;
    }

    public void setZatDataDo(Date zatDataDo) {
        this.zatDataDo = zatDataDo;
    }

    public Date getZatWyrEmerData() {
        return zatWyrEmerData;
    }

    public void setZatWyrEmerData(Date zatWyrEmerData) {
        this.zatWyrEmerData = zatWyrEmerData;
    }

    public Date getZatWyrRentData() {
        return zatWyrRentData;
    }

    public void setZatWyrRentData(Date zatWyrRentData) {
        this.zatWyrRentData = zatWyrRentData;
    }

    public Date getZatWyrChorData() {
        return zatWyrChorData;
    }

    public void setZatWyrChorData(Date zatWyrChorData) {
        this.zatWyrChorData = zatWyrChorData;
    }

    public Date getZatWyrWypData() {
        return zatWyrWypData;
    }

    public void setZatWyrWypData(Date zatWyrWypData) {
        this.zatWyrWypData = zatWyrWypData;
    }

    public Date getZatWyrZdrowData() {
        return zatWyrZdrowData;
    }

    public void setZatWyrZdrowData(Date zatWyrZdrowData) {
        this.zatWyrZdrowData = zatWyrZdrowData;
    }

    public String getZatWyrEmerKod() {
        return zatWyrEmerKod;
    }

    public void setZatWyrEmerKod(String zatWyrEmerKod) {
        this.zatWyrEmerKod = zatWyrEmerKod;
    }

    public String getZatWyrRentKod() {
        return zatWyrRentKod;
    }

    public void setZatWyrRentKod(String zatWyrRentKod) {
        this.zatWyrRentKod = zatWyrRentKod;
    }

    public String getZatWyrChorKod() {
        return zatWyrChorKod;
    }

    public void setZatWyrChorKod(String zatWyrChorKod) {
        this.zatWyrChorKod = zatWyrChorKod;
    }

    public String getZatWyrWypKod() {
        return zatWyrWypKod;
    }

    public void setZatWyrWypKod(String zatWyrWypKod) {
        this.zatWyrWypKod = zatWyrWypKod;
    }

    public String getZatWyrZdrowKod() {
        return zatWyrZdrowKod;
    }

    public void setZatWyrZdrowKod(String zatWyrZdrowKod) {
        this.zatWyrZdrowKod = zatWyrZdrowKod;
    }

    public String getZatEkdNumer() {
        return zatEkdNumer;
    }

    public void setZatEkdNumer(String zatEkdNumer) {
        this.zatEkdNumer = zatEkdNumer;
    }

    public BigDecimal getZatWskaznik() {
        return zatWskaznik;
    }

    public void setZatWskaznik(BigDecimal zatWskaznik) {
        this.zatWskaznik = zatWskaznik;
    }

    public String getZatWartoscBazowa() {
        return zatWartoscBazowa;
    }

    public void setZatWartoscBazowa(String zatWartoscBazowa) {
        this.zatWartoscBazowa = zatWartoscBazowa;
    }

    public String getZatZakresObowiazkow() {
        return zatZakresObowiazkow;
    }

    public void setZatZakresObowiazkow(String zatZakresObowiazkow) {
        this.zatZakresObowiazkow = zatZakresObowiazkow;
    }

    public String getZatWarSzcz() {
        return zatWarSzcz;
    }

    public void setZatWarSzcz(String zatWarSzcz) {
        this.zatWarSzcz = zatWarSzcz;
    }

    public Short getZatPodatek() {
        return zatPodatek;
    }

    public void setZatPodatek(Short zatPodatek) {
        this.zatPodatek = zatPodatek;
    }

    public String getZatWypowiedzenie() {
        return zatWypowiedzenie;
    }

    public void setZatWypowiedzenie(String zatWypowiedzenie) {
        this.zatWypowiedzenie = zatWypowiedzenie;
    }

    public String getZatInneWarunki() {
        return zatInneWarunki;
    }

    public void setZatInneWarunki(String zatInneWarunki) {
        this.zatInneWarunki = zatInneWarunki;
    }

    public String getZatGodzinyPonad() {
        return zatGodzinyPonad;
    }

    public void setZatGodzinyPonad(String zatGodzinyPonad) {
        this.zatGodzinyPonad = zatGodzinyPonad;
    }

    public long getZatWapId() {
        return zatWapId;
    }

    public void setZatWapId(long zatWapId) {
        this.zatWapId = zatWapId;
    }

    public String getZatAudytKt() {
        return zatAudytKt;
    }

    public void setZatAudytKt(String zatAudytKt) {
        this.zatAudytKt = zatAudytKt;
    }

    public String getZatAudytKm() {
        return zatAudytKm;
    }

    public void setZatAudytKm(String zatAudytKm) {
        this.zatAudytKm = zatAudytKm;
    }

    public BigInteger getZatAudytLm() {
        return zatAudytLm;
    }

    public void setZatAudytLm(BigInteger zatAudytLm) {
        this.zatAudytLm = zatAudytLm;
    }

    public String getZatKomentarz() {
        return zatKomentarz;
    }

    public void setZatKomentarz(String zatKomentarz) {
        this.zatKomentarz = zatKomentarz;
    }

    public Date getZatDataPodpisania() {
        return zatDataPodpisania;
    }

    public void setZatDataPodpisania(Date zatDataPodpisania) {
        this.zatDataPodpisania = zatDataPodpisania;
    }

    public String getZatAneks() {
        return zatAneks;
    }

    public void setZatAneks(String zatAneks) {
        this.zatAneks = zatAneks;
    }

    public String getZatRodzajAkordu() {
        return zatRodzajAkordu;
    }

    public void setZatRodzajAkordu(String zatRodzajAkordu) {
        this.zatRodzajAkordu = zatRodzajAkordu;
    }

    public String getZatMiejscePracy() {
        return zatMiejscePracy;
    }

    public void setZatMiejscePracy(String zatMiejscePracy) {
        this.zatMiejscePracy = zatMiejscePracy;
    }

    public String getZatOpodatkowanie() {
        return zatOpodatkowanie;
    }

    public void setZatOpodatkowanie(String zatOpodatkowanie) {
        this.zatOpodatkowanie = zatOpodatkowanie;
    }

    public String getZatFRodzaj() {
        return zatFRodzaj;
    }

    public void setZatFRodzaj(String zatFRodzaj) {
        this.zatFRodzaj = zatFRodzaj;
    }

    public String getZatFAktMianowania() {
        return zatFAktMianowania;
    }

    public void setZatFAktMianowania(String zatFAktMianowania) {
        this.zatFAktMianowania = zatFAktMianowania;
    }

    public BigDecimal getZatPrzychodAut() {
        return zatPrzychodAut;
    }

    public void setZatPrzychodAut(BigDecimal zatPrzychodAut) {
        this.zatPrzychodAut = zatPrzychodAut;
    }

    public String getZatFZmianaPoObliczeniu() {
        return zatFZmianaPoObliczeniu;
    }

    public void setZatFZmianaPoObliczeniu(String zatFZmianaPoObliczeniu) {
        this.zatFZmianaPoObliczeniu = zatFZmianaPoObliczeniu;
    }

    public String getZatPrzygZaw() {
        return zatPrzygZaw;
    }

    public void setZatPrzygZaw(String zatPrzygZaw) {
        this.zatPrzygZaw = zatPrzygZaw;
    }

    public String getZatPozaKrajem() {
        return zatPozaKrajem;
    }

    public void setZatPozaKrajem(String zatPozaKrajem) {
        this.zatPozaKrajem = zatPozaKrajem;
    }

    public String getZatPraceInterwencyjne() {
        return zatPraceInterwencyjne;
    }

    public void setZatPraceInterwencyjne(String zatPraceInterwencyjne) {
        this.zatPraceInterwencyjne = zatPraceInterwencyjne;
    }

    public Short getZatLimitNadRok() {
        return zatLimitNadRok;
    }

    public void setZatLimitNadRok(Short zatLimitNadRok) {
        this.zatLimitNadRok = zatLimitNadRok;
    }

    public Long getZatOdzId() {
        return zatOdzId;
    }

    public void setZatOdzId(Long zatOdzId) {
        this.zatOdzId = zatOdzId;
    }

    public String getZatPowodZwolnienia() {
        return zatPowodZwolnienia;
    }

    public void setZatPowodZwolnienia(String zatPowodZwolnienia) {
        this.zatPowodZwolnienia = zatPowodZwolnienia;
    }

    public String getZatForma() {
        return zatForma;
    }

    public void setZatForma(String zatForma) {
        this.zatForma = zatForma;
    }

    public String getZatRodzajPlacowki() {
        return zatRodzajPlacowki;
    }

    public void setZatRodzajPlacowki(String zatRodzajPlacowki) {
        this.zatRodzajPlacowki = zatRodzajPlacowki;
    }

    public String getZatPoziomWykszt() {
        return zatPoziomWykszt;
    }

    public void setZatPoziomWykszt(String zatPoziomWykszt) {
        this.zatPoziomWykszt = zatPoziomWykszt;
    }

    public String getZatStopienAwansu() {
        return zatStopienAwansu;
    }

    public void setZatStopienAwansu(String zatStopienAwansu) {
        this.zatStopienAwansu = zatStopienAwansu;
    }

    public BigInteger getZatWymiarLicznik() {
        return zatWymiarLicznik;
    }

    public void setZatWymiarLicznik(BigInteger zatWymiarLicznik) {
        this.zatWymiarLicznik = zatWymiarLicznik;
    }

    public BigInteger getZatWymiarMianownik() {
        return zatWymiarMianownik;
    }

    public void setZatWymiarMianownik(BigInteger zatWymiarMianownik) {
        this.zatWymiarMianownik = zatWymiarMianownik;
    }

    public BigDecimal getZatStawkaPe() {
        return zatStawkaPe;
    }

    public void setZatStawkaPe(BigDecimal zatStawkaPe) {
        this.zatStawkaPe = zatStawkaPe;
    }

    public Short getZatPensum() {
        return zatPensum;
    }

    public void setZatPensum(Short zatPensum) {
        this.zatPensum = zatPensum;
    }

    public String getZatDef0() {
        return zatDef0;
    }

    public void setZatDef0(String zatDef0) {
        this.zatDef0 = zatDef0;
    }

    public String getZatDef1() {
        return zatDef1;
    }

    public void setZatDef1(String zatDef1) {
        this.zatDef1 = zatDef1;
    }

    public String getZatDef2() {
        return zatDef2;
    }

    public void setZatDef2(String zatDef2) {
        this.zatDef2 = zatDef2;
    }

    public String getZatDef3() {
        return zatDef3;
    }

    public void setZatDef3(String zatDef3) {
        this.zatDef3 = zatDef3;
    }

    public String getZatDef4() {
        return zatDef4;
    }

    public void setZatDef4(String zatDef4) {
        this.zatDef4 = zatDef4;
    }

    public String getZatDef5() {
        return zatDef5;
    }

    public void setZatDef5(String zatDef5) {
        this.zatDef5 = zatDef5;
    }

    public String getZatDef6() {
        return zatDef6;
    }

    public void setZatDef6(String zatDef6) {
        this.zatDef6 = zatDef6;
    }

    public String getZatDef7() {
        return zatDef7;
    }

    public void setZatDef7(String zatDef7) {
        this.zatDef7 = zatDef7;
    }

    public String getZatDef8() {
        return zatDef8;
    }

    public void setZatDef8(String zatDef8) {
        this.zatDef8 = zatDef8;
    }

    public String getZatDef9() {
        return zatDef9;
    }

    public void setZatDef9(String zatDef9) {
        this.zatDef9 = zatDef9;
    }

    public String getZatWydzial() {
        return zatWydzial;
    }

    public void setZatWydzial(String zatWydzial) {
        this.zatWydzial = zatWydzial;
    }

    public String getZatFPoraNocna() {
        return zatFPoraNocna;
    }

    public void setZatFPoraNocna(String zatFPoraNocna) {
        this.zatFPoraNocna = zatFPoraNocna;
    }

    public Date getZatZarejestrowanie() {
        return zatZarejestrowanie;
    }

    public void setZatZarejestrowanie(Date zatZarejestrowanie) {
        this.zatZarejestrowanie = zatZarejestrowanie;
    }

    public Date getZatWyrejestrowanie() {
        return zatWyrejestrowanie;
    }

    public void setZatWyrejestrowanie(Date zatWyrejestrowanie) {
        this.zatWyrejestrowanie = zatWyrejestrowanie;
    }

    public Date getZatDataStanowiska() {
        return zatDataStanowiska;
    }

    public void setZatDataStanowiska(Date zatDataStanowiska) {
        this.zatDataStanowiska = zatDataStanowiska;
    }

    public String getZatSzczWarChar() {
        return zatSzczWarChar;
    }

    public void setZatSzczWarChar(String zatSzczWarChar) {
        this.zatSzczWarChar = zatSzczWarChar;
    }

    public long getZatFrmId() {
        return zatFrmId;
    }

    public void setZatFrmId(long zatFrmId) {
        this.zatFrmId = zatFrmId;
    }

    public String getZatDef50() {
        return zatDef50;
    }

    public void setZatDef50(String zatDef50) {
        this.zatDef50 = zatDef50;
    }

    public String getZatDef51() {
        return zatDef51;
    }

    public void setZatDef51(String zatDef51) {
        this.zatDef51 = zatDef51;
    }

    public String getZatDef52() {
        return zatDef52;
    }

    public void setZatDef52(String zatDef52) {
        this.zatDef52 = zatDef52;
    }

    public String getZatDef53() {
        return zatDef53;
    }

    public void setZatDef53(String zatDef53) {
        this.zatDef53 = zatDef53;
    }

    public String getZatDef54() {
        return zatDef54;
    }

    public void setZatDef54(String zatDef54) {
        this.zatDef54 = zatDef54;
    }

    public String getZatDef55() {
        return zatDef55;
    }

    public void setZatDef55(String zatDef55) {
        this.zatDef55 = zatDef55;
    }

    public String getZatDef56() {
        return zatDef56;
    }

    public void setZatDef56(String zatDef56) {
        this.zatDef56 = zatDef56;
    }

    public String getZatDef57() {
        return zatDef57;
    }

    public void setZatDef57(String zatDef57) {
        this.zatDef57 = zatDef57;
    }

    public String getZatDef58() {
        return zatDef58;
    }

    public void setZatDef58(String zatDef58) {
        this.zatDef58 = zatDef58;
    }

    public String getZatDef59() {
        return zatDef59;
    }

    public void setZatDef59(String zatDef59) {
        this.zatDef59 = zatDef59;
    }

    public String getZatDef80() {
        return zatDef80;
    }

    public void setZatDef80(String zatDef80) {
        this.zatDef80 = zatDef80;
    }

    public String getZatDef81() {
        return zatDef81;
    }

    public void setZatDef81(String zatDef81) {
        this.zatDef81 = zatDef81;
    }

    public String getZatDef82() {
        return zatDef82;
    }

    public void setZatDef82(String zatDef82) {
        this.zatDef82 = zatDef82;
    }

    public String getZatDef83() {
        return zatDef83;
    }

    public void setZatDef83(String zatDef83) {
        this.zatDef83 = zatDef83;
    }

    public String getZatDef84() {
        return zatDef84;
    }

    public void setZatDef84(String zatDef84) {
        this.zatDef84 = zatDef84;
    }

    public String getZatDef85() {
        return zatDef85;
    }

    public void setZatDef85(String zatDef85) {
        this.zatDef85 = zatDef85;
    }

    public String getZatDef86() {
        return zatDef86;
    }

    public void setZatDef86(String zatDef86) {
        this.zatDef86 = zatDef86;
    }

    public String getZatDef87() {
        return zatDef87;
    }

    public void setZatDef87(String zatDef87) {
        this.zatDef87 = zatDef87;
    }

    public String getZatDef88() {
        return zatDef88;
    }

    public void setZatDef88(String zatDef88) {
        this.zatDef88 = zatDef88;
    }

    public String getZatDef89() {
        return zatDef89;
    }

    public void setZatDef89(String zatDef89) {
        this.zatDef89 = zatDef89;
    }

    public BigDecimal getZatStawkaInfo() {
        return zatStawkaInfo;
    }

    public void setZatStawkaInfo(BigDecimal zatStawkaInfo) {
        this.zatStawkaInfo = zatStawkaInfo;
    }

    public String getZatDef10() {
        return zatDef10;
    }

    public void setZatDef10(String zatDef10) {
        this.zatDef10 = zatDef10;
    }

    public String getZatDef11() {
        return zatDef11;
    }

    public void setZatDef11(String zatDef11) {
        this.zatDef11 = zatDef11;
    }

    public String getZatDef12() {
        return zatDef12;
    }

    public void setZatDef12(String zatDef12) {
        this.zatDef12 = zatDef12;
    }

    public String getZatDef13() {
        return zatDef13;
    }

    public void setZatDef13(String zatDef13) {
        this.zatDef13 = zatDef13;
    }

    public String getZatDef14() {
        return zatDef14;
    }

    public void setZatDef14(String zatDef14) {
        this.zatDef14 = zatDef14;
    }

    public String getZatDef15() {
        return zatDef15;
    }

    public void setZatDef15(String zatDef15) {
        this.zatDef15 = zatDef15;
    }

    public String getZatDef16() {
        return zatDef16;
    }

    public void setZatDef16(String zatDef16) {
        this.zatDef16 = zatDef16;
    }

    public String getZatDef17() {
        return zatDef17;
    }

    public void setZatDef17(String zatDef17) {
        this.zatDef17 = zatDef17;
    }

    public String getZatDef18() {
        return zatDef18;
    }

    public void setZatDef18(String zatDef18) {
        this.zatDef18 = zatDef18;
    }

    public String getZatDef19() {
        return zatDef19;
    }

    public void setZatDef19(String zatDef19) {
        this.zatDef19 = zatDef19;
    }

    public String getZatDef20() {
        return zatDef20;
    }

    public void setZatDef20(String zatDef20) {
        this.zatDef20 = zatDef20;
    }

    public String getZatDef21() {
        return zatDef21;
    }

    public void setZatDef21(String zatDef21) {
        this.zatDef21 = zatDef21;
    }

    public String getZatDef22() {
        return zatDef22;
    }

    public void setZatDef22(String zatDef22) {
        this.zatDef22 = zatDef22;
    }

    public String getZatDef23() {
        return zatDef23;
    }

    public void setZatDef23(String zatDef23) {
        this.zatDef23 = zatDef23;
    }

    public String getZatDef24() {
        return zatDef24;
    }

    public void setZatDef24(String zatDef24) {
        this.zatDef24 = zatDef24;
    }

    public String getZatDef25() {
        return zatDef25;
    }

    public void setZatDef25(String zatDef25) {
        this.zatDef25 = zatDef25;
    }

    public String getZatDef26() {
        return zatDef26;
    }

    public void setZatDef26(String zatDef26) {
        this.zatDef26 = zatDef26;
    }

    public String getZatDef27() {
        return zatDef27;
    }

    public void setZatDef27(String zatDef27) {
        this.zatDef27 = zatDef27;
    }

    public String getZatDef28() {
        return zatDef28;
    }

    public void setZatDef28(String zatDef28) {
        this.zatDef28 = zatDef28;
    }

    public String getZatDef29() {
        return zatDef29;
    }

    public void setZatDef29(String zatDef29) {
        this.zatDef29 = zatDef29;
    }

    public String getZatDef30() {
        return zatDef30;
    }

    public void setZatDef30(String zatDef30) {
        this.zatDef30 = zatDef30;
    }

    public String getZatDef31() {
        return zatDef31;
    }

    public void setZatDef31(String zatDef31) {
        this.zatDef31 = zatDef31;
    }

    public String getZatDef32() {
        return zatDef32;
    }

    public void setZatDef32(String zatDef32) {
        this.zatDef32 = zatDef32;
    }

    public String getZatDef33() {
        return zatDef33;
    }

    public void setZatDef33(String zatDef33) {
        this.zatDef33 = zatDef33;
    }

    public String getZatDef34() {
        return zatDef34;
    }

    public void setZatDef34(String zatDef34) {
        this.zatDef34 = zatDef34;
    }

    public String getZatDef35() {
        return zatDef35;
    }

    public void setZatDef35(String zatDef35) {
        this.zatDef35 = zatDef35;
    }

    public String getZatDef36() {
        return zatDef36;
    }

    public void setZatDef36(String zatDef36) {
        this.zatDef36 = zatDef36;
    }

    public String getZatDef37() {
        return zatDef37;
    }

    public void setZatDef37(String zatDef37) {
        this.zatDef37 = zatDef37;
    }

    public String getZatDef38() {
        return zatDef38;
    }

    public void setZatDef38(String zatDef38) {
        this.zatDef38 = zatDef38;
    }

    public String getZatDef39() {
        return zatDef39;
    }

    public void setZatDef39(String zatDef39) {
        this.zatDef39 = zatDef39;
    }

    public String getZatDef40() {
        return zatDef40;
    }

    public void setZatDef40(String zatDef40) {
        this.zatDef40 = zatDef40;
    }

    public String getZatDef41() {
        return zatDef41;
    }

    public void setZatDef41(String zatDef41) {
        this.zatDef41 = zatDef41;
    }

    public String getZatDef42() {
        return zatDef42;
    }

    public void setZatDef42(String zatDef42) {
        this.zatDef42 = zatDef42;
    }

    public String getZatDef43() {
        return zatDef43;
    }

    public void setZatDef43(String zatDef43) {
        this.zatDef43 = zatDef43;
    }

    public String getZatDef44() {
        return zatDef44;
    }

    public void setZatDef44(String zatDef44) {
        this.zatDef44 = zatDef44;
    }

    public String getZatDef45() {
        return zatDef45;
    }

    public void setZatDef45(String zatDef45) {
        this.zatDef45 = zatDef45;
    }

    public String getZatDef46() {
        return zatDef46;
    }

    public void setZatDef46(String zatDef46) {
        this.zatDef46 = zatDef46;
    }

    public String getZatDef47() {
        return zatDef47;
    }

    public void setZatDef47(String zatDef47) {
        this.zatDef47 = zatDef47;
    }

    public String getZatDef48() {
        return zatDef48;
    }

    public void setZatDef48(String zatDef48) {
        this.zatDef48 = zatDef48;
    }

    public String getZatDef49() {
        return zatDef49;
    }

    public void setZatDef49(String zatDef49) {
        this.zatDef49 = zatDef49;
    }

    public String getZatProfil() {
        return zatProfil;
    }

    public void setZatProfil(String zatProfil) {
        this.zatProfil = zatProfil;
    }

    public PracownikVO getZatPrcId() {
        return zatPrcId;
    }

    public void setZatPrcId(PracownikVO zatPrcId) {
        this.zatPrcId = zatPrcId;
    }

    public PracownikVO getZatPrcIdSzef() {
        return zatPrcIdSzef;
    }

    public void setZatPrcIdSzef(PracownikVO zatPrcIdSzef) {
        this.zatPrcIdSzef = zatPrcIdSzef;
    }

    public PracownikVO getZatPrcIdZast() {
        return zatPrcIdZast;
    }

    public void setZatPrcIdZast(PracownikVO zatPrcIdZast) {
        this.zatPrcIdZast = zatPrcIdZast;
    }

    @XmlTransient
    public Collection<ZatrudnienieVO> getZatrudnienieVOCollection() {
        return zatrudnienieVOCollection;
    }

    public void setZatrudnienieVOCollection(Collection<ZatrudnienieVO> zatrudnienieVOCollection) {
        this.zatrudnienieVOCollection = zatrudnienieVOCollection;
    }

    public ZatrudnienieVO getZatZatId() {
        return zatZatId;
    }

    public void setZatZatId(ZatrudnienieVO zatZatId) {
        this.zatZatId = zatZatId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zatId != null ? zatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZatrudnienieVO)) {
            return false;
        }
        ZatrudnienieVO other = (ZatrudnienieVO) object;
        if ((this.zatId == null && other.zatId != null) || (this.zatId != null && !this.zatId.equals(other.zatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pl.ZatrudnienieVO[ zatId=" + zatId + " ]";
    }
    
}
