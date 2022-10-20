package Matrixes;

public class MatrixUser {

	public static void main(String[] args) throws Exception {
/*		MatrixInt Matrix1,Matrix2;
		
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
		*/
		MatrixBool Matrix1,Matrix2;
		
		Matrix1 = new MatrixBool(5, 5);
		
		Matrix1.Data[0][0] = false;
		Matrix1.Data[0][1] = false;
		Matrix1.Data[0][2] = false;
		Matrix1.Data[0][3] = false;
		Matrix1.Data[0][4] = false;
		
		Matrix1.Data[1][0] = true;
		Matrix1.Data[1][1] = false;
		Matrix1.Data[1][2] = true;
		Matrix1.Data[1][3] = false;
		Matrix1.Data[1][4] = false;
		
		Matrix1.Data[2][0] = true;
		Matrix1.Data[2][1] = false;
		Matrix1.Data[2][2] = false;
		Matrix1.Data[2][3] = true;
		Matrix1.Data[2][4] = false;
		
		Matrix1.Data[3][0] = false;
		Matrix1.Data[3][1] = true;
		Matrix1.Data[3][2] = false;
		Matrix1.Data[3][3] = false;
		Matrix1.Data[3][4] = false;
		
		Matrix1.Data[4][0] = true;
		Matrix1.Data[4][1] = false;
		Matrix1.Data[4][2] = true;
		Matrix1.Data[4][3] = false;
		Matrix1.Data[4][4] = false;

		Matrix2 = new MatrixBool(5, 5);
		
		Matrix2.Data[0][0] = false;
		Matrix2.Data[0][1] = false;
		Matrix2.Data[0][2] = false;
		Matrix2.Data[0][3] = false;
		Matrix2.Data[0][4] = false;
		
		Matrix2.Data[1][0] = true;
		Matrix2.Data[1][1] = false;
		Matrix2.Data[1][2] = false;
		Matrix2.Data[1][3] = true;
		Matrix2.Data[1][4] = false;
		
		Matrix2.Data[2][0] = false;
		Matrix2.Data[2][1] = true;
		Matrix2.Data[2][2] = false;
		Matrix2.Data[2][3] = false;
		Matrix2.Data[2][4] = false;
		
		Matrix2.Data[3][0] = true;
		Matrix2.Data[3][1] = false;
		Matrix2.Data[3][2] = true;
		Matrix2.Data[3][3] = false;
		Matrix2.Data[3][4] = false;
		
		Matrix2.Data[4][0] = true;
		Matrix2.Data[4][1] = false;
		Matrix2.Data[4][2] = false;
		Matrix2.Data[4][3] = true;
		Matrix2.Data[4][4] = false;
		
		MatrixBool.Multiply(Matrix1, Matrix2).Show();		
		
	}

}
