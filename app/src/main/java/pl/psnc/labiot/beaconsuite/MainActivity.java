package pl.psnc.labiot.beaconsuite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ListViewCustomAdapter adapter;
    private int[] ICONS;
    private String[]  TITLES;
    private String[]  DESCRIPTIONS ;

    private ArrayList<ListViewItemModel> arrayList = new ArrayList<ListViewItemModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign values
        ICONS = new int[]{R.drawable.eddystone, R.drawable.eddystone, R.drawable.estimote, R.drawable.estimote};
        TITLES = new String[]{"Google Cloud beacon registration", "Google Cloud beacon use cases", "Estimote SDK beacon configuration", "Estimote SDK beacon use case"};
        DESCRIPTIONS = new String[]{"Register a beacon with your Google account", "See an example use case for Google Proximity Beacon API", "Configure Estimote beacon", "See an example use case for Estimote legacy SDK"};

        listView = findViewById(R.id.listView);

        for(int i = 0; i < TITLES.length; i++){
            ListViewItemModel model = new ListViewItemModel(TITLES[i],DESCRIPTIONS[i],ICONS[i]);
            arrayList.add(model);
        }

        //pass results to listViewAdapter
        adapter = new ListViewCustomAdapter(this,arrayList);
        //bind the adapter to the listview
        listView.setAdapter(adapter);
    }
}
