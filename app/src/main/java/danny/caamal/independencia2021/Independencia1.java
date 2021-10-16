package danny.caamal.independencia2021;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Independencia1 extends Activity {
    public static Activity In1;
    private RadioButton rb1;
    public int total1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        In1=this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.independencia1);
        rb1=(RadioButton) findViewById(R.id.radio0);
    }

    public void independencia2 (View v){
        // opción 1 es la respuesta correcta
        if (rb1.isChecked() == true) {
            total1 = 1;
        }
        Intent i=new Intent(this,Independencia2.class);
// añado un Extra, que es el que me llevará el valor 1,
// que corresponde a la respuesta correcta.
        i.putExtra("Resultados1",total1);
//inicia la actividad enviando el extra
        startActivity(i);


    }

}
