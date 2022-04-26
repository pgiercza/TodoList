package pl.edu.wszib.http2.service.model;

import pl.edu.wszib.http2.service.common.CrudResource;

public class Product implements CrudResource<Integer> {

  private Integer id;
  private String nazwa;
  private Integer ilosc;
  private Float cena;




  @Override
  public Integer getId() {
    return id;
  }

  @Override
  public void setId(Integer id) {
    this.id = id;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public Integer getIlosc() {
    return ilosc;
  }

  public void setIlosc(Integer ilosc) {
    this.ilosc = ilosc;
  }

  public Float getCena() {
    return cena;
  }

  public void setCena(Float cena) {
    this.cena = cena;
  }
}
