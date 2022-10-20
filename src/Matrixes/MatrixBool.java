package Matrixes;

public class MatrixBool {
	public boolean[][] Data;
	public int RowCount;
	public int ColCount;
	public MatrixBool(int RowCont, int ColCount) {
		this.RowCount = RowCont;
		this.ColCount = ColCount;
		Data = new boolean[RowCont][ColCount];
	}
	
	public void Show() {
		for (int i = 0; i < RowCount; i++) {
			for (int j = 0; j < ColCount; j++) {
				System.out.print(Data[i][j]);
				System.out.print(" ");
			}
		System.out.println();	
		}
	}
	
	static MatrixBool Multiply(MatrixBool Matrix1, MatrixBool Matrix2) throws Exception {
		MatrixBool Result;
		boolean curValue;
		
		if (Matrix1.ColCount == Matrix2.RowCount) {
			Result = new MatrixBool(Matrix1.RowCount,Matrix2.RowCount);
			for (int i = 0; i < Matrix1.RowCount; i++) {
				for (int j = 0; j < Matrix2.ColCount; j++) {
					curValue = false;
					for (int k = 0; k < Matrix2.RowCount; k++) {
						curValue = curValue || Matrix1.Data[i][k] && Matrix2.Data[k][j];						
					}
					Result.Data[i][j] = curValue;
				}
			}
		} else {
			throw new Exception("Wrong sizes");
		}
		
		return Result;
	}
}
