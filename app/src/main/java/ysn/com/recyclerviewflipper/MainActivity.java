package ysn.com.recyclerviewflipper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import ysn.com.recyclerviewflipper.LayoutManager.LooperLayoutManager;
import ysn.com.recyclerviewflipper.adapter.MyAdapter;
import ysn.com.recyclerviewflipper.view.RecyclerViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerViewFlipper recyclerViewFlipper = findViewById(R.id.main_activity_recycler_view_flipper);
        recyclerViewFlipper.setLayoutManager(new LooperLayoutManager());
        recyclerViewFlipper.setAdapter(new MyAdapter(getData(), this));
    }

    public ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            data.add("第" + i + "碗饭");
        }
        return data;
    }
}
