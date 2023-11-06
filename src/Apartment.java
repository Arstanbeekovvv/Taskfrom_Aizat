public class Apartment {
    private String title;
    private float price;
    private String address;

    public String getTitle() { return title;}
    public void setTitle(String title) { this.title = title;}
    public float getPrice() { return price;}
    public void setPrice(float price) { this.price = price;}
    public String getAddress() { return address;}
    public void setAddress(String address) { this.address = address;}

    public float[] payPerMonth(Student[] students, Apartment[] apartment){
        float shevchonka125 = apartment[0].getPrice() / 3;
        float tynalieva16 = apartment[1].getPrice() / 3;
        float[] arrays = {shevchonka125,tynalieva16};
        return arrays;
    }
}
