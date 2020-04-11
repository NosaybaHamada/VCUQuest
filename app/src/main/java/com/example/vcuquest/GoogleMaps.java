package com.example.vcuquest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMaps extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap mapAPI;
    SupportMapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);
        mapFragment= (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.mapAPI);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("mapcounter", 0);
        mapAPI = googleMap;

        if (intValue == 1){
        LatLng Commons = new LatLng(37.546388, -77.453641);
        mapAPI.addMarker(new MarkerOptions().position(Commons).title("VCU Commons"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
    }
        if (intValue == 2){
            LatLng Compass = new LatLng(37.548459, -77.453889);
            mapAPI.addMarker(new MarkerOptions().position(Compass).title("VCU Compass"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Compass));
        }
        if (intValue == 3){
            LatLng Commons = new LatLng(37.545640, -77.449779);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("VCU Engineering West Hall"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
        if (intValue == 4){
            LatLng Commons = new LatLng(37.547801, -77.453562);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("James Cabell Library"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
        if (intValue == 5){
            LatLng Commons = new LatLng(37.551093, -77.450912);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("West Broad St"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
        if (intValue == 6){
            LatLng Commons = new LatLng(37.544521, -77.453866);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("Cary St Gym"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
        if (intValue == 7){
            LatLng Commons = new LatLng(37.545584, -77.453866);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("Temple Building"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
        if (intValue == 8){
            LatLng Commons = new LatLng(37.544579, -77.439097);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("VCU Police Station"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
        if (intValue == 9){
            LatLng Commons = new LatLng(37.546749, -77.450411);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("Monroe Park"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
        if (intValue == 10){
            LatLng Commons = new LatLng(37.547801, -77.453562);
            mapAPI.addMarker(new MarkerOptions().position(Commons).title("James Cabell Library"));
            mapAPI.moveCamera(CameraUpdateFactory.newLatLng(Commons));
        }
    }
}
