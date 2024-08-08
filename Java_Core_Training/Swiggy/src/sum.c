#include <jni.h>

JNIEXPORT jint JNICALL Java_Menu_sumOfArray(JNIEnv *enviroinment, jobject obj, jintArray arr){
    jint *arr_elements = (*enviroinment)->GetIntArrayElements(enviroinment, arr, NULL);
    jsize len = (*enviroinment)->GetArrayLength(enviroinment, arr);
    jint sum = 0;
    int i;

    for (i = 0; i < len; i++) {
        sum += arr_elements[i];
    }

    (*enviroinment)->ReleaseIntArrayElements(enviroinment, arr, arr_elements, 0);
    return sum;
}

