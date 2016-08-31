/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class CodecInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CodecInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CodecInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_CodecInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCodecId(String value) {
    pjsua2JNI.CodecInfo_codecId_set(swigCPtr, this, value);
  }

  public String getCodecId() {
    return pjsua2JNI.CodecInfo_codecId_get(swigCPtr, this);
  }

  public void setPriority(short value) {
    pjsua2JNI.CodecInfo_priority_set(swigCPtr, this, value);
  }

  public short getPriority() {
    return pjsua2JNI.CodecInfo_priority_get(swigCPtr, this);
  }

  public void setDesc(String value) {
    pjsua2JNI.CodecInfo_desc_set(swigCPtr, this, value);
  }

  public String getDesc() {
    return pjsua2JNI.CodecInfo_desc_get(swigCPtr, this);
  }

  public CodecInfo() {
    this(pjsua2JNI.new_CodecInfo(), true);
  }

}
