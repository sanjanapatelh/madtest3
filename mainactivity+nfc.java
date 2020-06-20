public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1;     TextView txt1;

    @Override     protected void onCreate(Bundle savedInstanceState) {
        btn1=(Button)findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        txt1=(TextView)findViewById(R.id.textview1);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1){
            NfcAdapter nfcAdapter=null;
            nfcAdapter.getDefaultAdapter(this);
            if(nfcAdapter!=null && nfcAdapter.isEnabled())
                txt1.setText("NFC Available");
            else
                txt1.setText("NFC not available");
            }
    } }
