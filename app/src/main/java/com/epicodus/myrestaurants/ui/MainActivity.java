package com.epicodus.myrestaurants.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.myrestaurants.Constants;
import com.epicodus.myrestaurants.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.Bind;
import butterknife.ButterKnife;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    private DatabaseReference mSearchedLocationReference;
//
//    private ValueEventListener mSearchedLocationReferenceListener;


    @Bind(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @Bind(R.id.appNameTextView) TextView mAppNameTextView;
    @Bind(R.id.savedRestaurantsButton) Button mSavedRestaurantsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        mSearchedLocationReference = FirebaseDatabase
//                .getInstance()
//                .getReference()
//                .child(Constants.FIREBASE_CHILD_SEARCHED_LOCATION);
//
//        mSearchedLocationReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot locationSnapshot : dataSnapshot.getChildren()){
//                    String location = locationSnapshot.getValue().toString();
//                    Log.d("Locations updated", "location: " + location);
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
        super.onCreate(savedInstanceState);
        View _mw = getLayoutInflater().inflate(R.layout.activity_main, null);
        setContentView(_mw);
     //   setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/ostrich-regular.ttf");
        mAppNameTextView.setTypeface(ostrichFont);


        mFindRestaurantsButton.setOnClickListener(this);
        mSavedRestaurantsButton.setOnClickListener(this);
    }

            @Override
            public void onClick(View v) {
                if (v == mFindRestaurantsButton) {
                    Intent intent = new Intent(MainActivity.this, RestaurantListActivity.class);
                    startActivity(intent);

                }
                if (v == mSavedRestaurantsButton) {
                    Intent intent = new Intent(MainActivity.this, SavedRestaurantListActivity.class);
                    startActivity(intent);
                }
            }


//            public void saveLocationToFirebase(String location){
//                mSearchedLocationReference.push().setValue(location);
//            }



//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        mSearchedLocationReference.removeEventListener(mSearchedLocationReferenceListener);
//    }

}
