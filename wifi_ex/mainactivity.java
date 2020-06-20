public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1;     TextView txt1;
    WifiManager wifi;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView)findViewById(R.id.textview1);
        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);

wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
    }

@Override public void onClick(View v) {
if (wifi.isWifiEnabled()) {
                txt1.setText("WiFi is Enabled");
            } else
                txt1.setText("WiFi is Disabled");
    }   }
