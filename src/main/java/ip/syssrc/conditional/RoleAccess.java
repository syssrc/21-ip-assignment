package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211078 - Muh Fajar Siddiq <fsdidiq072@gmail.com>
 *
 */
public class RoleAccess {
    public static void main(String[] args) {
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
    
>>>>>>> 3373f33 (Update src/main/java/ip/syssrc/conditional/RoleAccess.java)
        if (args.length == 0) {
          System.out.println("What role you want to see ?");
          System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {

            switch (args[0]) {
                case "Super Admin":
                    isValidRole = true;
                    break;
                case "Admin":
                    isValidRole = true;
                    break;
                case "User":
                    isValidRole = true;
                    break;
                default:
                    isValidRole = false;
                    break;
            }
            if (isValidRole == true) {
                switch (args[0] ) {
                case "Super Admin":
                    menuIndex = menuIndex + 1;
                    System.out.printf("%d. Super Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n", menuIndex, subMenuIndex);
                    System.out.println();
                case "Admin":
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
                default:
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
<<<<<<< HEAD
                    System.out.printf("%d. User\n", ++menuIndex);
                    System.out.printf("%2d.%d. View\n", menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. Edit\n", menuIndex, ++subMenuIndex);
=======
    
=======
>>>>>>> 8c618e1 (Update RoleAccess.java)
        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {
            switch (args[0]) {
                case "Super Admin":
                case "Admin":
                case "User":
                isValidRole = true;
                break;
            }
            if (isValidRole) {
                switch (args[0] ) {
                    case "Super Admin":
                    System.out.printf("%2d.%d. CRUD Super Admin\n", ++menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. CRUD User\n", menuIndex, ++subMenuIndex);
                    System.out.println();
                    case "Admin":
                    subMenuIndex = 0;
                    System.out.printf("%d. Admin\n", ++menuIndex);
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, ++subMenuIndex);
                    default:
                    subMenuIndex = 0;
<<<<<<< HEAD
=======
>>>>>>> 3373f33 (Update src/main/java/ip/syssrc/conditional/RoleAccess.java)
                    System.out.printf("%d. User\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
<<<<<<< HEAD
>>>>>>> 6b7a196 (Update src/main/java/ip/syssrc/conditional/RoleAccess.java)
=======
                    System.out.printf("%d. User\n", ++menuIndex);
                    System.out.printf("%2d.%d. View\n", menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. Edit\n", menuIndex, ++subMenuIndex);
>>>>>>> 7a0e3d1 (Update src/main/java/ip/syssrc/conditional/RoleAccess.java)
=======
>>>>>>> 3373f33 (Update src/main/java/ip/syssrc/conditional/RoleAccess.java)
                    break;
                }
            } else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } else {
            System.out.println("Too many argument");
        }
    }
}
