/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.codecs.generated;

public class OpenH264DecoderImpl {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OpenH264DecoderImpl(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OpenH264DecoderImpl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ihmcVideoCodecsJNI.delete_OpenH264DecoderImpl(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OpenH264DecoderImpl() {
    this(ihmcVideoCodecsJNI.new_OpenH264DecoderImpl(), true);
  }

  public YUVPicture decodeFrame(java.nio.ByteBuffer frame, int srcLength) {
  assert frame.isDirect() : "Buffer must be allocated direct.";
    {
      long cPtr = ihmcVideoCodecsJNI.OpenH264DecoderImpl_decodeFrame(swigCPtr, this, frame, srcLength);
      return (cPtr == 0) ? null : new YUVPicture(cPtr, true);
    }
  }

  public void skipFrame(java.nio.ByteBuffer frame, int srcLength) {
  assert frame.isDirect() : "Buffer must be allocated direct.";
    {
      ihmcVideoCodecsJNI.OpenH264DecoderImpl_skipFrame(swigCPtr, this, frame, srcLength);
    }
  }

}
