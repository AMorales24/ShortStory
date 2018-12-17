package angelomorales.com.shortstory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VlistActivity extends AppCompatActivity {

    public static final String VIDEO_URL_EXTRA = "example.com.myvideoplayer.VIDEO_URL_EXTRA";

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_vlist);



        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
       // mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext()));

        List<VideoObject> videos = new ArrayList<VideoObject>();
        VideoObject Story1 = new VideoObject("Story #1", "https://ia801604.us.archive.org/4/items/youtube-6VTj0zpjtsY/The_Raven_by_Edgar_Allan_Poe-6VTj0zpjtsY.mp4");
        VideoObject Story2 = new VideoObject("Story #2", "https://ia800407.us.archive.org/19/items/NewWorldOrderInPhilipK.DicksShortStoryDefenders/New%20World%20Order%20in%20Philip%20K.%20Dicks%E2%80%99%20short%20story%20Defenders.mp4");
        VideoObject Story3 = new VideoObject("Story #3", "https://ia800107.us.archive.org/30/items/youtube-lTjFhhLmiIY/Sci-Fi_Radio_-_Diary_Of_A_Rose_By_Ursula_K._Leguin-lTjFhhLmiIY.mp4");
        VideoObject Story4 = new VideoObject("Story #4", "https://ia802809.us.archive.org/22/items/ChristopherLeeReadsEdgarAllanPoe3ThePitAndThePendulum/Christopher%20Lee%20reads%20Edgar%20Allan%20Poe%20-%203%20The%20Pit%20and%20the%20Pendulum.mp4");
        VideoObject Story5 = new VideoObject("Story #5", "https://ia902807.us.archive.org/26/items/BasilRathboneReadsPoeTheFactsInTheCaseOfM.Valdemar/Basil%20Rathbone%20reads%20Poe%20The%20Facts%20in%20the%20Case%20of%20M.%20Valdemar.mp4");

        videos.add(Story1);
        videos.add(Story2);
        videos.add(Story3);
        videos.add(Story4);
        videos.add(Story5);

        VideoAdapter adapter = new VideoAdapter(videos);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(VlistActivity.this));
        mRecyclerView.setAdapter(adapter);






    }
}