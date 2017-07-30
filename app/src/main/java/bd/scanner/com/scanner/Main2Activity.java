package bd.scanner.com.scanner;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button btnOne, btnTwo, btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnOne:
                changeFocus(R.id.btnOne);
                break;
            case R.id.btnTwo:
                changeFocus(R.id.btnTwo);
                break;
            case R.id.btnThree:
                changeFocus(R.id.btnThree);
                break;

        }

    }

    public void changeFocus(int btn)
    {
        if (btn==R.id.btnOne){
            btnOne.setBackgroundResource(R.drawable.back);
            btnTwo.setBackgroundResource(R.drawable.sack);
            btnThree.setBackgroundResource(R.drawable.sack);

        }else if (btn==R.id.btnTwo){
            btnOne.setBackgroundResource(R.drawable.sack);
            btnTwo.setBackgroundResource(R.drawable.back);
            btnThree.setBackgroundResource(R.drawable.sack);

        }else {
            btnOne.setBackgroundResource(R.drawable.sack);
            btnTwo.setBackgroundResource(R.drawable.sack);
            btnThree.setBackgroundResource(R.drawable.back);

        }
    }
}
