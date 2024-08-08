#include <D:\JDK\include\jni.h>
#include <D:\JDK\include\win32\jni_md.h>

JNIEXPORT jint JNICALL Java_NativeSumExample_sumArray(JNIEnv *env, jobject obj, jintArray arr) {
    jint *elements = (*env)->GetIntArrayElements(env, arr, NULL);
    jsize len = (*env)->GetArrayLength(env, arr);
    jint sum = 0;
    int i;

    for (i = 0; i < len; i++) {
        sum += elements[i];
    }

    (*env)->ReleaseIntArrayElements(env, arr, elements, 0);
    return sum;
}
