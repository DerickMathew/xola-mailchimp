package models;

import java.util.Objects;

/**
 * @author rishabh
 */
public class Confirmation extends BaseModel {

    private String pluginId;
    private Seller seller;

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Confirmation that = (Confirmation) o;
        return Objects.equals(pluginId, that.pluginId) &&
                Objects.equals(seller, that.seller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginId, seller);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Confirmation{");
        sb.append("pluginId='").append(pluginId).append('\'');
        sb.append(", seller=").append(seller);
        sb.append('}');
        return sb.toString();
    }
}

class Seller {

    private String id;
    private String name;
    private String email;
    private String company;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id) &&
                Objects.equals(name, seller.name) &&
                Objects.equals(email, seller.email) &&
                Objects.equals(company, seller.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, company);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Seller{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }
}