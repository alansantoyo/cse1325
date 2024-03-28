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
        //std::cout << text << std::endl;
    }

    std::cout << "Odd lengths:" << std::endl;
    for(auto i : odds) {
        std::cout << i << std::endl;
    }
    
    std::cout << "\n\nEven lengths:" << std::endl;
    for(auto i : *evens) {
        std::cout << i << std::endl;
    }

    return 0;
}
