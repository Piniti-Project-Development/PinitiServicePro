package bd.piniti.service_pro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.DateDayRecycleAdapter;
import Adapter.TimeRecycleAdapter;
import ModelClass.DateDayModelClass;
import at.grabner.circleprogress.CircleProgressView;

public class HomeCleaningFifthActivity extends AppCompatActivity {

    TextView title,number,number1,type;
    ImageView back_img,search;
    Button button;

    int layout;


    /*horizontal date day recyerview data is here*/

    private ArrayList<DateDayModelClass> dateDayModelClasses;
    private RecyclerView recyclerView;
    private DateDayRecycleAdapter bAdapter;

    private  String date[] = {"15","16","17","18","19","20","21","22","23","24","25"};
    private String day[] = {"MON","TUS","WEN","Thu","FRI","SAT","SUN","MON","TUS","WEN","Thu","FRI","SAT","SUN","MON"};


    /*Morning Grid view recycerview data*/

    private ArrayList<DateDayModelClass> dateDayModelClasses1;
    private RecyclerView recyclerView1;
    private TimeRecycleAdapter bAdapter1;

    private String time[] = {"09:00","10:00","11:00"};
    private String hours[] = {"am","am","am"};



    /*After noon Grid view recycerview data*/

    private ArrayList<DateDayModelClass> dateDayModelClasses2;
    private RecyclerView recyclerView2;
    private TimeRecycleAdapter bAdapter2;

    private String time2[] = {"12:00","01:00","02:00","03:00","04:00"};
    private String hours2[] = {"pm","pm","pm","pm","pm"};



     /*Evening Grid view recycerview data*/

    private ArrayList<DateDayModelClass> dateDayModelClasses3;
    private RecyclerView recyclerView3;
    private TimeRecycleAdapter bAdapter3;

    private String time3[] = {"06:00","07:00","08:00"};
    private String hours3[] = {"pm","pm","pm"};


    CircleProgressView circleProgressView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cleaning_fifth);

        type = findViewById(R.id.type);
        title = findViewById(R.id.title);

        Intent j=getIntent();
        layout = j.getIntExtra("layout",0);
        if(layout==1){

            type.setText("Home Cleaning");
            title.setText("Home Deep Cleaning");


            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("70"));
        }
        if(layout==2){
            type.setText("Home Cleaning");
            title.setText("Kitchen Deep Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("70"));
        }
        if(layout==3){
            type.setText("Home Cleaning");
            title.setText("Carpet Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("70"));
        }
        if(layout==4){
            type.setText("Home Cleaning");
            title.setText("Bathroom Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("70"));
        }
        if(layout==5){
            type.setText("Home Cleaning");
            title.setText("Sofa Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("70"));
        }



        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (layout==1){
                    Intent intent = new Intent(HomeCleaningFifthActivity.this,HomeCleaningSixActivity.class);
                    intent.putExtra("layout",1);
                    startActivity(intent);
                }
                if (layout==2){
                    Intent intent = new Intent(HomeCleaningFifthActivity.this,HomeCleaningSixActivity.class);
                    intent.putExtra("layout",2);
                    startActivity(intent);
                }
                if (layout==3){
                    Intent intent = new Intent(HomeCleaningFifthActivity.this,HomeCleaningSixActivity.class);
                    intent.putExtra("layout",3);
                    startActivity(intent);
                }
                if (layout==4){
                    Intent intent = new Intent(HomeCleaningFifthActivity.this,HomeCleaningSixActivity.class);
                    intent.putExtra("layout",4);
                    startActivity(intent);
                }
                if (layout==5){
                    Intent intent = new Intent(HomeCleaningFifthActivity.this,HomeCleaningSixActivity.class);
                    intent.putExtra("layout",5);
                    startActivity(intent);
                }
            }
        });



        /*horizontal category recyclerview code is here*/

        recyclerView = findViewById(R.id.recyclerview_date);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeCleaningFifthActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        dateDayModelClasses = new ArrayList<>();

        for (int i = 0; i < date.length; i++) {
            DateDayModelClass mycreditList = new DateDayModelClass(date[i],day[i]);
            dateDayModelClasses.add(mycreditList);
        }
        bAdapter = new DateDayRecycleAdapter(HomeCleaningFifthActivity.this,dateDayModelClasses);
        recyclerView.setAdapter(bAdapter);



        /*Morningg Grid recyclerview code is here*/

        recyclerView1 = findViewById(R.id.recyclerview_morning);

        RecyclerView.LayoutManager layoutManager1 = new GridLayoutManager(HomeCleaningFifthActivity.this,3);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        dateDayModelClasses1 = new ArrayList<>();

        for (int i = 0; i < time.length; i++) {
            DateDayModelClass mycreditList = new DateDayModelClass(time[i],hours[i]);
            dateDayModelClasses1.add(mycreditList);
        }
        bAdapter1 = new TimeRecycleAdapter(HomeCleaningFifthActivity.this,dateDayModelClasses1);
        recyclerView1.setAdapter(bAdapter1);



        /*Afternoon Grid recyclerview code is here*/

        recyclerView2 = findViewById(R.id.recyclerview_afternoon);

        RecyclerView.LayoutManager layoutManager2 = new GridLayoutManager(HomeCleaningFifthActivity.this,3);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());

        dateDayModelClasses2 = new ArrayList<>();

        for (int i = 0; i < time2.length; i++) {
            DateDayModelClass mycreditList = new DateDayModelClass(time2[i],hours2[i]);
            dateDayModelClasses2.add(mycreditList);
        }
        bAdapter2 = new TimeRecycleAdapter(HomeCleaningFifthActivity.this,dateDayModelClasses2);
        recyclerView2.setAdapter(bAdapter2);


        /*Evening Grid recyclerview code is here*/

        recyclerView3 = findViewById(R.id.recyclerview_evening);

        RecyclerView.LayoutManager layoutManager3 = new GridLayoutManager(HomeCleaningFifthActivity.this,3);
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView3.setItemAnimator(new DefaultItemAnimator());

        dateDayModelClasses3 = new ArrayList<>();

        for (int i = 0; i < time3.length; i++) {
            DateDayModelClass mycreditList = new DateDayModelClass(time3[i],hours3[i]);
            dateDayModelClasses3.add(mycreditList);
        }
        bAdapter3 = new TimeRecycleAdapter(HomeCleaningFifthActivity.this,dateDayModelClasses3);
        recyclerView3.setAdapter(bAdapter3);
    }
}
