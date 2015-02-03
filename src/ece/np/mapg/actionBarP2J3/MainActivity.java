package ece.np.mapg.actionBarP2J3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
    }
    	
 	@SuppressLint("NewApi")
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

			int id = item.getItemId();
	        if (id == R.id.java) {
	            startActivity(new Intent(getApplicationContext(),JavaActivity.class));
	            javaActivity();
	            return true;
	        }
	        else if (id==R.id.youtube){
	        	startActivity(new Intent(getApplicationContext(),YoutubeActivity.class));
	        	youtubeActivity();
	        	return true;
	        }
	        else
			return super.onOptionsItemSelected(item);
		}

	



	public void javaActivity() {
		Toast.makeText(this, "Java Option Selected", Toast.LENGTH_SHORT).show();
	}

	public void youtubeActivity() {
		Toast.makeText(this, "Youtube Option Selected", Toast.LENGTH_SHORT).show();
	}

}
