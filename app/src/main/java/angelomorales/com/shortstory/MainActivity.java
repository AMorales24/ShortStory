package angelomorales.com.shortstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public static final String VIDEO_URL_EXTRA = "example.com.myvideoplayer.VIDEO_URL_EXTRA";

    private Button SendButton;
    private Button StartButton;


    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        StartButton = (Button) findViewById(R.id.open_button);
        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VlistActivity.class );
                startActivity(intent);


            }
        });


        SendButton = (Button) findViewById(R.id.send_button);
        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FeedbackActivity.class) ;
                startActivity(intent);


            }
        });

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        List<VideoObject> videos = new ArrayList<VideoObject>();
        VideoObject story1 = new VideoObject("Story #1", "https://ia800800.us.archive.org/9/items/TheBeatlesHelpHD/The%20Beatles%20-%20Help%21%20%5BHD%5D.mp4");
        VideoObject story2 = new VideoObject("Story #2", "https://ia601006.us.archive.org/33/items/IWantToHoldYourHandHdByTheBeatles/i%20want%20to%20hold%20your%20hand%20hd%20by%20the%20beatles.mp4");
        VideoObject story3 = new VideoObject("Story #3", "https://ia902804.us.archive.org/4/items/TheBeatles-GetBack/TheBeatles-GetBack.mp4");
        VideoObject story4 = new VideoObject("Story #4", "https://ia802800.us.archive.org/9/items/TheBeatles-Rain_MusicVideo/DVD_210344_0_Segment_0_x264.mp4");

        videos.add(story1);
        videos.add(story2);
        videos.add(story3);
        videos.add(story4);

        VideoAdapter adapter = new VideoAdapter(videos);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecyclerView.setAdapter(adapter);








    }
}
