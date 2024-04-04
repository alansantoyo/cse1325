#ifndef __LINEAR_H
#define __LINEAR_H

#include <iostream>


class Linear {
  public:
    Linear(std::vector<double>& coefficients);

    virtual ~Linear();
    virtual std::vector<double> solve() override {

    }

};

#endif
