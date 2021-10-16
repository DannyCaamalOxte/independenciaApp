package danny.caamal.independencia2021;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultados extends Activity {
    private Independencia in= new Independencia();
    private Bienvenida bi= new Bienvenida();
    private Independencia1 in1= new Independencia1();
    private Independencia2 in2= new Independencia2();
    private Independencia3 in3= new Independencia3();
    private Independencia4 in4= new Independencia4();

    int total=0;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);
        tv1=(TextView)findViewById(R.id.textView2);
        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            total = (Integer) extras.get("Resultados4");
            tv1.setText(Integer.toString(total));
        }

    }

    public void salir(View view){
        finish();
        in.Ini.finish();
        bi.Bi.finish();
        in1.In1.finish();
        in2.In2.finish();
        in3.In3.finish();
        in4.In4.finish();

    }

}
