public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
Button btn1, btn2, btn3, btn4;
    TextView txt1, txt2, txt3, txt4;
    BluetoothAdapter b_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(TextView)findViewById(R.id.textview1);
        txt2=(TextView)findViewById(R.id.textview2);
        txt3=(TextView)findViewById(R.id.textview3);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
 b_adapter =BluetoothAdapter.getDefaultAdapter();
    }
    public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
………..
@Override
    protected void onCreate(Bundle savedInstanceState) {
…………..
b_adapter =BluetoothAdapter.getDefaultAdapter();
    }

public void onClick(View v) {

  //status
    if (v.getId() == R.id.button1) {
        if (b_adapter.isEnabled())
            txt1.setText("Bluetooth is On");
        else
            txt1.setText("Bluetooth is Off");
    }

  //switching

    if (v.getId() == R.id.button2) {
 if (!b_adapter.isEnabled()) {
Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
startActivityForResult(intent, 420);
            }
else { // Bluetooth is enabled }
        }

        protected void onActivityResult(int requestCode,int resultCode, Intent data) {
if (requestCode == 420)
     if (resultCode == RESULT_OK) {
                  txt2.setText("Bluetooth has been Switched On");
            }     }
//address

            if (v.getId() == R.id.button3) {
           if (b_adapter.isEnabled()) {
             String address = b_adapter.getAddress();
             String name = b_adapter.getName();
             txt3.setText("Address= " + address +
                                "\nName= " + name);
           }
       }}
