# GestureLockView

Frames stuck because of the Genymotion，，，，wtf=。=
![](http://7xn4z4.com1.z0.glb.clouddn.com/GestureLockViewDemo.gif)

**Usage:**<br/>
Add the JitPack repository to your build file:

	repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
Add the dependency in the form:

	dependencies {
	   compile 'com.github.Syehunter:GestureLockView:'
	}


U can use the GestureLockView like this:

	<com.sye.library.GestureLockView 
		xmlns:gesture="http://schemas.android.com/apk/res-auto"
        android:id="@+id/gestureLockView"
        gesture:bitmapError="@mipmap/error"
        gesture:bitmapNormal="@mipmap/normal"
        gesture:bitmapSelect="@mipmap/select"
        gesture:lineColor="#FF773355"
        gesture:strokeWidth="3dp"
        android:layout_width="match_parent"
        android:layout_height="300dp"/>
