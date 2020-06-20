public class MainActivity extends AppCompatActivity {
    @Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 VideoView video=(VideoView)findViewById(R.id.videoview1);



video.setVideoURI(Uri.parse("/storage/sdcard1/
                                                videos/isha video.mp4"));

video.setMediaController(new MediaController(this));

video.requestFocus();
video.start();
    } }
