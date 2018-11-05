// https://open.kattis.com/problems/timeloop
#include <string>
#include <iostream>

const std::string spell("Abracadabra");
int main() {
    long long spellCount;
    while(std::cin >> spellCount) {
        for(auto line = 0; line < spellCount; ++line) {
            std::cout << std::to_string(line + 1);
            std::cout << " " << spell << std::endl;
        }
    }
}
