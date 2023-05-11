package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean following = false;
    private Button followBtn;

    private TextView header;

    private Button messageBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent receivingEnd = getIntent();
        String message = receivingEnd.getStringExtra("Key");
        header = findViewById(R.id.headerText);
        header.setText("MAD " + message);


        followBtn = (Button) findViewById(R.id.followBtn);
        followBtn.setOnClickListener(view -> {
            if(!following){
                followBtn.setText("Unfollow");
                Toast.makeText(getApplicationContext(),"Followed",Toast.LENGTH_SHORT).show();
            }
            else{
                followBtn.setText("follow");
                Toast.makeText(getApplicationContext(),"Unfollowed",Toast.LENGTH_SHORT).show();
            }
            following = !following;
        });

        messageBtn = (Button) findViewById(R.id.MessageBtn);
        messageBtn.setOnClickListener(view -> {
            Intent messagePage = new Intent(MainActivity.this, MessageGroup.class);
            startActivity(messagePage);
        });

    }
}