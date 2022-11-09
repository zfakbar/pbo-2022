public interface IPlayer {

    public Symbol getSymbol();
    public Position getNextMove(int x, int y);
    public int getID();

}
