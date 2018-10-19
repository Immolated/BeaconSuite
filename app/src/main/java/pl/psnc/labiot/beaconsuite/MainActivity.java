package pl.psnc.labiot.beaconsuite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Intent myintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        final String[] values = new String[]{"button1", "button2", "button3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.activity_list_item, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    myintent = new Intent(view.getContext(), EstimoteLegacySDK_BeaconScanning.class);
                    MainActivity.this.startActivity(myintent);
                }
                if (position == 1) {
                    myintent = new Intent(view.getContext(), EstimoteLegacySDK_BeaconConfiguration.class);
                    MainActivity.this.startActivity(myintent);
                }
                if (position == 2) {
                    myintent = new Intent(view.getContext(), GoogleCloud_BeaconUseCase.class);
                    MainActivity.this.startActivity(myintent);
                }
                if (position == 3) {
                    myintent = new Intent(view.getContext(), GoogleCloud_BeaconRegistration.class);
                    MainActivity.this.startActivity(myintent);
                }
            }
        });
    }
}
