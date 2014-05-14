package org.mpilone.vaadin.upload.fineuploader.shared;

import java.io.Serializable;

/**
 * An error that can be generated by the Plupload component. The fields set will
 * very depending on the type of error but <code>message</code> and
 * <code>code</code> appear to always be available.
 *
 * @author mpilone
 */
public class FineUploaderError implements Serializable {
  /**
   * Serialization ID.
   */
  private static final long serialVersionUID = 1L;

  private String message;
  private Integer code;
  private FineUploaderFile file;


  /**
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message
   *          the message to set
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * @return the code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * @param code
   *          the code to set
   */
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * @return the file
   */
  public FineUploaderFile getFile() {
    return file;
  }

  /**
   * @param file
   *          the file to set
   */
  public void setFile(FineUploaderFile file) {
    this.file = file;
  }

}