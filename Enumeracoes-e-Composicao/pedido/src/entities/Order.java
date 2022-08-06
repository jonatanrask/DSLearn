package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrdemItem> ordemItems = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrdemItem> getOrdemItems() {
        return ordemItems;
    }
    public void addItem(OrdemItem ordemItem){
        ordemItems.add(ordemItem);
    }
    public void removeItem(OrdemItem ordemItem){
        ordemItems.remove(ordemItem);
    }
    public Double total(){
        double total = 0;
        for(OrdemItem item : ordemItems){
            total += item.subTotal();
        }
        return total;
    }
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: ");
        sb.append(client.getName());
        sb.append(" (" + client.getBirthDay() + ") - ");
        sb.append(client.getEmail() + "\n");
        sb.append("Order items:\n");
        for(OrdemItem item : getOrdemItems()){
            sb.append(item.getProduct().getName() + ", $");
            sb.append(String.format("%.2f", item.getProduct().getPrice()) + ", ");
            sb.append("Quantity: " + item.getQuantity() + ", ");
            sb.append("Subtotal: $" + String.format("%.2f",item.subTotal())  + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f",total()));
        return  sb.toString();
    }
}
