package danny.caamal.independencia2021;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Independencia extends AppCompatActivity {
    private EditText et1;
    public static Activity Ini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Ini=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_independencia);
        et1=(EditText) findViewById(R.id.editText2);
    }

    public void aceptar (View v){
        String clave=et1.getText().toString();
        if(clave.equals("abc123")){
            Intent i=new Intent(this, Bienvenida.class);
            startActivity(i);
        }
    }

}