package coffee.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
  private Queue<Order> orderQueue = new LinkedList<>();

  public void add(String costomerName){
    Order order = new Order(costomerName);
    orderQueue.add(order);
  }

  public void deliver(){
    if(!orderQueue.isEmpty()){
      Order nextOrder = orderQueue.poll();
      System.out.println("Deliverring order: "+ nextOrder);
    }else {
      System.out.println("No orders to deliver.");
    }
  }

  public void deliver(int orderNumber){
    Order foundOrder = null;
    for (Order order : orderQueue) {
      if(order.getOrderNumber() == orderNumber){
        foundOrder = order;
        break;
      }
    }

    if(foundOrder != null){
      orderQueue.remove(foundOrder);
      System.out.println("Delivering order: "+ foundOrder);
    }else {
      System.out.println("Order with number "+ orderNumber+" not found.");
    }
  }
    public void draw(){
      System.out.println("--------------------");
      System.out.println("Num | Name");
      for (Order order : orderQueue ) {
        System.out.println(order);
      }
    }
  }
