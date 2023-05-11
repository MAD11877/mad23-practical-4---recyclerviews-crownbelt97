package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.widget.Button;

import android.os.Bundle;


public class MessageGroup extends AppCompatActivity {

    private Button group1;

    private Button group2;

    private FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        group1 = findViewById(R.id.button2);

        group1.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .addToBackStack("Group 1")
                    .replace(R.id.fragmentContainerView, new BlankFragment(), null)
                    .commit();
        });

        group2 = findViewById(R.id.button3);

        group2.setOnClickListener(v -> {
            fragmentManager.beginTransaction()
                    .addToBackStack("Group 2")
                    .replace(R.id.fragmentContainerView, new BlankFragment2(), null)
                    .commit();
        });

    }
}