package users;

import users.roles.CommonBook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CommonBook> lib = new ArrayList<CommonBook>();
        lib.add(new CommonBook("Atlas shrugged"));
        lib.add(new CommonBook("1984"));
        lib.add(new CommonBook("Crime and the punishment"));

        SteveReader steve = new SteveReader();
        MattSupplier matt = new MattSupplier();
        CatrineAdministrator catrine = new CatrineAdministrator();

        steve.takeBook("Atlas shrugged", lib);

        for (int i = 0; i < lib.size(); i++) {
            System.out.print(lib.get(i).getName() + " " + lib.get(i).getStatus() + " | ");
        }
        System.out.println();

        matt.bringBook("Intoduction to Java", lib);

        steve.returnBook("Atlas shrugged", lib);

        for (int i = 0; i < lib.size(); i++) {
            System.out.print(lib.get(i).getName() + " " + lib.get(i).getStatus() + " | ");
        }
        System.out.println();

        catrine.giveBook("Crime and the punishment", lib);

        for (int i = 0; i < lib.size(); i++) {
            System.out.print(lib.get(i).getName() + " " + lib.get(i).getStatus() + " | ");
        }
        System.out.println();
    }
}
