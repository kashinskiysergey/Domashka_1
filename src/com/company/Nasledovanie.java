package com.company;

class Tank{
    String Bronya;
    int Ecipaj;
    int Shassi;
    float MaxSpeed;
}

public class Nasledovanie {
    Tank Tank1 = new Tank();
            Tank1.Bronya ="Steel";
            Tank1.Ecipaj=4;
            Tank1.Shassi=6;
            Tank1.MaxSpeed=50f;

    Tank Tank2 = new Tank();
            Tank2.Bronya="Steel and lead";
            Tank2.Ecipaj=4;
            Tank2.Shassi=6;
            Tank2.MaxSpeed=64.7f;
            int Tank2.Pushka=80;
    Tank Tank3 = new Tank();
            Tank3.Bronya="многослойная";
            Tank3.Ecipaj=3;
            Tank3.Shassi=8;
            Tank3.MaxSpeed=77.7f;
            Tank3.Pushka=120;
            float Tank3.DalnostStrelbee=3970f;
}
