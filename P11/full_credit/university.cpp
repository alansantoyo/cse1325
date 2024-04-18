#include "university.h"

University::University(string _name, int _enrollment)
    : _name{""}, _enrollment{0} {
    
    validate();
}
