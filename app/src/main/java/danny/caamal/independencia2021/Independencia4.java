package danny.caamal.independencia2021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Independencia4 extends Activity {
    public static Activity In4;
    private RadioButton rb1;
    public int total3=0;
    public int total4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        In4=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.independencia4);
        rb1=(RadioButton)findViewById(R.id.radio0);
        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            total3 = (Integer) extras.get("Resultados3");
        }

    }

    public void resultados (View v) {
        if (rb1.isChecked()==true){//opcion 1 es la respuesta
            total4= total3 +1;
        }
        Intent i=new Intent(this,Resultados.class);
        i.putExtra("Resultados4", total4);
        startActivity(i);
    }

}

