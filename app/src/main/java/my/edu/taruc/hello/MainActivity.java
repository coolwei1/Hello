package my.edu.taruc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg; // TextView = class, textViewMsg = instance
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // onCreate() = main() function
        super.onCreate(savedInstanceState);
        // Display UI
        // R = resources
        // layout = folder
        setContentView(R.layout.activity_main);

        // Link UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    public void showMessage(View view){
        textViewMsg.setText("Hello, Han Zong");
    }

    public void delMessage(View view){
        textViewMsg.setText("");
    }

}
