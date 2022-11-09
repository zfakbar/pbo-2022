public class Computer implements IPlayer{
    int id;
    Position position;

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
}
