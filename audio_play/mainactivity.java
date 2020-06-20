public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mp;
    Button play, pause, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(MainActivity.this, R.raw.isha_song);
        play=(Button)findViewById(R.id.button1);
        play.setOnClickListener(this);
        pause=(Button)findViewById(R.id.button2);
        pause.setOnClickListener(this);
        stop=(Button)findViewById(R.id.button3);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1) {
            // Play audio
           mp.start();         }
        if(v.getId()==R.id.button2) {
         // Pause audio
         mp.pause();         }
        if(v.getId()==R.id.button3) {
         // Stop audio
      mp.stop();         }
    }

}
}
