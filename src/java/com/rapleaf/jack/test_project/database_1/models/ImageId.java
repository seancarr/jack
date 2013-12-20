
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.models;

import com.rapleaf.jack.ModelIdWrapper;

public class ImageId implements ModelIdWrapper<ImageId>{
  private final Long id;

  public ImageId(Long id){
    this.id = id;
  }

  public Long getId(){
    return this.id;
  }

  public int compareTo(ImageId other){
    return this.getId().compareTo(other.getId());
  }

  public boolean equals(Object other){
    if(other instanceof ImageId){
      return this.getId().equals(((ImageId) other).getId());
    }
    return false;
  }

  public int hashCode(){
    return this.getId().hashCode();
  }
}
