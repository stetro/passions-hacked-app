package de.stetro.booking.application.ui.hotel;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.stetro.booking.application.MainApplication;
import de.stetro.booking.application.R;
import de.stetro.booking.application.data.Hotel;

public class HotelActivity extends AppCompatActivity implements HotelView {

    @Inject
    public HotelPresenter hotelPresenter;

    @BindView(R.id.hotel_list)
    public RecyclerView recyclerView;

    private HotelAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainApplication.getApplicationComponent(this).inject(this);
        setContentView(R.layout.activity_hotel);
        setTitle("Hotel Suggestions");
        ButterKnife.bind(this);
        adapter = new HotelAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        hotelPresenter.setView(this);
    }

    @Override
    public void setState(List<Hotel> hotels) {
        adapter.setHotels(hotels);
    }
}