package hello;
// tag::sample[]


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private String name;
    public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	private String email;
    private String created_date;
    protected Customer() {}

    public Customer(String id,String name,String email, String created_date) {
        this.id = id;
        this.name = name;
        this.email=email;
        this.created_date=created_date;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', email='%s',created_date='%s']",
                id, name, email,created_date);
    }

// end::sample[]

	}

