#include <jni.h>

JNIEXPORT jboolean JNICALL Java_Payment_checkBalance(JNIEnv *env, jobject obj, jint val1, jint val2){
    
	jboolean available = val1 >= val2;
	
    return available;
}