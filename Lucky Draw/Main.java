#include <iostream>
using namespace std;

int main() {
    int i, n;
    bool isPrime = true;
    cin >> n;

    // 0 and 1 are not prime numbers
    if (n == 0 || n == 1) {
        isPrime = false;
    }
    else {
        for (i = 2; i <= n/2; ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime)
        cout << "Eligible";
    else
        cout << "Not eligible";

    return 0;
}