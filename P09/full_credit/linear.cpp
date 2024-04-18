#include "linear.h"

Linear::Linear(std::vector<double>& coefficients)
    : Polynomial::Polynomial(coefficients)       {
    if((coefficients.size() != 2) || (coefficients[0] == 0)) {
        throw std::runtime_error("a may not be 0");
    }
}
Linear::~Linear(){}

std::vector<double> Linear::solve() {

    double a = coefficients[0];
    double b = coefficients[1];

    return {-b/a};
}
