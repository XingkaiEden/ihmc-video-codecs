/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.codecs.generated;

public class mem_destination_mgr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected mem_destination_mgr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(mem_destination_mgr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ihmcVideoCodecsJNI.delete_mem_destination_mgr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDestinationManager(SWIGTYPE_p_jpeg_destination_mgr value) {
    ihmcVideoCodecsJNI.mem_destination_mgr_destinationManager_set(swigCPtr, this, SWIGTYPE_p_jpeg_destination_mgr.getCPtr(value));
  }

  public SWIGTYPE_p_jpeg_destination_mgr getDestinationManager() {
    return new SWIGTYPE_p_jpeg_destination_mgr(ihmcVideoCodecsJNI.mem_destination_mgr_destinationManager_get(swigCPtr, this), true);
  }

  public void setOutputBuffer(SWIGTYPE_p_unsigned_char value) {
    ihmcVideoCodecsJNI.mem_destination_mgr_outputBuffer_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getOutputBuffer() {
    long cPtr = ihmcVideoCodecsJNI.mem_destination_mgr_outputBuffer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public void setBufferSize(long value) {
    ihmcVideoCodecsJNI.mem_destination_mgr_bufferSize_set(swigCPtr, this, value);
  }

  public long getBufferSize() {
    return ihmcVideoCodecsJNI.mem_destination_mgr_bufferSize_get(swigCPtr, this);
  }

  public void setCompressedSize(long value) {
    ihmcVideoCodecsJNI.mem_destination_mgr_compressedSize_set(swigCPtr, this, value);
  }

  public long getCompressedSize() {
    return ihmcVideoCodecsJNI.mem_destination_mgr_compressedSize_get(swigCPtr, this);
  }

  public mem_destination_mgr() {
    this(ihmcVideoCodecsJNI.new_mem_destination_mgr(), true);
  }

}
