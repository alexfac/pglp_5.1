package uvsq;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Groupe extends Equipe implements Serializable {

  private List personnelList;

  public Groupe() {

    this.personnelList = new ArrayList<Personnel>();
  }

  public void add2Groupe(Personnel p) {

    this.personnelList.add(p);
  }

  public List<Personnel> getListPerso() {
    List<Personnel> unmodifiableList = Collections.unmodifiableList(personnelList);
    return unmodifiableList;
  }
}
