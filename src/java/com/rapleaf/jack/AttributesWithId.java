package com.rapleaf.jack;

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.nio.ByteBuffer;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: sean
 * Date: 12/31/12
 * Time: 10:51 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AttributesWithId {

  private final long id;
  transient protected int cachedHashCode = 0;

  public AttributesWithId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  @Override
  public int hashCode() {
    if (cachedHashCode == 0) {
      HashCodeBuilder hcb = new HashCodeBuilder();
      hcb.append(this.getClass().getName());
      hcb.append(getId());
      for (Enum field : getFieldSet()) {
        hcb.append(field.name());
        Object value = getField(field.name());
        if (value != null) {
          hcb.append(value);
        }
      }
      cachedHashCode = hcb.toHashCode();
    }
    return cachedHashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ModelWithId other = (ModelWithId) obj;
    return equals(other);
  }

  public boolean equals(ModelWithId obj) {
    if(obj == null) return false;
    if(!this.getClass().getName().equals(obj.getClass().getName())) {
      return false;
    }
    if(getId() != obj.getId()) {
      return false;
    }

    for (Enum field : getFieldSet()) {
      Object value1 = getField(field.name());
      Object value2 = obj.getField(field.name());
      if (value1 != null) {
        if (value1 instanceof byte[]) {
          value1 = ByteBuffer.wrap((byte[]) value1);
          value2 = ByteBuffer.wrap((byte[]) value2);
        }
        if(!value1.equals(value2)) {
          return false;
        }
      } else {
        if(value2 != null) {
          return false;
        }
      }
    }
    return true;
  }

  public abstract Object getField(String fieldName);

  public abstract boolean hasField(String fieldName);

  public abstract void setField(String fieldName, Object value);

  public abstract Set<Enum> getFieldSet();


}
