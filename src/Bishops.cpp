// https://open.kattis.com/problems/bishops

#include <iostream>

int main() {
    long int n;
    while(std::cin >> n) {
        if (n == 0) {
            std::cout << "0" << std::endl;
        } else if (n == 1) {
            std::cout << "1" << std::endl;
        } else {
            std::cout << 2 * n - 2 << std::endl;
        }
    }

    return 0;
}
