package Matrixes;

public class MatrixUser {

	public static void main(String[] args) throws Exception {
		MatrixInt Matrix1,Matrix2;
		
		Matrix1 = new MatrixInt(3, 2);
		Matrix1.Data[0][0] = 1;
		Matrix1.Data[1][0] = 2;
		Matrix1.Data[2][0] = 3;
		Matrix1.Data[0][1] = 4;
		Matrix1.Data[1][1] = 1;
		Matrix1.Data[2][1] = 3;

		Matrix2 = new MatrixInt(2, 1);
		Matrix2.Data[0][0] = 1;
		Matrix2.Data[1][0] = 2;
		
		MatrixInt.Multiply(Matrix1, Matrix2).Show();
	}

}
