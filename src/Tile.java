public abstract class Tile {
    //A chess board consist of 64 tile (8 * 8)

    int tileCoordinate;

    Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();
    // Define the empty tiles
    public static final class EmptyTile extends Tile {
        EmptyTile(int coordinate){
            super(coordinate);
        }

        @Override
        public boolean isTileOccupied(){
            return false;
        }

        @Override
        public Piece getPiece(){
            return null;
        }
    }

    // Define the Occupied tiles
    public static final class OccupiedTile extends Tile {

        Piece pieceOnTile;
        OccupiedTile(int tileCoordinate, Piece pieceOnTil ){
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTil;
        }

        @Override
        public boolean isTileOccupied(){
            return true;
        }

        @Override
        public Piece getPiece(){
            return this.pieceOnTile;
        }
    }

}
