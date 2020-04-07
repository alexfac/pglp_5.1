package uvsq21603110;

import java.io.*;

public class DAOGroupe implements DAO<Groupe> {
    @Override
    public Groupe create(Groupe obj) {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new BufferedOutputStream(
                                     new FileOutputStream("/home/alex/Bureau/M1/pglp/pglp_5.1/groupe")))) {
            out.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Groupe find(String id) {
        Groupe groupe = null;
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("/home/alex/Bureau/M1/pglp/pglp_5.1/groupe"))) {
            groupe = (Groupe) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return groupe;
    }

    @Override
    public Groupe update(Groupe obj) {
        return null;
    }

    @Override
    public void delete(Groupe obj) {

    }
}
