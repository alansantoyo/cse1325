#ifndef __QUADRATIC_H
#define __QUADRATIC_H

#include <iostream>

class Quadratic {
  public:
    Quadratic(std::vector<double>& coefficients);

    virtual ~Quadratic();
    virtual std::vector<double> solve() override;

}

#endif
