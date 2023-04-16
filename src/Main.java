public class Main {
    public static void main(String[] args) {
        Grafo brasil = new Grafo();

        Vertice AC = new Vertice("AC");
        Vertice RO = new Vertice("RO");
        Vertice AM = new Vertice("AM");
        Vertice RR = new Vertice("RR");
        Vertice PA = new Vertice("PA");
        Vertice AP = new Vertice("AP");
        Vertice TO = new Vertice("TO");
        brasil.addVertice(AC);
        brasil.addVertice(RO);
        brasil.addVertice(AM);
        brasil.addVertice(RR);
        brasil.addVertice(PA);
        brasil.addVertice(AP);
        brasil.addVertice(TO);


        Vertice MA = new Vertice("MA");
        Vertice PI = new Vertice("PI");
        Vertice CE = new Vertice("CE");
        Vertice RN = new Vertice("RN");
        Vertice PB = new Vertice("PB");
        Vertice PE = new Vertice("PE");
        Vertice AL = new Vertice("AL");
        Vertice SE = new Vertice("SE");
        Vertice BA = new Vertice("BA");
        brasil.addVertice(MA);
        brasil.addVertice(PI);
        brasil.addVertice(CE);
        brasil.addVertice(RN);
        brasil.addVertice(PB);
        brasil.addVertice(PE);
        brasil.addVertice(AL);
        brasil.addVertice(SE);
        brasil.addVertice(BA);


        Vertice MT = new Vertice("MT");
        Vertice GO = new Vertice("GO");
        Vertice DF = new Vertice("DF");
        Vertice MS = new Vertice("MS");
        brasil.addVertice(MT);
        brasil.addVertice(GO);
        brasil.addVertice(DF);
        brasil.addVertice(MS);


        Vertice MG = new Vertice("MG");
        Vertice ES = new Vertice("ES");
        Vertice SP = new Vertice("SP");
        Vertice RJ = new Vertice("RJ");
        brasil.addVertice(MG);
        brasil.addVertice(ES);
        brasil.addVertice(SP);
        brasil.addVertice(RJ);


        Vertice PR = new Vertice("PR");
        Vertice SC = new Vertice("SC");
        Vertice RS = new Vertice("RS");
        brasil.addVertice(PR);
        brasil.addVertice(SC);
        brasil.addVertice(RS);



        //Fronteiras Região Norte

        Aresta ACAM = new Aresta(AC, AM, "AC-AM", 1150);

        Aresta ROMT = new Aresta(RO, MT, "RO-MT", 1138);
        Aresta ROAM = new Aresta(RO, AM, "RO-AM", 760);

        Aresta AMAC = new Aresta(AM, AC, "AM-AC", 1150);
        Aresta AMRO = new Aresta(AM, RO, "AM-RO", 760);
        Aresta AMRR = new Aresta(AM, RR, "AM-RR", 663);
        Aresta AMPA = new Aresta(AM, PA, "AM-PA", 1294);
        Aresta AMMT = new Aresta(AM, MT, "AM-MT", 1455);

        Aresta RRAM = new Aresta(RR, AM, "RR-AM", 665);
        Aresta RRPA = new Aresta(RR, PA, "RR-PA", 1434);

        Aresta PARR = new Aresta(PA, RR, "PA-RR", 1434);
        Aresta PAAM = new Aresta(PA, AM, "PA-AM", 1294);
        Aresta PAMT = new Aresta(PA, MT, "PA-MT", 1780);
        Aresta PATO = new Aresta(PA, TO, "PA-TO", 970);
        Aresta PAAP = new Aresta(PA, AP, "PA-AP", 330);
        Aresta PAMA = new Aresta(PA, MA, "PA-MA", 482);

        Aresta APPA = new Aresta(AP, PA, "AP-PA", 330);

        Aresta TOMT = new Aresta(TO, MT, "TO-MT", 1036);
        Aresta TOPA = new Aresta(TO, PA, "TO-PA", 970);
        Aresta TOMA = new Aresta(TO, MA, "TO-MA", 959);
        Aresta TOPI = new Aresta(TO, PI, "TO-PI", 831);
        Aresta TOBA = new Aresta(TO, BA, "TO-BA", 1115);
        Aresta TOGO = new Aresta(TO, GO, "TO-GO", 731);
        brasil.addAresta(ACAM);
        brasil.addAresta(ROMT);
        brasil.addAresta(ROAM);

        brasil.addAresta(AMAC);
        brasil.addAresta(AMRO);
        brasil.addAresta(AMRR);
        brasil.addAresta(AMPA);
        brasil.addAresta(AMMT);

        brasil.addAresta(RRAM);
        brasil.addAresta(RRPA);

        brasil.addAresta(PARR);
        brasil.addAresta(PAAM);
        brasil.addAresta(PAMT);
        brasil.addAresta(PATO);
        brasil.addAresta(PAAP);
        brasil.addAresta(PAMA);

        brasil.addAresta(APPA);

        brasil.addAresta(TOMT);
        brasil.addAresta(TOPA);
        brasil.addAresta(TOMA);
        brasil.addAresta(TOPI);
        brasil.addAresta(TOBA);
        brasil.addAresta(TOGO);



        //Fronteiras Região Nordeste

        Aresta BASE = new Aresta(BA, SE, "BA-SE", 277);
        Aresta BAAL = new Aresta(BA, AL, "BA-AL", 476);
        Aresta BAPE = new Aresta(BA, PE, "BA-PE", 676);
        Aresta BAPI = new Aresta(BA, PI, "BA-PI", 996);
        Aresta BATO = new Aresta(BA, TO, "BA-TO", 1115);
        Aresta BAGO = new Aresta(BA, GO, "BA-GO", 1227);
        Aresta BAMG = new Aresta(BA, MG, "BA-MG", 968);
        Aresta BAES = new Aresta(BA, ES, "BA-ES", 839);

        Aresta PIMA = new Aresta(PI, MA, "PI-MA", 330);
        Aresta PICE = new Aresta(PI, CE, "PI-CE", 497);
        Aresta PIPE = new Aresta(PI, PE, "PI-PE", 936);
        Aresta PIBA = new Aresta(PI, BA, "PI-BA", 996);
        Aresta PITO = new Aresta(PI, TO, "PI-TO", 831);

        Aresta MAPA = new Aresta(MA, PA, "MA-PA", 482);
        Aresta MATO = new Aresta(MA, TO, "MA-TO", 959);
        Aresta MAPI = new Aresta(MA, PI, "MA-PI", 330);

        Aresta CEPI = new Aresta(CE, PI, "CE-PI", 497);
        Aresta CEPE = new Aresta(CE, PE, "CE-PE", 631);
        Aresta CEPB = new Aresta(CE, PB, "CE-PB", 556);
        Aresta CERN = new Aresta(CE, RN, "CE-RN", 436);

        Aresta RNCE = new Aresta(RN, CE, "RN-CE", 436);
        Aresta RNPB = new Aresta(RN, PB, "RN-PB", 152);

        Aresta PBRN = new Aresta(PB, RN, "PB-RN", 152);
        Aresta PBCE = new Aresta(PB, CE, "PB-CE", 556);
        Aresta PBPE = new Aresta(PB, PE, "PB-PE", 105);

        Aresta PEPB = new Aresta(PE, PB, "PE-PB", 105);
        Aresta PECE = new Aresta(PE, CE, "PE-CE", 630);
        Aresta PEPI = new Aresta(PE, PI, "PE-PI", 935);
        Aresta PEBA = new Aresta(PE, BA, "PE-BA", 675);
        Aresta PEAL = new Aresta(PE, AL, "PE-AL", 203);

        Aresta ALPE = new Aresta(AL, PE, "AL-PE", 203);
        Aresta ALBA = new Aresta(AL, BA, "AL-BA", 476);
        Aresta ALSE = new Aresta(AL, SE, "AL-SE", 202);

        Aresta SEAL = new Aresta(SE, AL, "SE-AL", 202);
        Aresta SEBA = new Aresta(SE, BA, "SE-BA", 277);
        brasil.addAresta(BASE);
        brasil.addAresta(BAAL);
        brasil.addAresta(BAPE);
        brasil.addAresta(BAPI);
        brasil.addAresta(BATO);
        brasil.addAresta(BAGO);
        brasil.addAresta(BAMG);
        brasil.addAresta(BAES);

        brasil.addAresta(PIMA);
        brasil.addAresta(PICE);
        brasil.addAresta(PIPE);
        brasil.addAresta(PIBA);
        brasil.addAresta(PITO);

        brasil.addAresta(MAPA);
        brasil.addAresta(MATO);
        brasil.addAresta(MAPI);

        brasil.addAresta(CEPI);
        brasil.addAresta(CEPE);
        brasil.addAresta(CEPB);
        brasil.addAresta(CERN);

        brasil.addAresta(RNCE);
        brasil.addAresta(RNPB);

        brasil.addAresta(PBRN);
        brasil.addAresta(PBCE);
        brasil.addAresta(PBPE);

        brasil.addAresta(PEPB);
        brasil.addAresta(PECE);
        brasil.addAresta(PEPI);
        brasil.addAresta(PEBA);
        brasil.addAresta(PEAL);

        brasil.addAresta(ALPE);
        brasil.addAresta(ALBA);
        brasil.addAresta(ALSE);

        brasil.addAresta(SEAL);
        brasil.addAresta(SEBA);


        //Fronteiras Região Centro-Oeste

        Aresta MSPR = new Aresta(MS, PR, "MS-PR", 782);
        Aresta MSSP = new Aresta(MS, SP, "MS-SP", 894);
        Aresta MSMG = new Aresta(MS, MG, "MS-MG", 1120);
        Aresta MSGO = new Aresta(MS, GO, "MS-GO", 706);
        Aresta MSMT = new Aresta(MS, MT, "MS-MT", 560);

        Aresta MTMS = new Aresta(MT, MS, "MT-MS", 560);
        Aresta MTGO = new Aresta(MT, GO, "MT-GO", 741);
        Aresta MTTO = new Aresta(MT, TO, "MT-TO", 1036);
        Aresta MTPA = new Aresta(MT, PA, "MT-PA", 1780);
        Aresta MTAM = new Aresta(MT, AM, "MT-AM", 1453);
        Aresta MTRO = new Aresta(MT, RO, "MT-RO", 1139);

        Aresta GOMS = new Aresta(GO, MS, "GO-MS", 706);
        Aresta GOMG = new Aresta(GO, MG, "GO-MG", 671);
        Aresta GODF = new Aresta(GO, DF, "GO-DF", 175);
        Aresta GOBA = new Aresta(GO, BA, "GO-BA", 1227);
        Aresta GOTO = new Aresta(GO, TO, "GO-TO", 731);
        Aresta GOMT = new Aresta(GO, MT, "GO-MT", 741);

        Aresta DFGO = new Aresta(DF, GO, "DF-GO", 175);
        Aresta DFMG = new Aresta(DF, MG, "DF-MG", 628);
        brasil.addAresta(MSPR);
        brasil.addAresta(MSSP);
        brasil.addAresta(MSMG);
        brasil.addAresta(MSGO);
        brasil.addAresta(MSMT);

        brasil.addAresta(MTMS);
        brasil.addAresta(MTGO);
        brasil.addAresta(MTTO);
        brasil.addAresta(MTPA);
        brasil.addAresta(MTAM);
        brasil.addAresta(MTRO);

        brasil.addAresta(GOMS);
        brasil.addAresta(GOMG);
        brasil.addAresta(GODF);
        brasil.addAresta(GOBA);
        brasil.addAresta(GOTO);
        brasil.addAresta(GOMT);

        brasil.addAresta(DFGO);
        brasil.addAresta(DFMG);



        //Fronteiras Região Sudeste

        Aresta SPPR = new Aresta(SP, PR, "SP-PR", 338);
        Aresta SPRJ = new Aresta(SP, RJ, "SP-RJ", 360);
        Aresta SPMG = new Aresta(SP, MG, "SP-MG", 491);
        Aresta SPMS = new Aresta(SP, MS, "SP-MS", 894);

        Aresta RJSP = new Aresta(RJ, SP, "RJ-SP", 360);
        Aresta RJES = new Aresta(RJ, ES, "RJ-ES", 421);
        Aresta RJMG = new Aresta(RJ, MG, "RJ-MG", 346);

        Aresta ESRJ = new Aresta(ES, RJ, "ES-RJ", 421);
        Aresta ESMG = new Aresta(ES, MG, "ES-MG", 382);
        Aresta ESBA = new Aresta(ES, BA, "ES-BA", 839);

        Aresta MGBA = new Aresta(MG, BA, "MG-BA", 968);
        Aresta MGES = new Aresta(MG, ES, "MG-ES", 383);
        Aresta MGRJ = new Aresta(MG, RJ, "MG-RJ", 349);
        Aresta MGSP = new Aresta(MG, SP, "MG-SP", 493);
        Aresta MGGO = new Aresta(MG, GO, "MG-GO", 667);
        Aresta MGDF = new Aresta(MG, DF, "MG-DF", 625);
        Aresta MGMS = new Aresta(MG, MS, "MG-MS", 1120);
        brasil.addAresta(SPPR);
        brasil.addAresta(SPRJ);
        brasil.addAresta(SPMG);
        brasil.addAresta(SPMS);

        brasil.addAresta(RJSP);
        brasil.addAresta(RJES);
        brasil.addAresta(RJMG);

        brasil.addAresta(ESRJ);
        brasil.addAresta(ESMG);
        brasil.addAresta(ESBA);

        brasil.addAresta(MGBA);
        brasil.addAresta(MGES);
        brasil.addAresta(MGRJ);
        brasil.addAresta(MGSP);
        brasil.addAresta(MGGO);
        brasil.addAresta(MGDF);
        brasil.addAresta(MGMS);


        //Fronteiras Região Sul

        Aresta RSSC = new Aresta(RS, SC, "RS-SC", 377);

        Aresta SCRS = new Aresta(SC, RS, "SC-RS", 377);
        Aresta SCPR = new Aresta(SC, PR, "SC-PR", 251);

        Aresta PRSC = new Aresta(PR, SC, "PR-SC", 252);
        Aresta PRSP = new Aresta(PR, SP, "PR-SP", 338);
        Aresta PRMS = new Aresta(PR, MS, "PR-MS", 781);
        brasil.addAresta(RSSC);

        brasil.addAresta(SCRS);
        brasil.addAresta(SCPR);

        brasil.addAresta(PRSC);
        brasil.addAresta(PRSP);
        brasil.addAresta(PRMS);


        brasil.respostasAtividade();
        brasil.grau();
        brasil.matrizAdjacencia();

    }
}