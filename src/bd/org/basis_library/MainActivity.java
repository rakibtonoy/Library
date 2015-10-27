/**
 * 
 */
package bd.org.basis_library;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author Rakib
 *
 */
public class MainActivity extends Activity implements OnClickListener {
	private EditText etTitle,etAuthor,etCategory,etISBN,etPrice;
	private Button btnSave,btnView;
	private DBAdapter dbAdapater;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dbAdapater=new DBAdapter(this);
		etTitle =(EditText)findViewById(R.id.etTitle);
		etAuthor =(EditText)findViewById(R.id.etAuthor);
		etCategory =(EditText)findViewById(R.id.etCategory);
		etISBN =(EditText)findViewById(R.id.etISBN);
		etPrice =(EditText)findViewById(R.id.etPrice);
		btnSave =(Button)findViewById(R.id.btnSave);
		btnView=(Button)findViewById(R.id.btnView);
		
		btnSave.setOnClickListener(this);
		btnView.setOnClickListener(this);
	}
		
   @Override
   public void onClick(View v) {
	   switch (v.getId()) {
	   case R.id.btnSave:
		   String title=etTitle.getText().toString();
		   String author=etAuthor.getText().toString();
		   String category=etCategory.getText().toString();
		   String ISBN=etISBN.getText().toString();
		   double price=Double.parseDouble(etPrice.getText().toString());
		   
		   dbAdapater.open();
		   long inserted=dbAdapater.insertBook(new Book(title, author, category, ISBN, price));
		   dbAdapater.close();
		   
		   if(inserted>0)
		   {
			   Toast.makeText(getApplicationContext(), "Insert Successful", Toast.LENGTH_LONG).show();
		   }
		
		 break;
	   case R.id.btnView:
		   dbAdapater.open();
		   ArrayList<Book> books = dbAdapater.getAllBooks();
		   dbAdapater.close();
		   for (Book book : books) {
			   Toast.makeText(getApplicationContext(), book.toString(), Toast.LENGTH_LONG).show();
		   }
		   
		 break;
		 
	   default:	  
		 break;
	}
   }


}
