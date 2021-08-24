# DSImagePickerCropper
DSImagePickerAndCropper provide support for android 16 to android sdk 30. You can use this library for pick image from gallery or camera and it also provides you crop functionality.
How to use

> Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
> Step 2. Add the dependency
```gradle
dependencies {
	        implementation 'com.github.ashutosh53prajapat:DSImagePickerAndCropper:Tag'
	}
```

> Step 3. Add activity in manifest file
```manifest
  
<application>

<activity android:name="com.dts.dsimagepickerlibrary.CropImageActivity"
            android:theme="@style/Base.Theme.AppCompat"/>


</application>
	    
```

> Setp 4. Add onActivityResult in your activity
> 
```Activity class

 override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK) {
            if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
                val intentData = CropImage.getActivityResult(data)
                val selectedImagePath = intentData.uri.path
 Log.e("FinalImage",selectedImagePath.toString());


            }
        }
    }
    
```    
