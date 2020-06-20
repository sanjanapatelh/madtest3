public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn; EditText address_entered; TextView display_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
address_entered=(EditText)findViewById(R.id.edittext);
btn=(Button)findViewById(R.id.button);
display_textview=(TextView)findViewById(R.id.textview);

btn.setOnClickListener((View.OnClickListener)this);
    }


@Override
   public void onClick(View v) {
       if(v.getId()==R.id.button){
   String addr=address_entered.getText().toString();
   Geocoder fwdGeocoder= new Geocoder(this, Locale.getDefault());
           List<Address> locations = null;
           try {
           locations = fwdGeocoder.getFromLocationName(addr, 1);
           } catch (IOException e) {
            e.printStackTrace();
            display_textview.setText("No Latitude and Longitude Found");
           }
           double lat =  locations .get(0).getLatitude();
           double lng =  locations .get(0).getLongitude();
           display_textview.setText("Latitude: "+lat
                   +"\nLongitude: "+lng);
       }     }  }
