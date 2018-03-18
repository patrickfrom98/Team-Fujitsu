package com.example.u1753592.explorehudd;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        this.getSupportActionBar().setTitle("exploreHudd - Find events near you!");

        FloatingActionButton infobutton = findViewById(R.id.imageButton);
        infobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MapsActivity.this);
                alertDialogBuilder.setMessage("exploreHudd will display all events in Huddersfield on the map. The events will be organised by colours:\n\nBlue: Sports events \nOrange: Educational events, \nYellow: Food/Drink events \nPink: Hobby events");
                alertDialogBuilder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng event1 = new LatLng(53.645311, -1.777505);
        LatLng event2 = new LatLng (53.643645, -1.781704);
        LatLng event3 = new LatLng (53.642280, -1.784164);
        LatLng event4 = new LatLng (53.644589, -1.789625);
        LatLng event5 = new LatLng (53.642936, -1.773979);
        LatLng event6 = new LatLng (53.643547, -1.770406);
        LatLng event7 = new LatLng (53.642720, -1.780545);
        LatLng event8 = new LatLng (53.645448, -1.785233);
        LatLng event9 = new LatLng (53.646949, -1.781779);
        LatLng event10 = new LatLng (53.643148, -1.778267);
        LatLng event11 = new LatLng (53.644806, -1.773496);
        LatLng event12 = new LatLng (53.646695, -1.778871);


        mMap.addMarker(new MarkerOptions()
                .position(event1)
                .title("Charity Run: 28/03/2018 14:30, Costumes encouraged")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions()
                .position(event2)
                .title("Arm Wrestling Competition: 14/04/2018 15:00, £5 to enter, £150 prize.")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions()
                .position(event3)
                .title("Football match: 15/04/2018 13:30, £10 entry")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions()
                .position(event4)
                .title("Hockey match: 16/04/2018 14:30, £5 entry")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions()
                .position(event5)
                .title("Marathon: 25/03/2018 12:30, All ages welcome!")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions()
                .position(event6)
                .title("Rugby Match: 26/03/2018 13:30, £7.50 entry")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions()
                .position(event7)
                .title("Wine tasting evening: 27/03/2018 20:30, £30 entry")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions()
                .position(event8)
                .title("International foods market: 29/03/2018 13:30 - 17:00, Everyone welcome!")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions()
                .position(event9)
                .title("Eating contest: 03/04/2018 15:45, £15 entry, £200 prize")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions()
                .position(event10)
                .title("University open day: 07/04/2018, 12:00 - 18:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(event11)
                .title("Kid's spelling contest: 08/04/2018 13:45 - 15:00")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.addMarker(new MarkerOptions()
                .position(event12)
                .title("Book group: 03/04/2018 16:00, newcomers welcome")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));

        float zoomLevel = 15.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(event1, zoomLevel));

    }
}
