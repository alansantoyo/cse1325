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


    return 0;
}
