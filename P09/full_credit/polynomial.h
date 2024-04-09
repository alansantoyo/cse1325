#ifndef __POLYNOMIAL_H
#define __POLYNOMIAL_H

#include <iostream>
#include <vector>

class Polynomial {
  private:
    std::vector<double> _coefficients;

  public:
    Polynomial(std::vector<double>& coefficients);
    virtual ~Polynomial();
    virtual double solve() = 0;

};

#endif
