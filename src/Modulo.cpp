// https://open.kattis.com/problems/timeloop
#include <iostream>
#include <set>

int main() {
    std::set<int> results;
    int A;
    int B(42);
    while(std::cin >> A) {
        results.insert(A % B);
    }

    std::cout << results.size();
}
