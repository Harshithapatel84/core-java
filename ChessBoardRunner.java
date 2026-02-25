class ChessBoardRunner{
	public static void main(String[] args)
	{
		ChessBoard chessBoard= new ChessBoard("wood",true);
		System.out.println("chess board is made by:"+chessBoard.boardMaterial);
		System.out.println("chess board type:"+chessBoard.isFoldable);
	}
}