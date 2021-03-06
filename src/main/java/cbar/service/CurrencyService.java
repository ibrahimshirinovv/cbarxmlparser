package cbar.service;

import cbar.model.Valute;

import java.util.List;

public interface CurrencyService {


    Valute saveValute(Valute valute);
    boolean saveBatchValutes(List<Valute> valuteList);
    Valute updateValute(Valute valute);
    boolean removeValute(int id);
    Valute findById(int id);
    Valute findByCode(String code);
    List<Valute> findValutes();
}
