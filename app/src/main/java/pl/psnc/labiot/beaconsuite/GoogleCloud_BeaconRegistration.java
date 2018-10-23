package pl.psnc.labiot.beaconsuite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GoogleCloud_BeaconRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_cloud__beacon_registration);

        //TODO:
        //1.Znaleźć beacony (Estimote SDK - skanowanie, potem zrobić z tego ListView)
        //2.Ustawić im typ broadcastu na Eddystone-UID (Estimote SDK)
        //3.Znaleźć beacony z ustawionym typem pakietu na Eddystone-UID (Google Proximity API + ListView)
        //4.Udostępnić możliwość rejestracji beacona:
        //  -zalogować się do konta google cloud
        //  -wysłać odpowiednio spreparowanego requesta do serwera na odpowiednim adresie
        //  -wyłapać wszystkie błędy
        //  -zapdejtować jakoś status wyświetlanego "znalezionego" beacona na "zarejestrowany"
    }
}
