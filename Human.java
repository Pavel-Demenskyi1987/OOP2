public class Human extends Actor{

    public Human(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        // TODO Auto-generated method stub
        super.isMakeOrder = isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        // TODO Auto-generated method stub
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public String getname() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getname'");
    }
    
}
