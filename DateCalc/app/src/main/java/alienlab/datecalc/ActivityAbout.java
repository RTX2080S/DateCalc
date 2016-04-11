package alienlab.datecalc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ActivityAbout extends ActionBarActivity {

    private TextView myTextView, myTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        initUI();
    }

    private void initUI() {
        myTextView = (TextView) findViewById(R.id.textAbout);
        myTextView2 =(TextView) findViewById(R.id.textView2);

        String info =  "\n" + getString(R.string.app_name);
        String info2 = "\nVersion " + getString(R.string.app_version) + "\n\nBy 小阿狸";
        myTextView.setText(info);
        myTextView2.setText(info2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_activity_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_close) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
