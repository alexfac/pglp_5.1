package uvsq21603110;

import java.io.*;

public class DAOpersonnel implements DAO<Personnel> {
    @Override
    public Personnel create(Personnel obj) {
        try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/home/alex/Bureau/M1/pglp/pglp_5.1/perso")))){
            out.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Personnel find(String id) {
        Personnel personnel = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/alex/Bureau/M1/pglp/pglp_5.1/perso"))){
            personnel = (Personnel) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personnel;
    }

    @Override
    public Personnel update(Personnel obj) {
        return null;
    }

    @Override
    public void delete(Personnel obj) {

    }
}
