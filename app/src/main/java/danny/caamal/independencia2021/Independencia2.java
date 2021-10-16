package danny.caamal.independencia2021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Independencia2 extends Activity {
    public static Activity In2;
    private RadioButton rb1;
    public int total1=0;
    public int total2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        In2=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.independencia2);
        rb1=(RadioButton) findViewById(R.id.radio0);
        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            total1 = (Integer) extras.get("Resultados1");
        }
    }

    public void independencia3(View v) {
        //Creo y asigno la información a enviar
// opción 1 es la respuesta correcta
        if (rb1.isChecked() == true) {
            total2 = total1 + 1;
        }
        Intent i=new Intent(this,Independencia3.class);
        i.putExtra("Resultados2",total2);
//inicia la actividad enviando el extra
        startActivity(i);


    }
}
