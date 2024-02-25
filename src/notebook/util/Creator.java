package notebook.util;

import notebook.model.User;

public class Creator {
    private final Getter getter;

    public Creator(Getter getter) {
        this.getter = getter;
    }

    public User createUser() {
        String firstName = getter.getData("Имя: ");
        String lastName = getter.getData("Фамилия: ");
        String phone = getter.getData("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }
}
