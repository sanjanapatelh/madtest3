public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayContacts(View v){
Intent read1=new Intent();
read1.setAction(android.content.Intent.ACTION_VIEW);   read1.setData(ContactsContract.Contacts.CONTENT_URI);
startActivity(read1);
    }
}
