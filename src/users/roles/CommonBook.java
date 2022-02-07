package users.roles;

public class CommonBook {
    private String name;
    private BookStatus status;

    public CommonBook(String name, BookStatus status) {
        this.name = name;
        this.status = status;
    }

    public CommonBook(String name) {
        this.name = name;
        this.status = BookStatus.AVAILABLE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public BookStatus getStatus() {
        return status;
    }
}
