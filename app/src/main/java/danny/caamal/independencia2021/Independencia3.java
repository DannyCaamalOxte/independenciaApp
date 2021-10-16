package danny.caamal.independencia2021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Independencia3 extends Activity {
    public static Activity In3;
    private RadioButton rb1;
    public int total2=0;
    public int total3=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        In3=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.independencia3);
        rb1=(RadioButton) findViewById(R.id.radio0);
        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            total2 = (Integer) extras.get("Resultados2");
        }
    }

    public void independencia4(View v) {
        //Creo y asigno la información a enviar
// opción 1 es la respuesta correcta
        if (rb1.isChecked() == true) {
            total3 = total2 + 1;
        }
        Intent i=new Intent(this,Independencia4.class);
        i.putExtra("Resultados3",total3);
//inicia la actividad enviando el extra
        startActivity(i);

    }

}
