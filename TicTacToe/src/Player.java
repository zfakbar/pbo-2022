public class Player implements IPlayer{
    int id;

    Position position;
    Symbol symbol;

    public Player(int id, Position position, Symbol symbol) {
        this.id = id;
        this.position = position;
        this.symbol = symbol;
    }

    public Player(int id) {
        this.id = id;
    }

    @Override
    public Symbol getSymbol() {
        return null;
    }

    @Override
    public Position getNextMove(int x, int y) {

        return this.position;
    }

    @Override
    public int getID() {
        return 0;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
