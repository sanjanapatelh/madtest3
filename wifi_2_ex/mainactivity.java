public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1, btn2;     TextView txt1, txt2;     WifiManager wifi;
    @Override
protected void onCreate(Bundle savedInstanceState)  {
txt2=(TextView)findViewById(R.id.textview2);
btn2=(Button)findViewById(R.id.button2);
btn2.setOnClickListener(this);
wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
}
@Override     public void onClick(View v) {
if (v.getId() == R.id.button2)     {
WifiInfo info = wifi.getConnectionInfo();
if (info.getBSSID() != null) {
      int strength = WifiManager.calculateSignalLevel(info.getRssi(), 5);
      int speed = info.getLinkSpeed();
            String units = WifiInfo.LINK_SPEED_UNITS;
            String ssid = info.getSSID();
            txt2.setText("Strength: "+strength+"\nSpeed: "+speed+
                        "\nUnits: "+units+"\nSSID: "+ssid);
        }    }     } }
