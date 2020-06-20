public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1,btn2; TextView textview1, textview2;  double lat=0, lng=0;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
textview1 = (TextView) findViewById(R.id.textview1);
textview2 = (TextView) findViewById(R.id.textview2);
btn1 = (Button) findViewById(R.id.button1);
btn1.setOnClickListener((View.OnClickListener) this);
btn2 = (Button) findViewById(R.id.button2);
btn2.setOnClickListener((View.OnClickListener) this);    }
    @Override     public void onClick(View v) {
if (v.getId() == R.id.button1) {
        LocationManager locationManager;
        String svcName = Context.LOCATION_SERVICE;
 locationManager = (LocationManager)getSystemService(svcName);
 String provider = LocationManager.GPS_PROVIDER;
        Location loc = locationManager.getLastKnownLocation(provider);
        if (loc != null) {
 double lat = loc.getLatitude();
 double lng = loc.getLongitude();
 String txt="Latitude:" + Double.toString(lat) +
                  "\nLongitude:" + Double.toString(lng);
textview.setText(txt);
}
else     textview.setText("No Location Found");

if (v.getId() == R.id.button2) {
     Geocoder geocoder;
    List<Address> addresses=null;
    geocoder = new Geocoder(this, Locale.getDefault());
     try {
        addresses = geocoder.getFromLocation(lat, lng, 1);
   } catch (IOException e) {
         e.printStackTrace();
         textview2.setText("No Address Found");
    }
 String address = addresses.get(0).getAddressLine(0);
 String city = addresses.get(0).getLocality();
    String state = addresses.get(0).getAdminArea();
    String country = addresses.get(0).getCountryName();
    String postalCode = addresses.get(0).getPostalCode();
    textview2.setText("Address: "+address +"\nCity: "+city
                      +"\nState: "+state  +"\nCountry: "+country
                      +"\nPincode: "+postalCode);
}



    } } }
