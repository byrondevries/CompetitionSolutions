// https://open.kattis.com/problems/combinationlock

#include <iostream>

int main() {
    int start;
    int a;
    int b;
    int c;

    std::cin >> start >> a >> b >> c;

    while (start + a + b + c != 0) {
        int total = 120;
        if (a > start) {
            total += 40 + start - a;
        } else { 
            total += start - a;
        }

        if (b > a) {
            total += b - a;
        } else {
            total += 40 + b - a;
        }

        if (c > b) {
            total += 40 + b - c;
        } else {
            total += b - c;
        }

        std::cout << total * 9 << std::endl;
        std::cin >> start >> a >> b >> c;
    }

    return 0;
}
