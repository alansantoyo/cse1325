#include <iostream>
#include <vector>
#include <string>
#include <random>
#include <chrono>
#include <algorithm>

int main(int args, char* argv[]) {
    std::vector<std::string> odds;
    std::vector<std::string>* evens = new std::vector<std::string>;

    for(int i = 1; i < args; i++) {
        std::string text = argv[i];

        if((text.size() % 2) == 1) {
            odds.push_back(text);
        }
        else {
            evens->push_back(text);
        }
    }

    sort(odds.begin(),odds.end());
    std::cout << "Odd lengths (sorted):" << std::endl;
    for(auto i : odds) {
        std::cout << i << std::endl;
    }

    unsigned seed = std::chrono::system_clock::now().time_since_epoch().count();
    std::shuffle(evens->begin(), evens->end(), std::default_random_engine(seed));
    std::cout << "\nEven lengths (shuffled):" << std::endl;
    for(auto i : *evens) {
        std::cout << i << std::endl;
    }

    return 0;
}

