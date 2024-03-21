package edu.ucaldas.LectorQR.services.impl;

public interface ICrud {

    public Object create(Object o);

    public Object read(String codigo);

    public Object update(Object o);

    public Object delete(String codigo);
}
