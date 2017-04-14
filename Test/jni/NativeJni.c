#include <jni.h>
#include <math.h>
 jint  Java_com_example_jni_NativeJni_add(JNIEnv *env, jobject obj
                                                    , jint i, jint j){
    return i + j; 
  }

