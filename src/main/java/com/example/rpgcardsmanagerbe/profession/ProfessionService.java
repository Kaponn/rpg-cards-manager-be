package com.example.rpgcardsmanagerbe.profession;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProfessionService {
    private final Map<String, Profession> professions;

    public ProfessionService() {
        professions = new HashMap<>();

        professions.put("acolyte", new Profession("acolyte",
                Arrays.asList(5, 5, 0, 5, 0, 10, 10, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bardzo silny", "charyzmatyczny", "przemawianie"),
                Arrays.asList("czytanie i pisanie", "leczenie", "nauka (astronomia)", "spostrzegawczość", "znajomość języka (klasyczny)", "znajomość języka (staroświatowy)"), // skills
                Arrays.asList("szaty kapłańskie", "symbol boga")
        ));
        professions.put("outlaw", new Profession("outlaw",
                Arrays.asList(10, 10, 0, 0, 10, 5, 0, 0),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("strzał mierzony", "łotrzyk"),
                Arrays.asList("opieka nad zwierzętami", "plotkowanie", "powożenie", "skradanie się", "spostrzegawczość", "ukrywanie się", "unik", "wspinaczka", "pływanie"),
                Arrays.asList("łuk i 10 strzał", "lekki pancerz (skórzany kaftan)", "tarcza")
        ));
        professions.put("berserk", new Profession("berserk",
                Arrays.asList(15, 0, 10, 10, 0, 0, 10, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (dwuręczna)", "groźny", "szał bojowy", "szybkie wyciągnięcie"),
                Arrays.asList("kuglarstwo (gawędziarstwo)", "mocna głowa", "pływanie", "wiedza (Norska)", "zastraszanie", "znajomość języka (norski)"),
                Arrays.asList("broń dwuręczna", "lekki pancerz (skórzany kaftan)", "butelka gorzałki")
        ));
        professions.put("peasant", new Profession("peasant",
                Arrays.asList(5, 5, 5, 10, 5, 0, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("chodu!", "twardziel"),
                Arrays.asList("hazard", "przekonywanie", "oswajanie", "powożenie", "sztuka przetrwania", "pływanie", "ukrywanie się", "wioślarstwo", "wspinaczka"),
                Arrays.asList("kij", "skórzany bukłak")
                ));
        professions.put("campMan", new Profession("campMan",
                Arrays.asList(0, 0, 0, 5, 10, 5, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("chodu!", "obieżyświat", "twardziel", "charyzmatyczny", "bijatyka"),
                Arrays.asList("powożenie", "plotkowanie", "przekonywanie", "przeszukiwanie", "rzemiosło (gotowanie)", "spostrzegawczość", "targowanie", "znajomość języka (kislevski)", "zwinne palce"),
                Arrays.asList("talizman szczęścia", "sakiewka", "namiot")
                ));
        professions.put("circusArtist", new Profession("circusArtist",
                Arrays.asList(5, 10, 0, 0, 10, 0, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("szybki refleks", "szybkie wyciągnięcie"),
                Arrays.asList("kuglarstwo", "pływanie", "przekonywanie", "spostrzegawczość", "wiedza (Imperium)", "wycena", "znajomość języka (staroświatowy)", "brzuchomóstwo"),
                Arrays.asList("lekki pancerz (skórzany kaftan)", "2 topory do rzucania", "ubranie dobrej jakości")
                ));
        professions.put("barber", new Profession("barber",
                Arrays.asList(5, 0, 0, 0, 10, 10, 10, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("charyzmatyczny", "niezwykle odporny", "chirurgia", "błyskotliwość"),
                Arrays.asList("czytanie i pisanie", "leczenie", "powożenie", "przekonywanie", "rzemiosło (aptekarstwo)", "spostrzegawczość", "targowanie", "znajomość języka (bretoński)"),
                Arrays.asList("narzędzia (cyrulika)", "mikstura lecznicza")
                ));
        professions.put("fanatic", new Profession("fanatic",
                Arrays.asList(10, 0, 5, 10, 0, 0, 10, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (korbacze)", "bardzo silny", "przemawianie", "twardziel"),
                Arrays.asList("czytanie i pisanie", "leczenie", "nauka (teologia)", "przekonywanie", "wiedza (Imperium)", "zastraszanie"),
                Arrays.asList("korbacz", "lekki pancerz (skórzana kurta)", "butelka spirytusu")
                ));
        professions.put("bargeman", new Profession("bargeman",
                Arrays.asList(10, 5, 5, 5, 10, 5, 0, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("obieżyświat", "wyczucie kierunku"),
                Arrays.asList("mocna głowa", "nawigacja", "pływanie", "sekretny język (łowców)", "spostrzegawczość", "sztuka przetrwania", "wiedza (Imperium)", "wioślarstwo", "żeglarstwo"),
                Arrays.asList("leki pancerz (skórzana kurta)", "łódź wiosłowa")
                ));
        professions.put("squire", new Profession("squire",
                Arrays.asList(10, 5, 5, 5, 5, 0, 0, 5),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (kawaleryjska)", "etykieta", "silny cios"),
                Arrays.asList("jeździectwo", "nauka (heraldyka)", "opieka nad zwierzętami", "przekonywanie", "tresura", "unik", "znajomość języka (bretoński)"),
                Arrays.asList("lanca", "średni pancerz (kaftan kolczy, czepiec kolczy i skórzana kurta)", "tarcza", "koń z siodłem i uprzężą")
                ));
        professions.put("gladiator", new Profession("gladiator",
                Arrays.asList(15, 0, 0, 10, 10, 0, 10, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bardzo silny", "broń specjalna (dwuręczna)", "broń specjalna (korbacze)", "broń specjalna (parująca)", "rozbrajanie", "silny cios", "morderczy atak"),
                Arrays.asList("unik", "zastraszanie"),
                Arrays.asList("broń dwuręczna", "kastet", "średni pancerz (kaftan kolczy i skórzana kurta)", "puklerz")
                ));
        professions.put("runner", new Profession("runner",
                Arrays.asList(10, 0, 5, 5, 10, 5, 5, 0),
                Arrays.asList(0, 2, 0, 0, 1, 0, 0, 0),
                Arrays.asList("szósty zmysł", "bardzo wytrzymały", "błyskawiczne przeładowanie", "chodu!", "wyczucie kierunku"),
                Arrays.asList("nawigacja", "pływanie", "sekretne znaki (zwiadowców)", "spostrzegawczość", "sztuka przetrwania", "unik"),
                Arrays.asList("kusza i 10 bełtów", "lekki pancerz (skórzana kurta)", "mikstura lecznicza", "taliznam szczęścia")
                ));
        professions.put("miner", new Profession("miner",
                Arrays.asList(5, 5, 10, 5, 0, 5, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bardzo wytrzymały", "broń specjalna (wojownik)", "wyczucie kierunku"),
                Arrays.asList("nawigacja", "opieka nad zwierzętami", "rzemiosło (górnictwo)", "spostrzegawczość", "ukrywanie się", "wspinaczka", "sztuka przetrwania"),
                Arrays.asList("broń dwuręczna (dwuręczny kilof)", "lekki pancerz (skórzana kurta)", "kilof", "łopata", "latarnia sztormowa", "olej do latarni")
                ));
        professions.put("pellar", new Profession("pellar",
                Arrays.asList(0, 0, 0, 5, 5, 5, 10, 10),
                Arrays.asList(0, 2, 0, 0, 0, 1, 0, 0),
                Arrays.asList("gusła", "magia prosta (gusła)"),
                Arrays.asList("hipnoza", "opieka nad zwierzętami", "oswajanie", "zastraszanie", "przeszukiwanie", "splatanie magii", "spostrzegawczość", "wykrycie magii"),
                Arrays.asList("mikstura lecznicza", "płaszcz z kapturem")
                ));
        professions.put("graveRobber", new Profession("graveRobber",
                Arrays.asList(10, 0, 0, 0, 10, 10, 10, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("szósty zmysł", "wykrywanie pułapek"),
                Arrays.asList("czytanie i pisanie", "skradanie się", "przeszukiwanie", "spostrzegawczość", "ukrywanie się", "wiedza (Imperium)", "wspinaczka", "wycena", "znajomość języka (klasyczny)"),
                Arrays.asList("lekki pancerz (skórzana kurta)", "łom", "latarnia", "olej do latarni", "10 metrów liny", "2 worki")
                ));
        professions.put("fiddler", new Profession("fiddler",
                Arrays.asList(5, 5, 0, 0, 10, 5, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("łotrzyk", "przemawianie", "szczęście"),
                Arrays.asList("gadanina", "hazard", "kuglarstwo (gawędziarstwo)", "plotkowanie", "przekonywanie", "przeszukiwanie", "spostrzegawczość", "wycena", "znajomość języka (staroświatowy)"),
                Arrays.asList("zestaw kości do gry", "6 zk")
                ));
        professions.put("kislevCossack", new Profession("kisslevCossack",
                Arrays.asList(10, 10, 0, 10, 0, 0, 10, 0),
                Arrays.asList(0, 2, 0, 0, 0, 1, 0, 0),
                Arrays.asList("broń specjalna (dwuręczna)", "morderczy atak"),
                Arrays.asList("hazard", "mocna głowa", "przeszukiwanie", "spostrzegawczość", "sztuka przetrwania", "unik", "wiedza (Kislev)", "znajomość języka (kislevski)"),
                Arrays.asList("łuk i 10 strzał", "broń dwuręczna (dwuręczny topór)", "średni pancerz (kolczuga, skórzana kurta, skórzane nogawice")
                ));
        professions.put("woodman", new Profession("woodman",
                Arrays.asList(10, 0, 10, 0, 5, 0, 10, 0),
                Arrays.asList(0, 3, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bardzo szybki", "broń specjalna (dwuręczna)", "wędrowiec"),
                Arrays.asList("sekretne znaki (łowców)", "sekretny język (łowców)", "skradanie się", "spostrzegawczość", "tropienie", "ukrywanie się", "wspinaczka"),
                Arrays.asList("broń dwuręczna (dwuręczny topór)", "lekki pancerz (skórzana kurta)", "odtrutki")
                ));
        professions.put("hunter", new Profession("hunter",
                Arrays.asList(0, 15, 0, 5, 10, 5, 0, 0),
                Arrays.asList(0, 3, 0, 0, 0, 0, 0, 0),
                Arrays.asList("błyskawiczne przeładowanie", "strzelec wyborowy", "szybki refleks", "broń specjalna (długi łuk)"),
                Arrays.asList("przeszukiwanie", "sekretne znaki (łowców)", "skradanie się", "spostrzegawczość", "sztuka przetrwania", "tropienie", "ukrywanie się"),
                Arrays.asList("długi łuk i 10 strzał", "2 potrzaski", "odtrutki")
                ));
        professions.put("treasureHunter", new Profession("treasureHunter",
                Arrays.asList(5, 10, 5, 0, 10, 0, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (unieruchamiająca)", "strzał mierzony", "strzelec wyborowy", "wędrowiec"),
                Arrays.asList("przeszukiwanie", "skradanie się", "spostrzegawczość", "sztuka przetrwania", "tropienie", "śledzenie", "zastraszanie"),
                Arrays.asList("kusza i 10 bełtów", "sieć", "lekki pancerz (skórzany kaftan i skórzany hełm)", "kajdany", "10 metrów liny")
                ));
        professions.put("townsman", new Profession("townsman",
                Arrays.asList(5, 0, 0, 0, 5, 10, 5, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("błyskotliwość", "żyłka handlowa"),
                Arrays.asList("plotkowanie", "powożenie", "przeszukiwanie", "spostrzegawczość", "targowanie", "wiedza (Imperium)", "wycena", "znajomość języka (kislevski)", "znajomość języka (staroświatowy)"),
                Arrays.asList("ubranie dobrej jakości", "liczydło", "latarnia")
                ));
        professions.put("tollKeeper", new Profession("tollKeeper",
                Arrays.asList(10, 5, 5, 10, 5, 0, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 9, 0, 0),
                Arrays.asList("strzelec wyborowy", "szybki refleks"),
                Arrays.asList("czytanie i pisanie", "plotkowanie", "przeszukiwanie", "spostrzegawczość", "unik", "wycena", "znajomość języka (bretoński)"),
                Arrays.asList("kusza i 10 bełtów", "średni pancerz (kaftan kolczy i skórzany kaftan", "tarcza", "zamykana na kłódkę skrzynia", "6 zk")
                ));
        professions.put("mercenary", new Profession("mercenary",
                Arrays.asList(10, 10, 5, 5, 5, 0, 5, 0),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("silny cios", "rozbrajanie", "ogłuszanie"),
                Arrays.asList("hazard", "targowanie", "jeździectwo", "sekretny język (bitewny)", "spostrzegawczość", "unik", "wiedza (Tilea)", "pływanie"),
                Arrays.asList("kusza i 10 bełtów", "średni pancerz (kaftan kolczy i skórzana kurta", "tarcza", "mikstura lecznicza")
                ));
        professions.put("enlistee", new Profession("enlistee",
                Arrays.asList(10, 5, 5, 5, 10, 0, 0, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (dwuręczna)", "silny cios"),
                Arrays.asList("plotkowanie", "opieka nad zwierzętami", "powożenie", "przeszukiwanie", "rzemiosło (kowalstwo)", "spostrzegawczość", "sztuka przetrwania", "unik"),
                Arrays.asList("halabarda", "lekki pancerz (skórzana kurta i skórzany hełm", "mundur")
                ));
        professions.put("securityGuard", new Profession("securityGuard",
                Arrays.asList(10, 0, 5, 5, 5, 0, 0, 0),
                Arrays.asList(1, 3, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bardzo silny", "bijatyka", "broń specjalna (parująca)", "broń specjalna (rzucana)", "ogłuszanie", "rozbrajanie"),
                Arrays.asList("leczenie", "spostrzegawczość", "unik", "zastraszanie"),
                Arrays.asList("dwa noże do rzucania", "kastety", "lekki pancerz (skórzana kurta)", "puklerz")
                ));
        professions.put("bully", new Profession("bully",
                Arrays.asList(10, 0, 5, 5, 0, 0, 5, 5),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("morderczy atak", "odporność na trucizny", "ogłuszanie", "opanowanie", "rozbrajanie"),
                Arrays.asList("hazard", "mocna głowa", "sekretny język (złodziejski)", "unik", "zastraszanie"),
                Arrays.asList("kastety", "średni pancerz (kaftan kolczy i skórzany kaftan")
                ));
        professions.put("page", new Profession("page",
                Arrays.asList(0, 0, 0, 0, 10, 10, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("etykieta", "charyzmatyczny", "żyłka handlowa"),
                Arrays.asList("czytanie i pisanie", "gadanina", "nauka (genealogia)", "plotkowanie", "przeszukiwanie", "spostrzegawczość", "targowanie", "wycena"),
                Arrays.asList("2 komplety ubrań najlepszej jakości", "liberia", "perfumy", "mieszek")
                ));
        professions.put("inciter", new Profession("inciter",
                Arrays.asList(5, 5, 0, 0, 5, 10, 0, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("chodu!", "opanowanie", "przemawianie"),
                Arrays.asList("czytanie i pisanie", "plotkowanie", "nauka (prawo)", "przekonywanie", "spostrzegawczość", "ukrywanie się", "znajomość języka (bretoński)", "znajomość języka (staroświatowy"),
                Arrays.asList("lekki pancerz (skórzana kurta)", "ubranie dobrej jakości", "12 ulotek różnej treści")
                ));
        professions.put("corpseHijacker", new Profession("corpseHijacker",
                Arrays.asList(5, 5, 5, 0, 10, 0, 10, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("chodu!", "łotrzyk", "odporność na choroby"),
                Arrays.asList("targowanie", "powożenie", "przeszukiwanie", "sekretne znaki (złodziei)", "skradanie się", "spostrzegawczość", "wpsinaczka"),
                Arrays.asList("latarnia", "olej do latarni", "kilof", "łopata", "worek")
                ));
        professions.put("messenger", new Profession("messenger",
                Arrays.asList(5, 5, 0, 5, 10, 5, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("obieżyświat", "wyczucie kierunku"),
                Arrays.asList("jeździectwo", "nawigacja", "opieka nad zwierzętami", "pływanie", "sekretne znaki (zwiadowców)", "spostrzegawczość", "sztuka przetrwania", "wiedza (Imperium)", "znajomość języka (staroświatowy)"),
                Arrays.asList("lekki pancerz (skórzana kurta)", "tarcza", "koń z siodłem i uprzężą", "tuba na mapy")
                ));
        professions.put("smuggler", new Profession("smuggler",
                Arrays.asList(5, 5, 0, 0, 10, 10, 0, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("żyłka handlowa", "łotrzyk"),
                Arrays.asList("plotkowanie", "pływanie", "powożenie", "przeszukiwanie", "skradanie się", "spostrzegawczość", "targowanie", "wioślarstwo", "wycena", "znajomość języka (kislevski)"),
                Arrays.asList("lekki pancerz (skórzana kurta)", "koń pociągowy i wóz", "2 pochodnie")
                ));
        professions.put("lookout", new Profession("lookout",
                Arrays.asList(5, 10, 0, 0, 10, 10, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (unieruchamiająca)", "opanowanie", "wyczucie kierunku"),
                Arrays.asList("jeździectwo", "nawigacja", "opieka nad zwierzętami", "przeszukiwanie", "skradanie się", "spostrzegawczość", "sztuka przetrwania", "tropienie"),
                Arrays.asList("łuk i 10 strzał", "bicz", "sieć", "lekki pancerz (skórzana kurta)", "tarcza", "koń z siodłem i uprzężą", "10 metrów liny")
                ));
        professions.put("carrier", new Profession("carrier",
                Arrays.asList(5, 5, 10, 5, 5, 5, 0, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (palna)", "strzelec wyborowy"),
                Arrays.asList("zastraszanie", "pływanie", "przekonywanie", "spostrzegawczość", "targowanie", "wiedza (Imperium)", "wioślarstwo", "wycecena"),
                Arrays.asList("garłacz i 10 kul", "lekki pancerz (skórzana kurta)")
                ));
        professions.put("fisherman", new Profession("fisherman",
                Arrays.asList(0, 5, 10, 5, 10, 5, 0, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("twardziel", "wyczucie kierunku"),
                Arrays.asList("mocna głowa", "nawigacja", "pływanie", "spostrzegawczość", "sztuka przetrwania", "wiedza (Imperium)", "wioślarstwo", "znajomość języka (norski)", "żeglarstwo"),
                Arrays.asList("włócznia", "sieć", "lina z kotwiczką")
                ));
        professions.put("houseProponent", new Profession("houseProponent",
                Arrays.asList(5, 5, 0, 0, 5, 10, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("obieżyświat", "żyłka handlowa"),
                Arrays.asList("czytanie i pisanie", "plotkowanie", "pływanie", "przekonywanie", "spostrzegawczość", "targowanie", "wiedza (Imperium)", "wycena"),
                Arrays.asList("lekki pancerz (skórzana kurta)", "2 komplety ubrań dobrej jakości", "przybory do pisania")
                ));
        professions.put("craftsman", new Profession("craftsman",
                Arrays.asList(0, 0, 5, 5, 10, 5, 10, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("żyłka handlowa", "błyskotliwość"),
                Arrays.asList("czytanie i pisanie", "opieka nad zwierzętami", "powożenie", "rzemiosło (kowalstwo)", "rzemiosło (aptekarstwo)", "spostrzegawczość", "targowanie", "wycena"),
                Arrays.asList("lekki pancerz (skórzany kaftan)", "6 zk")
                ));
        professions.put("cutthroat", new Profession("cutthroat",
                Arrays.asList(10, 0, 10, 0, 10, 0, 10, 0),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bijatyka", "groźny", "morderczy atak", "ogłuszanie", "rozbrajanie", "silny cios"),
                Arrays.asList("jeździectwo", "plotkowanie", "unik", "zastraszanie"),
                Arrays.asList("średni pancerz (kaftan kolczy i skórzana kurta)", "tarcza", "koń z siodłem i uprzężą")
                ));
        professions.put("scribe", new Profession("scrice",
                Arrays.asList(0, 0, 0, 0, 10, 10, 10, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("poliglota", "etykieta"),
                Arrays.asList("czytanie i pisanie", "nauka (prawo)", "rzemiosło (kaligrafia)", "sekretny język (gildii)", "spostrzegawczość", "plotkowanie", "znajomość języka (bretoński)", "znajomość języka (klasyczny)", "znajomość języka (staroświatowy)"),
                Arrays.asList("nóż", "dwie świece woskowe", "5 zapałek", "ilustrowana księga", "przybory do pisania", "wosk do pieczęci")
                ));
        professions.put("servant", new Profession("servant",
                Arrays.asList(5, 0, 5, 0, 10, 5, 10, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bardzo wytrzymały", "czuły słuch", "etykieta"),
                Arrays.asList("czytanie i pisanie", "gadanina", "opieka nad zwierzętami", "plotkowanie", "przeszukiwanie", "spostrzegawczość", "targowanie", "unik"),
                Arrays.asList("ubranie dobrej jakości", "manierka", "krzesiwo i hubka", "latarnia sztormowa", "olej do latarni")
                ));
        professions.put("guard", new Profession("guard",
                Arrays.asList(10, 5, 5, 0, 5, 10, 0, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("ogłuszanie", "opanowanie", "rozbrajanie", "silny cios"),
                Arrays.asList("nauka (prawo)", "plotkowanie", "przeszukiwanie", "spostrzegawczość", "tropienie", "unik", "zastraszanie"),
                Arrays.asList("lekki pancerz (skórzana kurta)", "mundur", "latarnia na drągu", "olej do latarni")
                ));
        professions.put("roadGuard", new Profession("roadGuard",
                Arrays.asList(10, 10, 5, 0, 10, 5, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (palna)", "błyskawiczne przeładowanie"),
                Arrays.asList("jeździectwo", "nawigacja", "opieka nad zwierzętami", "powożenie", "przeszukiwanie", "spostrzegawczość", "sztuka przetrwania", "tropienie", "wiedza (Imperium)"),
                Arrays.asList("pistolet i 10 kul", "średni pancerz (kaftan kolczy i skórzana kurta)", "tarcza", "lekki koń bojowy z siodłem i uprzężą", "10 metrów liny")
                ));
        professions.put("fieldGuard", new Profession("fieldGuard",
                Arrays.asList(5, 10, 0, 5, 10, 0, 10, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bardzo szybki", "błyskawiczne przeładowanie", "szybkie wyciągnięcie"),
                Arrays.asList("neuka (nekromancja)", "przeszukiwanie", "skradanie się", "spostrzegawczość", "sztuka przetrwania", "tropienie", "ukrywanie się"),
                Arrays.asList("proca z amunicją", "kuc z siodłem i uprzężą", "latarnia", "olej do latarni", "łopata")
                ));
        professions.put("jailGuard", new Profession("jailGuard",
                Arrays.asList(10, 0, 10, 10, 0, 0, 5, 0),
                Arrays.asList(0, 3, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (unieruchamiająca)", "odporność na choroby", "odporność na trucizny", "zapasy"),
                Arrays.asList("dowodzenie", "leczenie", "mocna głowa", "przeszukiwanie", "spostrzegawczość", "unik", "zastraszanie"),
                Arrays.asList("bolas", "butelka podłego wina", "manierka")
                ));
        professions.put("ratCatcher", new Profession("ratCatcher",
                Arrays.asList(5, 10, 0, 5, 10, 0, 10, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (proca)", "grotołaz", "odporność na choroby", "odporność na trucizny"),
                Arrays.asList("opieka nad zwierzętami", "przeszukiwanie", "skradanie się", "spostrzegawczość", "tresura", "ukrywanie się", "zastawianie pułapek"),
                Arrays.asList("proca z amunicją", "4 pułapki na szczury", "drąg z martwymi szczurami (6)", "mały, zajadły pies")
                ));
        professions.put("estalFencer", new Profession("estalFencer",
                Arrays.asList(15, 0, 5, 5, 10, 5, 0, 0),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("brawura", "broń specjalna (szermiercza)", "silny cios", "szybkie wyciągnięcie"),
                Arrays.asList("czytanie i pisanie", "nauka (anatomia)", "unik", "wiedza (Estalia)", "znajomość języka (estalijski)"),
                Arrays.asList("szpada", "ubranie najlepszej jakości", "perfumy", "mikstura lecznicza")
                ));
        professions.put("noble", new Profession("noble",
                Arrays.asList(10, 5, 0, 0, 5, 5, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (szermiercza)", "intrygant", "etykieta", "szczęście"),
                Arrays.asList("czytanie i pisanie", "gadanina", "hazard", "jeździectwo", "mocna głowa", "przekonywanie", "wiedza (Imperium)", "znajomość języka (staroświatowy)"),
                Arrays.asList("szpada", "lewak", "strój szlachecki z herbem rodu", "koń z siodłem i uprzężą", "8 zk", "biżuteria o wartości 30 zk")
                ));
        professions.put("garbageman", new Profession("garbageman",
                Arrays.asList(5, 0, 5, 10, 5, 0, 5, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("łotrzyk", "odporność na choroby"),
                Arrays.asList("opieka nad zwierzętami", "powożenie", "plotkowanie", "przeszukiwanie", "spostrzegawczość", "targowanie", "wiedza (Imperium)", "wycena"),
                Arrays.asList("wózek", "3 worki")
                ));
        professions.put("shieldBearer", new Profession("shieldBearer",
                Arrays.asList(10, 0, 5, 5, 10, 0, 5, 0),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("opanowanie", "morderczy atak", "ogłuszanie", "silny cios", "wyczucie kierunku"),
                Arrays.asList("nawigacja", "spostrzegawczość", "śledzenie", "unik", "wspinaczka"),
                Arrays.asList("kusza i 10 bełtów", "średni pancerz (kolczuga, skórzana kurta i skórzane nogawice)", "tarcza", "10 metrów liny z kotwiczką", "bukłak z wodą")
                ));
        professions.put("sorcererApprentice", new Profession("sorcererApprentice",
                Arrays.asList(0, 0, 0, 0, 5, 10, 15, 5),
                Arrays.asList(0, 2, 0, 0, 0, 1, 0, 0),
                Arrays.asList("błyskotliwość", "magia prosta (tajemna)", "zmysł magii"),
                Arrays.asList("czytanie i pisanie", "język tajemny (magiczny)", "nauka (magia)", "przeszukiwanie", "splatanie magii", "spostrzegawczość", "wykrywanie magii", "znajomość języka (klasyczny)"),
                Arrays.asList("kij", "plecak", "księga wiedzy tajemnej")
                ));
        professions.put("coalMan", new Profession("coalMan",
                Arrays.asList(5, 0, 5, 5, 5, 5, 5, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("błyskotliwość", "chodu!"),
                Arrays.asList("powożenie", "przeszukiwanie", "sekretne znaki (łowców)", "spostrzegawczość", "sztuka przetrwania", "targowanie", "wiedza (Imperium)", "wspinaczka"),
                Arrays.asList("broń jednoręczna (topór)", "3 pochodnie", "krzesiwo i hubka")
                ));
        professions.put("rollingStone", new Profession("rollingStone",
                Arrays.asList(5, 10, 0, 0, 10, 5, 0, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("wędrowiec", "obieżyświat", "strzelec wyborowy"),
                Arrays.asList("kuglarstwo (śpiew)", "leczenie", "nawigacja", "plotkowanie", "skradanie się", "sztuka przetrwania", "targowanie", "wiedza (Bretonia)"),
                Arrays.asList("plecak", "prowiant (1 tydzień)", "namiot", "bukłak z wodą")
                ));
        professions.put("clanWarrior", new Profession("clanWarrior",
                Arrays.asList(5, 5, 0, 0, 10, 10, 5, 0),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("urodzony wojownik", "strzelec wyborowy"),
                Arrays.asList("przeszukiwanie", "skradanie się", "spostrzegawczość", "sztuka przetrwania", "tropienie", "ukrywanie się", "unik", "wspinaczka"),
                Arrays.asList("elfi łuk i 10 strzał", "lekki pancerz (skórzana kurta)")
                ));
        professions.put("wagoner", new Profession("wagoner",
                Arrays.asList(5, 10, 0, 0, 10, 0, 5, 5),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (palna)", "szybkie wyciągnięcie"),
                Arrays.asList("jeździectwo", "nawigacja", "opieka nad zwierzętami", "plotkowanie", "powożenie", "spostrzegawczość", "znajomość języka (tileański)"),
                Arrays.asList("garłacz i 10 kul", "średni pancerz (kaftan kolczy i skórzana kurta)", "instrument muzyczny (róg woźnicy)")
                ));
        professions.put("trollKiller", new Profession("trollKiller",
                Arrays.asList(10, 0, 5, 5, 5, 0, 10, 0),
                Arrays.asList(1, 3, 0, 0, 0, 0, 0, 0),
                Arrays.asList("bijatyka", "broń specjalna (dwuręczna)", "rozbrajanie", "silny cios", "szybki refleks", "twardziel"),
                Arrays.asList("mocna głowa", "unik", "zastraszanie"),
                Arrays.asList("broń dwuręczna", "lekki pancerz (skórzany kaftan)", "butelka sirytusu")
                ));
        professions.put("administrator", new Profession("administrator",
                Arrays.asList(5, 5, 5, 0, 0, 10, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("etykieta", "przemawianie"),
                Arrays.asList("czytanie i pisanie", "nawigacja", "jeździectwo", "nauka (prawo)", "opieka nad zwierzętami", "przekonywanie", "spostrzegawczość", "zastraszanie"),
                Arrays.asList("lekki pancerz (skórzana kurta i skórzany hełm)", "ubranie dobrej jakości", "koń z siodłem i uprzężą")
                ));
        professions.put("thief", new Profession("thief",
                Arrays.asList(5, 5, 0, 0, 15, 5, 0, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("wykrywanie pułapek", "łotrzyk"),
                Arrays.asList("zwinne palce", "otwieranie zamków", "wspinaczka", "przeszukiwanie", "sekretny język (złodziejski)", "skradanie się", "spostrzegawczość", "ukrywanie się", "wycena"),
                Arrays.asList("lekki pancerz (skó®zany kaftan)", "worek", "wytrychy", "10 metrów liny")
                ));
        professions.put("student", new Profession("student",
                Arrays.asList(0, 0, 0, 0, 10, 10, 5, 10),
                Arrays.asList(0, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("charyzmatyczny", "poliglota", "geniusz arytmetyczny"),
                Arrays.asList("czytanie i pisanie", "leczenie", "nauka (prawo)", "mocna głowa", "spostrzegawczość", "znajomość języka (klasyczny)", "znajomość języka (staroświatowy)"),
                Arrays.asList("dwie księgi do nauki", "przybory do pisania")
                ));
        professions.put("sailor", new Profession("sailor",
                Arrays.asList(10, 5, 10, 0, 10, 0, 0, 0),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("obieżyświat", "brawura", "bijatyka"),
                Arrays.asList("spostrzegawczość", "pływanie", "unik", "wiedza (Jałowa Kraina)", "wioślarstwo", "wspinaczka", "znajomość języka (norski)", "żeglarstwo"),
                Arrays.asList("lekki pancerz (skórzany kaftan)", "butelka gorzałki kiepskiej jakości")
                ));
        professions.put("soldier", new Profession("soldier",
                Arrays.asList(10, 10, 0, 0, 10, 0, 5, 0),
                Arrays.asList(1, 2, 0, 0, 0, 0, 0, 0),
                Arrays.asList("broń specjalna (dwuręczna)", "morderczy atak", "ogłuszanie", "rozbrajanie", "silny cios"),
                Arrays.asList("hazard", "leczenie", "powożenie", "unik", "spostrzegawczość", "zastraszanie"),
                Arrays.asList("broń dwuręczna (halabarda)", "lekki pancerz (skórznia)", "mundur", "tarcza")
                ));
        professions.put("seaSoldier", new Profession("seaSoldier",
                Arrays.asList(10, 10, 10, 0, 5, 0, 5, 0),
                Arrays.asList(1, 3, 0, 0, 0, 0, 0, 0),
                Arrays.asList("ogłuszanie", "rozbrajanie", "silny cios"),
                Arrays.asList("mocna głowa", "plotkowanie", "pływanie", "unik", "wiedza (Jałowa Kraina)", "wioślarstwo", "zastraszanie"),
                Arrays.asList("łuk i 10 strzał", "lekki pancerz (skórzana kurta)", "tarcza", "10 metrów liny z kotwiczką")
                ));
    }

    public Profession getProfessionByName(String name) {

        System.out.println("TUTAJ PROFESJA " + name);
        System.out.println("asdf " + professions);
        System.out.println("asdf " + professions.get(name));
        return professions.get(name);
    }
}
