#include <iostream>
#include <vector>
#include <string>

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

    std::cout << "\nEven lengths:" << std::endl;
    for(auto i : *evens) {
        std::cout << i << std::endl;
    }

    return 0;
}

