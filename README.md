# CompressingImage
we can using this library for compressing images in android (befor upload it to server)


compressing Image in small sizes witout losing image quality 

easy way to using it


Add it in your root build.gradle at the end of repositories:

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
 Step 2. Add the dependency
 
 dependencies {
	        implementation 'com.github.BasemNasr:CompressingImage:0.1.0'
	}



//set original image path
val originalImagePath = "/originalImagePath"
val compressedImagePath = BeforeUploadImages()
           .resizeAndCompressImageBeforeSend(this, originalImagePath, File(originalImagePath).name)
