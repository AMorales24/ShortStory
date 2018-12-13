package angelomorales.com.shortstory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

 EditText ouremail, subject, message;
 Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ouremail = findViewById(R.id.email);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        send = findViewById(R.id.btn_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ourSubjectFeedback = subject.getText().toString();
                String ourMessageFeedback = message.getText().toString();
                String ourEmail = ouremail.getText().toString();



                Intent send = new Intent(Intent.ACTION_SEND);
                send.putExtra(Intent.EXTRA_EMAIL, ourEmail);
                send.putExtra(Intent.EXTRA_SUBJECT, ourSubjectFeedback);
                send.putExtra(Intent.EXTRA_TEXT, ourMessageFeedback);
                send.setPackage("com.google.android.gm");
                startActivity(send);
            }
        });


    }


    }

