
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.models;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import com.rapleaf.jack.test_project.database_1.IDatabase1;

import com.rapleaf.jack.ModelWithId;
import com.rapleaf.jack.AttributesWithId;
import com.rapleaf.jack.BelongsToAssociation;
import com.rapleaf.jack.HasManyAssociation;
import com.rapleaf.jack.HasOneAssociation;

import com.rapleaf.jack.test_project.IDatabases;

public class Comment extends ModelWithId<Comment, IDatabases> {
  
  public static final long serialVersionUID = 6213989608937906012L;
  
  private final Attributes attributes;
  
  // Associations
  private BelongsToAssociation<User> __assoc_user;
  private BelongsToAssociation<Post> __assoc_post;

  public enum _Fields {
    content,
    commenter_id,
    commented_on_id,
    created_at,
  }

  public Comment(long id, final String content, final int commenter_id, final long commented_on_id, final long created_at, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, content, commenter_id, commented_on_id, created_at);
    this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), (long) getCommenterId());
    this.__assoc_post = new BelongsToAssociation<Post>(databases.getDatabase1().posts(), getCommentedOnId());
  }

  public Comment(long id, final String content, final int commenter_id, final long commented_on_id, final long created_at) {
    super(null);
    attributes = new Attributes(id, content, commenter_id, commented_on_id, created_at);
  }
  public Comment(long id, final int commenter_id, final long commented_on_id, final long created_at, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, commenter_id, commented_on_id, created_at);
    this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), (long) getCommenterId());
    this.__assoc_post = new BelongsToAssociation<Post>(databases.getDatabase1().posts(), getCommentedOnId());
  }

  public Comment(long id, final int commenter_id, final long commented_on_id, final long created_at) {
    super(null);
    attributes = new Attributes(id, commenter_id, commented_on_id, created_at);
  }

  public static Comment newDefaultInstance(long id) {
    return new Comment(id, 0, 0L, 0L);
  }

  public Comment(long id, Map<Enum, Object> fieldsMap) {
    super(null);
    attributes = new Attributes(id, fieldsMap);
  }

  public Comment (Comment other) {
    this(other, (IDatabases)null);
  }

  public Comment (Comment other, IDatabases databases) {
    super(databases);
    attributes = new Attributes(other.getAttributes());

    if (databases != null) {
      this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), (long) getCommenterId());
      this.__assoc_post = new BelongsToAssociation<Post>(databases.getDatabase1().posts(), getCommentedOnId());
    }
  }
  
  public Attributes getAttributes() {
    return attributes;
  }

  public String getContent(){
    return attributes.getContent();
  }

  public Comment setContent(String newval){
    attributes.setContent(newval);
    cachedHashCode = 0;
    return this;
  }

  public int getCommenterId(){
    return attributes.getCommenterId();
  }

  public Comment setCommenterId(int newval){
    attributes.setCommenterId(newval);
    if(__assoc_user != null){
      this.__assoc_user.setOwnerId(newval);
    }
    cachedHashCode = 0;
    return this;
  }

  public long getCommentedOnId(){
    return attributes.getCommentedOnId();
  }

  public Comment setCommentedOnId(long newval){
    attributes.setCommentedOnId(newval);
    if(__assoc_post != null){
      this.__assoc_post.setOwnerId(newval);
    }
    cachedHashCode = 0;
    return this;
  }

  public long getCreatedAt(){
    return attributes.getCreatedAt();
  }

  public Comment setCreatedAt(long newval){
    attributes.setCreatedAt(newval);
    cachedHashCode = 0;
    return this;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case content:
        setContent((String) value);
        break;
      case commenter_id:
        setCommenterId((Integer) value);
        break;
      case commented_on_id:
        setCommentedOnId((Long) value);
        break;
      case created_at:
        setCreatedAt((Long) value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }
  }
  
  public void setField(String fieldName, Object value) {
    if (fieldName.equals("content")) {
      setContent((String)  value);
      return;
    }
    if (fieldName.equals("commenter_id")) {
      setCommenterId((Integer)  value);
      return;
    }
    if (fieldName.equals("commented_on_id")) {
      setCommentedOnId((Long)  value);
      return;
    }
    if (fieldName.equals("created_at")) {
      setCreatedAt((Long)  value);
      return;
    }
    throw new IllegalStateException("Invalid field: " + fieldName);
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case content:
        return String.class;
      case commenter_id:
        return int.class;
      case commented_on_id:
        return long.class;
      case created_at:
        return long.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("content")) {
      return String.class;
    }
    if (fieldName.equals("commenter_id")) {
      return int.class;
    }
    if (fieldName.equals("commented_on_id")) {
      return long.class;
    }
    if (fieldName.equals("created_at")) {
      return long.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public User getUser() throws IOException {
    return __assoc_user.get();
  }

  public Post getPost() throws IOException {
    return __assoc_post.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("content")) {
      return getContent();
    }
    if (fieldName.equals("commenter_id")) {
      return getCommenterId();
    }
    if (fieldName.equals("commented_on_id")) {
      return getCommentedOnId();
    }
    if (fieldName.equals("created_at")) {
      return getCreatedAt();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case content:
        return getContent();
      case commenter_id:
        return getCommenterId();
      case commented_on_id:
        return getCommentedOnId();
      case created_at:
        return getCreatedAt();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }
  
  public boolean hasField(String fieldName) {
    if (fieldName.equals("id")) {
      return true;
    }
    if (fieldName.equals("content")) {
      return true;
    }
    if (fieldName.equals("commenter_id")) {
      return true;
    }
    if (fieldName.equals("commented_on_id")) {
      return true;
    }
    if (fieldName.equals("created_at")) {
      return true;
    }
    return false;
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case content:
        return null;
      case commenter_id:
        return null;
      case commented_on_id:
        return null;
      case created_at:
        return 28800000;
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  @Override
  public Set<Enum> getFieldSet() {
    Set set = EnumSet.allOf(_Fields.class);
    return set;
  }

  @Override
  public Comment getCopy() {
    return getCopy(databases);
  }

  @Override
  public Comment getCopy(IDatabases databases) {
    return new Comment(this, databases);
  }

  @Override
  public boolean save() throws IOException {
    return databases.getDatabase1().comments().save(this);
  }

  public User createCommenter(final String handle, final int num_posts) throws IOException {
 
    User newUser = databases.getDatabase1().users().create(handle, num_posts);
    setCommenterId(safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public User createCommenter(final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Boolean some_boolean) throws IOException {
 
    User newUser = databases.getDatabase1().users().create(handle, created_at_millis, num_posts, some_date, some_datetime, bio, some_binary, some_float, some_boolean);
    setCommenterId(safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public User createCommenter() throws IOException {
 
    User newUser = databases.getDatabase1().users().create("", 0);
    setCommenterId(safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public Post createCommentedOn() throws IOException {
 
    Post newPost = databases.getDatabase1().posts().create();
    setCommentedOnId(newPost.getId());
    save();
    __assoc_post.clearCache();
    return newPost;
  }

  public Post createCommentedOn(final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at) throws IOException {
 
    Post newPost = databases.getDatabase1().posts().create(title, posted_at_millis, user_id, updated_at);
    setCommentedOnId(newPost.getId());
    save();
    __assoc_post.clearCache();
    return newPost;
  }

  public String toString() {
    return "<Comment"
      + " content: " + getContent()
      + " commenter_id: " + getCommenterId()
      + " commented_on_id: " + getCommentedOnId()
      + " created_at: " + getCreatedAt()
      + ">";
  }
  
  public static class Attributes extends AttributesWithId {
    
    public static final long serialVersionUID = -2156535913590481279L;

    // Fields
    private String __content;
    private int __commenter_id;
    private long __commented_on_id;
    private long __created_at;

    public Attributes(long id) {
      super(id);
    }

    public Attributes(long id, final String content, final int commenter_id, final long commented_on_id, final long created_at) {
      super(id);
      this.__content = content;
      this.__commenter_id = commenter_id;
      this.__commented_on_id = commented_on_id;
      this.__created_at = created_at;
    }
    public Attributes(long id, final int commenter_id, final long commented_on_id, final long created_at) {
      super(id);
      this.__commenter_id = commenter_id;
      this.__commented_on_id = commented_on_id;
      this.__created_at = created_at;
    }

    public static Attributes newDefaultInstance(long id) {
      return new Attributes(id, 0, 0L, 0L);
    }

    public Attributes(long id, Map<Enum, Object> fieldsMap) {
      super(id);
      String content = (String) fieldsMap.get(Comment._Fields.content);
      int commenter_id = (Integer) fieldsMap.get(Comment._Fields.commenter_id);
      long commented_on_id = (Long) fieldsMap.get(Comment._Fields.commented_on_id);
      Long created_at_tmp = (Long) fieldsMap.get(Comment._Fields.created_at);
      long created_at = created_at_tmp == null ? 28800000 : created_at_tmp;
      this.__content = content;
      this.__commenter_id = commenter_id;
      this.__commented_on_id = commented_on_id;
      this.__created_at = created_at;
    }

    public Attributes(Attributes other) {
      super(other.getId());
      this.__content = other.getContent();
      this.__commenter_id = other.getCommenterId();
      this.__commented_on_id = other.getCommentedOnId();
      this.__created_at = other.getCreatedAt();
    }

    public String getContent(){
      return __content;
    }

    public Attributes setContent(String newval){
      this.__content = newval;
      cachedHashCode = 0;
      return this;
    }

    public int getCommenterId(){
      return __commenter_id;
    }

    public Attributes setCommenterId(int newval){
      this.__commenter_id = newval;
      cachedHashCode = 0;
      return this;
    }

    public long getCommentedOnId(){
      return __commented_on_id;
    }

    public Attributes setCommentedOnId(long newval){
      this.__commented_on_id = newval;
      cachedHashCode = 0;
      return this;
    }

    public long getCreatedAt(){
      return __created_at;
    }

    public Attributes setCreatedAt(long newval){
      this.__created_at = newval;
      cachedHashCode = 0;
      return this;
    }

    public void setField(_Fields field, Object value) {
      switch (field) {
        case content:
          setContent((String) value);
          break;
        case commenter_id:
          setCommenterId((Integer) value);
          break;
        case commented_on_id:
          setCommentedOnId((Long) value);
          break;
        case created_at:
          setCreatedAt((Long) value);
          break;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }
    }

    public void setField(String fieldName, Object value) {
      if (fieldName.equals("content")) {
        setContent((String)  value);
        return;
      }
      if (fieldName.equals("commenter_id")) {
        setCommenterId((Integer)  value);
        return;
      }
      if (fieldName.equals("commented_on_id")) {
        setCommentedOnId((Long)  value);
        return;
      }
      if (fieldName.equals("created_at")) {
        setCreatedAt((Long)  value);
        return;
      }
      throw new IllegalStateException("Invalid field: " + fieldName);
    }

    public static Class getFieldType(_Fields field) {
      switch (field) {
        case content:
          return String.class;
        case commenter_id:
          return int.class;
        case commented_on_id:
          return long.class;
        case created_at:
          return long.class;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }    
    }

    public static Class getFieldType(String fieldName) {    
      if (fieldName.equals("content")) {
        return String.class;
      }
      if (fieldName.equals("commenter_id")) {
        return int.class;
      }
      if (fieldName.equals("commented_on_id")) {
        return long.class;
      }
      if (fieldName.equals("created_at")) {
        return long.class;
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    @Override
    public Object getField(String fieldName) {
      if (fieldName.equals("id")) {
        return getId();
      }
      if (fieldName.equals("content")) {
        return getContent();
      }
      if (fieldName.equals("commenter_id")) {
        return getCommenterId();
      }
      if (fieldName.equals("commented_on_id")) {
        return getCommentedOnId();
      }
      if (fieldName.equals("created_at")) {
        return getCreatedAt();
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    public Object getField(_Fields field) {
      switch (field) {
        case content:
          return getContent();
        case commenter_id:
          return getCommenterId();
        case commented_on_id:
          return getCommentedOnId();
        case created_at:
          return getCreatedAt();
      }
      throw new IllegalStateException("Invalid field: " + field);
    }

    public boolean hasField(String fieldName) {
      if (fieldName.equals("id")) {
        return true;
      }
      if (fieldName.equals("content")) {
        return true;
      }
      if (fieldName.equals("commenter_id")) {
        return true;
      }
      if (fieldName.equals("commented_on_id")) {
        return true;
      }
      if (fieldName.equals("created_at")) {
        return true;
      }
      return false;
    }

    public static Object getDefaultValue(_Fields field) {
      switch (field) {
        case content:
          return null;
        case commenter_id:
          return null;
        case commented_on_id:
          return null;
        case created_at:
          return 28800000;
      }
      throw new IllegalStateException("Invalid field: " + field);
    }
    
    @Override
    public Set<Enum> getFieldSet() {
      Set set = EnumSet.allOf(_Fields.class);
      return set;
    }
    
    public String toString() {
      return "<Comment.Attributes"
        + " content: " + getContent()
        + " commenter_id: " + getCommenterId()
        + " commented_on_id: " + getCommentedOnId()
        + " created_at: " + getCreatedAt()
        + ">";
    }
  }
  
}
