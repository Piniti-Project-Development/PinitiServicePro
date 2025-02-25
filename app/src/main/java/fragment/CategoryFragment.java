package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.CategoryRecycleAdapter;
import ModelClass.HomeCategoryModelClass;
import bd.piniti.service_pro.R;


public class CategoryFragment extends Fragment {


    private View view;


    private ArrayList<HomeCategoryModelClass> homeCategoryModelClasses;
    private RecyclerView recyclerView;
    private CategoryRecycleAdapter bAdapter;


    private  Integer image[] = {R.drawable.ic_beauty,R.drawable.ic_appliance,R.drawable.ic_home_cleaning,R.drawable.ic_wedding,
            R.drawable.ic_painting,R.drawable.ic_pest_control,R.drawable.ic_movinghome,R.drawable.ic_wedding,R.drawable.ic_plumber,
            R.drawable.ic_electrician,  R.drawable.ic_electrician, R.drawable.ic_beauty, R.drawable.ic_beauty,R.drawable.ic_appliance,
            R.drawable.ic_home_cleaning,R.drawable.ic_wedding, R.drawable.ic_painting,R.drawable.ic_pest_control,R.drawable.ic_movinghome,
            R.drawable.ic_plumber,R.drawable.ic_plumber,R.drawable.ic_electrician,R.drawable.ic_electrician,R.drawable.ic_beauty,
            R.drawable.ic_electrician,R.drawable.ic_electrician,R.drawable.ic_electrician,R.drawable.ic_beauty,R.drawable.ic_beauty,R.drawable.ic_wedding};
    private String title[] = {"Beauty & Spa","Repair","Cleaning","Weddings & Events","Paintings","Pest Control","Pack & Shift","Plumber",
            "Buy & Sell","Delivery","Design","Devotional Services","Entertainment","Electrician","Farm & Agri","Financial Services","Health",
            "Home Service","Hotels","IT","Laundry","Local Services","Professional Services","Rental","Restaurant","Shopping","Training","Transportation","Travel","Tutor"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_category, container, false);

         /*category recyclerview code is here*/

        recyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeCategoryModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            HomeCategoryModelClass mycreditList = new HomeCategoryModelClass(image[i],title[i]);
            homeCategoryModelClasses.add(mycreditList);
        }
        bAdapter = new CategoryRecycleAdapter(getActivity(),homeCategoryModelClasses);
        recyclerView.setAdapter(bAdapter);

        return  view;
    }


}
