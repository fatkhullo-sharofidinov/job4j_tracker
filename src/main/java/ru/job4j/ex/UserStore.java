package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = new User(null, false);
        for (int i = 0; i < users.length; i++ ) {
            if (login.equals(users[i].getUsername())) {
                user = users[i];
            }
        }
        if(user.getUsername() == null) {
            throw new UserNotFoundException("User not found.");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        if (user.getUsername().length() > 3 && user.isValid()) {
            result = true;
        } else if (!user.isValid()){
            throw new UserInvalidException("User is not valid.");
        }
        return result;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr", false)
        };

        User user = findUser(users, "Petr");
        try {
            if (user.getUsername() != null) {
                validate(user);
            }
        } catch (Exception in) {
            in.printStackTrace();
        }
    }
}
