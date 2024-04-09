#ifndef __LINEAR_H
#define __LINEAR_H

#include <iostream>
#include "polynomial.h"

class Linear : public Polynomial {
  public:
    Linear(std::vector<double>& coefficients);

    virtual ~Linear();
    virtual double solve() override;

};

#endif
