import java.util.Objects;

public class CustomersRequests {
    private String firstName;
    private String lastName;
    private long id;
    private String texts;

    public CustomersRequests(String firstName, String lastName, long id, String texts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.texts = texts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomersRequests that = (CustomersRequests) o;
        return id == that.id && Objects.equals(texts, that.texts);
    }

    @Override
    public String toString() {
        return "CustomersRequests{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", texts='" + texts + '\'' +
                '}';
    }
}
