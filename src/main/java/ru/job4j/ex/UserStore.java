package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User value : users) {
            if (login.equals(value.getUsername())) {
                result = value;
                break;
            }
        }
        if(result == null) {
            throw new UserNotFoundException("User not found.");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid.");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr", false)
        };
        try {
            User user = findUser(users, "Petr");
            if (user.getUsername() != null) {
                validate(user);

            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException unfe) {
            unfe.printStackTrace();
        }
    }
}
