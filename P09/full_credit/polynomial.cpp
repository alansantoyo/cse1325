#include "polynomial.h"

Polynomial::Polynomial(std::vector<double>& coefficients)
    : _coefficients{coefficients} {
}
~Polynomial() { }

// std::vector<double> polynomial::solve(){ }