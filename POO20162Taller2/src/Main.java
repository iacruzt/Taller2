public class Main
{

    public static void main (String [] args)
    {
        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard (30);

        Pekka.payGourmet();
        Brian.payEconomical();
        TextIO.putln("Pekka: " + Pekka);
        TextIO.putln("Brian: " + Brian);
        TextIO.putln();

        Pekka.loadMoney(20);
        Brian.payGourmet();
        TextIO.putln("Pekka: " + Pekka);
        TextIO.putln("Brian: " + Brian);
        TextIO.putln();

        Pekka.payEconomical();
        Pekka.payEconomical();
        Brian.loadMoney(50);
        TextIO.putln("Pekka: " + Pekka);
        TextIO.putln("Brian: " + Brian);
        TextIO.putln();

    }

}
