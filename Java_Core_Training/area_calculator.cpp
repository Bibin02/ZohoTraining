#include <D:\JDK\include\jni.h>
#include <D:\JDK\include\win32\jni_md.h>

extern "C"{
JNIEXPORT jfloat JNICALL Java_D6T3Q1_calculateAreaOfCircle(JNIEnv *env, jobject obj, jint rad) {
    
    // Calculate the Area
    jfloat PI = 3.14f;
    jfloat area = PI * rad * rad;
    
    return area;
}
}
