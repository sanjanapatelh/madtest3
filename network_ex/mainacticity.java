public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;    TextView txt;
@Override protected void onCreate(Bundle savedInstanceState) { ……
        txt=(TextView)findViewById(R.id.textview);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this);     }
 @Override    public void onClick(View v) {
 ConnectivityManager con_manager=(ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
NetworkInfo network_info= con_manager.getActiveNetworkInfo();
if(network_info!=null  &&  network_info.isConnected()) {
txt.setText("Network is Connected \n"+
                 "Network Name: "+ network_info.getTypeName());
 }   else
            txt.setText("Network not Connected");
    }
} }
