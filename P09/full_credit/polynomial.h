#inlude <iostream>

class Polynomial {
  private:
    std::vector<double> _coefficients;

  public:
    Polynomial(std::vector<double>& coefficients);
    std::vector<double> solve();

} 
