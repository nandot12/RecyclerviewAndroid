package id.co.digitalindo.recyclerviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    int gambar[]= {R.drawable.pem1,
            R.drawable.pem2,
            R.drawable.pem3,
            R.drawable.pem4,
    R.drawable.pem5,R.drawable.pem6,R.drawable.pem7};

    String judul[] = {"indahnya keagungan panorama ciptannnya",
            "indahnya keagungan panorama ciptannnya",

            "indahnya keagungan panorama ciptannnya",
            "indahnya keagungan panorama ciptannnya",
            "indahnya keagungan panorama ciptannnya",
            "indahnya keagungan panorama ciptannnya",
            "indahnya keagungan panorama ciptannnya"};
    int dataratting[] = {1,4,3,5,6,4,5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call adapter
        MyAdapter adapter = new MyAdapter(judul,gambar,dataratting);
        //call recyclerview
        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
        //include adpter to recyclerview
        recyclerView.setAdapter(adapter);

        //set layout manager
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


    }
}
