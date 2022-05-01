package com.example.usedvehicledealership;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class BaseMenuActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.browse:
                Toast.makeText(this, "Browse selected", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.allVehicles:
                Toast.makeText(this, "All vehicles selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,ViewAllVehiclesActivity.class );
                startActivity(intent);
                return true;
            case R.id.soldVehicles:
                Toast.makeText(this, "Sold vehicles selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,ViewSoldVehiclesActivity.class );
                startActivity(intent);
                return true;
            case R.id.availableVehicles:
                Toast.makeText(this, "Available vehicles selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,ViewAvailableVehiclesActivity.class );
                startActivity(intent);
                return true;
            case R.id.view:
                Toast.makeText(this, "View selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.viewCompany:
                Toast.makeText(this, "View Company selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,ViewCompanyActivity.class );
                startActivity(intent);
                return true;
            case R.id.viewVehicle:
                Toast.makeText(this, "View Vehicle selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,ViewVehicleActivity.class );
                startActivity(intent);
                return true;
            case R.id.add:
                Toast.makeText(this, "Add selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,AddActivity.class );
                startActivity(intent);
                return true;
            case R.id.modify:
                Toast.makeText(this, "Modify selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.modifyCompany:
                Toast.makeText(this, "Modify Company selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,ModifyCompanyActivity.class );
                startActivity(intent);
                return true;
            case R.id.modifyVehicle:
                Toast.makeText(this, "Modify Vehicle selected", Toast.LENGTH_SHORT).show();
                intent=new Intent(this,ModifyVehicleActivity.class );
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
