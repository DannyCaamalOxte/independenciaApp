package danny.caamal.independencia2021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bienvenida extends Activity {
    public static Activity Bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bi=this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvenida);
    }

    public void independencia1 (View v) {
        Intent i=new Intent(this, Independencia1.class);
        startActivity(i);
    }

}
