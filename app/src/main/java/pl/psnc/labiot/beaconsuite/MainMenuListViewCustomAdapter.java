package pl.psnc.labiot.beaconsuite;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainMenuListViewCustomAdapter extends BaseAdapter{
    private Context mContext;
    private LayoutInflater inflater;
    private List<MainMenuListViewItemModel> modelList;
    private ArrayList<MainMenuListViewItemModel> arrayList;

    public class ViewHolder{
        TextView title, description;
        ImageView icon;
    }

    //constructor
    public MainMenuListViewCustomAdapter(Context mContext, List<MainMenuListViewItemModel> modelList) {
        this.mContext   = mContext;
        this.modelList  = modelList;
        this.inflater   = LayoutInflater.from(this.mContext);
        this.arrayList  = new ArrayList<>();
        this.arrayList.addAll(modelList);
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate views in row.xml
            holder.title = view.findViewById(R.id.MainListView_title);
            holder.description = view.findViewById(R.id.MainListView_description);
            holder.icon= view.findViewById(R.id.MainListView_icon);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        holder.title.setText(modelList.get(position).getTitle());
        holder.description.setText(modelList.get(position).getDescription());
        holder.icon.setImageResource(modelList.get(position).getIcon());

        view.setOnClickListener(v -> {
            //TODO: zaimplementować wybór elementu
            if(modelList.get(position).getTitle().equals(mContext.getResources().getString(R.string.MainMenu_Title1))){
                //start appropriate activity
                Intent intent = new Intent(mContext, GoogleCloud_BeaconRegistration.class);
                mContext.startActivity(intent);
            }
            if(modelList.get(position).getTitle().equals(mContext.getResources().getString(R.string.MainMenu_Title2))){
                //start appropriate activity
                Intent intent = new Intent(mContext, GoogleCloud_BeaconUseCase.class);
                mContext.startActivity(intent);
            }
            if(modelList.get(position).getTitle().equals(mContext.getResources().getString(R.string.MainMenu_Title3))){
                //start appropriate activity
                Intent intent = new Intent(mContext, EstimoteLegacySDK_BeaconConfiguration.class);
                mContext.startActivity(intent);
            }
            if(modelList.get(position).getTitle().equals(mContext.getResources().getString(R.string.MainMenu_Title4))){
                //start appropriate activity
                Intent intent = new Intent(mContext, EstimoteLegacySDK_BeaconUseCase.class);
                mContext.startActivity(intent);
            }
        });
        return view;
    }
}