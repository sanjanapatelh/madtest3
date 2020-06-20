public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;     TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textview=(TextView)findViewById(R.id.textview1);
        btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
 LocationManager locationManager;
 String svcName = Context.LOCATION_SERVICE;
 locationManager = (LocationManager)getSystemService(svcName);
 String provider = LocationManager.GPS_PROVIDER;
 Location loc= locationManager.getLastKnownLocation(provider);
if (loc != null) {
 double lat = loc.getLatitude();
 double lng = loc.getLongitude();
 String txt="Latitude:" + Double.toString(lat) +
                  "\nLongitude:" + Double.toString(lng);
textview.setText(txt);
}
else     textview.setText("No Location Found");        } }
