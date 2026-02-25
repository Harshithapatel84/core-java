class ChessBoard{
	String boardMaterial;
	boolean isFoldable;
	int numberOfRow;
	int numberOfColumn;
	String brand;
	
	ChessBoard(){
		
	}
	ChessBoard(String boardMaterial,boolean isFoldable,int numberOfRow,int numberOfColumn,String brand){
		this.boardMaterial=boardMaterial;
		this.isFoldable=isFoldable;
		this.numberOfRow=numberOfRow;
		this.numberOfColumn=numberOfColumn;
		this.brand=brand;
	}
	ChessBoard(String boardMaterial,boolean isFoldable){
		this.boardMaterial=boardMaterial;
		this.isFoldable=isFoldable;
	}
	ChessBoard(int numberOfColumn){
		this.numberOfColumn=numberOfColumn;
	}
	ChessBoard(int numberOfRow,boolean isFoldable){
		this.numberOfRow=numberOfRow;
		this.isFoldable=isFoldable;
	}
	ChessBoard(String brand){
	this.brand=brand;	
	}
	
}