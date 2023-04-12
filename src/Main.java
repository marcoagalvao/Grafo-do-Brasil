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

        Aresta ACAM = new Aresta(AC, AM);

        Aresta ROMT = new Aresta(RO, MT);
        Aresta ROAM = new Aresta(RO, AM);

        Aresta AMAC = new Aresta(AM, AC);
        Aresta AMRO = new Aresta(AM, RO);
        Aresta AMRR = new Aresta(AM, RR);
        Aresta AMPA = new Aresta(AM, PA);
        Aresta AMMT = new Aresta(AM, MT);

        Aresta RRAM = new Aresta(RR, AM);
        Aresta RRPA = new Aresta(RR, PA);

        Aresta PARR = new Aresta(PA, RR);
        Aresta PAAM = new Aresta(PA, AM);
        Aresta PAMT = new Aresta(PA, MT);
        Aresta PATO = new Aresta(PA, TO);
        Aresta PAAP = new Aresta(PA, AP);
        Aresta PAMA = new Aresta(PA, MA);

        Aresta APPA = new Aresta(AP, PA);

        Aresta ROAM = new Aresta(RO, AM);
        Aresta ROMT = new Aresta(RO, MT);

        Aresta TOMT = new Aresta(TO, MT);
        Aresta TOPA = new Aresta(TO, PA);
        Aresta TOMA = new Aresta(TO, MA);
        Aresta TOPI = new Aresta(TO, PI);
        Aresta TOBA = new Aresta(TO, BA);
        Aresta TOGO = new Aresta(TO, GO);


        //Fronteiras Região Nordeste



        //Fronteiras Região Centro-Oeste

        Aresta MSPR = new Aresta(MS, PR);
        Aresta MSSP = new Aresta(MS, SP);
        Aresta MSMG = new Aresta(MS, MG);
        Aresta MSGO = new Aresta(MS, GO);
        Aresta MSMT = new Aresta(MS, MT);

        Aresta MTMS = new Aresta(MT, MS);
        Aresta MTGO = new Aresta(MT, GO);
        Aresta MTTO = new Aresta(MT, TO);
        Aresta MTPA = new Aresta(MT, PA);
        Aresta MTAM = new Aresta(MT, AM);
        Aresta MTRO = new Aresta(MT, RO);

        Aresta GOMS = new Aresta(GO, MS);
        Aresta GOMG = new Aresta(GO, MG);
        Aresta GODF = new Aresta(GO, DF);
        Aresta GOBA = new Aresta(GO, BA);
        Aresta GOTO = new Aresta(GO, TO);
        Aresta GOMT = new Aresta(GO, MT);

        Aresta DFGO = new Aresta(DF, GO);
        Aresta DFMG = new Aresta(DF, MG);


        //Fronteiras Região Sudeste

        Aresta SPPR = new Aresta(SP, PR);
        Aresta SPRJ = new Aresta(SP, RJ);
        Aresta SPMG = new Aresta(SP, MG);
        Aresta SPMS = new Aresta(SP, MS);

        Aresta RJSP = new Aresta(RJ, SP);
        Aresta RJES = new Aresta(RJ, ES);
        Aresta RJMG = new Aresta(RJ, MG);

        Aresta ESRJ = new Aresta(ES, RJ);
        Aresta ESMG = new Aresta(ES, MG);
        Aresta ESBA = new Aresta(ES, BA);

        Aresta MGBA = new Aresta(MG, BA);
        Aresta MGES = new Aresta(MG, ES);
        Aresta MGRJ = new Aresta(MG, RJ);
        Aresta MGSP = new Aresta(MG, SP);
        Aresta MGGO = new Aresta(MG, GO);
        Aresta MGDF = new Aresta(MG, DF);
        Aresta MGMS = new Aresta(MG, MS);


        //Fronteiras Região Sul

        Aresta RSSC = new Aresta(RS, SC);

        Aresta SCRS = new Aresta(SC, RS);
        Aresta SCPR = new Aresta(SC, PR);

        Aresta PRSC = new Aresta(PR, SC);
        Aresta PRSP = new Aresta(PR, SP);
        Aresta PRMS = new Aresta(PR, MS);

    }
}