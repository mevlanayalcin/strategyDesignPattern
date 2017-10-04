package ana.paket;

public class OrnekLaptopMainSinifi
{




    public static void main(String [] args)
    {
        Laptop oyunLaptobu=new Gamebook();
        oyunLaptobu.oyunOzelligi();
        oyunLaptobu.fanOzelligi();
        oyunLaptobu.interneteGir();
        oyunLaptobu.setFanSicakligi(new YuksekFanIsisi());//Bu kısımda runtime da fan isi özelliğini değiştiriyoruz.
        oyunLaptobu.fanOzelligi();

    }




}
