#include "linear.h"
#include "polynomial.h"

Linear::Linear(std::vector<double>& coefficients)
    : Polynomial(coefficients)       {
    if((coefficients.size() != 2) || (coefficients[0] == 0)) throw std::runtime_error{"a may not be 0"};
}
Linear::~Linear(){}

std::vector<double> Linear::solve() {return ((-1)*coefficients[1])/coefficients[0];}
