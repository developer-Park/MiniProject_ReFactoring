package repository;

public interface CustomerRepositoryInterface {
    // public getInstance(); 무엇을 반환?
    public void createCustomer();
    public void readOneCustomer();
    public void readCustomerList();
    public void modifyCustomer();
    public void deleteCustomer();

}
