#include <jni.h>
#include <windows.h>

JNIEXPORT jboolean Java_D9T2Q1_findFile(JNIEnv *env, jobject *thisobj, jstring path, jstring filename){
    jboolean filefound = JNI_FALSE;
	
	const char *pathStr = (*env)->GetStringUTFChars(env, path, 0);
    const char *filenameStr = (*env)->GetStringUTFChars(env, filename, 0);

    char fullPath[MAX_PATH];
    snprintf(fullPath, sizeof(fullPath), "%s\\%s", pathStr, filenameStr);

    filefound = (GetFileAttributes(fullPath) != INVALID_FILE_ATTRIBUTES);

    (*env)->ReleaseStringUTFChars(env, path, pathStr);
    (*env)->ReleaseStringUTFChars(env, filename, filenameStr);
	
    return filefound ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT jboolean Java_D9T2Q1_gotoPath(JNIEnv *env, jobject *thisobj, jstring path){
    const char *pathStr = (*env)->GetStringUTFChars(env, path, 0);

    jboolean success = SetCurrentDirectory(pathStr);

    (*env)->ReleaseStringUTFChars(env, path, pathStr);

    return success ? JNI_TRUE : JNI_FALSE;
}

JNIEXPORT jboolean Java_D9T2Q1_lsCommand(JNIEnv *env, jobject *thisobj){
	WIN32_FIND_DATA findFileData;
    HANDLE hFind = FindFirstFile("*", &findFileData);

    if (hFind == INVALID_HANDLE_VALUE) {
        return JNI_FALSE;
    }

    do {
        printf("%s\n", findFileData.cFileName);
    } while (FindNextFile(hFind, &findFileData) != 0);

    FindClose(hFind);

    return JNI_TRUE;
}