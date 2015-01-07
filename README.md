## 说明

**描述：**模仿打字机的效果，字一个一个地蹦出来，伴随打字机的声音。

**效果：**

![TypeTextView](http://ww1.sinaimg.cn/large/6d17e381gw1eo0uvwrfo1g20hj0pwgpz.gif)

## 使用说明：

1. 在xml文件中定义：

		<com.uperone.typetext.view.TypeTextView
	        android:id="@+id/typeTxtId"
	        android:layout_width="fill_parent"
	        android:layout_height="wrap_content"
	        android:layout_centerVertical="true" />

2. 在代码中实例化：
	
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

3. 调用start方法：
		
		mTypeTextView.start( TEST_DATA );

## 关于作者：

**姓名：**张明云

**博客：**[zmywly8866](http://zmywly8866.github.io/)

**知乎：**[zmywly8866](http://www.zhihu.com/people/zhang-ming-yun-97)

**简书：**[zmywly8866](http://www.jianshu.com/users/e6885381f7d4/latest_articles)