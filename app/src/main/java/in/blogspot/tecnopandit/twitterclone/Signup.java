package in.blogspot.tecnopandit.twitterclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }
}
