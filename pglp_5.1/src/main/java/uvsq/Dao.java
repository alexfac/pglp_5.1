package uvsq;

import java.sql.Connection;

public interface Dao<T> {

  Connection connect = null;

  public abstract T create(T obj);

  public abstract T find(String id);

  public abstract T update(T obj);

  public abstract void delete(T obj);
}
