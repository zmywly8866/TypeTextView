package com.uperone.typetextview;

import android.view.View;

import com.uperone.typetext.view.TypeTextView;
import com.uperone.typetext.view.TypeTextView.OnTypeViewListener;

public class TypeTextViewActivity extends BaseActivity {
	private TypeTextView mTypeTextView = null;
	private static final String TEST_DATA = "题主我觉得你大概是被我们的同事三天两头就去问问题要材料搞烦了。。不过我们每年都来，一来就好几个月，在会议室里面天天熬到半夜这样的事情我们也是没有办法的啊！因为作为一个企业，无论是私企还是国企，公司的所有者和经营者一般都是分开的。所谓所有者，就是股东，而经营者就是企业各级管理人员。";
	
	@Override
	public void setContentView() {
		setContentView(R.layout.activity_type_text_view_layout);
	}
	
	@Override
	public void findViews() {
		mTypeTextView = ( TypeTextView )findViewById(R.id.typeTxtId);
		mTypeTextView.setOnTypeViewListener( new OnTypeViewListener( ) {
			@Override
			public void onTypeStart() {
				print( "onTypeStart" );
			}
			
			@Override
			public void onTypeOver() {
				print( "onTypeOver" );
			}
		});
	}
	
	@Override
	public void getData() {
		
	}
	
	@Override
	public void showConent() {
		mTypeTextView.start( TEST_DATA );
	}
	
	public void onClick( View v ){
		if( v.getId( ) == R.id.showBtnId ){
			showConent( );
		}
	}
	
	private void print( String printStr ){
		System.out.println( "TAG == TypeTextViewActivity, info == " + printStr );
	}
}
