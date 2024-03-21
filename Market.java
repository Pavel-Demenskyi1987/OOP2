import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        // TODO Auto-generated method stub
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
        
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        // TODO Auto-generated method stub
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
            
        }
        
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        takeOrders();
        giveOrders();
        releaseFromMarket();
        
    }

    @Override
    public void giveOrders() {
        // TODO Auto-generated method stub
        for (Actor actor : queue) {
            if(actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " получил заказ ");
            }
            
        }
        
    }

    @Override
    public void releaseFromMarket() {
        // TODO Auto-generated method stub
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : releasedActors) {
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из оччереди ");
            }
        }
        releaseFromMarket(releasedActors);        
    }

    @Override
    public void takeInQueue(Actor actor) {
        // TODO Auto-generated method stub
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
        
    }

    @Override
    public void takeOrders() {
        // TODO Auto-generated method stub
        for (Actor actor : queue) {
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }


        }
    }
    
    
}
