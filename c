#include <iostream>
#include <vector>
#include <chrono>
#include <omp.h>
using namespace std;
vector <double> LinearSystem(const vector<vector<double>>& A, const vector<double>& b) {
	int n = A.size();
	vector<vector<double>> Matrix(n, vector<double>(n + 1));
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			Matrix[i][j] = A[i][j];
		}
		Matrix[i][n] = b[i];
	}
	for (int i = 0; i < n; i++) {
		int pivotRow = i;
		for (int j = i + 1; j < n; j++) {
			if (abs(Matrix[j][i]) > abs(Matrix[pivotRow][i])) {
				pivotRow = j;
			}
		}
		swap(Matrix[i], Matrix[pivotRow]);
		double pivotElement = Matrix[i][i];
		for (int j = i; j <= n; j++) {
			Matrix[i][j] /= pivotElement;
		}
		for (int j = i + 1; j < n; j++) {
			double factor = Matrix[j][i];
			for (int k = i; k <= i; k++) {
				Matrix[j][k] -= factor * Matrix[i][k];
			}
		}
	}
	vector<double> x(n, 0);
	for (int i = n - 1; i >= 0; i--) {
		x[i] = Matrix[i][n];
		for (int j = i + 1; j < n; j++) {
			x[i] -= Matrix[i][j] * x[j];
		}
	}
	return x;
}

vector<double> mulMatrixVector(const vector<vector<double>>& A, const vector<double>& v) {
	int n = A.size();
	vector<double>result(n, 0);
#pragma omp parallel for
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			result[i] += A[i][j] * v[j];
		}
	}
	return result;
}
void Sravn(double t1, double t2) {
	if (t1 < t2)
		cout << "Последовательное быстрее" << endl;
	else cout << "OpenMP быстрее" << endl;
}
int main()
{
	setlocale(LC_ALL, "Rus");
	vector<int> n = { 100,200,300,400,500,600,700,800,900,100 };
	int numThreads = 4;
	for (int l = 0; l < n.size(); l++) {
		cout << "N = " << n[l] << endl;
		double t1 = 0, t2 = 0;
		vector<vector<double>> A(n[l], vector<double>(n[l]));
		vector<double>b(n[l]), v(n[l]);
		for (int i = 0; i < n[l]; i++) {
			for (int j = 0; j < n[l]; j++) {
				A[i][j] = static_cast<double>(rand()) / RAND_MAX;
			}
			b[i] = static_cast<double>(rand()) / RAND_MAX;
			v[i] = static_cast<double>(rand()) / RAND_MAX;
		}
		auto start = chrono::high_resolution_clock::now();
		vector<double>x = LinearSystem(A, b);
		auto end = chrono::high_resolution_clock::now();
		chrono::duration<double>elapsed_seconds = end - start;
		t1 = elapsed_seconds.count();
		cout << "Время решения системы линейных уравнений (последовательное): " << elapsed_seconds.count() << " sec" << endl;

		omp_set_num_threads(numThreads);
		start = chrono::high_resolution_clock::now();
		x = LinearSystem(A, b);
		end = chrono::high_resolution_clock::now();
		elapsed_seconds = end - start;
		t2 = elapsed_seconds.count();
		cout << "Время решения системы линейных уравнений (OpenMP): " << elapsed_seconds.count() << " sec" << endl;

		Sravn(t1, t2);

		start = chrono::high_resolution_clock::now();
		vector<double> result = mulMatrixVector(A, v);
		end = chrono::high_resolution_clock::now();
		elapsed_seconds = end - start;
		t1 = elapsed_seconds.count();
		cout << "Время перемножения матрицы на вектор (последовательно): " << elapsed_seconds.count() << " sec" << endl;

		start = chrono::high_resolution_clock::now();
		result = mulMatrixVector(A, v);
		end = chrono::high_resolution_clock::now();
		elapsed_seconds = end - start;
		t2 = elapsed_seconds.count();
		cout << "Время перемножения матрицы на вектор (OpenMP): " << elapsed_seconds.count() << " sec" << endl;

		Sravn(t1, t2);
	}
	return 0;
}
