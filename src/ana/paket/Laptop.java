package ana.paket;

public  class Laptop
{
    OyunOynatmaOzelligi oyunOynatmaOzelligi;
    FanSicakligi fanSicakligi;

    public void interneteGir()
    {
        System.out.println("Internete bağlanırım her bilgisayar gibi ");
    }


    public void oyunOzelligi( )
    {
        oyunOynatmaOzelligi.oyunOynatma();
    }

    public void fanOzelligi()
    {
        fanSicakligi.fanIsisi();
    }

    public void setFanSicakligi(FanSicakligi fan)
    {
        fanSicakligi=fan;
    }


}
