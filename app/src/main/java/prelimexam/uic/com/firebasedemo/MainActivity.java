package prelimexam.uic.com.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText editText_userid, editText_username, editText_avatar;
    Button  button_create;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_userid = (EditText) findViewById(R.id.editText_userid);
        editText_username = (EditText) findViewById(R.id.editText_username);
        editText_avatar = (EditText) findViewById(R.id.editText_avatar);
        button_create = (Button) findViewById(R.id.button_create);

        //initialize Firebase
        FirebaseApp.initializeApp(MainActivity.this);
        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        button_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //Firebase Create Action
            UserModel user = new UserModel();
            user.setUserid(editText_userid.getText().toString());
            user.setUsername(editText_username.getText().toString());
            user.setAvatar(editText_avatar.getText().toString());
            databaseReference.child("users").child(user.getUserid()).setValue(user);
            }
        });

    }
}
