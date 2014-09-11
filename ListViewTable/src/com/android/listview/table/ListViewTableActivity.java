package com.android.listview.table;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ListViewTableActivity extends Activity 
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.main );
		
		TableLayout bodyTable = (TableLayout)findViewById(R.id.bodyTable);

		for (int inx = 0; inx < 20; inx ++) {
			TableRow table_row = (TableRow) getLayoutInflater().inflate(R.layout.table_row, null);
			
			table_row.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO: do your logic here
					//Log.d("ListViewTableActivity", " on click ");
				}
			});
		
			for (int jnx = 0; jnx < 4; jnx++) {
				
				TextView table_row_text = (TextView) getLayoutInflater().inflate(R.layout.table_row_text, null);
				
				//weight‚ðÝ’è‚·‚éB
				TableRow.LayoutParams lp = (TableRow.LayoutParams)table_row_text.getLayoutParams();
				if (lp == null) {
					lp = new TableRow.LayoutParams(
							TableRow.LayoutParams.WRAP_CONTENT,
							TableRow.LayoutParams.WRAP_CONTENT);
				}
				lp.weight = 1;
				table_row_text.setLayoutParams(lp);
				
				
				table_row_text.setText("cell" + inx + "-" + jnx);
				if (inx == 2 && jnx == 2 ) {
					table_row_text.setText("cell-------------------------------------------------" + inx + "-" + jnx);
				}
				
				table_row.addView(table_row_text);
			}
			
			bodyTable.addView(table_row);
			
		}
		
		
	}
	

}